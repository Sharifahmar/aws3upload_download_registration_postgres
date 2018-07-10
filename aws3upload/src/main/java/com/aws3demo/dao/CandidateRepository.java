package com.aws3demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aws3demo.entity.Candidate;

/**
 * @author Ahmar
 *
 */

/**
 * A JPA repository used to perform crud operations on file meta data records in
 * database
 * 
 */

public interface CandidateRepository extends
		JpaRepository<Candidate, Integer> {
}