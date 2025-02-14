package com.kh.practice3.model.vo;

// 추상 클래스는 클래스 다이어그램에서 클래스명을 기울여서 표현 ★
// 추상 클래스는 인스턴스를 생성할 수 없음
// 		단, 참조자료형으로 사용할 수 있음
public abstract class Animal {
	private String name;
	private String kinds;
	
	protected Animal() {}
	// 클래스 다이어그램에서 #으로 표현 ★
	// protected 접근 제한자를 사용하여 생성자를 정의하게 되면
	// 해당 클래스는 같은 패키지 내에서 또는 상속 관계에서만 인스턴스를 생성할 수 있음
	// -> 현재 클래스는 추상 클래스로 직접 생성은 불가
	// 이 클래스를 상속 받은 클래스에서만 super() 생성자를 사용하여 실행할 것임

	protected Animal(String name, String kinds) {
		this.name = name;
		this.kinds = kinds;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getKinds() {
		return kinds;
	}

	public void setKinds(String kinds) {
		this.kinds = kinds;
	}

	@Override
	public String toString() {
		// Object의 toString 메서드를 재정의함!
		// 보통 toString 메서드는 현재 클래스의 모든 필드의 정보를
		// 문자열로 반환하는 역할을 하도록 재정의됨
		// => 참조변수를 문자열로 사용할 때, toString 메서드 호출됨
		return String.format("저의 이름은 %s이고, 종류는 %s입니다.", this.name, this.kinds);
	}
	
	public abstract void speak();
}
