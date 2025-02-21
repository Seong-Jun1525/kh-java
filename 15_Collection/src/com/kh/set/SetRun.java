package com.kh.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class SetRun {

	/**
	 * Set 특징
	 * - 순서X, 중복X
	 * 
	 * Hash 알고리즘
	 * - 특정 기준에 따라 데이터를 분류하는 방식
	 * 
	 * - 중복 데이터 판단 : hashCode(), equals()
	 * [1] hashCode : 기준이 되는 값을 정의
	 * [2] equals : hashCode 값이 같을 경우 동일 데이터를 판단하는 로직을 정의
	 * 
	 * 메서드
	 * - 데이터추가 : add(data)
	 * - 데이터삭제 : remove(data)
	 * - 데이터크기 : size()
	 * - 데이터조회
	 * [1] Iterator(반복자) 사용
	 * 		Iterator 객체 생성 : set변수명.iterator()
	 * 		데이터 유무 판단 : Iterator변수명.hasNext()
	 * 		데이터 조회 : Iterator변수명.next()
	 * 
	 * [2] 향상된 for문
	 * 		for(Set에 지정한 타입 변수명 : Set 변수명)
	 * 		변수명을 통해 접근
	 */
	
	public static void main(String[] args) {
//		HashSet hSet1 = new HashSet();
//		
//		hSet1.add("오늘은 금요일");
//		hSet1.add(new String("오늘은 금요일"));
//
//		hSet1.add("아메리카노");
//		hSet1.add("라떼");
//		hSet1.add("아메리카노");
//		hSet1.add(new String("오늘은 금요일"));
//	
//		System.out.println(hSet1);
		/**
		 * String
		 * - hashCode() : 실제 담긴 문자열을 10진수 형태로 변환하여 리턴
		 * - equals() : hashCOde결과가 같으면 "실제 담긴 문자열"
		 *				그렇지 않으면 동등하면  비교
		 *				동등 기벼ㄱㅇ지전ㅇ하면 "
		 */
		
		HashSet<Student> hSet2 = new HashSet<>();
		hSet2.add(new Student("임성준", 26, 100));
		hSet2.add(new Student("이홍기", 15, 50));
		hSet2.add(new Student("에일리", 20, 80));
		hSet2.add(new Student("에일리", 20, 80));
		
//		System.out.println(hSet2);
		
		for(Student s : hSet2) {
			System.out.println(s);
		}
		
		// 반복자 Iterator
		Iterator<Student> it = hSet2.iterator();
		
		while(it.hasNext()) { // 데이터 유/무 확인
			Student s = it.next();
			
			System.out.println(s.getName());
		}
		
		// 인덱스로 접근해서 처리해야할 경우 구조 변환 후에 복사하여 사용!
		ArrayList<Student> list = new ArrayList<>();
		list.addAll(hSet2);
	}

}
