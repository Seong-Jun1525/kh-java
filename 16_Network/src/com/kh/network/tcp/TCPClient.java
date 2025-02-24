package com.kh.network.tcp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class TCPClient {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 192.168.10.24
		Socket socket = null;
		BufferedReader br = null;
		PrintWriter pw = null;
		
		// 서버로 요청할 때 필요한 정보
		// => 서버 ip주소와 포트번호
		
//		String serverIP = myIpAddress();
		String serverIP = "192.168.10.91";
		int port = 3000;
		
		try {
			socket = new Socket(serverIP, port);
			
			if(socket != null) {
				System.out.println("=== 서버와 연결됨 ===");
				
				// 2) 서버와 입출력 스트림 생성
				// 3) 보조스트림을 사용하여 성능 개선
				
				// 입력용 스트림
				br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				
				pw = new PrintWriter(socket.getOutputStream());
				
				while(true) {
					System.out.print("서버로 보낼 메시지 : ");
					String sendMessage = sc.nextLine();
					
					pw.println(sendMessage);
					pw.flush();
					
					String message = br.readLine();
					System.out.println("서버로 부터 온 메시지 : " + message);
				}
			}
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			try {

				if(pw != null) pw.close();
				if(br != null) br.close();
				if(socket != null) socket.close();
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static String myIpAddress() {
		String ip = null;
		try {
			ip = InetAddress.getLocalHost().getHostAddress();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ip;
	}

}
