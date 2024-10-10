package com.naver.project1.model.dao;

import com.naver.project1.model.dto.EmployeeDTOKH;
import org.apache.ibatis.session.SqlSession;

import java.util.List;


public class EmployeeDAOKH {

    public List<EmployeeDTOKH> selectAllInformation(SqlSession sqlSession) {

        return sqlSession.selectList("EmployeeMapper.selectAllInformation");

    }

    public List<EmployeeDTOKH> selectDeptCode(SqlSession sqlSession, String selectDeptCode) {

        return sqlSession.selectList("EmployeeMapper.selectDeptCode", selectDeptCode);

    }

    public int insert(SqlSession sqlSession, EmployeeDTOKH insertInformation) {

        return sqlSession.insert("EmployeeMapper.insert", insertInformation);

    }
}
