package com.kh.practice3.controller;

import com.kh.practice3.model.vo.Animal;
import com.kh.practice3.model.vo.Cat;
import com.kh.practice3.model.vo.Dog;

public class AnimalManager {

	public static void main(String[] args) {
		Animal[] ani = new Animal[5];
		String[] catArr = {"기쁨이", "평화", "사랑이", "믿음이", "루팡이", "온화"};
		String[] dogArr = {"대박이", "하루", "통키"};
		
		for(int i = 0; i < ani.length; i++) {
			int r = (int)(Math.random() * 2) + 1;
			
			switch(r) {
				case 1:
					ani[i] = new Dog(dogArr[(int) (Math.random() * dogArr.length)], "포메", 5);
					break;
				case 2:
					ani[i] = new Cat(catArr[(int) (Math.random() * catArr.length)], "코숏", "인천", "검정");
					break;
			}
		}
		
		for(int i = 0; i < ani.length; i++) {
			if(ani[i] != null) {
				if(ani[i] instanceof Dog) {
					((Dog)ani[i]).speak();
				} else if(ani[i] instanceof Cat) {
					((Cat)ani[i]).speak();
				}
			}
		}
	}

}
