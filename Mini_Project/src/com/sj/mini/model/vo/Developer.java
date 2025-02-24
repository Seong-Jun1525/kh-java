package com.sj.mini.model.vo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public abstract class Developer implements Character, Competition {
	public static final String DEFAULT_NAME = "Unknown";
	private static final int DEFAULT_HP = 100;
	private static final int DEFAULT_LEVEL = 1;
	private static final int DEFAULT_EXP = 0;
	public static final String[] MAIN_JOB = {"프론트엔드 개발자", "백엔드 개발자", "풀스택 개발자"};
	public static final String[] MAIN_LANGUAGE = {"HTML&CSS", "Java", "JavaScript"};
	
	private String name;
	private String job;
	private int hp;
	private int level;
	private int exp;
	private int turn;
	private Set<Skill> skillList = new HashSet<>();
	
//	public abstract boolean isMySkill(String name);
//	public abstract Skill getMySkill(String name);
	
	public Developer() {
		this.name = DEFAULT_NAME;
	}
	
	public Developer(String name, String job) {
		this.name = name;
		this.hp = DEFAULT_HP;
		this.level = DEFAULT_LEVEL;
		this.exp = DEFAULT_EXP;
		this.turn = 1;
		this.setJob(job);
		
		for(int i = 0; i < 3; i++) if(job.equals(MAIN_JOB[i])) this.skillList.add(new Skill(MAIN_LANGUAGE[i]));
	}
	
	@Override
	public void addSkill(String name) {
		this.skillList.add(new Skill(name));
	}
	
	@Override
	public void removeSkill(String removeName) {
		if(this.skillList.size() > 1) {
			for(int i = 0; i < 3; i++) {
				// TODO 이 부분 해결하기
				if(removeName.toLowerCase().equals(MAIN_LANGUAGE[i].toLowerCase())) {
					System.out.println("메인언어는 제거할 수 없습니다.");
					return;
				}
			}
			Iterator<Skill> ir = this.skillList.iterator();
			
			while(ir.hasNext()) {
				Skill skill = ir.next(); // 스킬을 하나씩 가져옴
				String skillName = skill.getName();
				if(skillName.equals(removeName)) {
					this.skillList.remove(skill);
					System.out.println("기술을 제거했습니다.");
				}
			}
		}
		else System.out.println("\n!!!기술 스택이 하나일 경우 삭제할 수 없습니다.!!!\n");
	}
	
	@Override
	public String mySkillList() {
        StringBuilder skillStr = new StringBuilder();
        for (Skill skill : this.skillList) {
            skillStr.append(skill.getName() + "(Lv." + skill.getLevel() + ")").append(" ");
        }
        return skillStr.toString();
	}

	@Override
	public void gainExp(int amount) {
		this.setExp(this.exp + amount);
        while (this.getExp() >= 100) {  // 경험치가 100 이상이면 레벨업
        	this.setExp(this.getExp() - 100);
            levelUp();
        }
	}

	@Override
	public void levelUp() {
		this.setLevel(this.getLevel() + 1);
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
                this.getTurn(), this.getName(), this.job, this.getLevel(), this.getHp(), this.getExp(), mySkillList()
        );
	}

	public boolean isMySkill(String name) {
		Iterator<Skill> ir = this.skillList.iterator();
		
		while(ir.hasNext()) {
			Skill skill = ir.next(); // 스킬을 하나씩 가져옴
			String skillName = skill.getName();
			if(skillName.toLowerCase().equals(name.toLowerCase())) {
				return true;
			}
		}
		return false;
	}
	
	public Skill getMySkill(String name) {
		Iterator<Skill> ir = this.skillList.iterator();
		if(isMySkill(name)) {
			while(ir.hasNext()) {
				Skill skill = ir.next(); // 스킬을 하나씩 가져옴
				String skillName = skill.getName();
				if(skillName.toLowerCase().equals(name.toLowerCase())) {
					return skill;
				}
			}
		}
		return null;
	}

	@Override
	public boolean decreaseHP(int amount) {
		if(this.getHp() - amount >= 0) {
			this.setHp(this.getHp() - amount);
			return true;
		}
		return false;
	}

	@Override
	public TestLevel participate(Developer developer, int n) {
		if(developer != null) {
			switch(n) {
				case 1:
					return TestLevel.BASIC;
				case 2:
					return TestLevel.MIDDLE;
				case 3:
					return TestLevel.HARD;
					default:
						System.out.println("난이도를 잘못선택했습니다.");
			}
		}
		return null;
	}
	
	public void rest() {
		int plusHP = 0;
		if(this.getHp() < 100) {
			if(90 <= this.getHp()) {
				plusHP = this.getHp() + (int)(Math.random() * 5 + 1);
				this.setHp(plusHP > 100 ? 100 : plusHP);
			} else if(70 <= this.getHp() && this.getHp() < 90) {
				this.setHp(this.getHp() + (int)(Math.random() * 10 + 1));
			} else if(40 <= this.getHp() && this.getHp() < 70) {
				this.setHp(this.getHp() + (int)(Math.random() * 20 + 1));
			} else if(10 <= this.getHp() && this.getHp() < 40) {
				this.setHp(this.getHp() + (int)(Math.random() * 30 + 1));
			} else {
				this.setHp(this.getHp() + (int)(Math.random() * 5));
			}
			System.out.println("휴식했습니다.");
		} else {
			System.out.println("체력을 보충할 필요가 없습니다.");
		}
	}
	
	public void nextTurn() {
		this.turn++;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public int getExp() {
		return exp;
	}
	public void setExp(int exp) {
		this.exp = exp;
	}
	public int getTurn() {
		return turn;
	}
	public void setTurn(int turn) {
		this.turn = turn;
	}

	public Set<Skill> getSkillList() {
		return skillList;
	}

	public void setSkillList(Set<Skill> skillList) {
		this.skillList = skillList;
	}

	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}

	public enum TestLevel {
        BASIC, MIDDLE, HARD;
    }
}
