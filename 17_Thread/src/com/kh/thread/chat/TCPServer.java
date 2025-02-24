package com.kh.thread.chat;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {

	public static void main(String[] args) {
		// 1) 포트 지정 (IP는 PC에서 저장됨)
		int port = 7979;
		
		try {
			// 2) ServerSocket 객체 생성
			ServerSocket server = new ServerSocket(port);
			
			// 3) Socket 객체 생성
			Socket socket = server.accept();
			
			System.out.println(socket.getInetAddress().getHostAddress());
			
			// 클라이언트로 부터 메시지를 받는 스레드 => ServerReceiver
			
			
			// 클라리언트로 메시지를 보내는 스레드 => ServerSender
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
