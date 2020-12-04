package com.hibernate.client;

import java.util.Scanner;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import com.hibernate.model.Address;
import com.hibernate.model.EducationalDetails;
import com.hibernate.model.PersonalDetails;
import com.hibernate.model.Profile;
import com.hibernate.util.HibernateUtil;

public class ProfileClient {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int ch = 0;
	try {
		SessionFactory factory=HibernateUtil.obtainSessionFactory();
		Session session = factory.getCurrentSession();
		Transaction txn = (Transaction) session.beginTransaction();	//mandatory	
	
		System.out.println("\n1.Save profile.\n2.get profile \n3.update profile \n4.Delete profile");
		System.out.println("Enter Your choice :-");
		ch=sc.nextInt();
		 switch (ch) {
		case 1://save data
			System.out.println("Enter profile code :-");
			int p1=sc.nextInt();
			System.out.println("Enter profile creationDate :-");
			String p2=sc.next();
			System.out.println("Enter First name :-");
			String p3=sc.next();
			System.out.println("Enter Last Name:-");
			String p4=sc.next();
			System.out.println("Enter BirthDate :-");
			String p5=sc.next();
			System.out.println("Enter Email id :-");
			String p6=sc.next();
			System.out.println("Enter Contact Number :-");
			String p7=sc.next();
			System.out.println("Enter Gender :-");
			String p8=sc.next();
			System.out.println("Enter Street :-");
			String p9=sc.next();
			System.out.println("Enter City :-");
			String p10=sc.next();
			System.out.println("Enter Country :-");
			String p11=sc.next();
			System.out.println("Enter pincode :-");
			String p12=sc.next();
			System.out.println("Enter Qulification :-");
			String p13=sc.next();
			System.out.println("Enter Result :-");
			String p14=sc.next();
			System.out.println("Enter passing year :-");
			int p15=sc.nextInt();
			PersonalDetails personal=new PersonalDetails();
			personal.setFirstName(p3);personal.setLastName(p4);personal.setBirthDate(p5);personal.setEmailId(p6);personal.setContactNo(p7);personal.setGender(p8);
			Address ad=new Address();
			ad.setStreet(p9);ad.setCity(p10);ad.setCountry(p11);ad.setZip(p11);
			EducationalDetails ed=new EducationalDetails();
			ed.setQualification(p13);ed.setResult(p14);ed.setYearPassing(p15);
			Profile p17=new Profile();
			p17.setProfileId(p1);
			p17.setCreationDate(p2);
			p17.setPerInfo(personal);
			p17.setEduInfo(ed);
			session.save(p17);
			System.out.println("Done!!");
			break;
		case 2:
			//get Record
			System.out.println("Enter profile Id :-");
			int proId=sc.nextInt();
			Profile pp2=(Profile) session.get(Profile.class, proId);
			if(pp2 !=null) {
				System.out.println("profile code :-"+pp2.getProfileId());
				System.out.println("profile  profile contain date:-"+pp2.getCreationDate());
				System.out.println("profile  personal information :-"+pp2.getPerInfo());
				System.out.println("profile Education info :-"+pp2.getEduInfo());
			}
			else {
				System.out.println("Record not Found.....!!!");
			}
			System.out.println("Done!!");
			break;
		case 3:
			//update the record
			System.out.println("Enter profile Id :-");
			int pid=sc.nextInt();
			System.out.println("Enter qQualifications :-");
			String que=sc.next();
			System.out.println("Enter Result");
			String res=sc.nextLine();
			System.out.println("Enter Year of Passing :-");
			int pass=sc.nextInt();
				/*
				 * EducationalDetails edu=new EducationalDetails(); edu.setQualification(que);
				 * edu.setResult(res); edu.setYearPassing(pass);
				 */
			Profile pp7=new Profile();
			pp7.setEduInfo(new EducationalDetails(que, res, pass));
			session.update(pp7);
			System.out.println("UPDATED.......!!");
			break;
		case 4:
			//delete record
			System.out.println("Enter profile Id for delete the record :-");
			 int proid=sc.nextInt();
			 Profile pp3=(Profile) session.get(Profile.class, proid);
			session.delete(pp3);
			System.out.println("DELETED..........!!");
		default:
			System.out.println("Wrong Choice.............!!!!!!!!!!!");
		}
		
		txn.commit(); //here session is closed automatically
		
	} catch (HibernateException e) {
		e.printStackTrace();
	}
}
}
