package com.kh.practice.farm.model.vo;

import java.util.Objects;

public class Fruit extends Farm {
	private String name;
	
	public Fruit() {}

	public Fruit(String kind, String name) {
		super(kind);
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
		return Objects.hash(name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Fruit other = (Fruit) obj;
		return Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return super.toString() + this.name;
	}
}
