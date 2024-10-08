package com.naver.project1.view;

import java.util.List;

public class PrintResultnameJM {

    public void printEmployeeList(List<EmployeeDTO> employeeList) {

        System.out.println("요청하신 전체 직원 조회 결과입니다.");

        for(EmployeeDTO employee : EmployeeList){
            System.out.println(employee);
        }

        System.out.println("====================================================");
    }

    public void printErrorMessage(String errorCode) {

        String errorMessage = "";

        switch (errorCode) {
            case "selectList" :
                errorMessage = "메뉴 전체 조회에 실패하였습니다..";
                break;
            case "selectOne" :
                errorMessage = "메뉴 코드로 메뉴 조회에 실패하셨습니다....";
                break;
            case "insert" :
                errorMessage = "신규 메뉴 등록에 실패하셨습니다...";
                break;
            case "update" :
                errorMessage = "메뉴 수정에 실패하셨습니다...";
                break;
            case "delete" :
                errorMessage = "메뉴 삭제에 실패하셨습니다.";
        }

        System.out.println(errorMessage);

    }

    public void printMenu(MenuDTO menu) {

        System.out.println(menu.getMenuCode() + "번 메뉴 조회 결과입니다.");
        System.out.println(menu);
        System.out.println("=========================================================");

    }

    public void printSuccessMessage(String successCode) {

        String successMessage = "";
        switch (successCode) {
            case "insert" :
                successMessage = "신규 메뉴 등록 성공!!!";
                break;
            case "update" :
                successMessage = "메뉴 수정 성공!!!";
                break;
            case "delete" :
                successMessage = "메뉴 삭제 성공!!!";

        }
        System.out.println(successMessage);
    }

}
