package com.sj.mini.model.vo;

public class BackendDeveloper extends Developer {

	public BackendDeveloper() {}

	public BackendDeveloper(String name, String job) {
		super(name, job);
	}

	@Override
	public void study(Skill targetSkill) {
		targetSkill.increaseExp((int)Math.random() * 20 + 10);
	}
}
