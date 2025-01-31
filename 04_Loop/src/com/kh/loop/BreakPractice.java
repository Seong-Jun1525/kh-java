package com.kh.loop;

public class BreakPractice {

	public static void main(String[] args) {
		/** break (분기문)
		 * 반복문 안에서 사용 시 가장 가까운 반복문 종료
		 * 
		 */
		
		// TODO 1 ~ 100까지의 랜덤 값을 생성하여 랜덤 값이 짝수일 경우 반복문 종료
		
		while(true) {
			int randomNum = ((int)(Math.random() * 100) + 1);
			
			if(randomNum % 2 == 0) {
				System.out.println("종료 " + randomNum);
				break;
			}
			
			System.out.println(randomNum);
		}
	}

}
