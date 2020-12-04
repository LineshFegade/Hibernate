package com.hibernet.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name="hibstudentinfo")
@Inheritance(strategy = InheritanceType.JOINED)
public class Student {
	@Id
	@Column(name="rollNo")
	@GeneratedValue
	 private int rollno;
	@Column(name="Student_name")
	 private String studentName;
	@Column(name="AddmissionDate")
	 private Date admissionDate;
	@Embedded
	Address perAddr;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}	
	public Student(int rollno, String studentName, Date admissionDate, Address perAddr) {
		super();
		this.rollno = rollno;
		this.studentName = studentName;
		this.admissionDate = admissionDate;
		this.perAddr = perAddr;
	}

	

	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public Date getAdmissionDate() {
		return admissionDate;
	}
	public void setAdmissionDate(Date admissionDate) {
		this.admissionDate = admissionDate;
	}
	public Address getPerAddr() {
		return perAddr;
	}
	public void setPerAddr(Address perAddr) {
		this.perAddr = perAddr;
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", studentName=" + studentName + ", admissionDate=" + admissionDate
				+ ", perAddr=" + perAddr + "]";
	}
	
	
}
