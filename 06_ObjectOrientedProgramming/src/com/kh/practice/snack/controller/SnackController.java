package com.kh.practice.snack.controller;

import com.kh.practice.snack.model.vo.Snack;

public class SnackController {
	private Snack s = new Snack();
	
	public SnackController() {}
	
	public String saveData(String kind, String name, String flavor, int numOf, int price) {
		
		s.setKind(kind);
		s.setName(name);
		s.setFlavor(flavor);
		s.setNumOf(numOf);
		s.setPrice(price);
		
		return "저장이 완료되었습니다.";
	}
	
	public String confirmData() {
//		return "종류 : " + s.getKind() + "\n"
//				+ "이름 : " + s.getName() + "\n"
//						+ "맛 : " + s.getFlavor() + "\n"
//								+ "개수 : " + s.getNumOf() + "\n"
//										+ "가격 : " + s.getPrice() + "\n";
		String result = s.information();
		return result;
	}
}
