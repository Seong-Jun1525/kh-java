package com.kh.object.ex5;

public class Person {

	/**
	 * static
	 * - 정적 메모리를 사용하여 프로그램 실행 시점에
	 *   객체 생성없이 메모리에 생성되며 모든 객체가 공유하여 사용할 수 있음
	 *   
	 * * 클래스 변수(static으로 선언된 변수)
	 * => 한 클래스에서 공통적인 값을 유지해야할 때 사용
	 *    클래스명.변수명으로 사용가능하고,
	 *    참조변수명.클래스변수명으로도 사용 가능함
	 *    
	 * * 클래스 메서드(static으로 선언된 메서드)
	 * => 인스턴스 변수를 사용할 수 없음
	 *    따라서 인스턴스와 관계없는 메서드임
	 *    단순한 기능(인스턴스 생성없이 제공하고자 할 경우)
	 *    클래스명.메서드명으로 호출 가능
	 */
	
	String name; // 이름
	int age;     // 나이
	static int count = 0;	 // 인스턴스 생성 시 개수
	
	// 생성자
	public Person() {
		count++;
	}
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
		count++;
	}
	@Override
	public String toString() {
		return "이름 : " + name + "\n나이 :" + age + "\n번호" + count;
	}
}
