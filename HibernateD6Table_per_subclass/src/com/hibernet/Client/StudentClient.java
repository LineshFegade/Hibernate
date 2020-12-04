package com.hibernet.Client;

import java.sql.Date;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hibernate.util.HibernateUtil;
import com.hibernet.model.Address;
import com.hibernet.model.PrimaryStudent;
import com.hibernet.model.SecondaryStudent;

public class StudentClient {
public static void main(String[] args) {
	try {
		SessionFactory factory=HibernateUtil.obtainSessionFactory();
		Session session = factory.getCurrentSession();
		Transaction txn = (Transaction) session.beginTransaction();	
		
	
		  PrimaryStudent ps=new PrimaryStudent();
		  ps.setStudentName("Aniket patil");
		  ps.setAdmissionDate(Date.valueOf("2018-06-15"));
		  ps.setPerAddr(new Address("pawan nager", "kalyan", "India ", "421501"));
		  ps.setGrade("A");
		  
		 PrimaryStudent ps1=new PrimaryStudent();
		  ps1.setStudentName("Mandar Patankat");
		  ps1.setAdmissionDate(Date.valueOf("2018-06-15"));
		  ps1.setPerAddr(new Address("kala talav", "kalyan", "India ", "421501"));
		  ps1.setGrade("B+");
		  
		  SecondaryStudent sd=new SecondaryStudent();
		  sd.setStudentName("Rushikesh Jadhav");
		  sd.setAdmissionDate(Date.valueOf("2016-06-15"));
		  sd.setPerAddr(new Address("Durgadi fort", "Kalayn", "India", "421501"));
		  sd.setPercentage((float)89.55);
		  
		  SecondaryStudent sd1=new SecondaryStudent();
		  sd1.setStudentName("Rushikesh Jadhav");
		  sd1.setAdmissionDate(Date.valueOf("2016-06-15"));
		  sd1.setPerAddr(new Address("Adharwadi jail", "Kalayn", "India", "421501"));
		  sd1.setPercentage((float)92.05);
		  
		  //save the session
		  
		  session.save(ps);
		  session.save(ps1);
		  session.save(sd);
		  session.save(sd1);
		  System.out.println("Done!!");		
		
		txn.commit(); //here session is closed automatically
		
	} catch (HibernateException e) {
		e.printStackTrace();
	}
}
}
