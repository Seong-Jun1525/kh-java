package com.kh.inherit.after;

public class TV extends Product{
	private int inch;
	
	public TV() {}
	
	public TV(String brand, String code, String name, int price, int inch) {
		super(brand, code, name, price);
		this.inch = inch;
	}
	
	public String information() {
		String superR = super.information() + " || ";
		String result = String.format("inch : %d", inch);
		return superR + result;
	}

	public int getInch() {
		return inch;
	}

	public void setInch(int inch) {
		this.inch = inch;
	}
}
