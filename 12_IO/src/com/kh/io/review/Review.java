package com.kh.io.review;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Review {
	private static String fileName = "tt.txt";
	// => static으로 선언된 변수이어야지 static 메서드에서 사용 가능함

	public static void main(String[] args) {
		fileWrite();
		fileRead();
	}
	
	// => static으로 선언된 메서드이므로 멤버변수를 사용하려면 static으로 선언되어있어야 함!!
	public static void fileWrite() {
		String[] samples = {"안녕하세요", "반가워요", "또만나요"};
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));) {
			for(String s : samples) {
		
				bw.write(s);
				bw.newLine();
				
			}
		} catch (IOException e) {
			e.printStackTrace();		
		}
	
	}
	
	// => static으로 선언된 메서드이므로 멤버변수를 사용하려면 static으로 선언되어있어야 함!!
	public static void fileRead() {
	
		try (BufferedReader br = new BufferedReader(new FileReader(fileName));) {
			String data = null;
			while ((data = br.readLine()) != null) {
				System.out.println(data);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
