package com.hibernate.client;

import java.sql.Date;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hibernate.model.Director;
import com.hibernate.model.Movie;
import com.hibernate.util.HibernateUtil;

public class MovieClient {

	public static void main(String[] args) {
		
		try {
			SessionFactory factory=HibernateUtil.obtainSessionFactory();
			Session session=factory.getCurrentSession();
			Transaction txn=(Transaction)session.beginTransaction();
			
			//create Direcotr object and save it
			Director di=new Director();
			di.setDirectorId(45);
			di.setDirectorName("Karan johar");
			session.save(di);
			
			Director di1=new Director();
			di1.setDirectorId(55);
			di1.setDirectorName("Rajkumar Hirani");
			session.save(di1);
			//create movie object 
			Movie mo=new Movie();
			mo.setMovieName("Student Of Year");
			mo.setReleaseDate(Date.valueOf("2012-05-09"));
			mo.setBudget(55000000L);
			
			Movie mo1=new Movie();
			mo1.setMovieName("3 Idiots");
			mo1.setReleaseDate(Date.valueOf("2009-07-07"));
			mo1.setBudget(45824589L);
			//IMP Associated with director
			mo.setDir(di);
			mo1.setDir(di1);
			
			//save 
			session.save(mo);
			session.save(mo1);
			
			txn.commit();
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
