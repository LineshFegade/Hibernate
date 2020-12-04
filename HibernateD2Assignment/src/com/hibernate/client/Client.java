package com.hibernate.client;
import java.util.Scanner;
import org.hibernate.*;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import com.hibernate.model.BookInfo;
public class Client {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int code;
	String bookTitle;
	String bookAuthor;
	String publishdate;
	try {
		Configuration config=new Configuration().configure();
		ServiceRegistry registry=new StandardServiceRegistryBuilder().applySettings(config.getProperties()).build();
		SessionFactory factory=config.buildSessionFactory(registry);
		Session session = factory.getCurrentSession();
		Transaction txn = (Transaction) session.beginTransaction();	//mandatory	
	int ch;
	System.out.println("Enter Your choice :-\n1.Save Book.\n2.get Book \n3.update Book \n4.Delete Book");
	ch=sc.nextInt();
	switch (ch) {
	case 1:
		//save a new record
		
		System.out.println("Enter book title :-");
		bookTitle=sc.nextLine();
		System.out.println("Enter Book Author :-");
		bookAuthor=sc.nextLine();
		System.out.println("Enter Publish Date in YY-MM-DD format :-");
		publishdate=sc.nextLine();
		BookInfo book1=new BookInfo();
		book1.setBookTitle(bookTitle);
		book1.setBookAuthor(bookAuthor);
		book1.setBookPublishDate(publishdate);
		session.save(book1);
		txn.commit();
		break;
	
	case 2:
		//get the record
		
		System.out.println("Enter the Book Code :-");
		code=sc.nextInt();
		BookInfo book2=(BookInfo) session.get(BookInfo.class,code);
		if(book2 !=null) {
			System.out.println("Book code :-"+book2.getBookCode());
			System.out.println("Book Title :-"+book2.getBookTitle());
			System.out.println("Book Author :-"+book2.getBookAuthor());
			System.out.println("Book Publication Date :-"+book2.getBookPublishDate());
		}
		else {
			System.out.println("Record not Found.....!!!");
		}
		break;
	case 3:
		//Update the record
		
		System.out.println("Enter the book for update the record :-");
		code=sc.nextInt();
		System.out.println("Enter Author name :-");
		bookAuthor=sc.nextLine();
		BookInfo book3=(BookInfo) session.get(BookInfo.class,code);
		book3.setBookAuthor(bookAuthor);
		session.update(book3);
		txn.commit();
		System.out.println("UPDATED...!!");
		break;
		
	case 4:
		//delete the record.
		System.out.println("Enter the book code for delete the data :-");
		code=sc.nextInt();
		BookInfo book4=(BookInfo) session.get(BookInfo.class,code);
		session.delete(book4);
		txn.commit();
		System.out.println("DELETED .....!!!!!");
		break;
	default:
	System.out.println("Wrong Choce ........!");
	}
	
	} catch (HibernateException e) {
		e.printStackTrace();
	}		


}
}
