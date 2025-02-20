package com.kh.generic.ex4;

public class Run {

	public static void main(String[] args) {
		DBox<String, Integer> dBox1 = new DBox<>();
		dBox1.set("임성준", 25);
//		dBox1.set(25, "임성준"); // 순서가 다르므로 에러발생!
		System.out.println(dBox1);
		
		DBox<Double, Boolean> dBox2 = new DBox<>();
		dBox2.set(12.34, false);
		System.out.println(dBox2);
	}

}
