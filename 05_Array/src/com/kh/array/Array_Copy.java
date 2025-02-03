package com.kh.array;

public class Array_Copy {

	public static void main(String[] args) {
		int[] origin = {1, 2, 3, 4, 5};
		
		System.out.println("===원본 배열 출력===");
		for(int o : origin) System.out.print(o + " ");
		
		System.out.println();
		
		int[] copy = origin; // 얕은복사 : 주소값 복사

		System.out.println("===복사본 배열 출력");
		for(int c : copy) System.out.print(c + " ");
	}

}
