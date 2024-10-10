package com.naver.project1.model.dao;

import com.naver.project1.model.dto.EmployeeDTOGyunam;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class EmployeeDAOGyunam {

    public List<EmployeeDTOGyunam> selectUnitNamedao(SqlSession sqlSession) {

        return sqlSession.selectList("EmployeeMapper.selectEmployee");
    }

    public int insertUnitDao(SqlSession sqlSession, EmployeeDTOGyunam employeeDTOGyunam) {

        return sqlSession.insert("EmployeeMapper.insertEmployee",employeeDTOGyunam);
    }

    public int updateUnitDao(SqlSession sqlSession, EmployeeDTOGyunam employeeDTOGyunam) {

        return sqlSession.update("EmployeeMapper.updateEmployee",employeeDTOGyunam);

    }

    public int deleteUnitDao(SqlSession sqlSession, EmployeeDTOGyunam employeeDTOGyunam) {

        return sqlSession.delete("EmployeeMapper.deleteEmployee", employeeDTOGyunam);
    }
}







