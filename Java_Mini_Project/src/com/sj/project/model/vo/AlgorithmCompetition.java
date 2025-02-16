//package com.sj.project.model.vo;
//
//public class AlgorithmCompetition implements Competition {
//	private String[] algorithmAwardArr = {
//		"탈락","탈락","우수상","탈락","우수상","탈락","우수상","탈락","대상","탈락",
//	};
//	
//	@Override
//	public void participate(Player player) {
//		System.out.println("알고리즘 대회 참가!");
//		int awardIdx = (int)(Math.random() * (algorithmAwardArr.length - 1));
//		
//		switch(algorithmAwardArr[awardIdx]) {
//		case "탈락":
//			System.out.println("탈락입니다. 더 공부하세요.");
//	        player.increaseStress((int)(Math.random() * 7 + 3));
//			break;
//		case "우수상":
//			System.out.println("나쁘지 않습니다. 다음에는 더 높은 상을 받을 수 있을 겁니다.");
//	        player.increaseExp((int)(Math.random() * 10 + 3));
//	        player.increaseStress((int)(Math.random() * 3 + 1));
//			break;
//		case "최우수상":
//			System.out.println("정말 잘했습니다.");
//	        player.increaseExp((int)(Math.random() * 20 + 10));
//	        player.increaseStress((int)(Math.random() * 10 + 3));
//			break;
//		case "대상":
//			System.out.println("★당신은 최고입니다★");
//	        player.increaseExp((int)(Math.random() * 40 + 20));
//	        player.increaseStress((int)(Math.random() * 15 + 10));
//			break;
//		}
//	}
//
//}
