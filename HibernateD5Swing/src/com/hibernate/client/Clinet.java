package com.hibernate.client;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hibernate.model.ProductsSwing;
import com.hibernate.util.HibernateUtil;

@SuppressWarnings("serial")
public class Clinet extends JFrame implements ActionListener{
	Container cp;
	JButton btnSave,btnLoad,btnUpdate,btnClear,btnDelete;
	JLabel lblProductId, lblProductName, lblProductPrice;
	JTextField txtProductId,txtProductName, txtProductPrice;
	JPanel p1,p2;
	private ProductsSwing ps;
	public Clinet() {
		cp=getContentPane();
		cp.setLayout(new FlowLayout(FlowLayout.LEFT,20,20));
		cp.setLayout(new BorderLayout(20,20));
		
		p1=new JPanel();
		p1.setLayout(new GridLayout(3,2,30,30));
		lblProductId=new JLabel("Product Id ");
		lblProductId.setForeground(Color.RED);
		lblProductId.setFont(new Font("Arial",Font.BOLD,25));
		p1.add(lblProductId);
		txtProductId=new JTextField();
		p1.add(txtProductId);
		
		lblProductName=new JLabel("Product Name ");
		lblProductName.setForeground(Color.RED);
		lblProductName.setFont(new Font("Arial",Font.BOLD,25));
		p1.add(lblProductName);
		txtProductName=new JTextField();
		p1.add(txtProductName);
		
		lblProductPrice=new JLabel("Product Price ");
		lblProductPrice.setForeground(Color.RED);
		lblProductPrice.setFont(new Font("Arial",Font.BOLD,25));
		p1.add(lblProductPrice);
		txtProductPrice=new JTextField();
		p1.add(txtProductPrice);
		add(p1,"Center");
		
		p2=new JPanel();
		btnSave=new JButton("SAVE");
		btnSave.addActionListener(this);
		p2.add(btnSave);
		btnLoad=new JButton("Load");
		btnLoad.addActionListener(this);
		p2.add(btnLoad);
		btnUpdate=new JButton("UPDATE");
		btnUpdate.addActionListener(this);
		p2.add(btnUpdate);
		btnDelete=new JButton("DELETE");
		btnDelete.addActionListener(this);
		p2.add(btnDelete);
		btnClear=new JButton("CLEAR ");
		btnClear.addActionListener(this);
		p2.add(btnClear);
		add(p2,"South");
		
		setSize(300, 300);
		setTitle("PRODUCTS DETAILS");
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		cp.setBackground(Color.gray);
	}
	public static void main(String[] args) {
	new	Clinet();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==btnSave) {
			try{
				SessionFactory factory=HibernateUtil.obtainSessionFactory();
			
			Session session = factory.getCurrentSession();
			Transaction txn = (Transaction) session.beginTransaction();	//mandatory	
		
			int a=Integer.parseInt(txtProductId.getText());
			String b=txtProductName.getText();
			int c=Integer.parseInt(txtProductPrice.getText());
			ProductsSwing pp=new ProductsSwing();
			pp.setProductId(a);
			pp.setProductName(b);
			pp.setProductPrice(c);
			session.save(pp);txn.commit();
			}catch(HibernateException e1) {
				e1.printStackTrace();
			}
			}
			
		if(e.getSource()==btnClear) {
			txtProductId.setText("");
			txtProductName.setText("");
			txtProductPrice.setText("");
		}
		
		if(e.getSource()==btnDelete) {
			try {
			SessionFactory factory=HibernateUtil.obtainSessionFactory();
			Session session = factory.getCurrentSession();
			Transaction txn = (Transaction) session.beginTransaction();	//mandatory	
			int a=Integer.parseInt(txtProductId.getText());
			ProductsSwing p1=(ProductsSwing) session.get(ProductsSwing.class, a);
			session.delete(p1);txn.commit();
			}catch(HibernateException e1){
				e1.printStackTrace();
			}
		}
		if(e.getSource()==btnUpdate) {
			try {
			SessionFactory factory=HibernateUtil.obtainSessionFactory();
			Session session = factory.getCurrentSession();
			Transaction txn = (Transaction) session.beginTransaction();	//mandatory	
			int a=Integer.parseInt(txtProductId.getText());
			int b=Integer.parseInt(txtProductPrice.getText());
			ProductsSwing p2=(ProductsSwing) session.get(ProductsSwing.class, a);
			p2.setProductPrice(b);
			session.update(p2);
			txn.commit();
			}catch(HibernateException e1) {
				e1.printStackTrace();
			}
		}
		if(e.getSource()==btnLoad) {
			try {
			SessionFactory factory=HibernateUtil.obtainSessionFactory();
			Session session = factory.getCurrentSession();
			Transaction txn = (Transaction) session.beginTransaction();	//mandatory	
			int a=Integer.parseInt(txtProductId.getText());
		 ProductsSwing ps=(ProductsSwing) session.get(ProductsSwing.class, a);
			if(ps!=null) {
				System.out.println("Prodcut Id :-"+ps.getProductId());
				System.out.println("product Name:-"+ps.getProductName());
				System.out.println("Product Price:-"+ps.getProductPrice());
			}
			else {
				System.out.println("Record Not Found ...........!");
			}
			}catch(HibernateException e1) {
				e1.printStackTrace();
			}
		}
	}
}
