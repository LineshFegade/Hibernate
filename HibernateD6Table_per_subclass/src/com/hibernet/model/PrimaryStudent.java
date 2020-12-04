package com.hibernet.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
@Entity
@Table(name="primarystudent")
@PrimaryKeyJoinColumn(name="p_student")
public class PrimaryStudent extends Student {
	@Column(name="grade")
	private String grade;

	public PrimaryStudent() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PrimaryStudent(int rollno, String studentName, Date admissionDate, Address perAddr,String grade) {
		super(rollno, studentName, admissionDate, perAddr);
		this.grade = grade;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "PrimaryStudent [grade=" + grade + ", getRollno()=" + getRollno() + ", getStudentName()="
				+ getStudentName() + ", getAdmissionDate()=" + getAdmissionDate() + ", getPerAddr()=" + getPerAddr()
				+ "]";
	}

	
	
	
}
