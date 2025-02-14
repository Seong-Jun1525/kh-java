package test;

public class HelloWorld {

//	상수 선언 final ★★★
	final int MAX_SIZE = 1000;
	final String MY_BIRTH = "2000-04-29";
	
	public static void main(String[] args) {
//		실습 1 System.out.println에 대한 다양한 활용
		System.out.println(7);
		System.out.println(3.15);
		System.out.println("3 + 5 = " + 8);
		System.out.println(3.15 + "는 실수입니다.");
		System.out.println("3 + 5" + " 의 연산 결과는 8입니다.");
		System.out.println(3 + 5);
		
		System.out.println();
		
//		자료형 크기
		System.out.println(Byte.SIZE);
		System.out.println(Short.SIZE);
		System.out.println(Integer.SIZE);
		System.out.println(Long.SIZE);
		System.out.println(Float.SIZE);
		System.out.println(Double.SIZE);
		System.out.println(Character.SIZE);
		
		System.out.println();
		
		/**
		 * 대소문자가 구분되며 길이 제한이 없다
		 * 
		 * 예약어를 사용하면 안된다
		 * 
		 * 숫자로 시작하면 안된다
		 * 
		 * 특수문자는 _와 $만을 허용한다
		 * 
		 * 여러 단어 이름은 첫 글자를 대문자로 한다
		 * 단, 첫 시작 글자는 소문자로 하는 것이 관례이다
		 */
		
//		int num;
//		boolean isTrue;
//		double PI;
		
		String name  = "임성준";
		char gender = 'M';
		
		System.out.println(name);
		System.out.println(gender);
		
		System.out.println();
		
		String str = "기차" + 123 + 45 + "출발";
		String str1 = 123 + 45 + "기차" + "출발";
		
		System.out.println(str);
		System.out.println(str1);
		
		int a = 290;
		
		System.out.println((byte) a);
		
//		char ch = 'A';
//		int chNum = (int) ch;
		
//		float f = 1.09f;
//		int num = (int) f;
	}

}
