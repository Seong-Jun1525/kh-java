package com.kh.polymorphism.ex2;

public class Avante extends Car {

	public Avante() { }

	public Avante(String color, String fuel, int year) {
		super(color, fuel, year);

		// setter를 사용해도 됨
	}
	
	@Override
	public void drive() {
		System.out.println("Avante drive!!!");
	}
	
	public void moveAvante() {
		System.out.println("Avante moveAvante!!!");
	}

}
