package com.kh.list;

import java.util.LinkedList;
import java.util.List;

public class ListRun {

	/**
	 * 컬렉션이란?
	 * - 자료구조 개념이 내장되어 있는 클래스
	 * - 자바에서 제공되는 자료구조를 담당하는 프레임워크(틀이 있다)
	 * 
	 * 자료구조란?
	 * - 방대한 데이터를 보다 효율적으로 관리할 수 있도록 도와주는 방법들(추가, 삭제, 조회, 수정, 정렬 등) 
	 * 
	 * 프레임워크란?
	 * - 이미 만들어져 있는 틀
	 * 
	 * 배열의 단점
	 * - 크기를 반드시 지정해야함
	 * - 새로운 값을 추가하려면 새로운 배열을 생성 후 기본 배열을 복사해야함
	 * - 배열 중간 위치에 데이터를 추가 및 삭제하는 경우
	 * 		=> 매번 데이터의 위치를 이동시켜야하는 복잡한 코드를 직접 작성해야 함
	 * 
	 * 컬렉션의 장점
	 * - 크기를 지정할 필요가 없음
	 * 		=> 지정하더라도 추가로 데이터를 더 담을 수 있음!
	 * - 중간 위치에 데이터를 추가하거나 삭제할 때 다른 데이터들의 위치를 변경해줄 필요가 없음. 내부적으로 동작됨
	 */
	
	public static void main(String[] args) {
//		List<Integer> iList = new LinkedList<>();
//		iList.add(123);
//		iList.add(123);
//		System.out.println(iList);
		List list = new LinkedList(); // 제네릭 기호는 필수가 아니지만 경고가 뜬다..
		list.add("샘플데이터1");
		list.add(123);
		list.add(5.5);
		
		System.out.println(list);
		list.add(1, "샘플데이터2");
		System.out.println(list);
		
		list.remove(2);
		System.out.println(list);
		
		list.set(1, "샘플2");
		System.out.println(list);
		
		System.out.println(list.size());
		
		System.out.println(list.get(list.size() - 1));

		for(int i = 0; i < list.size(); i++) System.out.println(i + "번 위치 : " + list.get(i));

		System.out.println(list.isEmpty());
		// 전체삭제
		list.clear();
		System.out.println(list);
		
		System.out.println(list.isEmpty());
	}

}
