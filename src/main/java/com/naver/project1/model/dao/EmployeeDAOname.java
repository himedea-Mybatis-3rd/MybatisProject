package com.naver.project1.model.dao;

import com.naver.project1.model.dto.EmployeeDTOname;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class EmployeeDAOname {

    public List<EmployeeDTOname> selectAllMenu(SqlSession sqlSession) {

        return sqlSession.selectList("EmployeeMapper.selectAllMenu");
    }
}
