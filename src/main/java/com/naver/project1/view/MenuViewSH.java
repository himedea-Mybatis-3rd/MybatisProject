package com.naver.project1.view;

import com.naver.project1.controller.MenuController;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MenuViewSH {
    public void display() {

        Scanner sc = new Scanner(System.in);
        MenuControllerSH menuController = new MenuControllerSH();

        boolean run = true;

        do {
            System.out.println("==============HiMedia 메뉴 관리 시스템==============");
            System.out.println("1. 직원 전체 조회하기");
            System.out.println("2. 부서 코드로 부서 직원 조회하기");
            System.out.println("3. 신규 직원 등록하기");
            System.out.println("4. 직원정보 수정하기");
            System.out.println("5. 직원 삭제하기");
            System.out.println("6. 메인메뉴로 돌아가기");
            System.out.println("==================================================");
            System.out.print("실행할 메뉴를 선택해주세요 : ");
            int no = sc.nextInt();

            switch (no) {
                case 1 :
                    menuController.selectAllMenu();
                    break;
                case 2 :
                    menuController.selectMenuByCode(inputMenuCode());
                    break;
                case 3 :
                    menuController.insertNewMenu(inputMenu());
                    break;
                case 4 :
                    menuController.modifyMenu(inputModifyMenu());
                    break;
                case 5 :
                    menuController.deleteMenu(deleteMenu());
                    break;
                case 6 :
                    run=false;
                    break;
            }

        } while (run);

    }

    private static Map<String,String> deleteMenu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("삭제할 메뉴의 코드를 입력해주세요");
        String menuCode = sc.nextLine();

        Map<String,String> parameter = new HashMap<>();
        parameter.put("menuCode",menuCode);
        return parameter;
    }

    private static Map<String,String> inputModifyMenu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("수정할 메뉴의 코드를 입력해주세요");
        String menuCode = sc.nextLine();
        System.out.println("수정할 메뉴의 이름을 입력해주세요");
        String name = sc.nextLine();
        System.out.println("수정할 메뉴의 가격을 입력해주세요");
        String price = sc.nextLine();
        System.out.println("수정할 메뉴의 카테고리를 입력해주세요");
        String category = sc.nextLine();

        Map<String,String> parameter = new HashMap<>();
        parameter.put("menuCode",menuCode);
        parameter.put("name",name);
        parameter.put("price",price);
        parameter.put("category",category);
        return parameter;
    }

    private static Map<String,String> inputMenu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("새로운 메뉴의 이름을 입력해주세요");
        String name = sc.nextLine();
        System.out.println("새로운 메뉴의 가격을 입력해주세요");
        String price = sc.nextLine();
        System.out.println("새로운 메뉴의 카테고리를 입력해주세요");
        String category = sc.nextLine();

        Map<String,String> parameter = new HashMap<>();
        parameter.put("name",name);
        parameter.put("price",price);
        parameter.put("category",category);

        return parameter;
    }

    private static Map<String,String> inputMenuCode() {
        Scanner sc = new Scanner(System.in);
        System.out.println("검색할 메뉴의 코드를 입력해주세요");
        String menuCode = sc.nextLine();

        Map<String,String> parameter = new HashMap<>();
        parameter.put("menuCode",menuCode);
        return parameter;
    }
}