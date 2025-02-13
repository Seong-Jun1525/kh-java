package com.kh.practice.chap02_abstractNInterface.model.vo;

public interface CellPhone extends Phone, Camera {

	// 충전방식
	public abstract String charge();
}
