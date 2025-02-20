package com.kh.practice2.score.view;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import com.kh.practice2.score.controller.ScoreController;

public class ScoreMenu {
	private Scanner sc = new Scanner(System.in);
	private ScoreController scr = new ScoreController();
	
	public void mainMenu() {
		int n;
		do {
			System.out.println("1. 성적 저장");
			System.out.println("2. 성적 출력");
			System.out.println("9. 끝내기");
			System.out.print("메뉴 번호 : ");
			n = sc.nextInt();
			sc.nextLine();
			
			switch(n) {
				case 1:
					saveScore();
					break;
				case 2:
					readScore();
					break;
				case 9:
					break;
				default:
					System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
		} while(n != 9);
		System.out.println("프로그램을 종료합니다.");
	}
	
	public void saveScore() {
		int num = 0;
		char ans;
		do {
			System.out.println((num + 1) + "번 째 학생의 정보 기록");
			System.out.print("이름 : ");
			String name = sc.nextLine();
			System.out.print("국어 점수 : ");
			int kor = sc.nextInt();
			System.out.print("영어 점수 : ");
			int eng = sc.nextInt();
			System.out.print("수학 점수 : ");
			int math = sc.nextInt();
			sc.nextLine();
			int sum = kor + eng + math;
			double avg = (double)sum / (double)num;
			
			scr.saveScore(name, kor, eng, math, sum, avg);
			
			System.out.print("그만 입력하시려면 N 또는 n 입력, 계속 하시려면 아무 키나 입력하세요 : ");
			ans = sc.nextLine().charAt(0);
			num++;
		} while(ans != 'N' && ans != 'n');
	}
	
	public void readScore() {
		// scr의 readScore()의 반환 값을 DataInputStream에 담고 반복문을 이용하여
		// 안에 들어가있는 데이터를 가지고 와서 출력
		// 모든 파일이 읽어졌을 때 나오는 EOFException을 이용하여
		// EOFException가 일어났을 때 읽은 회수, 전체 합계, 전체 평균 출력
		
		int count = 0; // 몇 명의 학생인지(반복문이 몇 번 실행됐는지) 담을 변수
		int sumAll = 0;
		double avgAll = 0.0; // 모든 학생들의 합과 평균을 담을 변수
		DataInputStream dis = null;
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
		try {
			dis = scr.readScore();
			while(true) {
//				System.out.println("반복문 시작");
				// DataInputStream은 각 자료형에 맞게 입력이 가능
				String name = dis.readUTF();
				int kor = dis.readInt();
				int eng = dis.readInt();
				int math = dis.readInt();
				int sum = dis.readInt();
				sumAll += sum;
				double avg = dis.readDouble();
				avgAll += avg;
				System.out.println(name + "\t"
						+ kor + "\t"
						+ eng + "\t"
						+ math + "\t"
						+ sum + "\t"
						+ avg);
				count++;
			}
		} catch(EOFException e) { 
			System.out.println("읽은 횟수\t전체합계\t전체평균");
			System.out.println(count + "\t\t" + sumAll + "\t\t " + avgAll / count);
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				dis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
