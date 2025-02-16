package com.sj.project.model.vo;

import java.util.ArrayList;
import java.util.List;

public class Player extends Character implements Competitor {
    private String job;
    private List<Skill> skillList = new ArrayList<>();

    public Player() {}

    public Player(String name, String job) {
        super(name);
        this.job = job;

        if (job.equals("프론트엔드")) {
            this.skillList.add(new Skill("HTML&CSS"));
        } else if (job.equals("백엔드")) {
            this.skillList.add(new Skill("Java"));
        } else if (job.equals("풀스택")) {
            this.skillList.add(new Skill("JavaScript"));
        }
    }

    @Override
    public void joinCompetition(CompetitionType competitionType, CompetitionManager competitionManager) {
        competitionManager.startCompetition(this, competitionType);
    }

    public void addSkill(String name) {
        this.skillList.add(new Skill(name));
        System.out.println(name + " 스킬이 추가되었습니다.");
    }

    public void removeSkill(int idx) {
        if (idx >= 0 && idx < skillList.size()) {
            System.out.println(skillList.get(idx).getName() + " 스킬이 삭제되었습니다.");
            this.skillList.remove(idx);
        } else {
            System.out.println("잘못된 인덱스입니다.");
        }
    }

    public void gainExperience(int amount) {
        this.exp += amount;
        while (this.exp >= 100) {  // 경험치가 100 이상이면 레벨업
            this.exp -= 100;
            levelUp();
        }
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

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public enum CompetitionType {
        ALGORITHM, HACKATHON, CONTEST;
    }

    public String mySkill() {
        StringBuilder skillStr = new StringBuilder();
        for (Skill skill : this.skillList) {
            skillStr.append(skill.getName()).append(" ");
        }
        return skillStr.toString();
    }

	@Override
	public String showStatus() {
		return String.format(
                "%d턴 진행 중...\n" +
                "플레이어명: %s\n" +
                "직업: %s 개발자\n" +
                "레벨: %d\n" +
                "경험치: %d\n" +
                "보유 기술: %s\n",
                this.turn, this.getName(), this.job, this.getLevel(), this.exp, mySkill()
        );
	}

	@Override
	public void increaseHp(int amount) {
		this.hp = Math.min(hp + amount, DEFAULT_HP);
	}

	@Override
	public void study(Skill skill) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void rest() {
		// TODO Auto-generated method stub
		
	}

	public Skill getSkillByName(String skillName) {
		for(int i = 0; i < skillList.size(); i++) {
			if(skillList.get(i).getName().equals(skillName)) {
				return skillList.get(i);
			}
		}
		return null;
	}
}
