package com.hibernate.client;

import java.util.Iterator;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hibernate.model.Gifts;
import com.hibernate.util.HibernateUtil;

public class Client5 {
 
	public static void main(String[] args) {
		try {
			SessionFactory factory=HibernateUtil.obtainSessionFactory();
			Session session=factory.getCurrentSession();
			Transaction txn=(Transaction)session.beginTransaction();
			
			
			
			Query que=session.createQuery("select g.giftName,g.price from Gifts g");
			List lst=que.list();
			Iterator itr=lst.iterator();
				while(itr.hasNext()) {
					Object[] obj=(Object[]) itr.next();
					System.out.println("Gifts Name ="+obj[0]);
					System.out.println("Gifts price="+obj[1]);
					
					
				}
				
				txn.commit();
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
