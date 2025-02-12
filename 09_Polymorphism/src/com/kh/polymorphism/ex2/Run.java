package com.kh.polymorphism.ex2;

public class Run {

	public static void main(String[] args) {
		// [1] 부모 타입 참조 변수(레퍼런스)로 부모 객체를 다루는 경우
		Car c1 = new Car("빨강", "가솔린", 2023);
		// Car ---> Car
		// color, fuel, year
		// drive
		
		c1.drive();
		
		// [2] 자식 타입 참조 변수(레퍼런스)로 자식 객체를 다루는 경우
		Sonata c2 = new Sonata("노랑", "가스", 2025);
		// Sonata ---> Sonata
		// color, fuel, year
		// drive, moveSonata
		c2.drive(); // 오버라이딩을 통해 재정의된 Sonata의 drive가 출력
		c2.moveSonata();
		
		System.out.println("**********");
		
		// [3] 부모 타입의 참조 변수로 자식 객체를 다루는 경우
		Car c3 = c2; // ==> Car c3 = new Sonata();
		// 			Car 		---> 		Sonata
		// color, fuel, year			color, fuel, year
		// drive						drive, moveSonata
		
		c3.drive(); // Sonata drive. 오버라이딩을 통해 재정의된 Sonata의 drive가 출력
		// c3.moveSonata(); => c3 변수는 Car 타입으로 업캐스팅된 상태이므로 moveSonata 메서드가 없으므로 오류 발생
		
		// cs 변수를 활용하여 moveSonata() 호출하기
		((Sonata)c3).moveSonata();
		
		/**
		 * 다형성
		 * - 부모타입으로부터 파생된 여러 타입의 자식 객체들을
		 * 		부모타입 하나로 다룰 수 있는 기술
		 * 
		 * - 장점 : 하나의 부모 타입만으로 여러 자식 객체들을 다룰 수 있어 편리하고
		 * 				코드길이감소됨
		 * 
		 * 클래스 간의 형변환(상속관계에서만 가능)
		 * - 업캐스팅 : 자식타입에서 부모타입으로 형변환. 자동형변환
		 * 
		 * - 다운캐스팅 : 부모타입에서 자식타입으로 형변환. 강제형변환
		 * 
		 * 동적바인딩
		 * - 프로그램이 실행되기 전에는 컴파일 되면서 정적바인딩됨!
		 * 		(=> 팜조변수타입의 메서드를 가리킴)
		 * 		단 실질적으로 참조하는 자식 클래스에 해당 메서드가 오버라이딩되어 있으면
		 * 		프로그램 실행 시 동적으로 해당 클래스의 오버라이딩된 메서드를 찾아서 실행
		 */

		System.out.println("**********");
		// 다형성을 사용하기 전
		Sonata[] sArr = new Sonata[3];
		sArr[0] = new Sonata("black", "가솔린", 0);
				
		Car[] cArr = new Car[5];
		
		for(int i = 0; i < cArr.length; i++) {
			if(i > 2) cArr[i] = new Avante("blue", "가솔린", i + 100);
			else cArr[i] = new Sonata("red", "가스", i + 100);
		}
		
		// null 값이 있으면 오류가 발생하기 때문에 항상 null값인지 아닌지를 체크하자!
		
		for(Car c : cArr) {
			if(c != null) {
				c.drive();
				if(c instanceof Sonata) {
					((Sonata)c).moveSonata();
				} else if(c instanceof Avante) {
					((Avante)c).moveAvante();
				}
			}
		}

		System.out.println("**********");
		for(int i = 0; i < cArr.length; i++) {
			if(cArr[i] != null) {
				cArr[i].drive();
				
				if(cArr[i] instanceof Sonata) {
					((Sonata)cArr[i]).moveSonata();
				} else if(cArr[i] instanceof Avante) {
					((Avante)cArr[i]).moveAvante();
				}
			}
		}
	 }

}
