package com.sj.mini.model.vo;

public class Skill {
    private String name;
    private int exp;
    private int level;
    private static final int MAX_LEVEL = 3;

    public Skill(String name) {
        this.name = name;
        this.exp = 0;
        this.level = 1;
    }

    /** 경험치 증가 및 스킬 레벨업 */
    public void increaseExp(int amount) {
        this.exp += amount;
        if (this.exp >= 100 && this.level < MAX_LEVEL) {
            this.exp = 0;
            levelUp();
        }
    }

    /** 스킬 레벨업 */
    private void levelUp() {
        this.level++;
        System.out.println("🔼 " + this.name + " 스킬이 레벨업! 현재 레벨: " + this.level);
    }

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public int getExp() {
		return exp;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	@Override
    public String toString() {
        return String.format("%s (Lv.%d, Exp.%d)", this.name, this.level, this.exp);
    }
}
