package com.naver.project1.controller;

import com.naver.project1.model.dto.EmployeeDTO;
import com.naver.project1.model.service.EmployeeService;
import com.naver.project1.view.PrintResultname;

import java.util.List;

public class MenuController {

    private final EmployeeService empolyeeService;
    private final PrintResultname printResultname;

    public MenuController() {
        this.empolyeeService = new EmployeeService();
        this.printResultname = new PrintResultname();
    }

    public void selectAllInformation(){

        List<EmployeeDTO> selectAllInformation = empolyeeService.selectAllInformation();

        if (selectAllInformation != null){
            printResultname.printListEmployee(selectAllInformation);
        } else {
            printResultname.printError("selectError");
        }
    }

}
