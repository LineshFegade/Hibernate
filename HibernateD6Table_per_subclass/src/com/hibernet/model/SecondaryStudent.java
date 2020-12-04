package com.hibernet.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
@Entity
@Table(name="secondarystudent")
@PrimaryKeyJoinColumn(name="s_student")
public class SecondaryStudent extends Student {
	@Column(name="percentage")
	private float percentage ;

	public SecondaryStudent() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SecondaryStudent(int rollno, String studentName, Date admissionDate, Address perAddr,float percentage) {
		super(rollno, studentName, admissionDate, perAddr);
		this.percentage = percentage;
	}

	public float getPercentage() {
		return percentage;
	}

	public void setPercentage(float percentage) {
		this.percentage = percentage;
	}

	@Override
	public String toString() {
		return "SecondaryStudent [percentage=" + percentage + ", getRollno()=" + getRollno() + ", getStudentName()="
				+ getStudentName() + ", getAdmissionDate()=" + getAdmissionDate() + ", getPerAddr()=" + getPerAddr()
				+ "]";
	}

	
	
	
	
}
