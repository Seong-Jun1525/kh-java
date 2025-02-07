package com.kh.practice.snack.run;

import com.kh.practice.snack.view.SnackMenu;

public class Run {
	
	/**
	 * M : Model
	 * V : View
	 * C : Controller
	 */

	public static void main(String[] args) {
		SnackMenu sm = new SnackMenu();
		
		System.out.println("스낵류를 입력하세요.");
		sm.menu();
	}

}
