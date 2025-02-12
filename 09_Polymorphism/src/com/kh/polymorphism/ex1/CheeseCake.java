package com.kh.polymorphism.ex1;

public class CheeseCake extends Cake {
	
	public void milky() {
		System.out.println("CheeseCake milky");
	}
	
	@Override
	public void yummy() {
		System.out.println("CheeseCake yummy");
	}
}
