package com.kh.thread.chat;

import java.io.IOException;
import java.net.Socket;

public class TCPClient {

	public static void main(String[] args) {
		// 1) 서버의 IP 주소, 포트번호 => localhost, 7979
		// 2) Socket 객체 생성 (=> 서버 정보 전달)
		try {
			Socket socket = new Socket("localhost", 7979);
//			Socket socket = new Socket("192.168.10.88", 8282);
			// 37
			if(socket != null) {
				// 3) 스트림 생성 후 데이터 통신
				// 서버로부터 메시지를 받는 스레드
				ClientReceiver cr = new ClientReceiver(socket);
				cr.start();
				
				// 서버로 메시지를 보내는 스레드
				ClientSender cs = new ClientSender(socket);
				cs.start();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
