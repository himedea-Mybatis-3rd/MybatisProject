package com.naver.project1.model.service;

import com.naver.project1.model.dao.EmployeeDAOname;
import com.naver.project1.model.dto.EmployeeDTO;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

import static com.naver.project1.common.Template.getSqlSession;

public class EmployeeService {

    final EmployeeDAOname employeeDAOname;

    public EmployeeService(){
        this.employeeDAOname = new EmployeeDAOname();
    }

    public List<EmployeeDTO> selectAllEmployee() {

        SqlSession sqlSession = getSqlSession();

        List<EmployeeDTO> employeeList = employeeDAOname.selectAllMenu(sqlSession);

        sqlSession.close();

        return employeeList;
    }
}
