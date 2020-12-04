package com.hibernate.model;

import javax.persistence.*;

@Entity
@Table(name="hib_giftsinfo")
public class Gifts {
	@Id
	@Column(name="gift_id")
	private int giftId;
	
	@Column(name="gift_Name")
	private String giftName;
	
	@Column(name="gift_category")
	private String category;
	
	@Column(name="gift_price")
	private int price;

	public Gifts() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Gifts(int giftId, String giftName, String category, int price) {
		super();
		this.giftId = giftId;
		this.giftName = giftName;
		this.category = category;
		this.price = price;
	}

	public int getGiftId() {
		return giftId;
	}

	public void setGiftId(int giftId) {
		this.giftId = giftId;
	}

	public String getGiftName() {
		return giftName;
	}

	public void setGiftName(String giftName) {
		this.giftName = giftName;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Gifts [giftId=" + giftId + ", giftName=" + giftName + ", category=" + category + ", price=" + price
				+ "]";
	}
	
	
	
	
}
