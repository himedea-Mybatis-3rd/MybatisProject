package com.naver.project1.model.dao;

import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class EmployeeDAOJM {

    public List<MenuDTO> selectAllMenu(SqlSession sqlSession) {

        return sqlSession.selectList("MenuMapper.selectAllMenu");

    }

    public MenuDTO selectMenuByMenuCode(SqlSession sqlSession, int code) {

        return sqlSession.selectOne("MenuMapper.selectMenuByMenuCode", code);

    }

    public int insertNewMenu(SqlSession sqlSession, MenuDTO newMenu) {

        return sqlSession.insert("MenuMapper.insertNewMenu", newMenu);

    }

    public int updateMenu(SqlSession sqlSession, MenuDTO modifyMenu) {

        return sqlSession.update("MenuMapper.updateMenu", modifyMenu);

    }


    public int deleteMenu(SqlSession sqlSession, int deleteMenu) {

        return sqlSession.delete("MenuMapper.deleteMenu", deleteMenu);
    }


}
