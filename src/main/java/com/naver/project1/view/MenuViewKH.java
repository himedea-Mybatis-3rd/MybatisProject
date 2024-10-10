package com.naver.project1.view;

import com.naver.project1.controller.MenuControllerKH;
import com.naver.project1.model.dto.EmployeeDTOKH;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

public class MenuViewKH {


    public void MenuViewKH() {
        MenuControllerKH menuController = new MenuControllerKH();

        do {
            System.out.println("================학생관리 시스템=================");
            System.out.println("[메뉴 1번] : 전체 직원 조회하기");
            System.out.println("[메뉴 2번] : 직급별 조회하기");
            System.out.println("[메뉴 3번] : 직원 등록하기");
            System.out.println("[메뉴 4번] : 등록한 직원정보 수정하기");
            System.out.println("[메뉴 5번] : 직원정보 삭제하기");
            System.out.println("[메뉴 0번] : 프로그램 종료하기");
            System.out.print("원하시는 메뉴번호를 선택하세요 : ");

            Scanner sc = new Scanner(System.in);

            int menuNo = 0;

            try {
                menuNo = sc.nextInt();
                sc.nextLine(); // 버퍼에 남아 있는 줄바꿈 문자 제거
            } catch (InputMismatchException e) {
                System.out.println("잘못된 입력입니다. 숫자를 입력하세요.");
                sc.nextLine(); // 잘못된 입력을 소비
                continue; // 루프의 시작으로 돌아감
            }

            switch (menuNo) {
                case 1:
                    menuController.selectAllInformation();
                    break;
                case 2:
                    menuController.selectDepartMent(selectDepartMentCode());
                    break;
                case 3:
                    menuController.insertInformation(insert());
                    break;
                case 4:
                    // 직원 정보 수정 로직 추가
                    break;
                case 5:
                    // 직원 정보 삭제 로직 추가
                    break;
                case 0:
                    System.out.println("프로그램을 종료합니다...");
                    System.exit(0);
                default:
                    System.out.println("메뉴에 맞는 번호를 입력해주세요...");
                    break;
            }

        } while (true);
    }

    private static Map<String, String> selectDepartMentCode() {

        Scanner sc = new Scanner(System.in);

        System.out.println("현재 등록되어 있는 직급입니다");
        System.out.println("[J1 대표], [J2 부사장], [J3 부장], [J4 차장], [J5 과장], [J6 대리], [J7 사원]");
        System.out.print("원하시는 직급 코드를 입력해주세요 : ");
        String jobCode = sc.nextLine(); // 같은 Scanner 객체 사용

        Map<String, String> parameter = new HashMap<>();
        parameter.put("jobCode", jobCode);


        return parameter;
    }

    private static Map<String, String> insert() {

        Scanner sc = new Scanner(System.in);

        System.out.println("====================신규 직원 추가===================");
        System.out.print("등록하실 ID 입력 : ");
        String id = sc.nextLine();

        System.out.print("등록하실 이름 입력 : ");
        String name = sc.nextLine();

        System.out.print("등록하실 주민번호 입력 : ");
        String jumin = sc.nextLine();

        System.out.print("등록하실 이메일 입력 : ");
        String email = sc.nextLine();

        System.out.print("등록하실 전화번호 입력 : ");
        String phone  = sc.nextLine();

        System.out.print("[D1 ~ D9] 등록하실 부서코드 입력 : ");
        String deptCode = sc.nextLine();

        System.out.print("[J1 ~ J7] 등록하실 직급코드 입력 : ");
        String jobCode = sc.nextLine();

        System.out.print("[S1 ~ S6] 등록하실 급여등급 입력 : ");
        String salLevel = sc.nextLine();

        System.out.print("등록하실 월급 입력 : ");
        String salary = sc.nextLine();

        System.out.print("등록하실 보너스 입력 : ");
        String bonus = sc.nextLine();

        System.out.print("등록하실 매니저(사수) 입력 : ");
        String manager = sc.nextLine();

        Map<String, String> parameter = new HashMap<>();

        parameter.put("empId", id);
        parameter.put("empName", name);
        parameter.put("jumin", jumin);
        parameter.put("email", email);
        parameter.put("phone", phone);
        parameter.put("dpetCode", deptCode);
        parameter.put("jobCode", jobCode);
        parameter.put("salLevel", salLevel);
        parameter.put("salary", salary);
        parameter.put("bonus", bonus);
        parameter.put("manager", manager);

        return parameter;

    }

}
