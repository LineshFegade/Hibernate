package com.hibernate.model;

import java.sql.*;
import java.util.Set;

import javax.persistence.*;
@Entity
@Table(name="hib_meetinginfo")
public class Meetings {
		@Id
		@Column(name="Metting_Id")
		private int	meetingId;	
		@Column(name="agenda")
		private String	agenda;
		@Column(name="meetingDate")
		private Date meetingDate;
		@Column(name="meetingTime")
		private String	meetingTime;
		@ManyToMany
		@JoinTable(name="hib_emp_meet",joinColumns = {@JoinColumn(name="Meeting_Id")},
		inverseJoinColumns = {@JoinColumn(name="employee_Id")})
		private	Set<Employees> employees;
		public Meetings() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Meetings(int meetingId, String agenda, Date meetingDate, String meetingTime, Set<Employees> employees) {
			super();
			this.meetingId = meetingId;
			this.agenda = agenda;
			this.meetingDate = meetingDate;
			this.meetingTime = meetingTime;
			this.employees = employees;
		}
		public int getMeetingId() {
			return meetingId;
		}
		public void setMeetingId(int meetingId) {
			this.meetingId = meetingId;
		}
		public String getAgenda() {
			return agenda;
		}
		public void setAgenda(String agenda) {
			this.agenda = agenda;
		}
		public Date getMeetingDate() {
			return meetingDate;
		}
		public void setMeetingDate(Date meetingDate) {
			this.meetingDate = meetingDate;
		}
		public String getMeetingTime() {
			return meetingTime;
		}
		public void setMeetingTime(String meetingTime) {
			this.meetingTime = meetingTime;
		}
		public Set<Employees> getEmployees() {
			return employees;
		}
		public void setEmployees(Set<Employees> employees) {
			this.employees = employees;
		}
		@Override
		public String toString() {
			return "Meetings [meetingId=" + meetingId + ", agenda=" + agenda + ", meetingDate=" + meetingDate
					+ ", meetingTime=" + meetingTime + ", employees=" + employees + "]";
		}
		
		
		
}
