package com.kh.inter.ex1;

public class Dog implements Animal {

	@Override
	public void move() {
		System.out.println("Dog가 총총 걸어갑니다.");
	}

	@Override
	public void eat() {
		System.out.println("Dog가 뼈다귀를 먹습니다.");
	}

	@Override
	public void makeSound() {
		System.out.println("멍! 멍!!");
	}
}
