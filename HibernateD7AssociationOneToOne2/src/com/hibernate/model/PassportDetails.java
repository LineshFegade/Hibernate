package com.hibernate.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
@Entity
@Table(name="hib_passportdetails")
public class PassportDetails {
	@Id
	@Column(name="passportNumber")
	private long passportNo;
	@Column(name="FirstName")
	private String firstName;
	@Column(name="MiddleName")
	private String middleName;
	@Column(name="LastName")
	private String lastName;
	@Column(name="DateOfBirth")
	private Date dob;
	@Column(name="Gender")
	private String gender;
	@Column(name="nationality")
    private String	nationality;
	@Column(name="CountryCode")
	private int countryCode;
	@Column(name="ExpiryDate")
	private Date expiryDate;
	@Column(name="IssueDate")
	private Date issueDate;
	@Column(name="BirthPlace")
	private String birthPlace;
	@OneToOne
	@JoinColumn(name="passId")
	Customers cust;
	public PassportDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PassportDetails(long passportNo, String firstName, String middleName, String lastName, Date dob,
			String gender, String nationality, int countryCode, Date expiryDate, Date issueDate, String birthPlace,
			Customers cust) {
		super();
		this.passportNo = passportNo;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.dob = dob;
		this.gender = gender;
		this.nationality = nationality;
		this.countryCode = countryCode;
		this.expiryDate = expiryDate;
		this.issueDate = issueDate;
		this.birthPlace = birthPlace;
		this.cust = cust;
	}
	public long getPassportNo() {
		return passportNo;
	}
	public void setPassportNo(long passportNo) {
		this.passportNo = passportNo;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public int getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(int countryCode) {
		this.countryCode = countryCode;
	}
	public Date getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}
	public Date getIssueDate() {
		return issueDate;
	}
	public void setIssueDate(Date issueDate) {
		this.issueDate = issueDate;
	}
	public String getBirthPlace() {
		return birthPlace;
	}
	public void setBirthPlace(String birthPlace) {
		this.birthPlace = birthPlace;
	}
	public Customers getCust() {
		return cust;
	}
	public void setCust(Customers cust) {
		this.cust = cust;
	}
	@Override
	public String toString() {
		return "PassportDetails [passportNo=" + passportNo + ", firstName=" + firstName + ", middleName=" + middleName
				+ ", lastName=" + lastName + ", dob=" + dob + ", gender=" + gender + ", nationality=" + nationality
				+ ", countryCode=" + countryCode + ", expiryDate=" + expiryDate + ", issueDate=" + issueDate
				+ ", birthPlace=" + birthPlace + ", cust=" + cust + "]";
	}
	
	
}
