package com.sj.mini.model.dao;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import com.sj.mini.model.vo.Developer.TestLevel;
import com.sj.mini.model.vo.Question;

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
	
	public List<Question> fileOpen(TestLevel tl, String file) {
		List<Question> qList = new ArrayList<>();
		String question = "";
		String hint = "";
		int answer = 0;
		
		String data = null;
		File f = new File(baiscFilePath, file);
		try(BufferedReader br = new BufferedReader(new FileReader(f))) {
			while((data = br.readLine()) != null) {
				StringTokenizer stk = new StringTokenizer(data, "&");
				question = stk.nextToken();
				hint = stk.nextToken();
				answer = Integer.parseInt(stk.nextToken());
				
				qList.add(new Question(question, hint, answer));
			}
			
			return qList;
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return qList;
	}
}
