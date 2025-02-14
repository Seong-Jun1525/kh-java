package com.kh.array;

import java.util.Scanner;

public class Array_Two {

	public static void main(String[] args) {
		/** 2차원 배열
		 * - 같은 자료형의 1차원 배열의 묶음 (배열 안에 배열이 존재)
		 * 
		 * - 2차원 배열은 할당된 공간마다 인덱스 번호를 2개 부여 ([행][열])
		 * 
		 * - 선언 [표현식] => 1차원 배열의 묶을 참조하는 2차원 배열 참조변수를 만듬
		 * 		자료형[][] 변수명;
		 * 
		 * - 할당 [표현식]
		 * 		변수명 = new 자료형[행크기][열크기];
		 * 		* 행크기 : 1차원 배열의 개수
		 * 		* 열크기 : 2차원 배열의 길이(생략 가능! -> 가변길이의 1차원 배열 할당)
		 * 
		 * 		1차원 배열의 참조변수 묶음을 먼저 생성
		 * 		변수명 = new 자료형[n][];
		 * 		변수명[0] = new 자료형[m];
		 * 		변수명[1] = new 자료형[x];
		 * 		변수명[2] = new 자료형[z];
		 * 		=> 1차원 배열의 크기는 같을 수도 다를 수도 있음
		 * 
		 * - 선언 및 할당
		 * 		자료형[][] 변수명 = new int[행크기][열크기];
		 * 
		 * - 값 대입
		 * 		변수명[배열순번][인덱스] = 값;
		 */
		
		practice();
		practice2();
	}

	private static void practice2() {
		// (0행 0열) (0행 1열) (0행 2열)
		// (1행 0열) (1행 1열) (1행 2열)
		// (2행 0열) (2행 1열) (2행 2열)
		Scanner sc = new Scanner(System.in);
		
		System.out.print("원하는 행의 크기 : ");
		int r = sc.nextInt();
		
		System.out.print("원하는 열의 크기 : ");
		int c = sc.nextInt();
		
		if(r > 0 && c > 0) {
			String[][] strArr = new String[r][c];
			
			for(int i = 0; i < strArr.length; i++) {
				for(int j = 0; j < strArr[i].length; j++) {
					strArr[i][j] = j % 2 != 0 ? "(" + i + "행 " + j + "열)" : "■";
//					strArr[i][j] = "★";
				}
			}
			
			for(int i = 0; i < strArr.length; i++) {
				for(int j = 0; j < strArr[i].length; j++) {
					System.out.print(strArr[i][j] + " ");
//					System.out.print(strArr[i][j]);
				}
				
				System.out.println();
			}
		} else practice2();
		
		sc.close();
		
	}

	private static void practice() {
		// 배열 선언
		int[][] arr = null; // 정수형태 2차원 배열 선언
		
		// 배열 할당
//				arr = new int[3][4];// 크기가 4인 1차원 배열 3개 묶음
		arr = new int[3][];

//				arr[0] = new int[4];
//				arr[0] = new int[4];
//				arr[0] = new int[4];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = new int[4];
		}
		
		// 첫 번째 1차원 배열에 값을 대입
//				arr[0][0] = 10;
//				arr[0][2] = 30;
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = 10 * (j + 1);
			}
		}
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			
			System.out.println();
		}
		
		System.out.println("============================");
		int n = 0;
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = n += 10;
			}
		}
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			
			System.out.println();
		}
	}
}
