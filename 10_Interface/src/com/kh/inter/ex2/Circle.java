package com.kh.inter.ex2;

public class Circle implements Shape {
	// Shape 인터페이스를 상속(구현) -> implements 키워드 사용!
	private double radius;
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	@Override
	public double calculateArea() {
		// 원의 넓이 = 반지름 * 반지름 * 3.14... 
		return radius*radius*Math.PI;
	}
}
