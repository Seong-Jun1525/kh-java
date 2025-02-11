package com.kh.inherit.after;

public class Run {

	public static void main(String[] args) {
		
		Desktop desktop = new Desktop("삼성", "20250211", "갤럭시북프로2", 1500000, true);
		System.out.println(desktop.information());
		System.out.println("==============================================================================================================================");
		TV tv = new TV("삼성", "20250211-T", "LED TV", 70000000, 80);
		System.out.println(tv.information());
	}

}
