package com.kh.array;

public class Array02 {

	public static void main(String[] args) {
		/**
		 * 일반 변수 : 리터럴 자체를 담을 수 있는 변수
		 * => 기본 자료형(boolean, int, double, char, ... )으로 선언된 변수
		 * 
		 * 참조변수(Reference) : 주소 값을 담고 있는 변수
		 * => 그 외 자료형(int[], double[], char[], ..., String, Scanner, ...)으로 선언된 변수
		 * 
		 * 배열 특징
		 * - 배열 선언 및 할당까지만 한 후 직접 초기화하지 않아도
		 *   기본적으로 값들이 저장됨
		 *   heap 영역은 비워진 상태로 둘 수 없으므로
		 *   공간이 만들어질 때 JVM에 의해서 기본 값으로 초기화가 됨
		 *   
		 * 배열 단점
		 * - 한번 지정한 배열의 크기는 변경이 불가능
		 * 	=> 한번 크기를 변경하고자 한다면 다시 만들어야 함
		 */
		
		int[] iArr = new int[10]; // 0으로 초기화
		
		double[] dArr = new double[4]; // 0.0으로 초기화
		
		for(int i : iArr) {
			System.out.print(i + " ");
		}
		
		System.out.println("\n");
		
		for(double d : dArr) {
			System.out.print(d + " ");
		}
		
		// 배열의 자료형 + @ + 주소값의 16진수형태
		System.out.println("\n");
		System.out.println(iArr);
		System.out.println(iArr.hashCode()); // 16진수 형태를 10진수 형태로 출력
		
		System.out.println("\n");
		System.out.println(dArr);
		System.out.println(dArr.hashCode()); // 16진수 형태를 10진수 형태로 출력
		
		int[] nArr = null;
//		for(int n : nArr) {
//			System.out.print(n + " "); // null값이기 때문에 NullPointerException 에러 발생
//		}
		
		System.out.println("\n");
		
		System.out.println(nArr);
//		System.out.println(nArr.hashCode()); // NullPointerException 에러 발생
		
		nArr = new int[5];
		System.out.println(nArr[4]);
//		System.out.println(nArr[5]); // 범위를 벗어났기 때문에 ArrayIndexOutOfBoundsException 에러 발생

//		nArr = new int[7]; // 배열의 길이가 늘어나는 것이 아닌 길이가 7인 새로운 배열을 생성하고 그 배열의 위치를 가리킴
							// 연결이 끊어진 기존 배열은 Heap 영역에서 둥둥 떠다니다가 필요없는 존재가 됨.
							// 일정 시간이 지나면 Garbage Collector (GC)에 의해 알아서 제거됨
		
		// 배열을 강제로 삭제시키고자 한다면 -> 연결고리를 끊어주면 됨 (방법은 null대입)
		nArr = null;
		
		// 배열 선언, 할당, 초기화 동시 진행
		int[] arr2 = {1, 2, 3, 4, 5}; // == int[] arr2 = new int[] {1, 2, 3, 4, 5};
		int[] arr3 = new int[] {1, 2, 3, 4, 5};
		
		System.out.println(arr2 == arr3); // 각각 다른 주소값을 가지고 있으므로 false 출력
	}

}