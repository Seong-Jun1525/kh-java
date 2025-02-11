package com.kh.inherit.before;

public class Desktop {
	private String brand;
	private String code;
	private String name;
	private int price;
	protected boolean allInOne;
	
	public Desktop() {}
	
	public Desktop(String brand, String code, String name, int price, boolean allInOne) {
		super();
		this.brand = brand;
		this.code = code;
		this.name = name;
		this.price = price;
		this.allInOne = allInOne;
	}
	
	public String information() {
		String result = String.format("brand : %s, code : %s, name : %s, price : %d, allInOne : %b", brand, code, name, price, allInOne);
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
	public boolean isAllInOne() {
		return allInOne;
	}
	public void setAllInOne(boolean allInOne) {
		this.allInOne = allInOne;
	}
}
