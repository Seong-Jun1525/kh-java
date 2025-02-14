package com.kh.practice3.model.vo;

public class Dog extends Animal {
	public static final String PLACE = "애견카페";
	private int weight;

	public Dog() {} // 명시하지 않을 경우 부모 클래스의 기본 생성자가 실행됨. super();

	public Dog(String name, String kinds, int weight) {
		super(name, kinds);
		this.weight = weight;
	}

	@Override
	public void speak() {
		System.out.println(String.format(super.toString() + " 몸무게는 %dkg입니다.", this.weight));
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public static String getPlace() {
		return PLACE;
	}

}
