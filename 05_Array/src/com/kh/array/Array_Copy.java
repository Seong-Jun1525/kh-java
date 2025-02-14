package com.kh.array;

public class Array_Copy {

	public static void main(String[] args) {
		lightCopy();
		deepCopy();
	}

	// 얕은 복사 => 주소값 복사
	private static void lightCopy() {
		int[] origin = {1, 2, 3, 4, 5};
		
		System.out.println("===원본 배열 출력===");
		for(int o : origin) System.out.print(o + " ");
		
		System.out.println();
		
		int[] copy = origin; // 얕은복사 : 주소값 복사

		System.out.println("===복사본 배열 출력");
		for(int c : copy) System.out.print(c + " ");
		System.out.println();
		
		copy[2] = 999;

		System.out.println("===원본 배열 출력===");
		for(int o : origin) System.out.print(o + " ");
		
		System.out.println();
		
		System.out.println("===복사본 배열 출력");
		for(int c : copy) System.out.print(c + " ");
	}

	// 깊은 복사 : 새로운 배열을 할당하여 값을 복사
	private static void deepCopy() {
		int[] origin = {1, 2, 3, 4, 5};
		
		// 복사본(copy) 배열 선언 및 할당(원본 배열의 길이 만큼)
		int[] copy = new int[origin.length];
		int[] copy2 = new int[10];
		
		// for문으로 깊은 복사하기
//		for(int i = 0; i < copy.length; i++) {
//			copy[i] = origin[i];
//		}
		
		// System.arraycopy(원본배열, 복사를 시작할 인덱스, 복사본 배열, 복사본 배열의 시작 인덱스, 복사할 갯수);
		System.arraycopy(origin, 0, copy, 0, origin.length);
		
		System.arraycopy(origin, 2, copy2, origin.length - 1, 3);
		
		// clone()
//		copy= origin.clone();
		

		System.out.println("===원본 배열 출력===");
		for(int o : origin) System.out.print(o + " ");
		
		System.out.println();

		System.out.println("===복사본 배열 출력");
		for(int c : copy) System.out.print(c + " ");

		System.out.println();
		
		System.out.println("===복사본 배열2 출력");
		for(int c : copy2) System.out.print(c + " ");

		System.out.println("\n=======================================");

		origin[1] = 333;
		copy[2] = 999;

		System.out.println("===원본 배열 출력===");
		for(int o : origin) System.out.print(o + " ");
		
		System.out.println();
		
		System.out.println("===복사본 배열 출력");
		for(int c : copy) System.out.print(c + " ");
	}
}
