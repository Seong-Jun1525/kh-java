package com.kh.network.inet;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetTest {
	public void test() {
		// InetAddress : IP 주소 관련 정보를 확인할 수 있는 클래스
		try {
			// 내 PC에 대한 정보를 확인
			InetAddress localhost = InetAddress.getLocalHost();
			
			System.out.println(localhost); // PC 정보 / IP 주소
			
			System.out.println(localhost.getHostName());		// 내 PC 정보만 출력
			System.out.println(localhost.getHostAddress());		// 내 IP 주소만 출력
			
			// 도메인을 통해서 서버 정보를 확인
			InetAddress google = InetAddress.getByName("www.google.com");
			System.out.println(google.getHostName());		// google 정보만 출력
			System.out.println(google.getHostAddress());	// google 주소만 출력
			System.out.println("=".repeat(10));
			System.out.println("=".repeat(10));
			
			InetAddress[] naver = InetAddress.getAllByName("www.naver.com");
			System.out.println("네이버 호스트 개수 : " + naver.length);
			
			for(InetAddress ia : naver) {
				System.out.println(ia.getHostName());
				System.out.println(ia.getHostAddress());
				System.out.println("=".repeat(10));
			}
			System.out.println("=".repeat(10));
			
			// github
			InetAddress[] github = InetAddress.getAllByName("github.com");
			
			for(InetAddress ia : github) {
				System.out.println(ia.getHostName());
				System.out.println(ia.getHostAddress());
				System.out.println("=".repeat(10));
			}
			
			InetAddress[] baekjoon = InetAddress.getAllByName("www.baekjoon.com");
			
			System.out.println(baekjoon.length);
			for(InetAddress ia : baekjoon) {
				System.out.println(ia.getHostName());
				System.out.println(ia.getHostAddress());
				System.out.println("=".repeat(10));
			}
			
		} catch (UnknownHostException e) { // Checked Exception에 속하므로 처리해야함
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
