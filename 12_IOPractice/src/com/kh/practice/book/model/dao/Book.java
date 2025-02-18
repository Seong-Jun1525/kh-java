package com.kh.practice.book.model.dao;

import java.io.Serializable;

public class Book implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String title;
	private String author;
	private int price;
	private String date;
	private double discount;

	public Book() {
		// TODO Auto-generated constructor stub
	}
	
	public Book(String title, String author, int price, String date, double discount) {
		this.title = title;
		this.author = author;
		this.price = price;
		this.date = date;
		this.discount = discount;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	@Override
	public String toString() {
		String r = String.format("%s" + "\t" + "%s" + "\t" + "%d" + "\t" + "%s" + "\t" + "%.1f", title, author, price, date, discount);
		return r;
	}

	
}
