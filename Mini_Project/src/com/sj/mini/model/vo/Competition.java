package com.sj.mini.model.vo;

import com.sj.mini.model.vo.Developer.TestLevel;

public interface Competition {
	// 참가하는 추상 메서드
	public abstract TestLevel participate(Developer player, int n);
}
