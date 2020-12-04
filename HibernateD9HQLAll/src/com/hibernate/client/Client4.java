package com.hibernate.client;

import java.util.Scanner;


import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import org.hibernate.*;

import com.hibernate.model.Gifts;
import com.hibernate.util.HibernateUtil;

public class Client4 {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try {
			SessionFactory factory=HibernateUtil.obtainSessionFactory();
			Session session=factory.getCurrentSession();
			Transaction txn=(Transaction)session.beginTransaction();
			
			System.out.println("Enter Minimum Number :-");
			int min=sc.nextInt();
			System.out.println("Enter Maximum Number :-");
			int max=sc.nextInt();
			
			Query q=session.createQuery("from Gifts g where g.price between ? and ?");
			q.setParameter(0, min);
			q.setParameter(1, max);
			List<Gifts>	lst=q.list();
			Iterator<Gifts> itr=lst.iterator();
			while(itr.hasNext()) {
				Gifts g=itr.next();
				System.out.println(g);
			}
			
			txn.commit();	
			
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
