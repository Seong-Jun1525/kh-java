package com.kh.api;

public class API2_String {
	
	/**
	 * java.lang.String
	 */

	public static void main(String[] args) {
		test1();
		System.out.println("======================");
		System.out.println("======================");
		test2();
	}
	
	private static void test2() {
		/**
		 * equals
		 * 문자열A.equals(문자열B):boolean
		 */
		
		String str1 = "Hello";
		String str2 = "HTML#CSS#JS#Java";
		
		System.out.println("[1] " + str1.equals("Hello"));
		System.out.println("[2] " + str1.equals("Bye"));
		System.out.println("--------------");
		
		/**
		 * charAt
		 * 문자열.charAt(인덱스):char
		 */
		System.out.println("[1] " + str1.charAt(1));
		System.out.println("--------------");
		
		/**
		 * length():int
		 */
		System.out.println("[1] " + str1.length());
		System.out.println("[2] " + str1.charAt(str1.length() - 1));
		System.out.println("--------------");
		
		/**
		 * toUpperCase():String => 모든 알파벳을 대문자로
		 * toLowerCase():String => 모든 알파벳을 소문자로
		 */
		System.out.println("[1] " + str1.toUpperCase());
		System.out.println("[2] " + str1.toLowerCase());
		System.out.println("--------------");

		/**
		 * contains => 문자열A.contains(문자열B): boolean
		 */
		System.out.println("[1] " + str1.contains("el"));
		System.out.println("[2] " + str1.contains("tt"));
		System.out.println("--------------");
		
		/**
		 * indexOf => 문자열A.indexOf(문자열B):int
		 * 문자열A에 문자열B가 존재할 경우 시작인덱스를 반환
		 * 존재하지 않을 경우 -1을 반환 
		 */
		System.out.println("[1] " + str1.indexOf("el"));
		System.out.println("[2] " + str1.indexOf("tt"));
		System.out.println("--------------");
		
		/**
		 * substring()
		 * => 문자열.substring(시작인덱스):String
		 * 문자열에서 시작인덱스부터 마지막위치까지 추출하여 반환
		 * 
		 * => 문자열.substring(시작인덱스, 끝인덱스):String
		 * 문자열에서 시작인덱스부터 끝인덱스 직전까지 추출하여 반환
		 */
		System.out.println("[1] " + str1.substring(0));
		System.out.println("[2] " + str1.substring(0, 2));
		System.out.println("--------------");
		
		/**
		 * repeat => 문자열.repeat(개수):String
		 * 문자열을 개수만큼 반복하여 문자열을 리턴
		 */
		System.out.println("[1] " + str1.repeat(2));
		System.out.println("[2] " + "Happy".repeat(3));
		System.out.println("--------------");
		
		/**
		 * split => 문자열.split(구분자):String[]
		 * 문자열을 구분자를 기준으로 분리하여 문자열 배열을 반환
		 */
		String[] strArr = str2.split("#");
		
		for(int i = 0; i < strArr.length; i++) {
			System.out.print(strArr[i] + " ");
		}
	}

	private static void test1() {
		String str1 = "apple";
		String str2 = "apple";
		String str3 = new String("apple");
		String str4 = new String("apple");
		String str5 = "Hello";
		String str6 = "World";
		
		System.out.println("[1] " + (str1 == str2)); // true
		/**
		 * true가 나온 이유!!
		 * 
		 * 문자열 값 자체를 대입하게 되면
		 * "상수풀"이라는 공간에 값이 저장되어 같은 곳을 가리키게 되서
		 * 주소값이 같으므로 true!!
		 */
		
		System.out.println("[3] " + (str1 == "apple")); // true
		/**
		 * str1의 주소가 가리키는 값 자체와 "apple"이라는 값 자체를 비교함
		 * => str1, apple 모두 상수풀 공간에서 같은 주소를 가리키고 있기때문!
		 */
		
		System.out.println("[3] " + (str3 == str4)); // false
		/**
		 * 문자열 객체를 생성했으므로 각각의 인스턴스가 생성됨
		 * 메모리에 새로운 영역에 할당하므로 각각 할당된 영역을 가리키므로 false!!
		 */
		
		System.out.println("[4] " + (str3 == "apple")); // false
		/**
		 * str3의 주소값과 apple이라는 값자체가 저장된 주소와 다르므로 false
		 */
		System.out.println("--------------");
		// => 문자열의 값을 비교할때는 equals 메서드 사용!
		System.out.println("[1] " + (str1.equals(str2))); // true
		System.out.println("[2] " + (str1.equals("apple"))); // true
		System.out.println("[3] " + (str2.equals("apple"))); // true
		System.out.println("[4] " + (str3.equals(str4))); // true
		System.out.println("[5] " + (str3.equals("apple"))); // true
		System.out.println("[6] " + (str4.equals("apple"))); // true
		System.out.println("--------------");
		
		System.out.println("[1] " + str5);
		System.out.println("[2] " + str5.toString());
		/**
		 * String 클래스에서는 toString 메서드가 재정의되어 있다
		 */
		System.out.println("[3] " + str5.hashCode());
		System.out.println("[4] " + System.identityHashCode(str5)); // Object 타입이 매개변수다
		str5 = str5.concat(str6);
		System.out.println("[5] " + str5);
		System.out.println("[6] " + System.identityHashCode(str5.concat(str6)));
	}
	
	

}
