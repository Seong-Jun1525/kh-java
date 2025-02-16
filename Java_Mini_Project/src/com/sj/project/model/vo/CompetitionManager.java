package com.sj.project.model.vo;

import java.util.Random;

public class CompetitionManager {

    public void startCompetition(Player player, Player.CompetitionType competitionType) {
        System.out.println("🏆 " + competitionType + " 대회에 참가합니다...");
        
        Random rand = new Random();
        int result = rand.nextInt(100) + 1; // 1~100 사이 난수 생성
        
//        if (result <= 50) { // 탈락
//            System.out.println("😢 대회에서 탈락했습니다.");
//            player.increaseStress(5);
//        } else if (result <= 75) { // 우수상
//            System.out.println("🎖 우수상을 받았습니다!");
//            player.increaseExp(10);
//        } else if (result <= 95) { // 최우수상
//            System.out.println("🏅 최우수상을 받았습니다!");
//            player.increaseExp(20);
//        } else { // 대상
//            System.out.println("🥇 대상을 받았습니다! 경험치 40 획득!");
//            player.increaseExp(40);
//        }
    }
}
