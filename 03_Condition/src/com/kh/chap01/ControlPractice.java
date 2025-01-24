package com.kh.chap01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ControlPractice {
	public void practice1() throws NumberFormatException, IOException {
		// 아래 예시와 같이 메뉴를 출력하고 메뉴 번호를 누르면 “OO메뉴입니다“를,
		// 종료 번호를 누르면 “프로그램이 종료됩니다.”를 출력하세요.
		// ex.
		// 1. 입력
		// 2. 수정
		// 3. 조회
		// 4. 삭제
		// 7. 종료
		
		// 변수로 따로 빼기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("1: 입력");
		System.out.println("2: 수정");
		System.out.println("3: 조회");
		System.out.println("4: 삭제");
		System.out.println("7: 종료");

		System.out.print("메뉴 번호를 입력하세요 : ");
		int order = Integer.parseInt(br.readLine());
		
		switch(order) {
			case 1:
				System.out.println("입력메뉴입니다.");
				break;
			case 2:
				System.out.println("수정메뉴입니다.");
				break;
			case 3:
				System.out.println("조회메뉴입니다.");
				break;
			case 4:
				System.out.println("삭제메뉴입니다.");
				break;
			case 7:
				System.out.println("프로그램이 종료됩니다.");
				break;
			default:
				System.out.println("잘못입력했습니다.");
		}
		
		br.close();
	}
	
	public void practice2() throws NumberFormatException, IOException {
		// 키보드로 정수를 입력 받은 정수가 양수이면서 짝수일 때만 “짝수다”를 출력하고
		// 짝수가 아니면 “홀수다“를 출력하세요.
		// 양수가 아니면 “양수만 입력해주세요.”를 출력하세요.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("숫자를 한 개 입력하세요 : ");
		int number = Integer.parseInt(br.readLine());
		number %= 2;
		switch(number) {
			case 0:
				System.out.println("짝수다");
				break;
			case 1:
				System.out.println("홀수다");
				break;
			default:
				System.out.println("양수만 입력해주세요.");
		}
	}
	
	public void practice3() throws IOException {
		// 국어, 영어, 수학 세 과목의 점수를 키보드로 입력 받고 합계와 평균을 계산하고
		// 합계와 평균을 이용하여 합격 / 불합격 처리하는 기능을 구현하세요.
		// (합격 조건 : 세 과목의 점수가 각각 40점 이상이면서 평균이 60점 이상일 경우)
		// 합격 했을 경우 과목 별 점수와 합계, 평균, “축하합니다, 합격입니다!”를 출력하고
		// 불합격인 경우에는 “불합격입니다.”를 출력하세요.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("국어점수 : ");
		int korean = Integer.parseInt(br.readLine());
		

		System.out.print("수학점수 : ");
		int math = Integer.parseInt(br.readLine());

		System.out.print("영어점수 : ");
		int english = Integer.parseInt(br.readLine());
		
		int total = korean + math + english;
		double average = total / 3;
		
		if(korean >= 40 && math >= 40 && english >= 40 && average >= 60) {
			System.out.println("국어 : " + korean);
			System.out.println("수학 : " + math);
			System.out.println("영어 : " + english);
			System.out.println("합계 : " + total);
			System.out.println("평균 : " + average);
			System.out.println("축하합니다, 합격입니다!");
		} else {
			System.out.println("불합격입니다.");
		}
	}
	
	public void practice4() throws IOException {
//		수업 자료(7page)에서 if문으로 되어있는 봄, 여름, 가을, 겨울 예제를 switch문으로 바꿔서 출력하세요

		/*
			if(month == 1 || month == 2 || month == 12)
			{
			season = "겨울";
			} else if(month >= 3 && month <= 5) {
			season = "봄";
			} else if(month >= 6 && month <= 8) {
			season = "여름";
			} else if(month >= 9 && month <= 11) {
			season = "가을";
			} else {
			season = "해당하는 계절이 없습니다.";
			}

		 */

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("1~12월 사이의 정수 입력 : ");
		int month = Integer.parseInt(br.readLine());
		
		switch(month) {
			case 1: case 2: case 12:
				System.out.println(month + "월은 겨울입니다.");
				break;
			case 3: case 4: case 5:
				System.out.println(month + "월은 봄입니다.");
				break;
			case 6: case 7: case 8:
				System.out.println(month + "월은 여름입니다.");
				break;
			case 9: case 10: case 11:
				System.out.println(month + "월은 가을입니다.");
				break;
			default:
				System.out.println(month + "월은 잘못 입력된 달입니다.");
		}
	}

	public void practice5() throws IOException {
		// 아이디, 비밀번호를 정해두고 로그인 기능을 작성하세요.
		// 로그인 성공 시 “로그인 성공”,
		// 아이디가 틀렸을 시 “아이디가 틀렸습니다.“,
		// 비밀번호가 틀렸을 시 “비밀번호가 틀렸습니다.”를 출력하세요.
		final String myId = "myId";
		final String myPassword = "myId";

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("아이디 : ");
		String userId = br.readLine();

		System.out.print("비밀번호 : ");
		String userPw = br.readLine();

		boolean userIdCheck = userId.equals(myId);
		boolean userPwCheck = userPw.equals(myPassword);
		
		if(userIdCheck && userPwCheck) System.out.println("로그인 성공");
		else if(!userIdCheck && userPwCheck) System.out.println("아이디가 틀렸습니다.");
		else if(userIdCheck && !userPwCheck) System.out.println("비밀번호가 틀렸습니다.");
		else System.out.println("둘 다 틀렸습니다.");
	}

	public void practice6() throws IOException {
		// 사용자에게 관리자, 회원, 비회원 중 하나를 입력 받아 각 등급이 행할 수 있는 권한을 출력하세요.
		// 단, 관리자는 회원관리, 게시글 관리, 게시글 작성, 게시글 조회, 댓글 작성이 가능하고
		// 회원은 게시글 작성, 게시글 조회, 댓글 작성이 가능하고
		// 비회원은 게시글 조회만 가능합니다.

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("권한을 확인하고자 하는 회원 등급 : ");
		String authority = br.readLine();
		
		switch(authority) {
			case "관리자":
				System.out.println("회원관리, 게시글 관리 게시글 작성, 댓글 작성 게시글 조회");
				break;
			case "회원":
				System.out.println("게시글 작성, 게시글 조회, 댓글 작성");
				break;
			case "비회원":
				System.out.println("게시글 조회");
				break;
			default:
				System.out.println("권한이 없습니다.");
		}
		
	}

	public void practice7() throws IOException {
		// 키, 몸무게를 double로 입력 받고 BMI지수를 계산하여 계산 결과에 따라
		// 저체중/정상체중/과체중/비만을 출력하세요.
		// BMI = 몸무게 / (키(m) * 키(m))
		// BMI가 18.5미만일 경우 저체중 / 18.5이상 23미만일 경우 정상체중
		// BMI가 23이상 25미만일 경우 과체중 / 25이상 30미만일 경우 비만
		// BMI가 30이상일 경우 고도 비만

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("키(m)를 입력해 주세요 : ");
		double height = Double.parseDouble(br.readLine());
		
		System.out.print("몸무게(kg)를 입력해 주세요 : ");
		double weight = Double.parseDouble(br.readLine());
		
		double BMI = weight / (height * height);
		String result = "";
		
		if(BMI < 18.5) {
			result = "저체중";
		} else if(BMI >= 18.5 && BMI < 23) {
			result = "정상체중";
		} else if(BMI >= 23 && BMI < 25) {
			result = "과체중";
		} else if(BMI >= 25 && BMI < 30) {
			result = "비만";
		} else if(BMI >= 30) {
			result = "고도비만";
		}
		

		System.out.printf("BMI 지수 : %.14f\n", BMI);
		System.out.println(result);
	}

	public void practice8() throws NumberFormatException, IOException {
		// 키보드로 두 개의 정수와 연산 기호를 입력 받아 연산 기호에 맞춰 연산 결과를 출력하세요.
		// (단, 두 개의 정수 모두 양수일 때만 작동하며 없는 연산 기호를 입력 했을 시
		// “잘못 입력하셨습니다. 프로그램을 종료합니다.” 출력)
		
		// 예시 답안에 소수점 6자리까지 출력되었으므로 모두 double형으로 형변환!

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("피연산자1 입력 : ");
		int num1 = Integer.parseInt(br.readLine());

		System.out.print("피연산자2 입력 : ");
		int num2 = Integer.parseInt(br.readLine());
		
		boolean flag = true;
		double result = 0;
		
		System.out.print("연산자를 입력(+,-,*,/,%) : ");
		char operactor = br.readLine().charAt(0);
		
		if(num1 > 0 && num2 > 0) {
			switch(operactor) {
			case '+':
				result = (double)num1 + (double)num2;
				break;
			case '-':
				result = (double)num1 - (double)num2;
				break;
			case '*':
				result = (double)num1 * (double)num2;
				break;
			case '/':
				result = (double)num1 / (double)num2;
				break;
			case '%':
				result = (double)num1 % (double)num2;
				break;
			default:
				flag = false;
				System.out.println("잘못 입력하셨습니다. 프로그램을 종료합니다.");
			}
		}
		
		if(flag) System.out.printf("%d %c %d = %.6f\n", num1, operactor, num2, result);
	}

	public void practice9() throws NumberFormatException, IOException {
		// 중간고사, 기말고사, 과제점수, 출석회수를 입력하고 Pass 또는 Fail을 출력하세요.
		// 평가 비율은 중간고사 20%, 기말고사 30%, 과제 30%, 출석 20%로 이루어져 있고
		// 이 때, 출석 비율은 출석 회수의 총 강의 회수 20회 중에서 출석한 날만 따진 값으로 계산하세요.
		// 70점 이상일 경우 Pass, 70점 미만이거나 전체 강의에 30% 이상 결석 시 Fail을 출력하세요.

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("중간 고사 점수 : ");
		int midtermExamScore = Integer.parseInt(br.readLine());

		System.out.print("기말 고사 점수 : ");
		int finalExamScore = Integer.parseInt(br.readLine());

		System.out.print("과제 점수 : ");
		int homeworkScore = Integer.parseInt(br.readLine());

		System.out.print("출석 횟수 : ");
		int attendanceScore = Integer.parseInt(br.readLine());

		System.out.println("================= 결과 =================");
		
		if(!(attendanceScore > 14)) {
			System.out.printf("Fail [출석 회수 부족 (%d/20)]", attendanceScore);
		} else {
			double totalScore = midtermExamScore * 0.2 + finalExamScore * 0.3 + homeworkScore * 0.3 + attendanceScore;
			
			System.out.println("중간 고사 점수(20) : " + (double)midtermExamScore * 0.2);
			System.out.println("기말 고사 점수(30) : " + (double)finalExamScore * 0.3);
			System.out.println("과제 점수 	   (30) : " + (double)homeworkScore * 0.3);
			System.out.println("출석 점수 	   (20) : " + (double)attendanceScore);
			System.out.println("총점 : " + totalScore);
			System.out.println(totalScore >= 70 ? "Pass" : "Fail [점수미달]");
		}
	}

	public void practice10() throws NumberFormatException, IOException {
		// 앞에 구현한 실습문제를 선택하여 실행할 수 있는 메뉴화면을 구현하세요.
		/*
		 * 실행할 기능을 선택하세요.
			1. 메뉴 출력
			2. 짝수/홀수
			3. 합격/불합격
			4. 계절
			5. 로그인
			6. 권한 확인
			7. BMI
			8. 계산기
			9. P/F
		 */
		System.out.print("1. 메뉴 출력\r\n"
				+ "2. 짝수/홀수\r\n"
				+ "3. 합격/불합격\r\n"
				+ "4. 계절\r\n"
				+ "5. 로그인\r\n"
				+ "6. 권한 확인\r\n"
				+ "7. BMI\r\n"
				+ "8. 계산기\r\n"
				+ "9. P/F");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("선택 : ");
		int problemNum = Integer.parseInt(br.readLine());
		
		switch(problemNum) {
			case 1:
				practice1();
				break;
			case 2:
				practice2();
				break;
			case 3:
				practice3();
				break;
			case 4:
				practice4();
				break;
			case 5:
				practice5();
				break;
			case 6:
				practice6();
				break;
			case 7:
				practice7();
				break;
			case 8:
				practice8();
				break;
			case 9:
				practice9();
				break;
			default:
				System.out.println("종료합니다.");
				break;
		}
	}
}









