package com.hibernate.client;

import java.util.Scanner;

import javax.swing.text.StyledEditorKit.BoldAction;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hibernate.model.Address;
import com.hibernate.model.Batsman;
import com.hibernate.model.Bowler;
import com.hibernate.model.Players;
import com.hibernate.util.HibernateUtil;

public class Client {
	 
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try {
			SessionFactory factory=HibernateUtil.obtainSessionFactory();
			Session session = factory.getCurrentSession();
			Transaction txn = (Transaction) session.beginTransaction();	
			
			
			  Address dd=new Address();
			  dd.setStreet("juhu road");
			  dd.setCity("mumbai");
			  dd.setCountry("india");
			  dd.setZip("421503");
			  Address dd1=new Address();
			  dd1.setStreet("gandhi chowk");
			  dd1.setCity("Gujrat");
			  dd1.setCountry("india");
			  dd1.setZip("421518");
			  
			  Batsman bt=new Batsman(); 
			  bt.setPlayerId(18);
			  bt.setPlayerName("virat kohli");
			  bt.setResAddr(dd);
			  bt.setNumMatches(145);
			  bt.setNumRuns(5568);
			  
			  Bowler bl=new Bowler();
			  bl.setPlayerId(99);
			  bl.setPlayerName("Mohammed Shami");
			  bl.setNumMatches(54);
			  bl.setResAddr(dd1);
			  bl.setNumWickets(48);			   
			  
			  session.save(bt);
			  session.save(bl);
			  System.out.println("Done!!");		
			
			txn.commit(); //here session is closed automatically
			
		} catch (HibernateException e) {
			e.printStackTrace();
		}
	}
}
/*
 * System.out.println("Enter Player ID :-"); int pId=sc.nextInt();
 * System.out.println("Enter Player Name :-"); String pName=sc.next();
 * System.out.println("Enter Player Number Of Matches :-"); int
 * pMatch=sc.nextInt();
 * 
 * System.out.println("Enter Street :-"); String st=sc.next();
 * System.out.println("Enter City :-"); String ci=sc.next();
 * System.out.println("Enter Country :-"); String co=sc.next();
 * System.out.println("Enter pincode :-"); String pin=sc.next();
 * 
 * System.out.println("Enter Numbers of Runs :-"); long runs=sc.nextLong();
 * System.out.println("Enter Numbers of Wicketes :-"); long wik=sc.nextLong();
 */