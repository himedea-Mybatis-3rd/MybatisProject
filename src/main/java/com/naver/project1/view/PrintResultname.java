package com.naver.project1.view;

import com.naver.project1.model.dto.EmployeeDTO;

import java.util.List;

public class PrintResultname {

    public void printListEmployee(List<EmployeeDTO> selectAllInformation) {

        for (EmployeeDTO employeeList : selectAllInformation){
            System.out.println(employeeList);
        }

    }

    public void printError(String errorMessage) {

        switch (errorMessage){
            case "selectError":
                System.out.println("학생 조회가 실패되었습니다...");
                break;
        }
    }
}
