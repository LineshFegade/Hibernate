package com.hibernate.client;

import java.util.Scanner;

import javax.swing.text.StyledEditorKit.BoldAction;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.engine.jdbc.batch.internal.BasicBatchKey;

import com.hibernate.model.Address;
import com.hibernate.model.Batsman;
import com.hibernate.model.Bowler;
import com.hibernate.model.Players;
import com.hibernate.util.HibernateUtil;

public class LoadClient {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int pId;
		try {
			SessionFactory factory=HibernateUtil.obtainSessionFactory();
			Session session = factory.getCurrentSession();
			Transaction txn = (Transaction) session.beginTransaction();	//mandatory	
	
			 System.out.println("Enter player Id:-");
			 pId=sc.nextInt();
			 Players p=(Players) session.get(Players.class, pId);
			
			 if(p!=null) {
				 System.out.println("Player Id :-"+p.getPlayerId());
				 System.out.println("Player Name :-"+p.getPlayerName());
				 System.out.println("Player played matches :-"+p.getNumMatches());
				 System.out.println("Player Address :-"+p.getResAddr());
			 }
			 if(p instanceof Batsman) {
				 Batsman b1=(Batsman) p;
				 System.out.println("player Runs :-"+b1.getNumRuns());
			 }
			 if(p instanceof Bowler) {
				 Bowler b2=(Bowler)p;
				 System.out.println("Player Wickets :-"+b2.getNumWickets());
			 }
			  System.out.println("Done!!");		
			
			txn.commit(); //here session is closed automatically
			
		} catch (HibernateException e) {
			e.printStackTrace();
		}
	}
}
