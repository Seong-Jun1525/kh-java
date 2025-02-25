package com.kh.network.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Scanner;

public class UDPClient {

	public static void main(String[] args) {
		// 사용자로부터 입력받은 값을 UDP서버로 전송
		Scanner sc = new Scanner(System.in);
		
		System.out.print("전송 메시지 : ");
		String message = sc.nextLine();
		
		try(DatagramSocket ds = new DatagramSocket()) {
			// 서버 주소 (IP, Port)
			String ip = myIp();
			
			InetAddress ia = InetAddress.getByName(ip);
			int port = 8888;
			
			DatagramPacket dp = new DatagramPacket(
					message.getBytes(),				// 전송데이터
					message.getBytes().length, 		// 전송데이터 길이
					ia, 							// 서버 네트워크 정보
					port);							// 포트번호
			
			ds.send(dp);							// 데이터 전송
			
		} catch (SocketException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		sc.close();
	}

	
	public static String myIp() throws UnknownHostException {
		return InetAddress.getLocalHost().getHostAddress();
	}
}
