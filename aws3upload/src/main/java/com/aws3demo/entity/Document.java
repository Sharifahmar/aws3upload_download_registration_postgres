package com.aws3demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/** An entity that stores file meta data into database */
@Entity
@Table(name = "document")
public class Document {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(columnDefinition = "serial")
	private int id;

	@Column(name = "candidateid")
	private int candidateId;

	@Column(name = "documentname")
	private String documentName;

	@Column(name = "documenttype")
	private String documentType;

	@Column(name = "documentsize")
	private long documentSize;

	public int getId() {
		return id;
	}

	public int getCandidateId() {
		return candidateId;
	}

	public String getDocumentType() {
		return documentType;
	}

	public long getDocumentSize() {
		return documentSize;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setCandidateId(int candidateId) {
		this.candidateId = candidateId;
	}

	public void setDocumentType(String documentType) {
		this.documentType = documentType;
	}

	public void setDocumentSize(long documentSize) {
		this.documentSize = documentSize;
	}

	public String getDocumentName() {
		return documentName;
	}

	public void setDocumentName(String documentName) {
		this.documentName = documentName;
	}

}
