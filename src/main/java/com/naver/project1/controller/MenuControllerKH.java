package com.naver.project1.controller;

import com.naver.project1.model.dto.EmployeeDTOKH;
import com.naver.project1.model.service.EmployeeServiceKH;
import com.naver.project1.view.PrintResultnameKH;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.sql.Date;
import java.util.List;
import java.util.Map;

public class MenuControllerKH {

    private final EmployeeServiceKH empolyeeService;
    private final PrintResultnameKH printResultname;

    public MenuControllerKH() {
        this.empolyeeService = new EmployeeServiceKH();
        this.printResultname = new PrintResultnameKH();
    }

    public void selectAllInformation(){

        List<EmployeeDTOKH> selectAllInformation = empolyeeService.selectAllInformation();

        if (selectAllInformation != null){
            printResultname.printListEmployee(selectAllInformation);
        } else {
            printResultname.printError("selectError");
        }
    }

    public void selectDepartMent(Map<String, String> parameter) {

        String selectDept =  parameter.get("jobCode");

        List<EmployeeDTOKH> job =  empolyeeService.selectJobCode(selectDept);

        if (job != null){
            printResultname.printSuccess(job);
        } else {
            printResultname.printError("selectDeptCodeError");
        }
    }

    public void insertInformation(Map<String, String> parameter) {

        String id = parameter.get("empId");
        String name = parameter.get("empName");
        String jumin = parameter.get("jumin");
        String email = parameter.get("email");
        String phone = parameter.get("phone");
        String deptCode = parameter.get("deptCode");
        String jobCode = parameter.get("jobCode");
        String salLevel = parameter.get("salLevel");
        int salary = Integer.parseInt(parameter.get("salary"));
        double bonus = Double.parseDouble(parameter.get("bonus"));
        String manager = parameter.get("manager");

        EmployeeDTOKH insertInformation = new EmployeeDTOKH();
        insertInformation.setEmpId(id);
        insertInformation.setEmpName(name);
        insertInformation.setEmpNo(jumin);
        insertInformation.setEmail(email);
        insertInformation.setPhone(phone);
        insertInformation.setDeptCode(deptCode);
        insertInformation.setJobCode(jobCode);
        insertInformation.setSalLevel(salLevel);
        insertInformation.setSalary(salary);
        insertInformation.setBonus(bonus);
        insertInformation.setManagerId(manager);

        if(empolyeeService.insert(insertInformation)){
            printResultname.printSuccessInfo("successInfo");
        } else {
            printResultname.printError("insertError");
        }

    }
}
