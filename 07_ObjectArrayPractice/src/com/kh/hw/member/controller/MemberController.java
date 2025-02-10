package com.kh.hw.member.controller;

import com.kh.hw.member.mode.vo.Member;

public class MemberController {
	public static final int SIZE = 10;
	private Member[] m = new Member[SIZE];
	
	// 테스트용
//	private Member[] m = {
//			new Member("aaaaa", "박신우", "aa", "aaa@aaa.aaa", 'F', 33),
//			new Member("bbbbb", "강고결", "bb", "bbb@bbb.bbb", 'm', 34),
//			new Member("ccccc", "남나눔", "cc", "ccc@ccc.ccc", 'M', 28),
//			new Member("ddddd", "도대담", "dd", "ddd@ddd.ddd", 'M', 35),
//			new Member("eeeee", "류라라", "ee", "eee@eee.eee", 'f', 17),
//			new Member("fffff", "문미미", "ff", "fff@fff.fff", 'F', 20),
//			new Member("ggggg", "박보배", "gg", "ggg@ggg.ggg", 'm', 26),
//			new Member("hhhhh", "송성실", "hh", "hhh@hhh.hhh", 'm', 41),
//			new Member("iiiii", "윤예의", "ii", "iii@iii.iii", 'F', 28),
//			new Member("jjjjj", "정재주", "jj", "jjj@jjj.jjj", 'M', 23)
//	};
	
	public int existMemberNum() {
		// 현재 존재하는 멤버 수 반환
		int count = 0;
		for(int i = 0; i < m.length; i++) {
			if(m[i] == null) {
				continue;
			} else {
				count++;
			}
		}
		return count;
	}
	
	public boolean checkId(String inputId) {
		// 아이디 중복확인 하는 메서드
		if(existMemberNum() == 0) {
			return true;
		} 
		for(int i = 0; i < m.length; i++) {
			if(m[i] != null && m[i].getId().equals(inputId)) {
				return false;
			}
		}
		return true;
	}
	
	public void insertMember(String id, String name, String password, String email, char gender, int age) {
		// Member객체를 객체배열에 저장하는 메서드
		for(int i = 0; i < SIZE; i++) {
			if(m[i] == null) {
				m[i] = new Member(id, name, password, email, gender, age);
				break;
			}
		}
	}
	
	public String searchId(String id) {
		// id로 회원을 조회하는 메서드
		for(int i = 0; i < m.length; i++) {
			if(m[i] != null) {
				if(id.equals(m[i].getId())) {
					return m[i].inform();
				}
			}
		}
		return null;
	}
	
	public Member[] searchName(String name) {
		// name으로 회원을 조회하는 메서드
		int idx = 0;
		
		for(int i = 0; i < m.length; i++) {
			if(m[i] != null && m[i].getName().equals(name)) {
				idx+=1;
			}
		}
		
		Member[] searchName = new Member[idx];
//		System.out.println("searchName : " + searchName.length);
		
		for(int j = 0; j < m.length; j++) {
			for(int i = 0; i < searchName.length; i++) {
				if(searchName[i] == null && (m[j] != null && m[j].getName().equals(name))) {
					searchName[i] = new Member(m[j].getId(), m[j].getName(), m[j].getPassword(), m[j].getEmail(), m[j].getGender(), m[j].getAge());
//					System.out.println("searchName[i] : " + searchName[i]);
					break;
				}
			}
		}
		
		return searchName;
	}
	
	public Member[] searchEmail(String email) {
		// email로 회원을 조회하는 메서드
		int idx = 0;
		for(int i = 0; i < m.length; i++) {
			if(m[i] != null && m[i].getEmail().equals(email)) {
				idx+=1;
			}
		}
		Member[] searchEmail = new Member[idx];
		
		for(int j = 0; j < m.length; j++) {
			for(int i = 0; i < searchEmail.length; i++) {
				if(searchEmail[i] == null && (m[j] != null && m[j].getEmail().equals(email))) {
					searchEmail[i] = new Member(m[j].getId(), m[j].getName(), m[j].getPassword(), m[j].getEmail(), m[j].getGender(), m[j].getAge());
					break;
				}
			}
		}
		
		return searchEmail;
	}
	
	public boolean updatePassword(String id, String password) {
		// 비밀번호 변경 메서드
		for(int i = 0; i < m.length; i++) {
			if(m[i] != null) {
				if(id.equals(m[i].getId())) {
					m[i].setPassword(password);
					return true;
				}
			}
		}
		
		return false;
	}
	
	public boolean updateName(String id, String name) {
		// 이름 변경 메서드
		for(int i = 0; i < m.length; i++) {
			if(m[i] != null) {
				if(m[i].getId().equals(id)) {
					m[i].setName(name);
					return true;
				}
			}
		}
		
		return false;
	}
	
	public boolean updateEmail(String id, String email) {
		// 이메일 변경 메서드
		for(int i = 0; i < m.length; i++) {
			if(m[i] != null) {
				if(m[i].getId().equals(id)) {
					m[i].setEmail(email);
					return true;
				}
			}
		}
		
		return false;
	}
	
	public boolean delete(String id) {
		// 특정 회원 삭제
		for(int i = 0; i < m.length; i++) {
			if(m[i] != null && m[i].getId().equals(id)) {
				m[i] = null;
				return true;
			}
		}
		return false;
	}
	
	public void delete() {
		// 회원 전체 삭제
		for(int i = 0; i < m.length; i++) {
			m[i] = null;
		}
	}
	
	public Member[] printAll() {
		return m;
		
		// 배열에 null값이 아예 없는 배열을 만들경우 아래처럼..
//		Member[] memberList = new Member[m.length];
//		for(int i = 0; i < m.length; i++) {
//			if(m[i] != null) {
//				for(int j = 0; j < memberList.length; j++) {
//					if(memberList[j] == null) {
//						memberList[j] = m[i];
//						break;
//					}
//				}
//			}
//		}
//		int idx = -1;
//		for(int i = 0; i < memberList.length; i++) {
//			if(memberList[i] == null) {
//				idx = i;
//				break;
//			}
//		}
//		
//		if(idx > -1) {
//			Member[] copy = new Member[idx];
//			System.arraycopy(memberList, 0, copy, 0, idx);
//			memberList = copy;
//		} else {
//			memberList = new Member[0];
//		}
//		return memberList;
	}
}
