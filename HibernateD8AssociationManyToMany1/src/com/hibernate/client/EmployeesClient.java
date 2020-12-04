package com.hibernate.client;



import java.sql.Date;
import java.sql.Time;
import java.util.HashSet;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hibernate.model.Employees;
import com.hibernate.model.Meetings;
import com.hibernate.util.HibernateUtil;

public class EmployeesClient {

	public static void main(String[] args) {
		
		try {
			SessionFactory factory=HibernateUtil.obtainSessionFactory();
			Session session=factory.getCurrentSession();
			Transaction txn=(Transaction)session.beginTransaction();
			
			//create  object Employee 
			Employees e1=new Employees();
			e1.setEmpId(151);e1.setEmpName("Ashitosh");e1.setJdate(Date.valueOf("2020-09-10"));
			Employees e2=new Employees();
			e2.setEmpId(152);e2.setEmpName("Rahul");e2.setJdate(Date.valueOf("2020-09-22"));
			Employees e3=new Employees();
			e3.setEmpId(153);e3.setEmpName("Prajakta");e3.setJdate(Date.valueOf("2020-04-11"));
			Employees e4=new Employees();
			e4.setEmpId(154);e4.setEmpName("Sakshi");e4.setJdate(Date.valueOf("2020-06-28"));
			Employees e5=new Employees();
			e5.setEmpId(155);e5.setEmpName("Krunal");e5.setJdate(Date.valueOf("2020-07-05"));
			
			//create object Meeting
			Meetings m1=new Meetings();
			m1.setMeetingId(1121);m1.setAgenda("regarding to bugs");m1.setMeetingDate(Date.valueOf("2020-12-12"));m1.setMeetingTime("2:00:00");
			Meetings m2=new Meetings();
			m2.setMeetingId(1122);m2.setAgenda("Project presentation");m2.setMeetingDate(Date.valueOf("2020-12-12"));m2.setMeetingTime("5:00:00");
		
			//create List for meeting and employees
			HashSet<Employees> h1=new HashSet<Employees>();//emp added in list
			h1.add(e1);h1.add(e3);h1.add(e5);
			HashSet<Meetings>  h2=new HashSet<Meetings>();//meeting added in list
			h2.add(m1);
			
			HashSet<Employees> hs=new HashSet<Employees>(); //second employees added in list
			hs.add(e2);hs.add(e4);hs.add(e5);hs.add(e1);hs.add(e3);
			HashSet<Meetings>  hs1=new HashSet<Meetings>();//second meeting added in list
			hs1.add(m2);
			
			//employee associate with meeting
			e1.setMeetings(hs1);e1.setMeetings(h2);
			e2.setMeetings(hs1);
			e3.setMeetings(hs1);e3.setMeetings(h2);
			e4.setMeetings(hs1);
			e5.setMeetings(hs1);e5.setMeetings(h2);
			// meeting associate with employee
			m1.setEmployees(h1);m2.setEmployees(hs);
			
			session.save(e1);
			session.save(e2);
			session.save(e3);
			session.save(e4);
			session.save(e5);
			
			
			txn.commit();
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
