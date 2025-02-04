package com.kh.practice.dimension;

import java.util.Scanner;

public class DimensionPractice {
	public void practice1() {
		/**
		 * 3행 3열짜리 문자열 배열을 선언 및 할당하고
		 * 인덱스 0행 0열부터 2행 2열까지 차례대로 접근하여
		 * “(0, 0)”과 같은 형식으로 저장 후 출력하세요.
		 */
		
		String[][] strArr = new String[3][3];
		
		for(int i = 0; i < strArr.length; i++) {
			for(int j = 0; j < strArr.length; j++) {
				strArr[i][j] = "(" + i + ", " + j + ")";
			}
		}
		
		for(int i = 0; i < strArr.length; i++) {
			for(int j = 0; j < strArr.length; j++) {
				System.out.print(strArr[i][j]);
			}
			System.out.println();
		}
	}
	
	public void practice2() {
		/**
		 * 4행 4열짜리 정수형 배열을 선언 및 할당하고
		 * 1) 1 ~ 16까지 값을 차례대로 저장하세요.
		 * 2) 저장된 값들을 차례대로 출력하세요.
		 */
		
		int[][] arr = new int[4][4];
		int num = 1;
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = num++;
			}
		}
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr.length; j++) {
//				if(arr[i][j] < 10) System.out.print(" " + arr[i][j] + " ");
//				else System.out.print(arr[i][j] + " ");
				System.out.printf("%2d ", arr[i][j]);
			}
			System.out.println();
		}
	}
	
	public void practice3() {
		/**
		 * 4행 4열짜리 정수형 배열을 선언 및 할당하고
		 * 1) 16 ~ 1과 같이 값을 거꾸로 저장하세요.
		 * 2) 저장된 값들을 차례대로 출력하세요.
		 */
		
		int[][] arr = new int[4][4];
		int num = 16;
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = num--;
			}
		}
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr.length; j++) {
//				if(arr[i][j] < 10) System.out.print(" " + arr[i][j] + " ");
//				else System.out.print(arr[i][j] + " ");
				
				System.out.printf("%2d ", arr[i][j]);
			}
			System.out.println();
		}
	}
	
	public void practice4() {
		long startTimeN = System.nanoTime(); // 코드 시작 시간. 밀리초
		/**
		 * 4행 4열 2차원 배열을 생성하여
		 * 
		 * 0행 0열부터 2행 2열까지는 1~10까지의 임의의 정수 값 저장 후
		 * 아래의 내용처럼 처리하세요.
		 */
		int[][] arr = new int[4][4];
		int rSum = 0;
		int lSum = 0;
		int total = 0;
		
		for(int i = 0; i < arr.length - 1; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				if(j == 3) arr[i][j] = rSum;
				else {
					arr[i][j] = (int)(Math.random() * 10) + 1;
					rSum += arr[i][j];
				}
			}
			total += rSum;
			rSum = 0;
		}
		
		for(int i = 0; i < arr.length - 1; i++) {
			for(int j = 0; j < arr.length; j++) {
				if(j == 3) arr[j][i] = lSum;
				else {
					lSum += arr[j][i];
				}
			}
			total += lSum;
			lSum = 0;
		}
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr.length; j++) {
				if(i == arr.length - 1 && j == arr.length - 1) {
					System.out.print(total);
				} else {
					if(arr[i][j] < 10) System.out.print(" " + arr[i][j] + " ");
					else System.out.print(arr[i][j] + " ");
				}
			}
			System.out.println();
		}

		long endTimeN = System.nanoTime(); // 코드 끝난 시간
		long durationTimeSec = endTimeN - startTimeN;
		
		System.out.println("내가 짠거 : " + durationTimeSec + "ns");
		System.out.println("내가 짠거 : " + durationTimeSec / 1000000000 + "s");
		
		System.out.println("======");
		Runtime.getRuntime().gc();
		long usedMemory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
		System.out.println("내가 짠거 : " + usedMemory + " bytes");
	}
	
	public void practice4_1() {
		long startTimeN = System.nanoTime(); // 코드 시작 시간. 밀리초
		// 4행 4열 2차원 배열 생성 (선언 및 할당)
		int[][] arr = new int[4][4];
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				
				// 마지막 행의 인덱스
				int lastRow = arr.length - 1;	 // 3
				// 마지막 열의 인덱스
				int lastCol = arr[i].length - 1; // 3 
				
				if (i<lastRow && j<lastCol) {
					// 0,0 ~ 2,2 위치에 랜덤값을 저장
					arr[i][j] = (int)(Math.random()*10+1);
				}
				
				// 행의 위치가 마지막행이 아닌 경우
				// 현재 값을 더해서 마지막 행에 저장
				if (i < lastRow) {
					arr[lastRow][j] += arr[i][j];
				}
				
				// 마지막 열의 위치에 현재값 저장
				if (j < lastCol) {
					arr[i][lastCol] += arr[i][j];
				}				
				
			}
		}
		
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.printf("%3d ",arr[i][j]);
			}
			System.out.println();
		}
		

		long endTimeN = System.nanoTime(); // 코드 끝난 시간
		long durationTimeSec = endTimeN - startTimeN;
		
		System.out.println("풀이 1 : " + durationTimeSec + "ns");
		System.out.println("풀이 1 : " + durationTimeSec / 1000000000 + "s");
		
		System.out.println("======");
		Runtime.getRuntime().gc();
		long usedMemory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
		System.out.println("풀이 1 : " + usedMemory + " bytes");
	}
	
	public void practice4_2() {
		long startTimeN = System.nanoTime(); // 코드 시작 시간. 밀리초
		// 4행 4열 2차원 배열 생성 (선언 및 할당)
		int[][] arr = new int[4][4];
		
		// * 0행 0열부터 2행 2열까지 1 ~ 10사이의 랜덤값을 저장
		for(int i=0; i<3; i++) {		// 0행 ~ 2행
			for(int j=0; j<3; j++) {	// 0열 ~ 2열
				arr[i][j] = (int)(Math.random()*10+1);
			}
		}
		// * 마지막행과 마지막열에 값을 더하여 저장
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				arr[3][i] += arr[j][i]; 
			}
		}
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				arr[i][3] += arr[i][j];
			}
		}
		
		arr[3][3] = arr[3][0] + arr[3][1] + arr[3][2]
					+ arr[0][3] + arr[1][3] + arr[2][3];
		
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.printf("%3d ",arr[i][j]);
			}
			System.out.println();
		}
		

		long endTimeN = System.nanoTime(); // 코드 끝난 시간
		long durationTimeSec = endTimeN - startTimeN;
		
		System.out.println("풀이 2 : " + durationTimeSec + "ns");
		System.out.println("풀이 2 : " + durationTimeSec / 1000000000 + "s");
		
		System.out.println("======");
		Runtime.getRuntime().gc();
		long usedMemory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
		System.out.println("풀이 2 : " + usedMemory + " bytes");
	}
	
	public void practice5() {
		/**
		 * 2차원 배열의 행과 열의 크기를 사용자에게 직접 입력받되, 1~10사이 숫자가 아니면
		 * “반드시 1~10 사이의 정수를 입력해야 합니다.” 출력 후 다시 정수를 받게 하세요.
		 * 크기가 정해진 이차원 배열 안에는 영어 대문자가 랜덤으로 들어가게 한 뒤 출력하세요.
		 * (char형은 숫자를 더해서 문자를 표현할 수 있고 65는 A를 나타냄)
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("행 크기 : ");
		int r = sc.nextInt();
		
		System.out.print("열 크기 : ");
		int c = sc.nextInt();
		
		if(0 < r && r <= 10) {
			char arr[][] = new char[r][c];
			
			for(int i = 0; i < r; i++) {
				for(int j = 0; j < c; j++) {
					arr[i][j] = (char)(((int)(Math.random() * 26)) + 'A');
				}
			}
			
			for(int i = 0; i < r; i++) {
				for(int j = 0; j < c; j++) {
					System.out.printf("%c ", arr[i][j]);
				}
				System.out.println();
			}
		} else {
			System.out.println("반드시 1~10 사이의 정수를 입력해야 합니다.");
			practice5();
		}
		
		sc.close();
	}
	
	public void practice6() {
		/**
		 * 초기화되어 있는 배열을 가지고
		 * 아래의 ‘[그림] 실습문제4 흐름’과 같은 방식으로 출력하세요.
		 * 단, print()를 사용하고 값 사이에 띄어쓰기(“ “)가 존재하도록 출력하세요
		 */
		String[][] strArr = new String[][] {
			{"이", "까", "왔", "앞", "힘"},
			{"차", "지", "습", "으", "냅"},
			{"원", "열", "니", "로", "시"},
			{"배", "심", "다", "좀", "다"},
			{"열", "히", "! ", "더", "!! "}
		};
		
		for(int i = 0; i < strArr.length; i++) {
			for(int j = 0; j < strArr.length; j++) {
				System.out.print(strArr[j][i] + " ");
			}
		}
	}
	
	public void practice7() {
		/**
		 * 사용자에게 행의 크기를 입력 받고 그 수만큼의 반복을 통해 열의 크기도 받아
		 * 문자형 가변 배열을 선언 및 할당하세요.
		 * 그리고 각 인덱스에 ‘a’부터 총 인덱스의 개수만큼 하나씩 늘려 저장하고 출력하세요
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("행의 크기 : ");
		int r = sc.nextInt();

		char[][] arr = new char[r][];
		
		char alpha = 'a';
		
		for(int i = 0; i < r; i++) {
			System.out.printf("%d행의 열 크기 : ", i);
			int c = sc.nextInt();
			
			arr[i] = new char[c];
			
			for(int j = 0; j < c; j++) {
				arr[i][j] = alpha++;
			}
		}
		
		for(int i = 0; i < r; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		sc.close();
	}
	
	public void practice8() {
		/**
		 * 1차원 배열에 12명의 학생들을 출석부 순으로 초기화 하고
		 * 2열 3행으로 2차원 배열 2개를 이용하여 분단을 나눠
		 * 1분단 왼쪽부터 오른쪽, 1행에서 아래 행 순으로 자리를 배치하세요.
		 * <출석부>
		 * 1. 강건강 2. 남나나 3. 도대담 4. 류라라 5. 문미미 6. 박보배
		 * 7. 송성실 8. 윤예의 9. 진재주 10. 차천축 11. 피풍표 12. 홍하하
		 */
		
		String[] student = {
								"강건강", "남나나", "도대담", "류라라", "문미미",
								"박보배", "송성실", "윤예의", "진재주", "차천축",
								"피풍표", "홍하하"
							};
		
		String[][] firstTeam = new String[3][2];
		String[][] secondTeam = new String[3][2];
		
		int i = 0, count = 1;
		
		while(count < 3) {
			for(int j = 0; j < (int)(student.length / 2) / 2; j++) {
				for(int k = 0; k < 2; k++) {
					if(i < (int)(student.length / 2)) firstTeam[j][k] = student[i++];
					else secondTeam[j][k] = student[i++];
				}
			}
			System.out.printf("== %d분단 ==\n", count);
			
			for(int j = 0; j < (int)(student.length / 2) / 2; j++) {
				for(int k = 0; k < 2; k++) {
					if(count == 1) System.out.print(firstTeam[j][k] + " ");
					else System.out.print(secondTeam[j][k] + " ");
				}
				System.out.println();
			}
			count++;
		}
	}
	
	public void practice9() {
		String[] student = {
				"강건강", "남나나", "도대담", "류라라", "문미미",
				"박보배", "송성실", "윤예의", "진재주", "차천축",
				"피풍표", "홍하하"
			};

		String[][] firstTeam = new String[3][2];
		String[][] secondTeam = new String[3][2];
		
		int i = 0, count = 1;
		
		while(count < 3) {
			for(int j = 0; j < (int)(student.length / 2) / 2; j++) {
				for(int k = 0; k < 2; k++) {
					if(i < (int)(student.length / 2)) firstTeam[j][k] = student[i++];
					else secondTeam[j][k] = student[i++];
				}
			}
			System.out.printf("== %d분단 ==\n", count);
			
			for(int j = 0; j < (int)(student.length / 2) / 2; j++) {
				for(int k = 0; k < 2; k++) {
					if(count == 1) System.out.print(firstTeam[j][k] + " ");
					else System.out.print(secondTeam[j][k] + " ");
				}
				System.out.println();
			}
			count++;
		}
		
		System.out.println("===========================");
		
		boolean flag = false;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("검색할 학생 이름을 입력하세요 : ");
		String name = sc.nextLine();
		int team = 0;
		i = 0; count = 1;
		String line = "", location = "";

		while(count < 3) {
			for(int j = 0; j < (int)(student.length / 2) / 2; j++) {
				for(int k = 0; k < 2; k++) {
					if(i++ < (int)(student.length / 2)) {
						if(firstTeam[j][k].equals(name)) {
							flag = true;
						}
					}
					else {
						if(secondTeam[j][k].equals(name)) {
							flag = true;
						}
					}
					
					if(flag) {
						team = count;
						location = k == 0 ? "왼쪽" : "오른쪽";
						break;
					}
				}
				if(flag) {
					switch(j) {
						case 0:
							line = "첫 번째";
							break;
						case 1:
							line = "두 번째";
							break;
						case 2:
							line = "세 번째";
							break;
					}
					break;
				}
			}
			if(flag) break;
			count++;
		}
		
		if(flag) {
			System.out.printf("검색하신 %s 학생은 %d분단 %s 줄 %s에 있습니다.", name, team, line, location);
		}
		
		sc.close();
	}
	
	public void practice10() {
		/**
		 * String 2차원 배열 6행 6열을 만들고 행의 맨 위와 열의 맨 앞은 각 인덱스를 저장하세요.
		 * 그리고 사용자에게 행과 열을 입력 받아 해당 좌표의 값을 'X'로 변환해 2차원 배열을 출력하세요.
		 */
		Scanner sc = new Scanner(System.in);
		String[][] strArr = new String[6][6];
		
		for(int i = 0; i < strArr.length; i++) {
			for(int j = 0; j < strArr.length; j++) {
				if(i == 0 && j == 0) {
					strArr[i][j] = " ";
				} else if(i == 0) {
					strArr[i][j] = (j-1) + "";
				} else if(j == 0) {
					strArr[i][j] = (i-1) + "";
				} else {
					strArr[i][j] = "  ";
				}
			}
		}
		
		System.out.print("행 인덱스 입력 : ");
		int r = sc.nextInt();
		
		System.out.print("열 인덱스 입력 : ");
		int c = sc.nextInt();
		
		for(int i = 0; i < strArr.length; i++) {
			for(int j = 0; j < strArr.length; j++) {
				if(i == 0 && j == 0) {
					System.out.print(strArr[i][j] + " ");
				} else if(i == 0) {
					System.out.print(strArr[i][j] + " ");
				} else if(j == 0) {
					System.out.print(strArr[i][j] + " ");
				} else {
					if(i-1 == r && j-1 == c) {
						strArr[i][j] = "X";
						System.out.print(strArr[i][j] + " ");
					}
					else {
						System.out.print(strArr[i][j]);
					}
				}
			}
			System.out.println();
		}
		
		sc.close();
	}
	
	public void prcatice11() {
		Scanner sc = new Scanner(System.in);
		String[][] strArr = new String[6][6];
		
		for(int i = 0; i < strArr.length; i++) {
			for(int j = 0; j < strArr.length; j++) {
				if(i == 0 && j == 0) {
					strArr[i][j] = " ";
				} else if(i == 0) {
					strArr[i][j] = (j-1) + "";
				} else if(j == 0) {
					strArr[i][j] = (i-1) + "";
				} else {
					strArr[i][j] = "  ";
				}
			}
		}
		
		while(true) {
			System.out.print("행 인덱스 입력 : ");
			int r = sc.nextInt();
			
			if(r == 99) {
				System.out.println("프로그램 종료");
				break;
			}
			
			System.out.print("열 인덱스 입력 : ");
			int c = sc.nextInt();
			
			for(int i = 0; i < strArr.length; i++) {
				for(int j = 0; j < strArr.length; j++) {
					if(i == 0 && j == 0) {
						System.out.print(strArr[i][j] + " ");
					} else if(i == 0) {
						System.out.print(strArr[i][j] + " ");
					} else if(j == 0) {
						System.out.print(strArr[i][j] + " ");
					} else {
						if(i-1 == r && j-1 == c) {
							strArr[i][j] = "X";
							System.out.print(strArr[i][j] + " ");
						}
						else {
							System.out.print(strArr[i][j]);
						}
					}
				}
				System.out.println();
			}
		}
		
		sc.close();
	}
}
