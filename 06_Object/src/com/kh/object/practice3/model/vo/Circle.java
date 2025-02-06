package com.kh.object.practice3.model.vo;

public class Circle {
	private static double PI = 3.14;
	private static int radius = 1;
	
	public Circle() {}

	public void incrementRadius() {
		radius++;
	}
	
	public void getAreaOfCircle() {
		System.out.println(2 * radius * PI);
	}
	
	public void getSizeOfCircle() {
		System.out.println(radius * radius * PI);
	}
}
