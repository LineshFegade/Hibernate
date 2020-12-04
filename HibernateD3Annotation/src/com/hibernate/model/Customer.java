package com.hibernate.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="customerinfo")
public class Customer {
	@Id
	@Column(name="cust_id")
	private int custId;
	
	@Column(name="cust_Name")
	private String custName;
	
	@Column(name="cust_ContactNo")
	private long contactNo;
	
	@Column(name="cust_BirthDate")
	private String birthDate;
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(int custId, String custName, long contactNo, String birthDate) {
		super();
		this.custId = custId;
		this.custName = custName;
		this.contactNo = contactNo;
		this.birthDate = birthDate;
	}
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public long getContactNo() {
		return contactNo;
	}
	public void setContactNo(long contactNo) {
		this.contactNo = contactNo;
	}
	public String getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}
	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", custName=" + custName + ", contactNo=" + contactNo + ", birthDate="
				+ birthDate + "]";
	}
	
}
