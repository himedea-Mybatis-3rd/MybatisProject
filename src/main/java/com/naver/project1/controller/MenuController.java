package com.naver.project1.controller;

import com.naver.project1.model.service.EmployeeService;
import com.naver.project1.view.PrintResultname;
import com.naver.project1.model.dto.*;

import java.util.List;

public class MenuController {

    private final EmployeeService employeeService;
    private final PrintResultname printResultname;

    public MenuController(){
        this.employeeService = new EmployeeService();
        this.printResultname = new PrintResultname();
    }


    public void selectAllEmployee() {
        List<EmployeeDTO> employeeList = employeeService.selectAllEmployee();

        if (employeeList != null){
            printResultname.printSelectAllInformation(employeeList);
        } else {
            printResultname.printErrorMessage("selectError");
        }
    }
}
