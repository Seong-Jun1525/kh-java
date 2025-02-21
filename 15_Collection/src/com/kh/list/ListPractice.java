package com.kh.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

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
//		arrayListTest();
		System.out.println("=".repeat(30));
//		linkedListTest();
		System.out.println("=".repeat(30));
		stackTest();
		System.out.println("=".repeat(30));
		queueTest();
	}
	
	private static void queueTest() {
		MyQueue<Integer> q = new MyQueue<>();
		
		if(q.isEmpty()) {
			System.out.println("비어있습니다.");
			q.enQueue(1);
			q.enQueue(31);
			q.enQueue(12);
		} 

		System.out.println(q.deQueue());
		System.out.println(q.deQueue());
		System.out.println(q.deQueue());
	}

	private static void stackTest() {
		/**
		 * 스택 : LIFO
		 */
		MyStack<String> stack = new MyStack<>();

		stack.push("임성준입니다.");
		stack.push("저는");
		stack.push("안녕하세요");
		
		if(stack.isEmpty()) {
			System.out.println("스택이 비었습니다.");
		} else {
			System.out.println(stack.pop());
			System.out.println(stack.pop());
			System.out.println(stack.pop());
		}
		
//		System.out.println(stack.remove(2));
	}

	private static void linkedListTest() {
		// 사용자에게 개수를 입력받아 해당 개수만큼 랜덤값을 추출하여 리스트에 저장
		Scanner sc = new Scanner(System.in);
		List<Integer> list = new LinkedList<>();
		
		System.out.print("개수 입력 : ");
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			int ran = (int)(Math.random() * n + 1);
			
			list.add(ran); // int -> Integer (오토박싱)
		}
		
		printList(list);
		
		sc.close();
	}

	private static void arrayListTest() {
		// 문자열 데이터를 관리하는 ArrayList
//		List<String> strList = new ArrayList<>();
		List<String> strList = new ArrayList<>();
		
		// ["헤이즐넛", "아메리카노", "카모마일"]
		strList.add("헤이즐넛");
		strList.add("아메리카노");
		strList.add("카모마일");
		strList.add("아메리카노");
		
		System.out.println(strList);
		strList.remove(1);
		System.out.println(strList);
		
		strList.set(1, "유자차");
		System.out.println(strList);
		
		// {i}번째 {데이터값}
		
		printList(strList);
	}
	
	// 공통되는 부분 제네릭 메서드로 정의
		private static <T> void printList(List<T> list) { // 제네릭<T>를 사용하기 위해 반환형 앞에 <T>를 선언해야함
			for(int i = 0; i < list.size(); i++) {
				System.out.println(i+1 + " : " + list.get(i));
			}
		}

}

class MyQueue<T> {
	private List<T> arrQueue = new ArrayList<>();
	
	public void enQueue(T data) {
		this.arrQueue.add(data);
	}
	
	public T deQueue() {
		return this.arrQueue.remove(0);
	}
	
	public boolean isEmpty() {
		return this.arrQueue.size() == 0;
	}
}

class MyStack<T> {
	private LinkedList<T> arrStack = new LinkedList<>();
	
	public void push(T data) {
		this.arrStack.add(data);
	}
	
	public T pop() {
		return this.arrStack.remove(arrStack.size() - 1);
	}
	
	public boolean isEmpty() {
		return this.arrStack.size() == 0;
	}
}