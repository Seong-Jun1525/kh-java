package com.kh.practice.point.model.vo;

public class Circle extends Point {
	private int radius;
	
	public Circle() {}

	public Circle(int x, int y, int radius) {
		super(x, y);
		this.radius = radius;
	}
	
	public String toString() {
		String pointToString = super.toString();
		return pointToString + "/ 반지름 : " + this.radius;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

}
