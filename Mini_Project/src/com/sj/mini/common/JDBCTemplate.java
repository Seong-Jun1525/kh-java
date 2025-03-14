package com.sj.mini.common;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class JDBCTemplate {
	private static Properties prop = new Properties();
	private static final String RES_PATH = "resources/settings.properties";
	
	public static void jdbcSettings() {
		prop.setProperty("driver", "oracle.jdbc.driver.OracleDriver");
		prop.setProperty("url", "jdbc:oracle:thin:@localhost:1521:xe");
		prop.setProperty("username", "C##MYDEVGAME");
		prop.setProperty("password", "MYDEVGAME");
		
		try {
			prop.store(new FileOutputStream(RES_PATH), "개발자 키우기 JDBC 설정");
			System.out.println("JDBC 연결 성공!");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	// Connection 객체 생성
	public static Connection getConnection() {
		Connection conn = null;
		
		try {
			prop.load(new FileInputStream(RES_PATH));
			
			Class.forName(prop.getProperty("driver"));
			conn = DriverManager.getConnection(prop.getProperty("url"), prop.getProperty("username"), prop.getProperty("password"));
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return conn;
	}
	
	// 객체 반납
	public static void close(Connection conn) {
		try {
			if(conn != null && !conn.isClosed()) conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void close(Statement pstmt) {
		try {
			if(pstmt != null && !pstmt.isClosed()) pstmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void close(ResultSet rset) {
		try {
			if(rset != null && !rset.isClosed()) rset.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * commit 처리
	 * 
	 * @param conn 생성되어 있는 Connection 객체
	 */
	public static void commit(Connection conn) {
		try {
			if(conn != null && !conn.isClosed()) conn.commit();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * rollback 처리
	 * 
	 * @param conn 생성되어 있는 Connection 객체
	 */
	public static void rollback(Connection conn) {
		try {
			if(conn != null && !conn.isClosed()) conn.rollback();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
