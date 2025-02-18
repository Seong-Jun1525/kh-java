package com.kh.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class IO02_AssistantStream {
	/**
	 * 보조 스트림
	 * 	- 기반 스트림만으로 부족한 성능을 향상시켜주는 스트림 
	 * 	- 기반 스트림에서 제공하지 않는 추가적인 메서드를 가짐
	 * 		=> 데이터 전송 속도 향상!
	 *  - 외부 매체와 직접적으로 연결되지 않기때문에 단독 사용 불가
	 *  	=> 반드시 기반 스트림과 함께 사용!
	 */

	public static void main(String[] args) {
		fileSave();
		fileRead();
		objectSave();
		objectRead();
	}
	
	// 파일 -> 프로그램 : 입력. 객체로 저장된 데이터
	public static void objectRead() {
		// FileInputStream
		// ObjectInputStream
		
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("myProducts.txt"));) {
			// toString 메서드를 재정의하지 않으면 패키지명+주소값이 출력됨
			System.out.println(ois.readObject());
			System.out.println(ois.readObject());
			System.out.println(ois.readObject());
			System.out.println(ois.readObject()); // 값이 넘어가면 EOFException 예외 발생!
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch(EOFException e) {
			System.out.println("파일데이터 모두 입력 완료");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	// 프로그램 -> 파일 : 출력. 객체에 저장된 데이터
	public static void objectSave() {
		Product p1 = new Product("텀블러", 45000);
		Product p2 = new Product("노트북", 1450000);
		Product p3 = new Product("키보드", 65000);
		
		// FileOutputStream : 기반스트림. 1바이트 단위로 파일에 출력하는 스트림.
		// ObjectOutputStream : 보조스트림. 객체 단위로 출력을 도와주는 스트림.
		
		// Serializable을 꼭 상속을 하고 있어야지 ObjectOutputStream이 가능하다.
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("myProducts.txt"))) {
			oos.writeObject(p1);
			oos.writeObject(p2);
			oos.writeObject(p3);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	// 파일 -> 프로그램 : 입력
	public static void fileRead() {
		// FileReader : 기반 스트림. 파일에 직접 연결하여 2바이트씩 데이터를 입력받을 수 있는 스트림
		// BufferedReader : 한 줄씩 데이터를 읽어오도록 도와주는 보조 스트림
		
		try(BufferedReader br = new BufferedReader(new FileReader("as_test.txt"))) {
			String data = null;
			
			while((data = br.readLine()) != null) {
				System.out.println(data);
			}
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}

	// 프로그램 -> 파일 : 출력
	public static void fileSave() {
		// FileWriter : 기반 스트림. 파일을 직접적으로 연결하여 2바이트씩 출력하는 스트림
		// BufferedWriter : 속도 향상을 도와주는 보조 스트림
//		BufferedWriter bw = null;
		
//		try {
//			// 1. 기반스트림 생성
//			FileWriter fw = new FileWriter("as_test.txt");
//			
//			// 2. 보조스트림 생성
//			bw = new BufferedWriter(fw);
//			
//			bw.write("안녕하세요" + "\n");
//			bw.write("임성준입니다." + "\n");
//			bw.write("끝");
//			bw.newLine();
//			bw.flush();
//		} catch (IOException e) {
//			e.printStackTrace();
//		} finally {
//			try {
//				bw.close();
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//		}
		
		// try - with - resources : 자원을 알아서 해제해줌 => close()을 명시하지 안하도 됨.
		try(BufferedWriter bw = new BufferedWriter(new FileWriter("as_test.txt"))) {
			bw.write("안녕하세요" + "\n");
			bw.write("임성준입니다." + "\n");
			bw.write("끝");
			bw.newLine();
			bw.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
