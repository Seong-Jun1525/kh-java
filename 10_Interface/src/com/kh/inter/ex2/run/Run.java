package com.kh.inter.ex2.run;

import com.kh.inter.ex2.Circle;
import com.kh.inter.ex2.Rectangle;
import com.kh.inter.ex2.Shape;

public class Run {

	public static void main(String[] args) {
		// * 도형 정보들을 저장할 배열 생성 (크기는 2)
		Shape[] sArr = new Shape[2];
		
		//   첫번째 위치에는 원의 정보 (반지름 5)
		sArr[0] = new Circle(5);
		//   두번째 위치에는 사각형의 정보 (가로:3, 세로:4)
		sArr[1] = new Rectangle(3, 4);
		
		// * 반복문을 사용하여 각 도형의 넓이를 출력!
		for(int i=0; i<sArr.length; i++) {
			if(sArr[i] instanceof Circle) {
				System.out.print("원의 넓이 : ");
			} else if (sArr[i] instanceof Rectangle) {
				System.out.print("사각형의 넓이 : ");
			}
			System.out.println(sArr[i].calculateArea());
		}
	}

}
