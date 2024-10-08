package com.naver.project1.model.service;

import com.naver.project1.model.dao.EmployeeDAOnameGyunam;
import com.naver.project1.model.dto.EmployeeDTOnameGyunam;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

import static com.naver.project1.common.Template.getSqlSession;

public class EmployeeServiceGyunam {

    private final EmployeeDAOnameGyunam employeeDAOnameGyunam;

    public EmployeeServiceGyunam() {
        this.employeeDAOnameGyunam = new EmployeeDAOnameGyunam();
    }

    public List<EmployeeDTOnameGyunam> selectAllMenu () {

        SqlSession sqlSession = getSqlSession();
        List<EmployeeDTOnameGyunam> employeeList = employeeDAOnameGyunam.selectAllMenu(sqlSession);

        sqlSession.close();
        return employeeList;
    }
}
