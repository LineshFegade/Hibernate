package com.hibernate.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="hib_customersinfo")
public class Customers {
	@Id
	@Column(name="customerId")
	
	private int custId;
	@Column(name="customerName")
	private String prcustName;
	@Column(name="ContactNumber")
	 private long contactNum;
	@Embedded
	private  Address custAddress;
	@OneToOne(mappedBy = "cust",cascade = CascadeType.ALL )
	private PassportDetails pass;
	public Customers() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customers(int custId, String prcustName, long contactNum, Address custAddress, PassportDetails pass) {
		super();
		this.custId = custId;
		this.prcustName = prcustName;
		this.contactNum = contactNum;
		this.custAddress = custAddress;
		this.pass = pass;
	}
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getPrcustName() {
		return prcustName;
	}
	public void setPrcustName(String prcustName) {
		this.prcustName = prcustName;
	}
	public long getContactNum() {
		return contactNum;
	}
	public void setContactNum(long contactNum) {
		this.contactNum = contactNum;
	}
	public Address getCustAddress() {
		return custAddress;
	}
	public void setCustAddress(Address custAddress) {
		this.custAddress = custAddress;
	}
	public PassportDetails getPass() {
		return pass;
	}
	public void setPass(PassportDetails pass) {
		this.pass = pass;
	}
	@Override
	public String toString() {
		return "Customers [custId=" + custId + ", prcustName=" + prcustName + ", contactNum=" + contactNum
				+ ", custAddress=" + custAddress + ", pass=" + pass + "]";
	}
	
	
}
