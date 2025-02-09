package com.kh.hw.employee.controller;

import com.kh.hw.employee.Employee;

public class EmployeeController {
	Employee e = new Employee();
	
	public void add(int empNo, String name, char gender, String phone) {
		// 매개변수 있는 생성자를 이용하여 데이터 저장하는 메소드
		this.e = new Employee(empNo, name, gender, phone);
	}
	
	public void add(int empNo, String name, char gender, String phone, String dept, int salary, double bonus) {
		// 매개변수 있는 생성자를 이용하여 데이터 저장하는 메소드
		this.e = new Employee(empNo, name, gender, phone, dept, salary, bonus);
	}
	
	public void modify(String phone) {
		e.setPhone(phone);
	}
	
	public void modify(int salary) {
		e.setSalary(salary);
	}
	
	public void modify(double bonus) {
		e.setBonus(bonus);
	}
	
	public Employee remove() {
		e = null;
		return e;
	}
	
	public String inform() {
		
		return "";
	}
}
