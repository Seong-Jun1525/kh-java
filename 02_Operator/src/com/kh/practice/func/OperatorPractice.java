package com.kh.practice.func;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OperatorPractice {
	public void practice1() throws NumberFormatException, IOException {
		// 키보드로 입력 받은 하나의 정수가 양수이면 “양수다“, 양수가 아니면 “양수가 아니다“를 출력하세요.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("정수 : ");
		int n = Integer.parseInt(br.readLine());

		String result = n > 0 ? "양수다" : "양수가 아니다";
		System.out.println(result);

		br.close();
	}
	
	public void practice2() throws NumberFormatException, IOException {
		// 키보드로 입력 받은 하나의 정수가 양수이면 “양수다“,
		// 양수가 아닌 경우 중에서 0이면 “0이다“, 0이 아니면 “음수다”를 출력하세요.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("정수 : ");
		int n = Integer.parseInt(br.readLine());
		
		String result = n > 0 ? "양수다" : (n == 0 ? "0이다" : "음수다");
		System.out.println(result);

		br.close();
	}
	
	public void practice3() throws NumberFormatException, IOException {
		// 키보드로 입력 받은 하나의 정수가 짝수이면 “짝수다“, 짝수가 아니면 “홀수다“를 출력하세요
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("정수 : ");
		int n = Integer.parseInt(br.readLine());

		String result = n % 2 == 0 ? "짝수다" : "홀수다";
		System.out.println(result);
		

		br.close();
	}
	
	public void practice4() throws NumberFormatException, IOException {
		// 모든 사람이 사탕을 골고루 나눠가지려고 한다. 인원 수와 사탕 개수를 키보드로 입력 받고
		// 1인당 동일하게 나눠가진 사탕 개수와 나눠주고 남은 사탕의 개수를 출력하세요.

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("인원수 : ");
		int numberOfPeople = Integer.parseInt(br.readLine());

		System.out.print("사탕 개수 : ");
		int numberOfCandy = Integer.parseInt(br.readLine());

		System.out.println("1인당 사탕 개수 : " + numberOfCandy / numberOfPeople);
		System.out.println("1인당 사탕 개수 : " + numberOfCandy % numberOfPeople);
		

		br.close();
	}
	
	public void practice5() throws IOException {
		// 키보드로 입력 받은 값들을 변수에 기록하고 저장된 변수 값을 화면에 출력하여 확인하세요.
		// 이 때 성별이 ‘M’이면 남학생, ‘M’이 아니면 여학생으로 출력 처리 하세요.
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("이름 : ");
		String name = br.readLine();

		System.out.print("학년(숫자만) : ");
		int grade = Integer.parseInt(br.readLine());

		System.out.print("반(숫자만) : ");
		int classNum = Integer.parseInt(br.readLine());

		System.out.print("번호(숫자만) : ");
		int num = Integer.parseInt(br.readLine());

		System.out.print("성별(M/F) : ");
		char genderChar = br.readLine().charAt(0);

		System.out.print("성적(소수점 아래 둘째자리까지) : ");
		double score = Double.parseDouble(br.readLine());
		
		String gender = genderChar == 'M' || genderChar == 'm' ? "남학생" 
							: (genderChar == 'F' || genderChar == 'f' ? "여학생" : "성별없음");
		
		System.out.printf("%d학년 %d반 %d번 %s %s의 성적은 %.2f이다.\n", grade, classNum, num, name, gender, score);
		

		br.close();
	}
	
	public void practice6() throws NumberFormatException, IOException {
		// 나이를 키보드로 입력 받아 어린이(13세 이하)인지, 청소년(13세 초과 ~ 19세 이하)인지,
		// 성인(19세 초과)인지 출력하세요.

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("나이 : ");
		int age = Integer.parseInt(br.readLine());
		
		String result = age <= 13 ? "어린이" : (age > 13 && age <= 19 ? "청소년" : "성인");
		
		System.out.println(result);
		

		br.close();
		
	}
	
	public void practice7() throws NumberFormatException, IOException {
		// 국어, 영어, 수학에 대한 점수를 키보드를 이용해 정수로 입력 받고,
		// 세 과목에 대한 합계(국어+영어+수학)와 평균(합계/3.0)을 구하세요.
		// 세 과목의 점수와 평균을 가지고 합격 여부를 처리하는데
		// 세 과목 점수가 각각 40점 이상이면서 평균이 60점 이상일 때 합격, 아니라면 불합격을 출력하세요

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("국어 : ");
		int korean = Integer.parseInt(br.readLine());

		System.out.print("영어 : ");
		int english = Integer.parseInt(br.readLine());

		System.out.print("수학 : ");
		int math = Integer.parseInt(br.readLine());
		
		int totalScore = korean + english + math;
		double average = totalScore / 3;
		
		String result = (korean >= 40 && english >= 40 && math >= 40) && average >= 60 ? "합격" : "불합격";
		
		System.out.println("합계 : " + totalScore);
		System.out.println("평군 : " + average);
		System.out.println(result);

		br.close();
	}
	
	public void practice8() throws IOException {
		// 주민번호를 이용하여 남자인지 여자인지 구분하여 출력하세요.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("주민번호를 입력하세요(- 포함) : ");
		String num = br.readLine();
		
		String[] numArr = num.split("-");
		
		System.out.println(numArr[1].charAt(0) == '1' || numArr[1].charAt(0) == '3' ? "남자"
								: (numArr[1].charAt(0) == '2' || numArr[1].charAt(0) == '4' ? "여자" : "알수없음"));

		br.close();
	}
	
	public void practice9() throws NumberFormatException, IOException {
		// 키보드로 정수 두 개를 입력 받아 각각 변수(num1, num2)에 저장하세요.
		// 그리고 또 다른 정수를 입력 받아 그 수가 num1 이하거나 num2 초과이면 true를 출력하고
		// 아니면 false를 출력하세요.
		// (단, num1은 num2보다 작아야 함)

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("정수1 : ");
		int num1 = Integer.parseInt(br.readLine());

		System.out.print("정수2 : ");
		int num2 = Integer.parseInt(br.readLine());
		if(num1 >= num2) practice9();
		else {
			System.out.print("입력 : ");
			int checkValue = Integer.parseInt(br.readLine());
			
			System.out.println(num1 >= checkValue || num2 < checkValue);
		}

		br.close();
	}
	
	public void practice10() throws NumberFormatException, IOException {
		// 3개의 수를 키보드로 입력 받아 입력 받은 수가 모두 같으면 true, 아니면 false를 출력하세요.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("입력1 : ");
		int n1 = Integer.parseInt(br.readLine());

		System.out.print("입력2 : ");
		int n2 = Integer.parseInt(br.readLine());

		System.out.print("입력3 : ");
		int n3 = Integer.parseInt(br.readLine());
		
		System.out.println(n1 == n2 ? (n1 == n3 ? true : false) : false);

		br.close();
	}
	
	public void practice11() throws NumberFormatException, IOException {
		// A, B, C 사원의 연봉을 입력 받고 각 사원의 연봉과 인센티브를 포함한 연봉을 계산하여 출력하고
		// 인센티브 포함 급여가 3000만원 이상이면 “3000 이상”, 미만이면 “3000 미만”을 출력하세요.
		// (A 사원의 인센티브는 0.4, B 사원의 인센티브는 없으며, C 사원의 인센티브는 0.15)
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("A사원의 연봉 : ");
		int salaryA = Integer.parseInt(br.readLine());
		double totalSalaryA = salaryA * (1 + 0.4);

		System.out.print("B사원의 연봉 : ");
		int salaryB = Integer.parseInt(br.readLine());

		System.out.print("C사원의 연봉 : ");
		int salaryC = Integer.parseInt(br.readLine());
		double totalSalaryC = salaryC * (1 + 0.15);
		
		System.out.printf("A사원의 연봉/연봉+a : %d/%.1f\n", salaryA, totalSalaryA);
		System.out.println(totalSalaryA >= 3000 ? "3000이상" : "3000미만");

		System.out.printf("B사원의 연봉/연봉+a : %d/%.1f\n", salaryB, (double)salaryB);
		System.out.println(salaryB >= 3000 ? "3000이상" : "3000미만");

		System.out.printf("C사원의 연봉/연봉+a : %d/%.13f\n", salaryC, totalSalaryC);
		System.out.println(totalSalaryC >= 3000 ? "3000이상" : "3000미만");
		
		br.close();
	}
}
