package com.naver.project1.view;

import com.naver.project1.controller.MenuController;

import java.util.Scanner;

public class MenuViewKeunHee {

    public void MenuViewKeunHee (){

        Scanner sc = new Scanner(System.in);
        MenuController menuController = new MenuController();

        do {
            System.out.println("================학생관리 시스템=================");
            System.out.println("[메뉴 1번] : 등록된 학생 전체 조회하기");
            System.out.println("[메뉴 2번] : 과목코드 기준으로 검색하기");
            System.out.println("[메뉴 3번] : 학생 등록하기");
            System.out.println("[메뉴 4번] : 등록한 학생정보 수정하기");
            System.out.println("[메뉴 5번] : 학생정보 삭제하기");
            System.out.println("[메뉴 0번] : 프로그램 종료하기");
            System.out.print("원하시는 메뉴번호를 선택하세요 : ");
            int menuNo = sc.nextInt();

            switch(menuNo){
                case 1:
                    menuController.selectAllInformation();
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 0:
                    System.out.println("프로그램을 종료합니다...");
                    System.exit(0);
                default:
                    System.out.println("메뉴에 맞는 번호를 입력해주세요...");
                    break;
            }


        }while (true);

    }

}
