package com.sj.mini.model.vo;

public abstract class Developer implements Character, Competition {
	private String name;
	private int hp;
	private int level;
	private int exp;
	private int turn;
	public static final String DEFAULT_NAME = "Unknown";
	protected static final int DEFAULT_HP = 100;
	protected static final int DEFAULT_LEVEL = 1;
	protected static final int DEFAULT_EXP = 0;
	
	public abstract boolean isMySkill(String name);
	public abstract Skill getMySkill(String name);
	
	public Developer() {
		this.name = DEFAULT_NAME;
	}
	public Developer(String name) {
		this.name = name;
		this.hp = DEFAULT_HP;
		this.level = DEFAULT_LEVEL;
		this.exp = DEFAULT_EXP;
		this.turn = 1;
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
	
	public void nextTurn() {
		this.turn++;
	}

	public enum TestLevel {
        BASIC, MIDDLE, HARD;
    }
}
