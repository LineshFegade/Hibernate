package com.hibernate.client;



import javax.persistence.Query;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.mapping.List;

import com.hibernate.model.Gifts;
import com.hibernate.util.HibernateUtil;

public class GiftClient1 {
	public static void main(String[] args) {
		try {
			SessionFactory factory=HibernateUtil.obtainSessionFactory();
			Session session=factory.getCurrentSession();
			Transaction txn=(Transaction)session.beginTransaction();
			
			
			  Gifts g1=new Gifts(1, "Wall Clock", "clock", 1500L); Gifts g2=new Gifts(2,
			  "Ink Pen ", "pen", 750L); Gifts g3=new Gifts(3, "Remot control Car",
			  "toy",4500L); Gifts g4=new Gifts(4, "Teddy Bear ", "soft toy", 980L); Gifts
			  g5=new Gifts(5, "Photo Printed Coffee Cup", "cup", 1250L); Gifts g6=new
			  Gifts(6, "Skinn perfume", "perfume", 570L); Gifts g7=new Gifts(7,
			  " sport Shoes ", "shose", 1890L); Gifts g8=new Gifts(8, "Shirt ", "cloth",
			  2000L); Gifts g9=new Gifts(9, "Jense pant", "cloth", 3000L); Gifts g10=new
			  Gifts(10, "Wallet", "accessories", 1300L); Gifts g11=new Gifts(11,
			  " Photo fream ", "accessories", 2500L); Gifts g12=new Gifts(12, "SunGlasses",
			  "accessories", 2300L); Gifts g13=new Gifts(13, "Watch", "accessories",
			  6000L); Gifts g14=new Gifts(14, "Flower Pot ", "Show piece", 780L);
			  
			  session.save(g1);session.save(g2);session.save(g3);session.save(g4);session.
			  save(g5);session.save(g6);
			  session.save(g7);session.save(g8);session.save(g9);session.save(g11);session.
			  save(g10);session.save(g12); session.save(g13);session.save(g1);
			 
			
			
			
			
			txn.commit();
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
