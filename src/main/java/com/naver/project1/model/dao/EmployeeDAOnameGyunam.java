package com.naver.project1.model.dao;

import com.naver.project1.model.dto.EmployeeDTOnameGyunam;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class EmployeeDAOnameGyunam {

    public List<EmployeeDTOnameGyunam> selectAllMenu(SqlSession sqlSession) {

        return sqlSession.selectList("EmployeeMapper.selectAllMenu");
    }
}
