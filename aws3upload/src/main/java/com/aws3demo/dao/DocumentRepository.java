package com.aws3demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aws3demo.entity.Document;

/**
 * A JPA repository used to perform crud operations on file meta data records in
 * database
 */

public interface DocumentRepository extends JpaRepository<Document, Long> {
}