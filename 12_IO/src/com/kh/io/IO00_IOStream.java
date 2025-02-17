package com.kh.io;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class IO00_IOStream {
	/**
	 * 입출력(IO, Input / Output)
	 * - 프로그램 상의 데이터를 외부 매체로 출력하거나 반대로 외부 매체로부터 데이터를 입력받고자 할 때
	 *   프로그램과 외부 매체 사이에 데이터를 주고 받는 연결통로로서 역할을 하는 것을 [스트림]이라고 한다.
	 * 
	 * -------------			-------------			 -------------
	 * | 외부 매체 | ========== |			| ========== | 외부 매체 |
	 * | * 키보드  | --데이터-> | 프로그램	| --데이터-> | * 모니터  |
	 * | * 파일    | ========== |			| ========== | * 파일	 |
	 * | * 프로그램|	입력    |			|	 출력 	 | * 프로그램|
	 * -------------			-------------   		 -------------
	 * 
	 * 스트림의 특징
	 * - 단방향 : 입력용, 출력용 스트림이 나눠져 있다
	 * 			-> 입력과 출력을 동시에 하고자 한다면?
	 * 				=> 입력 스트림, 출력 스트림 각각 사용해야함
	 * 
	 * - 선입선출(FIFO)
	 * 
	 * - 시간지연이 발생될 수 있다.
	 * 
	 * 스트림의 구분
	 * -> 사이즈 : 바이트(1B) / 문자(2B)
	 * 			- 바이트 스트림 : 1B 씩 데이터가 왔다갔다 하는 통로
	 * 			=> IntputStream
	 * 			=> OutputStream
	 * 			- 문자 스트림 : 2B 씩 데이터가 왔다갔다 하는 통로
	 * 			=> Reader
	 * 			=> Writer
	 * -> 외부 매체와 직접 연결유무
	 * 			- 기반스트림 : 외부 매체와 직접적으로 연결되는 통로(필수 사용)
	 * 			- 보조스트림 : 기반스트림을 보조하는 통로, 속도를 빠르게 하거나, 유용한 기능을 제공하기 위한 스트림, 단독사용불가
	 */	
	
	public static void main(String[] args) {
		// I/O 스트림을 사용하여 키보드로 입력을 받아서 콘솔창에 출력하는 프로그램
		InputStream in = System.in; 	// 표준 입력 스트림
		OutputStream out = System.out;	// 표준 출력 스트림
		
		byte[] buf = new byte[1024];	// 입출력 시 버퍼에 데이터를 저장하기 위한 변수
		int len = 0;					// 데이터 길이
		
		try {
			while((len = in.read(buf)) != -1) {
				// 프로그램이 종료될 때까지 계속 입력 받음
				out.write(buf, 0, len);	// offset : 시작 위치
				out.flush();			// 데이터를 주고받는 통로에 남은 모든 데이터를 밀어버린다.
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// 자원 반납
			try {
				if(out != null) out.close();
				if(in != null) in.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
