package com.kh.practice2.score.model.dao;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ScoreDAO {

	public void saveScore(String name, int kor, int eng, int math, int sum, double avg) {
		/**
		 * 매개변수들을 DataOutputStream을 통해 파일에 저장
		 * 아래처럼 했을 경우 자동 close()를 해주기 때문에 스트림을 쓸 수가 없어짐
		 * => 즉, close를 해주면 DataOutputStream을 여러번 생성하기 때문에
		 * 값을 제대로 읽어오지 못함. 에러가 발생
		 */
		/*
//		try(DataOutputStream dos = new DataOutputStream(new FileOutputStream("data.txt"))) {
//			dos.writeBytes("이름\t국어\t영어\t수학\t총점\t평균\n");
//			dos.writeBytes(name + "\t");
//			dos.writeBytes(kor + "\t");
//			dos.writeBytes(eng + "\t");
//			dos.writeBytes(math + "\t");
//			dos.writeBytes(sum + "\t");
//			dos.writeBytes(avg + "\n");
//			dos.flush();
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
 * 
 */
		DataOutputStream dos = null;
		try {
			dos = new DataOutputStream(new FileOutputStream("data.txt", true));
			// DataOutputStream은 각 자료형에 맞게 출력이 가능
			dos.writeUTF(name);
			dos.writeInt(kor);
			dos.writeInt(eng);
			dos.writeInt(math);
			dos.writeInt(sum);
			dos.writeDouble(avg);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public DataInputStream readScore() throws FileNotFoundException {
		// 파일을 DataInputStream을 통해 읽어옴
		DataInputStream dis = null;
		try {
			dis = new DataInputStream(new FileInputStream("data.txt"));
			return dis;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}
}
