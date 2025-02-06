package com.kh.object.practice7.run;

import com.kh.object.practice7.model.vo.Employee;

public class Run {

	public static void main(String[] args) {
		Employee emp = new Employee();
		
		emp.setEmpNo(100);
		emp.setEmpName("홍길동");
		emp.setDept("영업부");
		emp.setJob("과장");
		emp.setAge(25);
		emp.setGender('남');
		emp.setSalary(2500000);
		emp.setBonusPoint(0.05);
		emp.setPhone("010-1234-5678");
		emp.setAddress("서울시 강남구");

		System.out.println("사원번호 : " + emp.getEmpNo());
		System.out.println("이름 : " + emp.getEmpName());
		System.out.println("부서 : " + emp.getDept());
		System.out.println("직책 : " + emp.getJob());
		System.out.println("나이 : " + emp.getAge());
		System.out.println("성별 : " + emp.getGender());
		System.out.println("월급 : " + emp.getSalary());
		System.out.println("보너스 : " + emp.getBonusPoint());
		System.out.println("핸드폰 : " + emp.getPhone());
		System.out.println("주소 : " + emp.getAddress());
	}

}
