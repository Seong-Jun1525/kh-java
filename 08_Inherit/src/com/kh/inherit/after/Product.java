package com.kh.inherit.after;

public class Product {
	private String brand;
	private String code;
	private String name;
	private int price;

	public Product() {}

	public Product(String brand, String code, String name, int price) {
		super();
		this.brand = brand;
		this.code = code;
		this.name = name;
		this.price = price;
	}
	
	public String information() {
		String result = String.format("brand : %s, code : %s, name : %s, price : %d ", this.brand, this.code, this.name, this.price);
		return result;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
}
