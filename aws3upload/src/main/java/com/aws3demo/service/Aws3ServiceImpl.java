/**
 * 
 */
package com.aws3demo.service;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.io.IOUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.model.CannedAccessControlList;
import com.amazonaws.services.s3.model.ListObjectsRequest;
import com.amazonaws.services.s3.model.ObjectListing;
import com.amazonaws.services.s3.model.ObjectMetadata;
import com.amazonaws.services.s3.model.PutObjectRequest;
import com.amazonaws.services.s3.model.PutObjectResult;
import com.amazonaws.services.s3.model.S3ObjectSummary;
import com.aws3demo.config.AwsConfig;
import com.aws3demo.dao.DocumentRepository;
import com.aws3demo.entity.Document;

/**
 * @author Ahmar
 *
 */
@Service
public class Aws3ServiceImpl implements IAws3Service {

	public static final Logger logger = Logger.getLogger(Aws3ServiceImpl.class);

	@Autowired
	private AmazonS3 amazonS3;

	@Autowired
	private DocumentRepository documentRepository;

	@Autowired
	AwsConfig awsConfig;

	private PutObjectResult upload(InputStream inputStream, String uploadKey,
			int id) {
		String folderKey = Integer.toString(id) + "/" + uploadKey;
		PutObjectRequest putObjectRequest = new PutObjectRequest(
				awsConfig.getBucket(), folderKey, inputStream,
				new ObjectMetadata());

		putObjectRequest.setCannedAcl(CannedAccessControlList.PublicRead);

		PutObjectResult putObjectResult = amazonS3.putObject(putObjectRequest);

		IOUtils.closeQuietly(inputStream);

		return putObjectResult;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.aws3demo.service.IAws3Service2#upload(org.springframework.web.multipart
	 * .MultipartFile[])
	 */
	public List<PutObjectResult> upload(MultipartFile[] multipartFiles, int id) {

		List<PutObjectResult> putObjectResults = new ArrayList<>();

		Arrays.stream(multipartFiles)
				.filter(multipartFile -> !StringUtils.isEmpty(multipartFile
						.getOriginalFilename()))
				.forEach(
						multipartFile -> {
							try {
								putObjectResults.add(

								upload(multipartFile.getInputStream(),
										multipartFile.getOriginalFilename(), id)

								);

								saveMetaData(multipartFile, id);
							} catch (Exception e) {
								e.printStackTrace();
							}
						}

				);

		return putObjectResults;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.aws3demo.service.IAws3Service2#list()
	 */
	public List<S3ObjectSummary> list() {
		ObjectListing objectListing = amazonS3
				.listObjects(new ListObjectsRequest().withBucketName(awsConfig
						.getBucket()));

		List<S3ObjectSummary> s3ObjectSummaries = objectListing
				.getObjectSummaries();

		return s3ObjectSummaries;
	}

	/**
	 * Method is use to save metadata of multipart
	 */
	public void saveMetaData(MultipartFile file, int id) throws IOException {
		Document metaData = new Document();
		metaData.setCandidateId(id);
		metaData.setDocumentName(file.getOriginalFilename());
		metaData.setDocumentType(file.getContentType());
		metaData.setDocumentSize(file.getSize());
		documentRepository.save(metaData);
	}

}
