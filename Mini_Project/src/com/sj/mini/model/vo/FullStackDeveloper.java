package com.sj.mini.model.vo;

public class FullStackDeveloper extends Developer {

	public FullStackDeveloper() {}

	public FullStackDeveloper(String name, String job) {
		super(name, job);
	}

	@Override
	public void study(Skill targetSkill) {
		targetSkill.increaseExp((int)Math.random() * 15 + 5);
	}

}
