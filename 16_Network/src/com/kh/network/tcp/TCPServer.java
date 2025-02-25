package com.kh.network.tcp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class TCPServer {
	/** TCP
	 * - 서버, 클라이언트 간에 1:1 소켓통신
	 * - 데이터 교환 전 서버와 클라이언트의 연결이 되어야 함
	 * (서버가 먼저 실행되어 클라이언트의 요청을 기다려야 함)
	 * - 신뢰성있는 데이터 전달 가능
	 * 
	 * Socket 클래스
	 * - 프로세스 간의 통신을 담당
	 * - 스트림(Input/OutputStream)을 가지고 있음
	 * (해당 스트림을 이용하여 입출력이 가능!)
	 * 
	 * ServerSocket
	 * - 포트와 연결되어 외부의 요청을 기다림 => 요청이 들어오면 수락함
	 * 		=> 수락한다는 것은 통신할 수 있는 소켓을 생성한다
	 */

	// 서버용 프로그램이다 (가정)
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 1) 포트번호 지정
		int port = 3000;
		BufferedReader br = null;
		PrintWriter pw = null;
		ServerSocket server = null;
		Socket socket = null;
		
		try {
			// 2) ServerSocket 객체 생성(지정한 포트번호를 사용)
			server = new ServerSocket(port);
			
			System.out.println("=== 클라이언트 요청 대기중 ===");
			
			// 3) 요청이 들어오면 수락 후 소켓 객체를 생성
			// 		=> 소켓: 클라이언트와 통신을 담당하는 객체
			socket = server.accept();
			System.out.println(socket.getInetAddress().getHostAddress() + "가 연결됨");
			
			// 입출력 스트림
			// 4) 클라이언트와 입출력 기반스트림 생성 (바이트 스트림만 가능하다)
			// 5) 보조스트림을 활용하여 성능 개선
			
			// 입력용 스트림(클라이언트로 부터 전달된 값을 한 줄 단위로 읽어오기 위해 사용)
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			
			// 출력용 스트림(클라이언트로 값을 전달)
			pw = new PrintWriter(socket.getOutputStream());
			
			while(true) {
				String message = br.readLine();
				System.out.println("클라이언트로 부터 온 메시지 => " + message);
				
				System.out.print("클라이언트로 보낼 메시지 : ");
				String sendMessage = sc.nextLine();
				pw.println(sendMessage);
				pw.flush();
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// 6) 통신종료
			try {
				if(pw != null) pw.close();
				if(br != null) br.close();
				
				if(server != null ) server.close();
				sc.close();
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
	}

}
