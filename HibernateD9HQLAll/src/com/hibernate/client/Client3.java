package com.hibernate.client;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import javax.transaction.HeuristicMixedException;
import javax.transaction.HeuristicRollbackException;
import javax.transaction.RollbackException;
import javax.transaction.SystemException;
import javax.transaction.Transaction;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.hibernate.model.Gifts;
import com.hibernate.util.HibernateUtil;

public class Client3 {
	@SuppressWarnings({ "resource", "unchecked" })
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		try {
			SessionFactory factory=HibernateUtil.obtainSessionFactory();
			Session session=factory.getCurrentSession();
			Transaction txn=(Transaction)session.beginTransaction();
			
			
			System.out.println("Enter Category :-");
			String ct=sc.next();
			Query que=session.createQuery("from Gifts g where g.category =?");
				que.setParameter(0, ct);
				List<Gifts>	lst=que.list();
				Iterator<Gifts> itr=lst.iterator();
				while(itr.hasNext()) {
					Gifts g=itr.next();
					System.out.println(g);
				}
				try {
					txn.commit();
				} catch (SecurityException | RollbackException | HeuristicMixedException | HeuristicRollbackException
						| SystemException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}	
				
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
