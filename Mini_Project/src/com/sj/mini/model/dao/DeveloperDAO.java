package com.sj.mini.model.dao;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

import com.sj.mini.common.JDBCTemplate;
import com.sj.mini.model.vo.Developer;

public class DeveloperDAO {
	// PreparedStatement 및 ResultSet 객체 초기화
	private PreparedStatement pstmt = null;
	private ResultSet rset = null;
	private Properties prop = new Properties();
	
	public DeveloperDAO() {
		try {
			prop.loadFromXML(new FileInputStream("resources/sql/query.xml"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public int insertDeveloper(Connection conn, Developer dev) {
		int result = 0;
		
		try {
			conn.setAutoCommit(false);
			System.out.println(prop.getProperty("insertDevloper"));
			
			pstmt = conn.prepareStatement(prop.getProperty("insertDevloper"));
			pstmt.setString(1, "ADMIN");
			pstmt.setString(2, dev.getName());
			pstmt.setString(3, dev.getJob());

			// SQL문 실행, 결과받기
			result = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			JDBCTemplate.close(pstmt);
		}
		
		return result;
	}

}
