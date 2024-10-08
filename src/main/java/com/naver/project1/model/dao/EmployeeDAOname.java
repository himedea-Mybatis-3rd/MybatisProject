package com.naver.project1.model.dao;

import com.naver.project1.model.dto.EmployeeDTO;
import org.apache.ibatis.session.SqlSession;

import java.util.List;


public class EmployeeDAOname {

    public List<EmployeeDTO> selectAllInformation(SqlSession sqlSession) {

        return sqlSession.selectList("EmployeeMapper.selectAllInformation");

    }
}
