package com.naver.project1.view;

import com.naver.project1.controller.MenuController;

import java.util.Scanner;

public class MenuViewGyunam {

    public void display() {
        MenuController menuController = new MenuController();

        do {
            System.out.println("1.(select) employee 테이블에서 HIRE_DATE가 2000년 이후인 사람 검색하기 : ");
            System.out.println("2.(update) department 테이블에서 D10에 청소부(L2) 추가하기 : ");
            System.out.println("3.(insert) nation 테이블에서 NATIONAL_CODE가 KO인 한국을 대한민국으로 수정하기 : ");
            System.out.println("4.(delete) job 테이블에서 Job_code가 J7인 사원 삭제하기 : ");
            System.out.println("=========================================================");
            Scanner sc = new Scanner(System.in);
            System.out.print("선택해 주세요 : ");
            int result = sc.nextInt();

            switch (result) {
                case 1 : menuController.selectAllMenu();
                break;
            }
        } while (true);

    }
}
