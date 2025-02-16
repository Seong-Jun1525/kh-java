package com.sj.project.model.vo;

/** 캐릭터 추상클래스
 * 플레이어 이름, 체력, 레벨
 */
public abstract class Character {
    private String name;
    protected int hp;
    private int level;
    protected int exp;
    protected int turn = 1;

    protected static final int DEFAULT_HP = 100;
    private static final int DEFAULT_LEVEL = 1;

    public Character() {
        this("Unknown");
    }

    public Character(String name) {
        this.name = name;
        this.hp = DEFAULT_HP;
        this.level = DEFAULT_LEVEL;
    }

    /** HP 감소 메서드 */
    public void decreaseHp(int amount) {
        hp = Math.max(hp - amount, 0);
        if (hp == 0) {
            System.out.println("💀 체력이 0이 되어 탈진 상태입니다!");
        }
    }

    /** 레벨업 메서드 */
    protected void levelUp() {
        level++;
        System.out.println("🎉 레벨업! 현재 레벨: " + level);
    }

    public void nextTurn() {
        this.turn++;
        System.out.println("📅 " + this.turn + "턴이 시작되었습니다.");
    }

    public abstract String showStatus();
    public abstract void gainExperience(int amount);
    public abstract void increaseHp(int amount);
    public abstract void study(Skill skill);
    public abstract void rest();

    // Getters & Setters
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
        this.hp = Math.max(hp, 0);
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        if (level > 0) {
            this.level = level;
        }
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
}
