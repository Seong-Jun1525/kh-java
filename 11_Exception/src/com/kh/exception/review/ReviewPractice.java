package com.kh.exception.review;

class InvalidUser extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InvalidUser(String msg) {
		super(msg);
	}
}

public class ReviewPractice {
	private static final String ID = "admin";
	private static final String PWD = "qwer";

	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.print("ID 입력 : ");
		String inputId = sc.next();

		System.out.print("PASSWD 입력 : ");
		String inputPwd = sc.next();
		
		// id, pwd 유효성 검사 후 일치하는 경우 "로그인 성공" 출력
		// id 값이 잘못된 경우 "로그인 실패. 잘못된 ID 값 입니다." 출력
		// pwd 값이 잘못된 경우 "로그인 실패. 잘못된 PWD 값 입니다." 출력
		try {
			idCheck(inputId);
			pwdCheck(inputPwd);
			
			System.out.println("로그인 성공");
		} catch(InvalidUser e) {
			e.printStackTrace();
		}
		
		sc.close();
	}

	public static boolean idCheck(String id) throws InvalidUser {
		// 전달된 id 값과 ID 상수필드의 값이 같은 경우 true 리턴
		// 다른 경우 InvalidUser 예외 발생
		if(id.equals(ID)) {
			return true;
		}
		
		throw new InvalidUser("로그인 실패. 잘못된 ID 값 입니다.");
		
	}


	public static boolean pwdCheck(String pwd) throws InvalidUser {
		// 전달된 pwd 값과 PWD 상수필드의 값이 같은 경우 true 리턴
		// 다른 경우 InvalidUser 예외 발생
		if(pwd.equals(PWD)) {
			return true;
		}
		
		throw new InvalidUser("로그인 실패. 잘못된 PWD 값 입니다.");
	}

}
