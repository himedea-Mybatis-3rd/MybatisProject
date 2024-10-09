package com.naver.project1.controller;

import com.naver.project1.model.dto.EmployeeDTOGyunam;
import com.naver.project1.model.service.EmployeeServiceGyunam;
import com.naver.project1.view.PrintResultGyunam;

import java.util.List;
import java.util.Map;

public class MenuControllerGyunam {

    private final PrintResultGyunam printResultGyunam;
    private final EmployeeServiceGyunam employeeServiceGyunam;

    public MenuControllerGyunam () {
        this.printResultGyunam = new PrintResultGyunam();
        this.employeeServiceGyunam = new EmployeeServiceGyunam();
    }
    public void selectAllMenu() {

        List<EmployeeDTOGyunam> result = employeeServiceGyunam.selectUnitName();

        if (result != null) {
            printResultGyunam.printList(result);
        } else {
            printResultGyunam.printErrorMessage("errorSelectList");
        }
    }

    public void insertUnit(Map<String, String> parameter) {
        String depId = parameter.get("depId");
        String deptTitle = parameter.get("deptTitle");
        String locationId = parameter.get("locationId");

        EmployeeDTOGyunam employeeDTOGyunam = new EmployeeDTOGyunam();
        employeeDTOGyunam.setDepId(depId);
        employeeDTOGyunam.setDepTitle(deptTitle);
        employeeDTOGyunam.setLocationId(locationId);

        if (employeeServiceGyunam.insertUnit(employeeDTOGyunam)) {
            printResultGyunam.printSuccessMessage("insertSuccess");
        } else {
            printResultGyunam.printErrorMessage("insertError");
        }
    }

    public void updateUnit(Map<String, String> parameter) {

        String nationalCode = parameter.get("nationalCode");
        String nationalName = parameter.get("nationalName");

        EmployeeDTOGyunam employeeDTOGyunam = new EmployeeDTOGyunam();
        employeeDTOGyunam.setNationalCode(nationalCode);
        employeeDTOGyunam.setNationalName(nationalName);

        if (employeeServiceGyunam.serviceUpdate(employeeDTOGyunam)) {
            printResultGyunam.printSuccessMessage("updateSuccess");
        } else {
            printResultGyunam.printErrorMessage("updateError");
        }

    }

    public void deleteUnit(Map<String, String> parameter) {

        String jobCode = parameter.get("jobCode");

        EmployeeDTOGyunam employeeDTOGyunam = new EmployeeDTOGyunam();
        employeeDTOGyunam.setJobCode(jobCode);

        if (employeeServiceGyunam.deleteUnit(employeeDTOGyunam)) {
            printResultGyunam.printSuccessMessage("deleteSuccess");
        } else {
            printResultGyunam.printErrorMessage("deleteError");
        }
    }
}








