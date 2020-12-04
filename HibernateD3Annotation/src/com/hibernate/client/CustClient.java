package com.hibernate.client;
import java.util.Scanner;

import org.hibernate.*;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import com.hibernate.model.Customer;
public class CustClient {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int ch = 0;
	int custId;
	String CustName;
	String DateOfBirth;
	Long ContactNo;
	do {
	
	try {
		Configuration config=new Configuration().configure();
		ServiceRegistry registry=new StandardServiceRegistryBuilder().applySettings(config.getProperties()).build();
		SessionFactory factory=config.buildSessionFactory(registry);
		Session session = factory.getCurrentSession();
		Transaction txn = (Transaction) session.beginTransaction();	//mandatory	
	
		System.out.println("\n1.Save Book.\n2.get Book \n3.update Book \n4.Delete Book");
		System.out.println("Enter Your choice :-");
		ch=sc.nextInt();
		 switch (ch) {
		case 1://save data
			System.out.println("Enter customer code :-");
			custId=sc.nextInt();
			System.out.println("Enter Customer Name :-");
			CustName=sc.next();
			System.out.println("Enter Customer Contact number :-");
			ContactNo=sc.nextLong();
			System.out.println("Enter Customer BirthDate :-");
			DateOfBirth=sc.next();
			Customer cust=new Customer();
			cust.setCustId(custId);
			cust.setCustName(CustName);
			cust.setContactNo(ContactNo);
			cust.setBirthDate(DateOfBirth);
			session.save(cust);
			System.out.println("Done!!");
			break;
		case 2:
			//get Record
			System.out.println("Enter Customer Id :-");
			custId=sc.nextInt();
			Customer cust2=(Customer) session.get(Customer.class, custId);
			if(cust2 !=null) {
				System.out.println("Book code :-"+cust2.getCustId());
				System.out.println("Book Title :-"+cust2.getCustName());
				System.out.println("Book Author :-"+cust2.getContactNo());
				System.out.println("Book Publication Date :-"+cust2.getBirthDate());
			}
			else {
				System.out.println("Record not Found.....!!!");
			}
			System.out.println("Done!!");
			break;
		case 3:
			//update the record
			System.out.println("Enter Customer code for update the details :-");
			custId=sc.nextInt();
			System.out.println("Enter Customer Name :-");
			CustName=sc.next();
			System.out.println("Enter customer contact no :-");
			ContactNo=sc.nextLong();
			System.out.println("Enter Customer BirthDate :-");
			DateOfBirth=sc.next();
			Customer cust3=(Customer) session.get(Customer.class, custId);
			cust3.setCustId(custId);
			cust3.setCustName(CustName);
			cust3.setContactNo(ContactNo);
			cust3.setBirthDate(DateOfBirth);
			session.update(cust3);
			System.out.println("UPDATED.......!!");
			break;
		case 4:
			//delete record
			System.out.println("Enter customer Id for delete the record :-");
			custId=sc.nextInt();
			Customer cust4=(Customer) session.get(Customer.class, custId);
			session.delete(cust4);
			System.out.println("DELETED..........!!");
		default:
			System.out.println("Wrong Choice.............!!!!!!!!!!!");
		}
		
		txn.commit(); //here session is closed automatically
		
	} catch (HibernateException e) {
		e.printStackTrace();
	}
	}while(ch!=4);
}
}
