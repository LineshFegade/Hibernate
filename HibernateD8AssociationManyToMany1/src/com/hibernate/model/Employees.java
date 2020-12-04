package com.hibernate.model;

import java.sql.Date;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name="hib_employeeinfo")
public class Employees {
	@Id
	@Column(name="employee_Id")
	private int empId;
	@Column(name="employee_Name")
	private String empName;
	@Column(name="employee_JoiningDate")
	private Date jdate;
	@ManyToMany(mappedBy = "employees",cascade = CascadeType.ALL)
	private Set<Meetings> meetings;
	
	public Employees() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employees(int empId, String empName, Date jdate, Set<Meetings> meetings) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.jdate = jdate;
		this.meetings = meetings;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public Date getJdate() {
		return jdate;
	}
	public void setJdate(Date jdate) {
		this.jdate = jdate;
	}
	public Set<Meetings> getMeetings() {
		return meetings;
	}
	public void setMeetings(Set<Meetings> meetings) {
		this.meetings = meetings;
	}
	@Override
	public String toString() {
		return "Employees [empId=" + empId + ", empName=" + empName + ", jdate=" + jdate + ", meetings=" + meetings
				+ "]";
	}
	
	
}
