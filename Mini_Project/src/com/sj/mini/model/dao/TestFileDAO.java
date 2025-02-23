package com.sj.mini.model.dao;

import java.io.File;

public class TestFileDAO {
	private String testFilePath = "../../question/basic";
	
	public TestFileDAO() {
		File file = new File(testFilePath);
		
		if(!file.exists()) {
			System.out.println("테스트 파일이 없습니다.");
		}
	}

}
