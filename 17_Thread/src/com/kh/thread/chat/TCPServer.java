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
			ServerReceiver receiver = new ServerReceiver(socket);
			
			// => 람다식
//			Runnable lamdaR = () -> {
//				// 소켓 객체로 부터 스트림 객체를 생성
//				try(BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()))) {
//					// 새로운 메시지가 도착할 때마다 해당 내용을 출력
//					while(true) {
//						String message = br.readLine();
//						
//						System.out.println("클라이언트로부터 온 메시지 : " + message);
//					}
//				} catch (IOException e) {
//					e.printStackTrace();
//				}
//			};
			
			Thread task1 = new Thread(receiver);
			task1.start();
			
			// 클라리언트로 메시지를 보내는 스레드 => ServerSender
			ServerSender sender = new ServerSender(socket);
			Thread task2 = new Thread(sender);
			task2.start();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
