package com.sj.mini.model.dao;

import java.io.File;

import com.sj.mini.model.vo.Developer.TestLevel;

public class TestFileDAO {
	private String baiscFilePath = "./resources/question/basic";
	private String middleFilePath = "./resources/question/middle";
	private String hardFilePath = "./resources/question/hard";
	
	public TestFileDAO() {
		File bFolder = new File(baiscFilePath);
		File mFolder = new File(middleFilePath);
		File hFolder = new File(hardFilePath);
		
		if(!bFolder.exists() && !mFolder.exists() && !hFolder.exists()) {
			if(bFolder.mkdirs() && mFolder.mkdirs() && hFolder.mkdirs()) {
				System.out.println("[ERROR] 폴더 생성 실패");
			}
		}
	}

	public boolean checkBaiscFolder(TestLevel tl) {
		if(tl == TestLevel.BASIC) return new File(baiscFilePath).exists();
		else if(tl == TestLevel.MIDDLE) return new File(middleFilePath).exists();
		else if(tl == TestLevel.HARD) return new File(hardFilePath).exists();
		
		return false;
		
	}
}
