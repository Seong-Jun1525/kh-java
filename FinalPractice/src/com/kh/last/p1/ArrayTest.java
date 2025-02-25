package com.kh.last.p1;

import java.util.Random;

public class ArrayTest {

	public static void main(String[] args) {
		/*
			main 함수 안에서 배열 할당, 값
			기록 처리, 메소드 실행, 결과 출력
			처리함
		 */
		ArrayTest at = new ArrayTest();
		
		int[] array = new int[6];
		Random r = new Random();
		
		for(int i = 0; i < array.length; i++) {
			array[i] = r.nextInt(100) + 1;
		}
		
		System.out.println("할당된 배열의 크기 : " + array.length);
		System.out.print("array : ");
		print(array);
		System.out.println();
		
		System.out.println("가장 큰 값 : " + max(array));
		System.out.println("가장 작은 값 : " + min(array));
		System.out.println("짝수의 개수 : " + evenCount(array) + "개");
		System.out.println("홀수의 개수 : " + oddCount(array) + "개");
		System.out.println("합계 : " + at.sum(array));
		System.out.printf("평균 : %.2f\n", at.avg(array));
	}
	
	public int sum(int[] arr) {
		int result = 0;
		
		for(int a : arr) result += a;
		
		return result;
	}
	
	public double avg(int[] arr) {
		double result = 0;
		
		int sum = sum(arr);
		
		result = sum / arr.length;
		
		return result;
	}

	public static int max(int[] arr) {
		int result = arr[0];
		
		for(int i = 1; i < arr.length; i++) {
			if(result < arr[i]) {
				result = arr[i];
			}
		}
		
		return result;
	}
	
	public static int min(int[] arr) {
		int result = arr[0];
		
		for(int i = 1; i < arr.length; i++) {
			if(result > arr[i]) {
				result = arr[i];
			}
		}
		
		return result;
	}
	
	public static int evenCount(int[] arr) {
		int result = 0;
		
		for(int a : arr) {
			if(a % 2 == 0) result++;
		}
		
		return result;
	}
	
	public static int oddCount(int[] arr) {
		int result = 0;
		
		for(int a : arr) {
			if(a % 2 != 0) result++;
		}
		
		return result;
	}
	
	public static void print(int[] arr) {
		for(int a : arr) System.out.print(a + " ");
	}
}
