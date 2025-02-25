package com.kh.last.p4;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Notice {
	private int no;
	private String title;
	private Date date;
	private String writer;
	private String content;
	
	public Notice() {}

	public Notice(int no, String title, Date date, String writer, String content) {
		this.no = no;
		this.title = title;
		this.date = date;
		this.writer = writer;
		this.content = content;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public String toString() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String r = String.format("%d %s %s %s %s", no, title, sdf.format(date), writer, content);
		return r;
	}
}
