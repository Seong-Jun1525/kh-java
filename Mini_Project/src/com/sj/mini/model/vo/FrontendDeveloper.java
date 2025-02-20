package com.sj.mini.model.vo;

public class FrontendDeveloper extends Developer {
//	private String job;
//	private Set<Skill> skillList = new HashSet<>();

	public FrontendDeveloper() {}

	public FrontendDeveloper(String name, String job) {
		super(name, job);
//		this.skillList.add(new Skill(MAIN_LANGUAGE[0]));
	}

//	@Override
//	public void addSkill(String name) {
//		// 중복 저장 막기
////		if(isMySkill(name)) {
////			System.out.println("!!!해당 기술은 이미 보유하고 있습니다.!!!");
////			return;
////		}
//		this.skillList.add(new Skill(name));
//	}

//	@Override
//	public void removeSkill(int idx) {
//		if(this.skillList.size() > 1) {
//			// 메인언어일 경우 삭제불가처리
//			if(this.skillList.get(idx).getName().toLowerCase().equals(MAIN_LANGUAGE[0].toLowerCase())) {
//				System.out.println("메인언어는 제거할 수 없습니다.");
//				return;
//			}
//			
//			this.skillList.remove(idx);
//			System.out.println("기술을 제거했습니다.");
//		}
//		else System.out.println("\n!!!기술 스택이 하나일 경우 삭제할 수 없습니다.!!!\n");
//	}
//	@Override
//	public void removeSkill(String removeName) {
//		if(this.skillList.size() > 1) {
//			// 메인언어일 경우 삭제불가처리
////			if(this.skillList.get(idx).getName().toLowerCase().equals(MAIN_LANGUAGE[1].toLowerCase())) {
////				System.out.println("메인언어는 제거할 수 없습니다.");
////				return;
////			}
//			if(removeName.toLowerCase().equals(MAIN_LANGUAGE[0].toLowerCase())) {
//				System.out.println("메인언어는 제거할 수 없습니다.");
//				return;
//			} 
//			Iterator<Skill> ir = this.skillList.iterator();
//			
//			while(ir.hasNext()) {
//				Skill skill = ir.next(); // 스킬을 하나씩 가져옴
//				String skillName = skill.getName();
//				if(skillName.equals(removeName)) {
//					this.skillList.remove(skill);
//					System.out.println("기술을 제거했습니다.");
//				}
//			}
//		}
//		else System.out.println("\n!!!기술 스택이 하나일 경우 삭제할 수 없습니다.!!!\n");
//	}

	@Override
	public void study(Skill targetSkill) {
		targetSkill.increaseExp((int)Math.random() * 35 + 25);
	}

//	@Override
//	public String mySkillList() {
//        StringBuilder skillStr = new StringBuilder();
//        for (Skill skill : this.skillList) {
//            skillStr.append(skill.getName() + "(Lv." + skill.getLevel() + ")").append(" ");
//        }
//        return skillStr.toString();
//	}
//
//	@Override
//	public void gainExp(int amount) {
//        super.setExp(super.getExp() + amount);
//        while (super.getExp() >= 100) {  // 경험치가 100 이상이면 레벨업
//        	super.setExp(0);
//            levelUp();
//        }
//	}
//
//	@Override
//	public void levelUp() {
//		super.setLevel(super.getLevel() + 1);
//	}
//
//	@Override
//	public String showStatus() {
//		return String.format(
//                "%d턴 진행 중...\n" +
//                "개발자명: %s\n" +
//                "직업: %s\n" +
//                "레벨: Lv.%d\n" +
//                "체력: %d\n" +
//                "경험치: %d\n" +
//                "보유 기술: %s",
//                super.getTurn(), this.getName(), this.job, this.getLevel(), super.getHp(), super.getExp(), mySkillList()
//        );
//	}
//
////	public String getJob() {
////		return job;
////	}
////
////	public void setJob(String job) {
////		this.job = job;
////	}
////
////	public Set<Skill> getSkillList() {
////		return skillList;
////	}
////
////	public void setSkillList(Set<Skill> skillList) {
////		this.skillList = skillList;
////	}
//
//	@Override
//	public boolean isMySkill(String name) {
////		System.out.println(this.skillList.get(0).getName().toLowerCase());
////		System.out.println(name.toLowerCase());
//		Iterator<Skill> ir = this.skillList.iterator();
//		
//		while(ir.hasNext()) {
//			Skill skill = ir.next(); // 스킬을 하나씩 가져옴
//			String skillName = skill.getName();
//			if(skillName.toLowerCase().equals(name.toLowerCase())) {
//				return true;
//			}
//		}
//		return false;
//	}
//	
//	@Override
//	public Skill getMySkill(String name) {
//		Iterator<Skill> ir = this.skillList.iterator();
//		if(isMySkill(name)) {
//			while(ir.hasNext()) {
//				Skill skill = ir.next(); // 스킬을 하나씩 가져옴
//				String skillName = skill.getName();
//				if(skillName.toLowerCase().equals(name.toLowerCase())) {
//					return skill;
//				}
//			}
//		}
//		return null;
//	}
//
//	@Override
//	public boolean decreaseExp(int amount) {
//		if(super.getHp() - amount >= 0) {
//			super.setHp(super.getHp() - amount);
//			return true;
//		}
//		return false;
//	}
//
//	@Override
//	public TestLevel participate(Developer developer, int n) {
//		if(developer != null) {
//			switch(n) {
//				case 1:
//					return TestLevel.BASIC;
//				case 2:
//					return TestLevel.MIDDLE;
//				case 3:
//					return TestLevel.HARD;
//					default:
//						System.out.println("난이도를 잘못선택했습니다.");
//			}
//		}
//		return null;
//	}
}
