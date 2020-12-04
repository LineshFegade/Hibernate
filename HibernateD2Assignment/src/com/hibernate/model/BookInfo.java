package com.hibernate.model;

public class BookInfo {
	private int bookCode;
	private String bookTitle;
	private String bookAuthor;
	private String bookPublishDate;
	public BookInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BookInfo(int bookCode, String bookTitle, String bookAuthor, String bookPublishDate) {
		super();
		this.bookCode = bookCode;
		this.bookTitle = bookTitle;
		this.bookAuthor = bookAuthor;
		this.bookPublishDate = bookPublishDate;
	}
	public int getBookCode() {
		return bookCode;
	}
	public void setBookCode(int bookCode) {
		this.bookCode = bookCode;
	}
	public String getBookTitle() {
		return bookTitle;
	}
	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}
	public String getBookAuthor() {
		return bookAuthor;
	}
	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}
	public String getBookPublishDate() {
		return bookPublishDate;
	}
	public void setBookPublishDate(String bookPublishDate) {
		this.bookPublishDate = bookPublishDate;
	}
	@Override
	public String toString() {
		return "BookInfo [bookCode=" + bookCode + ", bookTitle=" + bookTitle + ", bookAuthor=" + bookAuthor
				+ ", bookPublishDate=" + bookPublishDate + "]";
	}
	
	
}
