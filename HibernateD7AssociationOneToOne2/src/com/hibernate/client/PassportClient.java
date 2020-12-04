package com.hibernate.client;

import java.sql.Date;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hibernate.model.Address;
import com.hibernate.model.Customers;
import com.hibernate.model.PassportDetails;
import com.hibernate.util.HibernateUtil;

public class PassportClient {
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		try {
			SessionFactory factory=HibernateUtil.obtainSessionFactory();
			Session session = factory.getCurrentSession();
			Transaction txn = (Transaction) session.beginTransaction();
			
			Customers cs=new Customers();
			cs.setCustId(1001);
			cs.setPrcustName("Linesh fegade");
			cs.setContactNum(9096905180L);
			cs.setCustAddress(new Address("shivaji chowk", "kalyan", "India", "421501"));
			
			
			PassportDetails ps=new PassportDetails();
			ps.setPassportNo(7521369851L);
			ps.setFirstName("Linesh");
			ps.setMiddleName("Anant");
			ps.setLastName("Fegade");
			ps.setDob(Date.valueOf("1996-03-22"));//yy-mm-dd
			ps.setGender("male");
			ps.setNationality("Indian");
			ps.setCountryCode(313);
			ps.setExpiryDate(Date.valueOf("2021-04-25"));
			ps.setIssueDate(Date.valueOf("2020-09-06"));
			ps.setBirthPlace("kalyan");
			//Exchange obj reference for connection
			cs.setPass(ps);
			ps.setCust(cs);
			//save
			session.save(cs);
			
			
			Customers cs1=new Customers();
			cs1.setCustId(1002);
			cs1.setPrcustName("Rahul Phadtare");
			cs1.setContactNum(9567327810L);
			cs1.setCustAddress(new Address("shivaji chowk", "kalyan", "India", "421501"));
			
			
			PassportDetails ps1=new PassportDetails();
			ps1.setPassportNo(7521369852L);
			ps1.setFirstName("Rahul");
			ps1.setMiddleName("Ramchandra");
			ps1.setLastName("Phadtare");
			ps1.setDob(Date.valueOf("1996-12-12"));
			ps1.setGender("male");
			ps1.setNationality("Indian");
			ps1.setCountryCode(313);
			ps1.setExpiryDate(Date.valueOf("2021-04-15"));
			ps1.setIssueDate(Date.valueOf("2020-05-09"));
			ps1.setBirthPlace("satara");
			//Exchange object reference for connection
			cs.setPass(ps1);
			ps.setCust(cs1);
			//save
			session.save(cs1);
			
			txn.commit();
			} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
