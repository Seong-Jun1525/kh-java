package com.kh.inherit.before;

public class TV {	
	private String brand;
	private String code;
	private String name;
	private int price;
	private int inch;
	
	public TV() {}
	
	public TV(String brand, String code, String name, int price, int inch) {
		super();
		this.brand = brand;
		this.code = code;
		this.name = name;
		this.price = price;
		this.inch = inch;
	}

	public String information() {
		String result = String.format("brand : %s, code : %s, name : %s, price : %d, inch : %d", brand, code, name, price, inch);
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

	public int getInch() {
		return inch;
	}

	public void setInch(int inch) {
		this.inch = inch;
	}
}
