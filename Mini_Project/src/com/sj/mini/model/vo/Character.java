package com.sj.mini.model.vo;

public interface Character {
	public abstract void addSkill(String name);
	public abstract void removeSkill(String removeName);
	public abstract void study(Skill targetSkill);
	public abstract String mySkillList();
	public abstract void gainExp(int amount);
	public abstract boolean decreaseExp(int amount);
	public abstract void levelUp();
	public abstract String showStatus();
}
