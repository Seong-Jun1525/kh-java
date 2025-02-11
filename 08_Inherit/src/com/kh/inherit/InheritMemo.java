package com.kh.inherit;

public class InheritMemo {

	public static void main(String[] args) {
		/**
		 * 상속
		 * - 부모 클래스의 멤버(필드, 메서드)를 자식 클래스에서 그대로 이어받아 사용하는 것
		 * - 실제로 상속된 클래스를 통해 객체 생성 시 부모 클래스의 멤버들도 같이 생성됨
		 * 
		 * 장점
		 * - 적은 양의 코드로 새로운 클래스를 정의하고 사용할 수 있다. => 생산성이 좋다
		 * - 코드를 공통으로 관리하기 때문에 코드의 추가나 수정이 용이하다 => 유지보수성이 좋다
		 * 
		 * 특징
		 * - 부모 클래스의 생성자와 초기화 블록은 상속되지 않음
		 * - 부모 클래스의 private 멤버는 상속은 되지만 직접 접근이 불가하다 => protected 멤버는 직접 접근 가능
		 * - 모든 클래스는 Object 클래스의 후손이다 => 자바에서 제공되는 클래스, 직접 만든 클래스 등등
		 * - 클래스 간의 상속은 단일 상속만 가능(다중 상속 불가)
		 * - 부모 클래스에 정의되어 있는 메서드를 자식 클래스에서 재정의 할 수 있음 => 오버라이딩
		 */
		
		/**
		 * Desktop 클래스
		 * -brand : String
		 * -code : String
		 * -name:String
		 * -price:int
		 * -allInOne:boolean
		 * +Desktop(모든 필드 매개변수로 가짐)
		 * +information():String
		 * 
		 * TV 클래스
		 * -brand : String
		 * -code : String
		 * -name:String
		 * -price:int
		 * -inch:int
		 * +Desktop(모든 필드 매개변수로 가짐)
		 * +information():String
		 **/
	}

}
