package com.kh.inherit.before;

public class Run {

	public static void main(String[] args) {
		
		Desktop desktop = new Desktop("삼성", "20250211", "갤럭시북프로2", 1500000, false);
		System.out.println(desktop.information());
		
		TV tv = new TV("삼성", "20250211-T", "LED TV", 7000000, 55);
		System.out.println(tv.information());
	}

}
