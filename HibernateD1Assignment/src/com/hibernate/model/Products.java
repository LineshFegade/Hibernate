package com.hibernate.model;

public class Products {
	private int code;
	private String name;
	private long price;
	public Products() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Products(int code, String name, long price) {
		super();
		this.code = code;
		this.name = name;
		this.price = price;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getPrice() {
		return price;
	}
	public void setPrice(long price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Products [code=" + code + ", name=" + name + ", price=" + price + "]";
	}
	
	
}
