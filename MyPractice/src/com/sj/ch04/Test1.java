package com.sj.ch04;
import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] strNum = sc.nextLine().split(" ");
		
		System.out.println(Long.parseLong(strNum[0]) + Long.parseLong(strNum[1]));
	}
}