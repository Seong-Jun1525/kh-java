package com.kh.object.practice2.model.vo;

public class Product {
	private String productName;
	private int price;
	private String brand;
	
	public Product() {}
	
	public void information() {
		System.out.println("제품명 : " + productName);
		System.out.println("제품가격 : " + price);
		System.out.println("제조회사 : " + brand);
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
}
