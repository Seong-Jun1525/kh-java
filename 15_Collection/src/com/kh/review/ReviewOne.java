package com.kh.review;

public class ReviewOne {
	public static void main(String[] args) {
		 // 다음 코드가 정상 동작될 수 있도록 작성해주세요.
		 MyUtils mu = new MyUtils();
		 mu.add(3, 5);			// 3 + 5 = 8 출력
		 mu.minus(10, 8);		// 10 - 8 = 2 출력
	}
}

class MyUtils {
	 public void add(int n1, int n2) {
	 	System.out.printf("%d + %d = %d\n", n1, n2, n1 + n2);
	 }
	 
	 public void minus(int n1, int n2) {
		 System.out.printf("%d - %d = %d\n", n1, n2, n1 - n2);
	 }
}