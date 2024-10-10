package com.naver.project1.model.service;

import com.naver.project1.model.dao.EmployeeDAOGyunam;
import com.naver.project1.model.dto.EmployeeDTOGyunam;
import org.apache.ibatis.session.SqlSession;

import java.util.List;
import java.util.Map;

import static com.naver.project1.common.Template.getSqlSession;


public class EmployeeServiceGyunam {

    EmployeeDAOGyunam employeeDAOGyunam = new EmployeeDAOGyunam();

    public List<EmployeeDTOGyunam> selectUnitName() {

        SqlSession sqlSession = getSqlSession();

        List<EmployeeDTOGyunam> result = employeeDAOGyunam.selectUnitNamedao(sqlSession);

        sqlSession.close();
        return result;
    }

    public boolean insertUnit(EmployeeDTOGyunam employeeDTOGyunam) {

        SqlSession sqlSession = getSqlSession();

        int result = employeeDAOGyunam.insertUnitDao(sqlSession, employeeDTOGyunam);

        if (result > 0) {
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }
        sqlSession.close();
        return (result > 0 ? true : false);
    }

    public boolean serviceUpdate(EmployeeDTOGyunam employeeDTOGyunam) {
        SqlSession sqlSession = getSqlSession();
        int result = employeeDAOGyunam.updateUnitDao(sqlSession,employeeDTOGyunam);

        if (result > 0) {
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }
        sqlSession.close();
        return (result > 0 ? true : false);
    }

    public boolean deleteUnit(EmployeeDTOGyunam employeeDTOGyunam) {
        SqlSession sqlSession = getSqlSession();
        int result = employeeDAOGyunam.deleteUnitDao(sqlSession , employeeDTOGyunam);

        if (result > 0) {
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }
        return (result > 0 ? true : false);
    }
}












