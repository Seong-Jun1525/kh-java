package com.sj.project.view;

import java.util.Scanner;

import com.sj.project.model.vo.CompetitionManager;
import com.sj.project.model.vo.Player;
import com.sj.project.model.vo.Skill;

public class GameMenu {
    private Player player;
    private Scanner sc = new Scanner(System.in);
    
    public GameMenu() {}

    public void mainMenu() {
        while (true) {
            System.out.println("===== 개발자 키우기 =====");
            if (player == null) {
                System.out.println("1. 플레이어 생성");
            } else {
                System.out.println("1. 게임 시작");
            }
            System.out.println("2. 게임 종료");

            try {
                System.out.print("원하는 메뉴 번호 : ");
                int n = sc.nextInt();
                sc.nextLine();
                
                switch (n) {
                    case 1:
                        if (player == null) createPlayer();
                        else gameMenu();
                        break;
                    case 2:
                        System.out.println("게임을 종료합니다.");
                        return;
                    default:
                        System.out.println("올바른 번호를 입력하세요.");
                }
            } catch (Exception e) {
                System.out.println("잘못된 입력입니다. 숫자를 입력하세요.");
                sc.next();
            }
        }
    }

    public void createPlayer() {
        try {
            System.out.println("==== 플레이어 생성 ====");
            System.out.print("플레이어 명 : ");
            String name = sc.nextLine();

            int job = 0;
            while (job < 1 || job > 3) {
                System.out.println("1. 프론트엔드\n2. 백엔드\n3. 풀스택");
                System.out.print("원하시는 직업 번호 : ");
                
                if (sc.hasNextInt()) {
                    job = sc.nextInt();
                    sc.nextLine();
                } else {
                    System.out.println("숫자를 입력하세요.");
                    sc.next();
                    continue;
                }

                switch (job) {
                    case 1:
                        player = new Player(name, "프론트엔드");
                        break;
                    case 2:
                        player = new Player(name, "백엔드");
                        break;
                    case 3:
                        player = new Player(name, "풀스택");
                        break;
                    default:
                        System.out.println("올바른 번호를 입력하세요.");
                        job = 0; // 다시 입력받도록 설정
                }
            }
            System.out.println("플레이어를 생성했습니다.\n");
        } catch (Exception e) {
            System.out.println("플레이어 생성 중 오류 발생: " + e.getMessage());
        }
    }

    public void gameMenu() {
        CompetitionManager competitionManager = new CompetitionManager();

        while (true) {
            System.out.println("==== 플레이어 정보 ====");
            System.out.println(player.showStatus());
            System.out.println("=== 게임 메뉴 ===");
            System.out.println("1. 공부하기");
            System.out.println("2. 대회참여하기");
            System.out.println("3. 휴식하기");
            System.out.println("4. 돌아가기");
            
            int n = sc.nextInt();
            sc.nextLine();

            switch (n) {
                case 1:
                    System.out.println("📖 공부하기!");
                    player.gainExperience(10);
                    break;
                case 2:
                    System.out.println("🎯 참가할 대회를 선택하세요.");
                    System.out.println("1. 알고리즘 대회\n2. 해커톤\n3. 경진대회");
                    int compChoice = sc.nextInt();
                    sc.nextLine();

                    Player.CompetitionType type;
                    switch (compChoice) {
                        case 1:
                            type = Player.CompetitionType.ALGORITHM;
                            break;
                        case 2:
                            type = Player.CompetitionType.HACKATHON;
                            break;
                        case 3:
                            type = Player.CompetitionType.CONTEST;
                            break;
                        default:
                            type = null;
                    }

                    if (type != null) {
                        player.joinCompetition(type, competitionManager);
                    } else {
                        System.out.println("⚠ 잘못된 선택입니다.");
                    }
                    break;
                case 3:
                    System.out.println("💆‍♂️ 휴식하기...");
                    break;
                case 4:
                    System.out.println("이전 메뉴로 돌아갑니다.");
                    return;
                default:
                    System.out.println("⚠ 잘못된 입력입니다.");
            }
        }
    }


    private void studyMenu() {
        System.out.println("==== 공부할 기술 선택 ====");
        System.out.println("현재 보유 기술: " + player.getSkillList());
        System.out.print("공부할 기술 입력: ");
        String skillName = sc.nextLine();

        Skill skill = player.getSkillByName(skillName);
        if (skill == null) {
            System.out.println("보유하지 않은 기술입니다.");
            return;
        }

        System.out.println(skillName + " 공부를 시작합니다!");
        player.study(skill);
    }

    private void competitionMenu() {
        System.out.println("==== 참가할 대회 선택 ====");
        System.out.println("1. 알고리즘 대회\n2. 사이드 프로젝트\n3. 경진대회");
        System.out.print("대회 번호 선택: ");
        
        int competitionNum = sc.nextInt();
        sc.nextLine(); // 개행 문자 제거
        String competitionType = "";

        switch (competitionNum) {
            case 1: competitionType = "알고리즘 대회"; break;
            case 2: competitionType = "사이드 프로젝트"; break;
            case 3: competitionType = "경진대회"; break;
            default:
                System.out.println("잘못된 입력입니다.");
                return;
        }

        System.out.println(competitionType + "에 참가합니다.");
        CompetitionManager competitionManager = new CompetitionManager();
//        competitionManager.joinCompetition(player, competitionType);
    }
}
