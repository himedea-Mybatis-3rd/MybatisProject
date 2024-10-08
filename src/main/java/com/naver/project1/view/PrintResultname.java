package com.naver.project1.view;

import com.naver.project1.model.dto.EmployeeDTO;

import java.util.List;

public class PrintResultname {
    public void printSelectAllInformation(List<EmployeeDTO> employeeList) {

        System.out.println("조회하신 결과입니다...");

        for (EmployeeDTO employeeDTO : employeeList){
            System.out.println(employeeDTO);
        }

    }

    public void printErrorMessage(String errorMessage) {

        switch (errorMessage){
            case "selectError":
                System.out.println("조회에 실패하였습니다...");
                break;
        }

    }
}
