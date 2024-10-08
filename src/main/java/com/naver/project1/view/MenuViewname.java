package com.naver.project1.view;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MenuViewname {

    public void display() {

        Scanner sc = new Scanner(System.in);
        MenuController menuController = new MenuController();
        boolean run = true;

        do {
            System.out.println("============== HelloMedia 메뉴 관리 시스템 ==============");
            System.out.println("1. ");
            System.out.println("2. ");
            System.out.println("3. ");
            System.out.println("4. 박재민");
            System.out.println("5. 이승현");
            System.out.println("6. 종료");
            System.out.println("=======================================================");
            System.out.print("실행할 메뉴를 선택해주세요 : ");
            int no = sc.nextInt();

            switch (no) {
                case 1 :
                    menuView.display();
                    break;
                case 2 :
                    menuView.display();
                    break;
                case 3 :
                    menuView.display();
                    break;
                case 4 :
                    menuView.display();
                    break;
                case 5 :
                    menuView.display();
                    break;
                case 6 :
                    run = false;
                    break;
            }
        } while (run);
    }
}