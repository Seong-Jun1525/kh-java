package com.sj.mini.service;

import java.sql.Connection;

import com.sj.mini.common.JDBCTemplate;
import com.sj.mini.model.dao.DeveloperDAO;
import com.sj.mini.model.vo.Developer;

public class GameService {
	/**
	 * [1] Connection 객체 생성
	 * 		- jdbc Driver 등록
	 * 		- Connection 객체 생성
	 * 
	 * [2] DML문 실행 시 트랜잭션 처리
	 * 		- commit, rollback
	 * 
	 * [3] Connection 객체 반납
	 * 		- close
	 */
	Connection conn = null;
	
	public int insertDeveloper(Developer dev) {
		int result = 0;
		
		// JDBC 객체 생성
		conn = JDBCTemplate.getConnection();
		
		result = new DeveloperDAO().insertDeveloper(conn, dev);
		
		// 3) 실행할 SQL문 확인 => (DML, INSERT) => 트랜잭션 처리
		if(result > 0) JDBCTemplate.commit(conn);
		else JDBCTemplate.rollback(conn);
		
		// 4) Connection 객체 반납
		JDBCTemplate.close(conn);
		
		return result;
	}
	
}
