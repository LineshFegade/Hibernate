package com.hibernate.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Embedded;

@Embeddable
public class PersonalDetails {
	@Column(name="first_name")
	private String firstName;
	@Column(name="last_name")
	private String lastName;
	@Column(name="birth_date")
	private String birthDate;
	@Column(name="email_id")
	private String emailId;
	@Column(name="contact_no")
	private String contactNo;
	@Column(name="gender")
	private String gender;
	@Embedded
	Address resAdd;
	public PersonalDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PersonalDetails(String firstName, String lastName, String birthDate, String emailId, String contactNo,
			String gender, Address resAdd) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthDate = birthDate;
		this.emailId = emailId;
		this.contactNo = contactNo;
		this.gender = gender;
		this.resAdd = resAdd;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getContactNo() {
		return contactNo;
	}
	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Address getResAdd() {
		return resAdd;
	}
	public void setResAdd(Address resAdd) {
		this.resAdd = resAdd;
	}
	@Override
	public String toString() {
		return "PersonalDetails [firstName=" + firstName + ", lastName=" + lastName + ", birthDate=" + birthDate
				+ ", emailId=" + emailId + ", contactNo=" + contactNo + ", gender=" + gender + ", resAdd=" + resAdd
				+ "]";
	}

	
	
}
