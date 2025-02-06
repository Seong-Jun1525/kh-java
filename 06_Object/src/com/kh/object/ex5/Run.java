package com.kh.object.ex5;

public class Run {

	public static void main(String[] args) {
		Person p1 = new Person();
		
		p1.name = "홍길동";
		p1.age = 20;
		
		System.out.println(p1.toString());
		
		Person p2 = new Person();
		
		p2.name = "홍길마동";
		System.out.println(p2.toString());
		
		System.out.println(Math.PI);
		System.out.println(Math.random());
	}

}
