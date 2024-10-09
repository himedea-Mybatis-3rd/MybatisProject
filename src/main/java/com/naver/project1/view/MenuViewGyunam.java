package com.naver.project1.view;

import com.naver.project1.controller.MenuControllerGyunam;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MenuViewGyunam {

    public void selectView() {
        MenuControllerGyunam menuControllerGyunam = new MenuControllerGyunam();
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("1.(select) employee 테이블에서 HIRE_DATE가 2000년 이후인 사람 검색하기 : ");
            System.out.println("2.(insert) department 테이블에서 D10에 청소부(L2) 추가하기 : ");
            System.out.println("3.(update) nation 테이블에서 NATIONAL_CODE를 (KO → KR) / NATIONAL_NAME (한국 → 대한민국)으로 수정하기 : ");
            System.out.println("4.(delete) job 테이블에서 Job_code가 J7인 사원 삭제하기 : ");
            System.out.println("=========================================================");
            System.out.print("항목을 선택하세요 : ");
            int result = sc.nextInt();

            switch (result) {
                case 1 :
                    menuControllerGyunam.selectAllMenu();
                    break;
                case 2 :
                    menuControllerGyunam.insertUnit(inputUnit());
                    break;
                case 3 :
                    menuControllerGyunam.updateUnit(updateUnit());
                case 4 :
                    menuControllerGyunam.deleteUnit(deleteUnit());
            }
        } while (true);
    }

    private static Map<String, String> inputUnit() {
        Scanner sc = new Scanner(System.in);
        System.out.print("DEP_ID를 입력하세요 (ex D9) : ");
        String depId = sc.nextLine();
        System.out.print("DEP_TITLE을 입력하세요 (ex 총무부) : ");
        String depTitle = sc.nextLine();
        System.out.print("LOCATION_ID를 입력하세요 (ex L1) : ");
        String locationId = sc.nextLine();

        Map<String, String> parameter = new HashMap<>();
        parameter.put("depId", depId);
        parameter.put("deptTitle", depTitle);
        parameter.put("locationId", locationId);

        return parameter;
    }

    private static Map<String, String> updateUnit () {
        Scanner sc = new Scanner(System.in);
        System.out.print("수정할 NATIONAL_CODE(KR)를 입력해 주세요 : ");
        String nationalCode = sc.nextLine();
        System.out.print("수정할 NATIONAL_NAME(대한민국)를 입력해 주세요 : ");
        String nationalName = sc.nextLine();

        Map<String, String> parameter = new HashMap<>();
        parameter.put("nationalCode", nationalCode);
        parameter.put("nationalName", nationalName);
        return parameter;
    }

    private static Map<String, String> deleteUnit () {

        Scanner sc = new Scanner(System.in);
        System.out.print("사원의 JOB_CODE인 J7을 눌러주세요 : ");
        String jobCode = sc.nextLine();

        Map<String, String> parameter = new HashMap<>();
        parameter.put("jobCode", jobCode);
        return parameter;
    }
}









