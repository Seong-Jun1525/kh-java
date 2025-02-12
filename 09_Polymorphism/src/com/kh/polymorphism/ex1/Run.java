package com.kh.polymorphism.ex1;

public class Run {

	public static void main(String[] args) {
		/**
		 * 클래스명 참조변수 = new 클래스생성자;
		 * 실제로 어디까지			실제로 어떤 형태로 메모리에
		 * 		접근할수있는가?      			생성되었는가?
		 */
		
		Cake c1 = new CheeseCake();
		// 부모클래스 = 자식클래스 생성가능
		// Cake 클래스 멤버까지 접근 가능하며, 메모리 공간은 CheeseCake 형태로 생성되어 있다
		c1.sweet();
		c1.yummy(); // 오버라이딩된 메서드는 실제 메모리에 있는 재정의된 메서드가 실행된다
		
		// CheeseCake c2 = new Cake(); // type miss match!
		// => 실제 메모리 공간에 Cake 형태로 생성한다면, CheeseCake로 접근할 수 없다
		/** 
		 * CheeseCake ------ Cake
		 * sweet()			sweet()
		 * yummy()			yummy()
		 * milky()			???
		 */
	}

}
