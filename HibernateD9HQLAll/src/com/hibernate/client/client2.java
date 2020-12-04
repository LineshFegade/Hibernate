package com.hibernate.client;


import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import org.hibernate.*;

import com.hibernate.model.Gifts;
import com.hibernate.util.HibernateUtil;

public class client2 {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
			try {
				SessionFactory factory=HibernateUtil.obtainSessionFactory();
				Session session=factory.getCurrentSession();
				Transaction txn=(Transaction)session.beginTransaction();
				
				
				
				Query q=session.createQuery("from Gifts g");
					List<Gifts>	lst=q.list();
					Iterator<Gifts> itr=lst.iterator();
					while(itr.hasNext()) {
						Gifts g=itr.next();
						System.out.println(g.getGiftId()+"->"+g.getGiftName()+"->"+g.getCategory()+"->"+g.getPrice());
					}
					
					txn.commit();
			} catch (HibernateException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}
}
