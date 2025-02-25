package com.kh.practice.farm.model.vo;

import java.util.Objects;

public class Nut extends Farm {
	private String name;

	public Nut() {}

	public Nut(String kind, String name) {
		super(kind); // 부모 클래스의 매개변수있는 생성자를 호출하여 값 전달하여 생성
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(name);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Nut other = (Nut) obj;
		return Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return super.toString() + this.name;
	}
}
