package com.naver.project1.model.service;

import com.naver.project1.model.dao.EmployeeDAOKH;
import com.naver.project1.model.dto.EmployeeDTOKH;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

import static com.naver.project1.common.Template.getSqlSession;

public class EmployeeServiceKH {

    private EmployeeDAOKH employeeDAO = null;

    public EmployeeServiceKH() {
        this.employeeDAO = new EmployeeDAOKH();

    }

    public boolean insert(EmployeeDTOKH insertInformation) {

        SqlSession sqlSession = getSqlSession();

        int result = employeeDAO.insert(sqlSession, insertInformation);

        if (result > 0) {
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }

        sqlSession.close();

        return result > 0 ? true : false;

    }



    public List<EmployeeDTOKH> selectAllInformation() {

        SqlSession sqlSession = getSqlSession();

        List<EmployeeDTOKH> selectAllInformation = employeeDAO.selectAllInformation(sqlSession);

        sqlSession.close();

        return selectAllInformation;

    }

    public List<EmployeeDTOKH> selectJobCode(String selectjob) {

        SqlSession sqlSession = getSqlSession();

        List<EmployeeDTOKH> job =  employeeDAO.selectDeptCode(sqlSession, selectjob);

        sqlSession.close();

        return job;

    }
}
