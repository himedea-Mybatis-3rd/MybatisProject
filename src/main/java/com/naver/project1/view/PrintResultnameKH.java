package com.naver.project1.view;

import com.naver.project1.model.dto.EmployeeDTOKH;

import java.util.List;

public class PrintResultnameKH {

    public void printListEmployee(List<EmployeeDTOKH> selectAllInformation) {

        for (EmployeeDTOKH employeeList : selectAllInformation){
            System.out.println(employeeList);
        }

    }

    public void printSuccessInfo(String successMessage) {

        switch (successMessage){
            case "successInfo":
                System.out.println("신규 직원 추가가 완료되었습니다...");
                break;
        }

    }

    public void printError(String errorMessage) {

        switch (errorMessage){
            case "selectError":
                System.out.println("직원 전체 조회가 실패되었습니다...");
                break;
            case "selectDeptCodeError":
                System.out.println("요청하신 부서코드로 등록되어 있는 직원 조회가 실패되었습니다...");
                break;
            case "insertError":
                System.out.println("직원 정보 추가가 실패되었습니다...");
                break;
        }
    }

    public void printSuccess(List<EmployeeDTOKH> dept) {

        System.out.println("조회하신 결과 입니다...");

        for (EmployeeDTOKH deptList : dept){
            System.out.println(deptList);
        }

    }


}
