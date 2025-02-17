package com.sj.mini.model.vo;

import java.util.ArrayList;
import java.util.List;

public class FullStackDeveloper extends Developer implements Character {
	private String job;
	private List<Skill> skillList = new ArrayList<>();

	public FullStackDeveloper() {}

	public FullStackDeveloper(String name, String job) {
		super(name);
		this.job = job;
		this.skillList.add(new Skill("JavaScript"));
	}

	@Override
	public void addSkill(String name) {
		this.skillList.add(new Skill(name));
	}

	@Override
	public void removeSkill(int idx) {
		this.skillList.remove(idx);
	}

	@Override
	public void study(Skill targetSkill) {
		targetSkill.increaseExp((int)Math.random() * 15 + 7);
	}

	@Override
	public String mySkillList() {
        StringBuilder skillStr = new StringBuilder();
        for (Skill skill : this.skillList) {
            skillStr.append(skill.getName()).append(" ");
        }
        return skillStr.toString();
	}

	@Override
	public void gainExp(int amount) {
        super.setExp(super.getExp() + amount);
        while (super.getExp() >= 100) {  // 경험치가 100 이상이면 레벨업
        	super.setExp(0);
            levelUp();
        }
	}
	
	@Override
	public boolean decreaseExp(int amount) {
		if(super.getHp() - amount >= 0) {
			super.setHp(super.getHp() - amount);
			return true;
		}
		return false;
	}

	@Override
	public void levelUp() {
		super.setLevel(super.getLevel() + 1);
	}

	@Override
	public String showStatus() {
		return String.format(
                "%d턴 진행 중...\n" +
                "개발자명: %s\n" +
                "직업: %s\n" +
                "레벨: Lv.%d\n" +
                "체력: %d\n" +
                "경험치: %d\n" +
                "보유 기술: %s",
                super.getTurn(), this.getName(), this.job, this.getLevel(), super.getHp(), super.getExp(), mySkillList()
        );
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public List<Skill> getSkillList() {
		return skillList;
	}

	public void setSkillList(List<Skill> skillList) {
		this.skillList = skillList;
	}

	@Override
	public boolean isMySkill(String name) {
		return mySkillList().contains(name);
	}
	@Override
	public Skill getMySkill(String name) {
		if(isMySkill(name)) {
			for(int i = 0; i < this.skillList.size(); i++) {
				if(this.skillList.get(i).getName().equals(name)) {
					return this.skillList.get(i);
				}
			}
		}
		return null;
	}
}
