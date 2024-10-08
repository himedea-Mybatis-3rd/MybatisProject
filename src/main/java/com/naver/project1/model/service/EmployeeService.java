package com.naver.project1.model.service;

import com.naver.project1.model.dao.EmployeeDAOname;
import com.naver.project1.model.dto.EmployeeDTO;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

import static com.naver.project1.common.Template.getSqlSession;

public class EmployeeService {

    private final EmployeeDAOname employeeDAO;

    public EmployeeService() {
        this.employeeDAO = new EmployeeDAOname();

    }


    public List<EmployeeDTO> selectAllInformation() {

        SqlSession sqlSession = getSqlSession();

        List<EmployeeDTO> selectAllInformation = employeeDAO.selectAllInformation(sqlSession);

        sqlSession.close();

        return selectAllInformation;

    }

}
