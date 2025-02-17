package com.kh.practice.charCheck.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.kh.practice.charCheck.controller.CharacterController;
import com.kh.practice.charCheck.exception.CharCheckException;

public class CharacterMenu {
	
	public CharacterMenu() {}

	public void menu() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("문자열 : ");
		String str = null;
		
		try {
			str = br.readLine();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		try {
			System.out.print(str + "에 포함된 영문자 개수 : " + new CharacterController().countAlpha(str) + "\n");
		} catch (CharCheckException e) {
			e.printStackTrace();
		}
	}
}
