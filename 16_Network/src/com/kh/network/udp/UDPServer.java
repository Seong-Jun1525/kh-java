package com.kh.network.udp;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UDPServer {

	public static void main(String[] args) {
		// 1) IP, Port
		int port = 8888;
		
		try(DatagramSocket ds = new DatagramSocket(port)) { // UDP 용 소켓 객체 생성
			while(true) {
				// 데이터 받을 준비 완료
				System.out.println("=".repeat(30) + "요청 대기중" + "=".repeat(30));
				
				// 클라이언트로부터 받을 packet 객체 생성
				byte[] data = new byte[1024];
				
				DatagramPacket dp = new DatagramPacket(data, data.length);
				
				// 전송된 데이터 받기
				ds.receive(dp);
				
				// 전송된 데이터 정보 확인
				System.out.println("클라이언트 IP : " + dp.getAddress());
				
				String message = new String(dp.getData(), "UTF-8"); // 인코딩을 위해서 생성자 활용하기
				System.out.println("전송된 메시지 : " + message);
			}
		} catch (SocketException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
