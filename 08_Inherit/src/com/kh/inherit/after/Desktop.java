package com.kh.inherit.after;

public class Desktop extends Product {
	protected boolean allInOne;
	
	public Desktop() {}

	public Desktop(String brand, String code, String name, int price, boolean allInOne) {
		super(brand, code, name, price);
		this.allInOne = allInOne;
	}
	
	public String information() {
		String superR = super.information() + " || ";
		String result = String.format("allInOne : %b", allInOne);
		return superR + result;
	}

	public boolean isAllInOne() {
		return allInOne;
	}

	public void setAllInOne(boolean allInOne) {
		this.allInOne = allInOne;
	}
}
