package com.naver.project1.view;

import com.naver.project1.controller.MenuController;

import java.util.Scanner;

public class MenuViewSeongChan {

    public void display(){

        MenuController menuController = new MenuController();

        do{
            System.out.println("======직원관리시스템======");
            System.out.println("1. 전체 직원 정보 조회하기 ");
            System.out.println("2. 특정 직원 정보 조회하기 ");
            System.out.println("3. 특정 직원 정보 등록하기 ");
            System.out.println("4. 특정 직원 정보 수정하기 ");
            System.out.println("5. 특정 직원 정보 삭제하기 ");
            System.out.println("======직원관리시스템======");
            Scanner sc = new Scanner(System.in);
            System.out.print("번호를 적어주세요 : ");
            int no = sc.nextInt();

            switch (no){
                case 1:
                    menuController.selectAllEmployee();
                    break;
                case 2 :
                    //MenuController.selectEmployeeByCode(inputEmployeeCode());
                    break;
                case 3 :
                    //MenuController.insertNewEmployee(inputEmployee());
                    break;
                case 4 :
                    //MenuController.modifyEmployee(inputModifyEmployee());
                    break;
                case 5 :
                    //MenuController.deleteEmployee(inputDeleteEmployee());
                    break;
            }
        }while(true);
    }
}
