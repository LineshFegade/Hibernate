package com.hibernate.client;
import org.hibernate.*;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import com.hibernate.model.Products;
public class Client {
public static void main(String[] args) {
	try {
		Configuration config=new Configuration().configure();
		ServiceRegistry registry=new StandardServiceRegistryBuilder().applySettings(config.getProperties()).build();
		SessionFactory factory=config.buildSessionFactory(registry);
		Session session = factory.getCurrentSession();
		Transaction txn = (Transaction) session.beginTransaction();	//mandatory	
	
	//save a new record
		Products pr=new Products();
		pr.setCode(104);
		pr.setName("Aircondition");
		pr.setPrice(35599);
		session.save(pr);
		
		txn.commit(); //here session is closed automatically
		System.out.println("Done!!");
	} catch (HibernateException e) {
		e.printStackTrace();
	}		

}
}
