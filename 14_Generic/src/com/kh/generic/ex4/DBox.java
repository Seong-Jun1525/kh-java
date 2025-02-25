package com.kh.generic.ex4;

/**
 * 타입 제한하기
 * <T extends 클래스 또는 인터페이스>
 * => 클래스 또는 인터페이스를 상속 혹은 구현하는 타입으로 제한!
 * => 클래스인 경우 해당 클래스도 포함됨!
 */
public class DBox <L, R> {
	private L left;
	private R right;
	
	public DBox() {}
	
	public void set(L left, R right) {
		this.left = left;
		this.right = right;
	}

	public L getLeft() {
		return left;
	}

	public R getRight() {
		return right;
	}

	@Override
	public String toString() {
		return "DBox [left=" + left + ", right=" + right + "]";
	}
}