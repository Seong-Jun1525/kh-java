package com.kh.practice2.numRange.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.kh.practice2.numRange.controller.NumberController;
import com.kh.practice2.numRange.exception.NumRangeException;

public class NumberMenu {
	public void menu() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			System.out.print("정수1 : ");
			int num1 = Integer.parseInt(br.readLine());

			System.out.print("정수2 : ");
			int num2 = Integer.parseInt(br.readLine());
			
			System.out.println(num1 + "은(는) " + num2 + "의 배수인가? " + new NumberController().checkDouble(num1, num2));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NumRangeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
