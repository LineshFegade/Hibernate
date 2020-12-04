package com.hibernate.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;
@Embeddable
public class EducationalDetails {
	@Column(name="qualification") 
	private String qualification;
	
	@Column(name="result") 
	private String result;
	
	 @Column(name="yearpassing")
	 private int yearPassing;

	 
	 
	public EducationalDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public EducationalDetails(String qualification, String result, int yearPassing) {
		super();
		this.qualification = qualification;
		this.result = result;
		this.yearPassing = yearPassing;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	public int getYearPassing() {
		return yearPassing;
	}
	public void setYearPassing(int yearPassing) {
		this.yearPassing = yearPassing;
	}
	@Override
	public String toString() {
		return "EducationalDetails [qualification=" + qualification + ", result=" + result + ", yearPassing="
				+ yearPassing + "]";
	}
	
	 
	 
	 
	 
	
	 
}
