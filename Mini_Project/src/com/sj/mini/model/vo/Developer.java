package com.sj.mini.model.vo;

public abstract class Developer implements Character {
	private String name;
	private int hp;
	private int level;
	private int exp;
	private int turn;
	
	protected static int DEFAULT_HP = 100;
	
	public Developer() {}
	public Developer(String name) {
		this.name = name;
		this.hp = DEFAULT_HP;
		this.level = 1;
		this.exp = 0;
		this.turn = 1;
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

}
