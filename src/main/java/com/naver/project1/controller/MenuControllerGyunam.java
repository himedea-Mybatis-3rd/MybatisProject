package com.naver.project1.controller;

import com.naver.project1.model.dto.EmployeeDTOnameGyunam;
import com.naver.project1.model.service.EmployeeServiceGyunam;
import com.naver.project1.view.PrintResultname;

import java.util.List;

public class MenuControllerGyunam {

    private final EmployeeServiceGyunam employeeServiceGyunam;
    private final PrintResultname printResultName;

    public MenuControllerGyunam() { // 안정화를 위한 초기화
        this.employeeServiceGyunam = new EmployeeServiceGyunam();
        this.printResultName = new PrintResultname();
    }

    public void selectAllMenu () {

        List<EmployeeDTOnameGyunam> employeeList = employeeServiceGyunam.selectAllMenu();
        if (employeeList != null) { // 잘 작동 시
            printResultName.printEmployeeList(employeeList);
        } else { // 에러 발생 시
            printResultName.printErrorMessage("selectList");
        }

    }


}
