package com.kh.object.practice3.run;

import com.kh.object.practice3.model.vo.Circle;

public class Run {

	public static void main(String[] args) {
		Circle circle = new Circle();
		
		circle.getAreaOfCircle();
		circle.getSizeOfCircle();
		
		circle.incrementRadius();

		circle.getAreaOfCircle();
		circle.getSizeOfCircle();
	}

}
