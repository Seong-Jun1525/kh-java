package com.kh.array;

public class Array01 {

	public static void main(String[] args) {
		/**
		 * 변수
		 * => 하나의 공간에 하나의 값을 저장
		 * 
		 * 배열
		 * => 하나의 공간에 여러 개의 값을 저장
		 * => 여러 개의 값들은 하나의 자료형으로 일치해야한다
		 * => 배열의 인덱스 자리에 실제 값이 저장됨
		 * 
		 * 배열을 사용하는 이유?
		 * => 변수만을 사용하게 된다면 대량의 데이터를 보관하고자 할 때
		 *    변수를 각각 만들어 따로 관리해야 함
		 *    => 따라서 배열을 통해 하나의 공간에서 여러 개의 데이터를 관리
		 * 
		 * 선언[표현식]
		 * - 자료형[] 변수명;
		 * - 자료형 변수명[];
		 * 
		 * 할당[표현식] -> 배열에 몇 개의 데이터를 저장할 것인지 크기 지정
		 * - 변수명 = new 자료형[배열 크기];
		 * 
		 * 선언과 동시에 할당
		 * - 자료형[] 변수명 = new 자료형[배열크기];
		 * 
		 * 값 대입
		 * - 변수명[인덱스] = 값;
		 */
		
		int[] arr;
		
		arr = new int[5];
		
		
		System.out.println(arr + "\n");
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
		}
		
		for(int a : arr) System.out.print(a + " ");
	}

}
