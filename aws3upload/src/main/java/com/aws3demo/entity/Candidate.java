package com.aws3demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Ahmar
 *
 */
@Entity
@Table(name = "candidate")
public class Candidate {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(columnDefinition = "serial")
	private int id;

	@Column(name = "firstname")
	private String firstName;

	@Column(name = "lastname")
	private String lastName;

	@Column(name = "phonenumber")
	private String phoneNumber;

	@Column(name = "email")
	private String email;

	@Column(name = "overallexp")
	private String overallExperience;

	@Column(name = "relevantexp")
	private String relevantExperience;

	@Column(name = "workingstatus")
	private String workingStatus;

	@Column(name = "strengths")
	private String strengths;

	@Column(name = "availforintrvw")
	private String avalabilityForInterview;

	@Column(name = "availforjoin")
	private String avalabilityForJoin;

	@Column(name = "status")
	private String status;

	@Column(name = "linkedinurl")
	private String linkedInUrl;

	@Column(name = "vendorname")
	private String vendorName;

	@Column(name = "vendorcontact")
	private String vendorContactDetails;

	@Column(name = "referredby")
	private String referredBy;

	@Column(name = "referredbonus")
	private String referredBonus;

	@Column(name = "primaryskills")
	private String primarySkills;

	@Column(name = "secondaryskills")
	private String secondSkills;

	public int getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public String getOverallExperience() {
		return overallExperience;
	}

	public String getRelevantExperience() {
		return relevantExperience;
	}

	public String getWorkingStatus() {
		return workingStatus;
	}

	public String getStrengths() {
		return strengths;
	}

	public String getAvalabilityForInterview() {
		return avalabilityForInterview;
	}

	public String getAvalabilityForJoin() {
		return avalabilityForJoin;
	}

	public String getStatus() {
		return status;
	}

	public String getLinkedInUrl() {
		return linkedInUrl;
	}

	public String getVendorName() {
		return vendorName;
	}

	public String getVendorContactDetails() {
		return vendorContactDetails;
	}

	public String getReferredBy() {
		return referredBy;
	}

	public String getReferredBonus() {
		return referredBonus;
	}

	public String getPrimarySkills() {
		return primarySkills;
	}

	public String getSecondSkills() {
		return secondSkills;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setOverallExperience(String overallExperience) {
		this.overallExperience = overallExperience;
	}

	public void setRelevantExperience(String relevantExperience) {
		this.relevantExperience = relevantExperience;
	}

	public void setWorkingStatus(String workingStatus) {
		this.workingStatus = workingStatus;
	}

	public void setStrengths(String strengths) {
		this.strengths = strengths;
	}

	public void setAvalabilityForInterview(String avalabilityForInterview) {
		this.avalabilityForInterview = avalabilityForInterview;
	}

	public void setAvalabilityForJoin(String avalabilityForJoin) {
		this.avalabilityForJoin = avalabilityForJoin;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public void setLinkedInUrl(String linkedInUrl) {
		this.linkedInUrl = linkedInUrl;
	}

	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}

	public void setVendorContactDetails(String vendorContactDetails) {
		this.vendorContactDetails = vendorContactDetails;
	}

	public void setReferredBy(String referredBy) {
		this.referredBy = referredBy;
	}

	public void setReferredBonus(String referredBonus) {
		this.referredBonus = referredBonus;
	}

	public void setPrimarySkills(String primarySkills) {
		this.primarySkills = primarySkills;
	}

	public void setSecondSkills(String secondSkills) {
		this.secondSkills = secondSkills;
	}


	
	
	
	
	
	

}
