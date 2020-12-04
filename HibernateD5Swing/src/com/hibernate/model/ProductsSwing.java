package com.hibernate.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="produtswing")
public class ProductsSwing  {
	@Id
	@Column(name="ProductId")
	private int productId;
	
	@Column(name="ProductName")
	private String productName;
	@Column(name="ProdcutPrice")
	private int productPrice;
	
	public ProductsSwing() {
		super();
	
	}

	@SuppressWarnings("unused")
	private ProductsSwing(int productId, String productName, int productPrice) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}

	@Override
	public String toString() {
		return "ProductsSwing [productId=" + productId + ", productName=" + productName + ", productPrice="
				+ productPrice + "]";
	}
	
	
	
	
		
	

	
	

	
}
