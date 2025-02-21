package com.kh.set;

import java.util.Objects;

public class Student {

	private String name;
	private int age;
	private int score;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(String name, int age, int score) {
		this.name = name;
		this.age = age;
		this.score = score;
	}

	@Override
	public int hashCode() {
//		return Objects.hash(name, age, score);
		
		// String hashCode 사용
		return ("" + name + age + score).hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student std = (Student) obj;
			
			if(this.name.equals(std.getName())
					&& this.age == std.getAge()
					&& this.score == std.getScore()) {
				return true;
			}
		}
		
		return false;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", score=" + score + "]";
	}
}
