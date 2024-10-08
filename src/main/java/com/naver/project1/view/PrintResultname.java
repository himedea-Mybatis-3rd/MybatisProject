package com.naver.project1.view;

import com.naver.project1.model.dto.EmployeeDTOname;

import java.util.List;

public class PrintResultname {
    public void printEmployeeList(List<EmployeeDTOname> employeeList) {
        System.out.println("정상 조회 결과입니다");
        for (EmployeeDTOname name : employeeList) {
            System.out.println(name.getEmpName());
        }
    }

    public void printErrorMessage(String errorCode) {
        String errorMessage = "";
        switch (errorCode) {
            case "selectList" :
                errorMessage = "조회가 되지 않았습니다.";
                break;
        }
        System.out.println(errorMessage);
    }
}
