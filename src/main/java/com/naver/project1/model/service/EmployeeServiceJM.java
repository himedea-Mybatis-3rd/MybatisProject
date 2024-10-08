//package com.naver.project1.model.service;
//
//import org.apache.ibatis.session.SqlSession;
//
//import java.util.List;
//
//public class EmployeeServiceJM {
//
//    private final MenuDAO menuDAO;
//
//    public MenuService(){
//        this.menuDAO = new MenuDAO();
//    }
//
//    public List<MenuDTO> selectAllMenu() {
//
//        SqlSession sqlSession = getSqlSession();
//
//        // DAO 는 데이터베이스와 직접 소통하는 클래스이다.
//        // 따라서 소토을 하기 위해서는 통로 == Connection == SqlSession 이 필요하다.
//        List<MenuDTO> menuList = menuDAO.selectAllMenu(sqlSession);
//
//        sqlSession.close();
//
//        return menuList;
//
//
//
//
//    }
//
//    public MenuDTO selectMenuByMenuCode(int code) {
//
//
//        // 1. SqlSession 생성
//        SqlSession sqlSession = getSqlSession();
//
//        // 2. DAO 계층의 메소드 호출하기 - session 과 추가적인 전달 값 있으면 전달
//        MenuDTO menu = menuDAO.selectMenuByMenuCode(sqlSession, code);
//
//        // 3. 사용한 통로 닫아주기
//
//        sqlSession.close();
//
//
//        return menu;
//    }
//
//    public boolean insertNewMenu(MenuDTO newMenu) {
//
//        // 1. SqlSession 생성
//        SqlSession sqlSession = getSqlSession();
//
//        // 2. DAO 계층에 SqlSession 과 전달 할 값 있으면 전달
//        int result = menuDAO.insertNewMenu(sqlSession, newMenu);
//
//        // 3. dml(insert, delete, update) 구문은 트랜젝션 제어를 해주서야 한다.
//        // 저장을 할 것인지 롤백을 할 것인지.
//        if(result > 0 ){
//            sqlSession.commit();
//        } else {
//            sqlSession.rollback();
//        }
//
//        // 4. Sqlsession 닫기
//        sqlSession.close();
//
//        return result > 0 ? true : false;
//
//    }
//
//    public boolean modifyMenu(MenuDTO modifyMenu) {
//
//        SqlSession sqlSession = getSqlSession();
//
//        int result = menuDAO.updateMenu(sqlSession, modifyMenu);
//
//        if(result > 0 ){
//            sqlSession.commit();
//        }else{
//            sqlSession.rollback();
//        }
//
//        sqlSession.close();
//
//        return result > 0 ? true : false;
//    }
//
//    public boolean deleteMenu(int deleteMenu) {
//        SqlSession sqlSession = getSqlSession();
//        int result = menuDAO.deleteMenu(sqlSession, deleteMenu);
//
//        if(result > 0 ){
//            sqlSession.commit();
//        }else{
//            sqlSession.rollback();
//        }
//
//        sqlSession.close();
//
//        return result > 0 ? true : false;
//
//    }
//
//
//}
