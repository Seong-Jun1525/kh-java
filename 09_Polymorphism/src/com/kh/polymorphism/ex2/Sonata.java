package com.kh.polymorphism.ex2;

public class Sonata extends Car {

	public Sonata() { }
	
	public Sonata(String color, String fuel, int year) {
		super(color, fuel, year);
		
		// setter를 사용해도 됨
	}
	
	@Override
	public void drive() {
		System.out.println("Sonata drive!!!");
	}
	
	public void moveSonata() {
		System.out.println("Sonata moveSonata!!!");
	}

}
