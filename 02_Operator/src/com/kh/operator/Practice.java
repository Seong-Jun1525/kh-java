package com.kh.operator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//		example01();
//		example02();
//		example03();
		example04();
	}
	
	/**
	 * 복합 대입 연산자
	 * 대입 연산자와 다른 연산자를 조합해서 하나의 연산자처럼 사용되는 연산자
	 */
	public static void example01() throws IOException {
		/**
		 * 사용자로부터 숫자를 입력받아서 그 값에 7L을 더한 결과를 출력
		 */
//		Scanner sc = new Scanner(System.in);
//		
//		long n = (long)sc.nextShort();

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("숫자를 입력하세요 : ");
		String str = br.readLine();
		short n = Short.parseShort(str);
		
		System.out.println(n += 7L); // 복합대입연산자를 사용하지 않으면 에러 발생. 복합대입연산자는 알아서 형변환을 하고 처리함
		
		// 복합대입연산자를 사용하지 않을 경우 아래처럼 해줘야함
//		n = n + 7L;					=> 자료형 관련 에러 발생
//		n = n + (short)7L;			=> short와 byte는 int 형으로 계산되므로 여전히 자료형이 일치하지 않아 에러 발생
//		n = (short)(n + (short)7L);	=> 최종적으로 int->short로 형변환 해줘야함
		
		br.close();
	}
	
	public static void example02() throws NumberFormatException, IOException {
		/**
		 * 비교연산자와 논리연산자
		 * 
		 * 공통점
		 * - 결과값이 true 혹은 false
		 * - 이항연산자
		 */
		
		// 나이 입력받고 초 중 고 구분하여 출력하기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("나이를 입력하세요 : ");
		int age = Integer.parseInt(br.readLine());
		
//		if(age >= 8 && age <= 13) {
//			System.out.println("초등학생");
//		} else if(age >= 14 && age <= 16) {
//			System.out.println("중학생");
//		} else if(age >= 17 && age <= 19) {
//			System.out.println("고등학생");
//		} else {
//			System.out.println("알 수 없음");
//		}
		
		String result = (age >= 8) && (age <= 13) ? "초등학생"
							: ((age >= 14 && age <= 16) ? "중학생" 
									: (age >= 17 && age <= 19) ? "고등학생" : "알 수 없음");
		
//		String result2 = "알 수 없음";
//		result2 = 8 <= age && age <= 13 ? "초등학생" : result2;
//		result2 = age >= 14 && age <= 16 ? "중학생" : result2;
//		result2 = age >= 17 && age <= 19 ? "고등학생" : result2;
		
		System.out.println(age + "살은 " + result + "입니다.");
//		System.out.println(age + "살은 " + result2 + "입니다.");
		
		br.close();
	}
	
	public static void example03() {
		// SCE 단락회로평가
		int num = 10;
		int i = 3;
		boolean result3;
		
		result3 = ((num += 15) < 0) && ((i *= 2) > 2); 
		System.out.println(result3); // false
		System.out.println(i); // 3
		System.out.println(num); // 25
		
		System.out.println();
		result3 = ((num += 15) < 0 || ((i *= 2) > 2));
		System.out.println(result3); // true
		System.out.println(i); // 6
		System.out.println(num); // 40
	}

	public static void example04() throws NumberFormatException, IOException {
		/**
		 * 산술연산자 활용
		 * 키와 몸무게를 입력받아서 BMI 계산하기
		 * 
		 * BMI = 몸무게 / (키(m) * 키(m));
		 * BMI 기준
		 *  - 18.5 이하 : 				: 저체중
		 *  - 18.5 < BMI < 22.9 		: 정상
		 *  - 23.0 <= BMI <= 24.9 		: 과체중
		 *  - 25 <= BMI 				: 비만
		 */

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("키 입력(cm) : ");
		double height = Double.parseDouble(br.readLine());
		height /= 100;

		System.out.print("몸무게 입력(kg) : ");
		double weight = Double.parseDouble(br.readLine());
		
		double BMI = weight / (height * height);
		
		System.out.println("BMI : " + BMI);
		
		if(BMI <= 18.5) System.out.println("저체중");
		else if(BMI > 18.5 && BMI < 22.9) System.out.println("정상");
		else if(BMI >= 23.0 && BMI <= 24.9) System.out.println("과체중");
		else if(25 <= BMI) System.out.println("비만");
		else System.out.println("병원가세요");
		
		String result = BMI <= 18.5 ? "저체중" : (BMI > 18.5 && BMI < 22.9 ? "정상"
							: (BMI >= 23.0 && BMI <= 24.9 ? "과체중" 
									: (BMI >= 25 ? "비만" : "병원가세요")));
		
		System.out.println(result);
		br.close();
		
	}
}
