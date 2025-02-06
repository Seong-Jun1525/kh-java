package com.kh.object.practice1.run;

import com.kh.object.practice1.model.vo.Member;

public class Run {

	public static void main(String[] args) {
		Member member = new Member();
		member.changeName("임성준");
		
		member.printName();
	}

}
