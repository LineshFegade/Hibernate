package com.hibernate.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="hib_institutehistory")
public class InstituteHistory {
	@Id
	@Column(name="institiuteid")
	private int instituteId;
	@Column(name="Founder")
	private String founder;
	@Column(name="FoundationDate")
	private Date foundationDate;
	@Embedded
	Address hoAddress ; 
	@OneToOne
	@PrimaryKeyJoinColumn
	private Institute inst   ;
	
	
	
	public InstituteHistory() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public InstituteHistory(int instituteId, String founder, Date foundationDate, Address hoAddress, Institute inst) {
		super();
		this.instituteId = instituteId;
		this.founder = founder;
		this.foundationDate = foundationDate;
		this.hoAddress = hoAddress;
		
	}
	public int getInstituteId() {
		return instituteId;
	}
	public void setInstituteId(int instituteId) {
		this.instituteId = instituteId;
	}
	public String getFounder() {
		return founder;
	}
	public void setFounder(String founder) {
		this.founder = founder;
	}
	public Date getFoundationDate() {
		return foundationDate;
	}
	public void setFoundationDate(Date foundationDate) {
		this.foundationDate = foundationDate;
	}
	public Address getHoAddress() {
		return hoAddress;
	}
	public void setHoAddress(Address hoAddress) {
		this.hoAddress = hoAddress;
	}
	public Institute getInst() {
		return inst;
	}
	public void setInst(Institute inst) {
		this.inst = inst;
	}
	@Override
	public String toString() {
		return "InstituteHistory [instituteId=" + instituteId + ", founder=" + founder + ", foundationDate="
				+ foundationDate + ", hoAddress=" + hoAddress  + "]";
	}
	
	

}
