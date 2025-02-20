package com.kh.list;

import java.util.ArrayList;
import java.util.List;

public class ListPractice {

	/**
	 * List의 특징
	 * - 순서O
	 * - 중복O
	 * 
	 * ArrayList
	 * - 배열 기반
	 * - 데이터 조회가 빠름
	 * - 데이터 추가 / 삭제가 느림
	 * 
	 * LinkedList
	 * - 리스트 기반 
	 * - 데이터 조회가 느림
	 * - 데이터 추가 / 삭제가 빠름
	 * 
	 * 메서드
	 * - 데이터 추가 : add()
	 * - 데이터 삭제 : remove()
	 * - 데이터 조회 : get()
	 * - 데이터 수정 : set()
	 * - 데이터 크기 : size()
	 */
	
	public static void main(String[] args) {
		arrayListTest();
	}

	private static void arrayListTest() {
		// 문자열 데이터를 관리하는 ArrayList
//		List<String> strList = new ArrayList<>();
		ArrayList<String> strList = new ArrayList<>();
		
		// ["헤이즐넛", "아메리카노", "카모마일"]
		strList.add("헤이즐넛");
		strList.add("아메리카노");
		strList.add("카모마일");
		strList.add("아메리카노");
		
		System.out.println(strList);
		strList.remove(1);
		System.out.println(strList);
	}

}
