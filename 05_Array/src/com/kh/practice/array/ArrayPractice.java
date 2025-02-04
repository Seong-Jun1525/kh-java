package com.kh.practice.array;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ArrayPractice {
	public void practice1() {
		/**
		 * 길이가 10인 배열을 선언하고 1부터 10까지의 값을 반복문을 이용하여
		 * 순서대로 배열 인덱스에 넣은 후 그 값을 출력하세요.
		 */
		
		int[] arr = new int[10];
		
		for(int i = 0; i < arr.length; i++) arr[i] = i + 1;
		for(int a : arr) System.out.print(a + " ");
	}
	
	public void practice2() {
		/**
		 * 길이가 10인 배열을 선언하고 1부터 10까지의 값을 반복문을 이용하여
		 * 역순으로 배열 인덱스에 넣은 후 그 값을 출력하세요.
		 */
		
		int[] arr = new int[10];
		
		for(int i = 0; i < arr.length; i++) arr[i] = arr.length - i;
		
		for(int a : arr) System.out.print(a + " ");
	}
	
	public void practice3() {
		/**
		 * 사용자에게 입력 받은 양의 정수만큼 배열 크기를 할당하고
		 * 1부터 입력 받은 값까지 배열에 초기화한 후 출력하세요.
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.print("양의 정수 : ");
		int[] arr = new int[sc.nextInt()];

		for(int i = 0; i < arr.length; i++) arr[i] = i + 1;
		
		for(int a : arr) System.out.print(a + " ");
		sc.close();
	}
	
	public void practice4() {
		/**
		 * 길이가 5인 String배열을 선언하고 “사과”, “귤“, “포도“, “복숭아”, “참외“로 초기화 한 후
		 * 배열 인덱스를 활용해서 귤을 출력하세요.
		 */
		String[] fruits = {"사과", "귤", "포도", "복숭아", "참외"};

		System.out.println(fruits[1]);
	}
	
	public void practice5() {
		/**
		 * 문자열을 입력 받아 문자 하나하나를 배열에 넣고 검색할 문자가 문자열에 몇 개 들어가 있는지
		 * 개수와 몇 번째 인덱스에 위치하는지 인덱스를 출력하세요.
		 */
		
		Scanner sc = new Scanner(System.in);
		int count = 0;
		
		System.out.print("문자열 : ");
		String str = sc.nextLine();
		
		char[] cArr = new char[str.length()];
		
		for(int i = 0; i < cArr.length; i++) {
			char strC = str.charAt(i);
			cArr[i] = strC;
			
		}

		System.out.print("문자 : ");
		char c = sc.nextLine().charAt(0);
		
		System.out.print("application에 i가 존재하는 위치(인덱스) :");
		for(int i = 0; i < cArr.length; i++) {
			if(c == cArr[i]) {
				System.out.print(i + " ");
				count++;
			}
		}
		
		System.out.println();
		System.out.println("i 개수 : " + count);
		
		sc.close();
	}
	
	public void practice6() {
		/**
		 * “월“ ~ “일”까지 초기화된 문자열 배열을 만들고 0부터 6까지 숫자를 입력 받아
		 * 입력한 숫자와 같은 인덱스에 있는 요일을 출력하고
		 * 범위에 없는 숫자를 입력 시 “잘못 입력하셨습니다“를 출력하세요.
		 */
		Scanner sc = new Scanner(System.in);
		
		String[] days = {"월요일", "화요일", "수요일", "목요일", "금요일", "토요일", "일요일"};
		
		System.out.print("0 ~ 6 사이 숫자 입력 :");
		int n = sc.nextInt();
		
		if(n > 6) {
			System.out.println("잘못 입력하셨습니다.");
		} else {
			for(int i = 0; i < days.length; i++) {
				if(i == n) {
					System.out.println(days[i]);
				}
			}
		}

		sc.close();
	}
	
	public void practice7() {
		/**
		 * 사용자가 배열의 길이를 직접 입력하여 그 값만큼 정수형 배열을 선언 및 할당하고
		 * 배열의 크기만큼 사용자가 직접 값을 입력하여 각각의 인덱스에 값을 초기화 하세요.
		 * 그리고 배열 전체 값을 나열하고 각 인덱스에 저장된 값들의 합을 출력하세요.
		 */
		
		Scanner sc = new Scanner(System.in);
		int sum = 0;

		System.out.print("정수 : ");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		for(int i = 0; i < arr.length; i++) {
			System.out.printf("배열 %d번째 인덱스에 넣을 값 : ", i);
			arr[i] = sc.nextInt();
		}
		
		for(int i : arr ) {
			sum += i;
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("총 합 : " + sum);
		sc.close();
	}
	
	public void practice8() {
		/**
		 * 3이상인 홀수 자연수를 입력 받아 배열의 중간까지는 1부터 1씩 증가하여 오름차순으로 값을 넣고,
		 * 중간 이후부터 끝까지는 1씩 감소하여 내림차순으로 값을 넣어 출력하세요.
		 * 단, 입력한 정수가 홀수가 아니거나 3 미만일 경우 “다시 입력하세요”를 출력하고
		 * 다시 정수를 받도록 하세요
		 */
		
		Scanner sc = new Scanner(System.in);
		int[] arr;
		boolean flag = true;
		int m = 1;
		
		while(true) {
			System.out.print("정수 : ");
			int n = sc.nextInt();
			if((n > 0 && n < 3) || n % 2 == 0) System.out.println("다시 입력하세요.");
			else {
				arr = new int[n];
				for(int i = 0; i < arr.length; i++) {
					if(i == (int)(arr.length / 2)) {
						flag = false;
					}
					
					if(flag) {
						arr[i] = m++;
					} else {
						arr[i] = m--;
					}
				}
				break;
			}
		}
		
		for(int i = 0; i < arr.length; i++) {
			if(i == arr.length - 1) {
				System.out.print(arr[i]);
			} else {
				System.out.print(arr[i] + ", ");
			}
		}
		sc.close();
	}
	
	public void practice9() {
		/**
		 * 사용자가 입력한 값이 배열에 있는지 검색하여
		 * 있으면 “OOO 치킨 배달 가능“, 없으면 “OOO 치킨은 없는 메뉴입니다“를 출력하세요.
		 * 단, 치킨 메뉴가 들어가있는 배열은 본인 스스로 정하세요.
		 */
		String[] chickenArr = {"후라이드", "양념", "반반"};
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("치킨 이름을 입력하세요 : ");
		String chicken = sc.nextLine();
		
		String result = "";
		
		for(int i = 0; i < chickenArr.length; i++) {
			if(chickenArr[i].equals(chicken)) {
				result += chicken;
				break;
			}
		}
		if(result.length() != 0) {
			System.out.println(result + "치킨 배달 가능");
		} else {
			System.out.println(chicken + "치킨은 없는 메뉴입니다.");
		}
		sc.close();
	}
	
	public void practice10() {
		/**
		 * 주민등록번호 성별자리 이후부터 *로 가리고 출력하세요.
		 * 단, 원본 배열 값은 변경 없이 배열 복사본으로 변경하세요.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("주민등록번호(-포함) : ");
		String[] num = sc.nextLine().split("");

		String[] copy = new String[num.length];
		
		for(int i = 0; i < num.length; i++) {
			if(i > 7) copy[i] = "*";
			else copy[i] = num[i];
		}

		for(String s : copy) {
			System.out.print(s);
		}

		sc.close();
	}
	
	public void practice11() {
		/**
		 * 10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고
		 * 1~10 사이의 난수를 발생시켜 배열에 초기화한 후 출력하세요.
		 */
		
		int[] arr = new int[10];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 10) + 1;
		}
		
		for(int a : arr) {
			System.out.print(a + " ");
		}
	}
	
	public void practice12() {
		/**
		 * 10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고
		 * 1~10 사이의 난수를 발생시켜 배열에 초기화 후
		 * 배열 전체 값과 그 값 중에서 최대값과 최소값을 출력하세요.
		 */

		int[] arr = new int[10];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 10) + 1;
		}
		
		Arrays.sort(arr);
		
		for(int a : arr) {
			System.out.print(a + " ");
		}
		
		System.out.println();
		
		System.out.println("최대값 : " + arr[arr.length - 1]);
		System.out.println("최소값 : " + arr[0]);
	}
	
	public void practice13() {
		/**
		 * 10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고
		 * 1~10 사이의 난수를 발생시켜 중복된 값이 없게 배열에 초기화한 후 출력하세요.
		 */

		int[] arr = new int[10];
		int i = 0;
		boolean flag = false;
		
		while(i < arr.length) {
			int n = ((int)(Math.random() * 10) + 1);
			for(int j = 0; j <= i; j++) {
				
				if(n == arr[j]) {
					flag = true;
					break;
				}
			}
			
			if(flag) {
				flag = false;
				continue;
			}
			arr[i] = n;
			i++;
		}
		
		for(int a : arr) {
			System.out.print(a + " ");
		}
	}
	
	public void practice14() {
		// 로또 번호 자동 생성기 프로그램을 작성하는데 중복 값 없이 오름차순으로 정렬하여 출력하세요.
		
//		long startTimeM = System.currentTimeMillis(); // 코드 시작 시간. 밀리초
		long startTimeN = System.nanoTime(); // 코드 시작 시간. 나노초
		
		// 내가 작성한 코드와 시간은 큰 차이가 없지만 아래 코드가 좀 더 빠름
		
		int[] arr = new int[6];
		
		// 1370700n/s
//		int i = 0;
//		boolean flag = false;
//		while(i < arr.length) {
//			int n = ((int)(Math.random() * 45) + 1);
//			for(int j = 0; j <= i; j++) {
//				
//				if(n == arr[j]) {
//					flag = true;
//					break;
//				}
//			}
//			
//			if(flag) {
//				flag = false;
//				continue;
//			}
//			arr[i] = n;
//			i++;
//		}
		
		// => 코드를 더 줄이기!
		// 내가 작성한 코드도 중복값이 저장되고 있지만 로직이 너무 길다
		// 1303300n/s
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 45) + 1;
			for(int j = 0; j < i; j++) {
				if(arr[i] == arr[j]) {
					i--;
					break;
				}
			}
		}

		Arrays.sort(arr);
		
		for(int a : arr) {
			System.out.print(a + " ");
		}

		
//		long endTimeM = System.currentTimeMillis(); // 코드 끝난 시간
		long endTimeN = System.nanoTime(); // 코드 끝난 시간

		long durationTimeSec = endTimeN - startTimeN;
	    
//		System.out.println(durationTimeSec + "m/s"); // 밀리세컨드 출력
//		System.out.println((durationTimeSec / 1000) + "sec"); // 초 단위 변환 출력
		System.out.println(durationTimeSec + "n/s"); // 나노세컨드 출력
	}
	
	public void practice15() {
		/**
		 * 문자열을 입력 받아 문자열에 어떤 문자가 들어갔는지 배열에 저장하고
		 * 문자의 개수와 함께 출력하세요.
		 */
		
		long startTimeM = System.currentTimeMillis(); // 코드 시작 시간. 밀리초
//		long startTimeN = System.nanoTime(); // 코드 시작 시간. 나노초
		
		Scanner sc = new Scanner(System.in);
		boolean flag = false;
		System.out.print("문자열 : ");
		String[] strArr = sc.nextLine().split("");
		String result = "";
		
		System.out.print("문자열에 있는 문자 : ");
		
		for(int i = 0; i < strArr.length; i++) {
			String[] r = result.split("");
//			System.out.println(r.length);
			if(result.length() == 0) result += strArr[i];
			else {
				for(int j = 0; j < r.length; j++) {
//					System.out.println(strArr[i]);
//					System.out.println(r[j]);
					if(strArr[i].equals(r[j])) {
						flag = true;
						break;
					}
				}
				if(flag) {
					flag = false;
				} else {
					result += strArr[i];
				}
			}
		}

		String[] r = result.split("");

		for(int i = 0; i < r.length; i++) {
			if(i == r.length - 1) System.out.println(r[i]);
			else System.out.print(r[i] + ", ");
		}
		System.out.println("문자 개수 : " + r.length);

		sc.close();
		
		long endTimeM = System.currentTimeMillis(); // 코드 끝난 시간
//		long endTimeN = System.nanoTime(); // 코드 끝난 시간

		long durationTimeSec = endTimeM - startTimeM;
	    
		System.out.println(durationTimeSec + "m/s"); // 밀리세컨드 출력
		System.out.println((durationTimeSec / 1000) + "sec"); // 초 단위 변환 출력
	}
	
	public void practice16() {
		/**
		 * 사용자가 입력한 배열의 길이만큼의 문자열 배열을 선언 및 할당하고
		 * 배열의 인덱스에 넣을 값 역시 사용자가 입력하여 초기화 하세요.
		 * 단, 사용자에게 배열에 값을 더 넣을지 물어보고 몇 개를 더 입력할 건지,
		 * 늘린 곳에 어떤 데이터를 넣을 것인지 받으세요.
		 * 사용자가 더 이상 입력하지 않겠다고 하면 배열 전체 값을 출력하세요.
		 */
		long startTimeM = System.currentTimeMillis(); // 코드 시작 시간. 밀리초
		
		Scanner sc = new Scanner(System.in);
		System.out.print("배열의 크기를 입력하세요 : ");
		int length = sc.nextInt();
		char answer;
		String[] strArr = new String[length];
		sc.nextLine();
		
		for(int i = 0; i < strArr.length; i++) {
			System.out.print((i + 1) + "번째 문자열 : ");
			strArr[i] = sc.nextLine();
		}

		String[] addStr = null;
		System.out.print("더 값을 입력하시겠습니까?(Y/N) : ");
		answer = sc.nextLine().charAt(0);

		while(answer == 'y') {
			System.out.print("더 입력하고 싶은 개수 : ");
			length = sc.nextInt();
			addStr = new String[length + strArr.length];
			System.arraycopy(strArr, 0, addStr, 0, strArr.length);
			sc.nextLine();
			for(int i = strArr.length; i < addStr.length; i++) {
				System.out.print((i + 1) + "번째 문자열 : ");
				addStr[i] = sc.nextLine();
			}
			
			System.out.print("더 값을 입력하시겠습니까?(Y/N) : ");
			answer = sc.nextLine().charAt(0);
			
			if(answer == 'n' || answer == 'N') {
				break;
			}
		}
		
		System.out.print("[");
		for(int i = 0; i < addStr.length; i++) {
			if(i == addStr.length - 1) System.out.print(addStr[i]);
			else System.out.print(addStr[i] + ", ");
		}
		System.out.print("]");
		
		sc.close();
		
		long endTimeM = System.currentTimeMillis(); // 코드 끝난 시간

		long durationTimeSec = endTimeM - startTimeM;
	    
		System.out.println(durationTimeSec + "m/s"); // 밀리세컨드 출력
		System.out.println((durationTimeSec / 1000) + "sec"); // 초 단위 변환 출력
	}
}
