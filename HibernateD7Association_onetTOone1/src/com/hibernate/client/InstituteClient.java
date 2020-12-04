package com.hibernate.client;

import java.sql.Date;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hibernate.model.Address;
import com.hibernate.model.Institute;
import com.hibernate.model.InstituteHistory;
import com.hibernate.util.HibernateUtil;

public class InstituteClient {
public static void main(String[] args) {
		
	try {
		SessionFactory factory=HibernateUtil.obtainSessionFactory();
		Session session = factory.getCurrentSession();
		Transaction txn = (Transaction) session.beginTransaction();
		
		
		Institute is=new Institute();
		is.setInstituteId(100);
		is.setInstituteName("VJTI");
		
		InstituteHistory hs=new InstituteHistory();
		hs.setInstituteId(100);
		hs.setFounder("Dhiren patel");
		hs.setFoundationDate(Date.valueOf("1888-1-28"));
		hs.setHoAddress(new Address("near viidhyavihar railway station", "Mumbai", "India", "421001"));
		//Refrance Exchange.
		is.setHistory(hs);
		hs.setInst(is);
		session.save(is);
		
		
		

		Institute is1=new Institute();
		is1.setInstituteId(101);
		is1.setInstituteName("D.Y.Patil institute and technology");
		
		InstituteHistory hs1=new InstituteHistory();
		hs1.setInstituteId(101);
		hs1.setFounder("D Y patil");
		hs1.setFoundationDate(Date.valueOf("1978-6-18"));
		hs1.setHoAddress(new Address("sion-panvel highway", "navi-Mumbai", "India", "421001"));
		//refrance exchange
		is.setHistory(hs1);
		hs.setInst(is1);
		
		//save the session.or only main pojo class refrance wil be save.
		
		session.save(is1);
		
		txn.commit();

	} catch (HibernateException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}	
	
}
}
