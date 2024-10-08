package com.naver.project1.controller;

import com.naver.project1.model.dto.EmployeeDTOname;
import com.naver.project1.model.service.EmployeeService;
import com.naver.project1.view.PrintResultname;

import java.util.List;

public class MenuController {

    private final EmployeeService employeeService;
    private final PrintResultname printResultName;

    public MenuController () { // 안정화를 위한 초기화
        this.employeeService = new EmployeeService();
        this.printResultName = new PrintResultname();
    }

    public void selectAllMenu () {

        List<EmployeeDTOname> employeeList = employeeService.selectAllMenu();
        if (employeeList != null) { // 잘 작동 시
            printResultName.printEmployeeList(employeeList);
        } else { // 에러 발생 시
            printResultName.printErrorMessage("selectList");
        }

    }


}
