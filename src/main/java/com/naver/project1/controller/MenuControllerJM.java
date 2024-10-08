//package com.naver.project1.controller;
//
//import java.util.List;
//import java.util.Map;
//
//public class MenuControllerJM {
//
//    private final MenuService menuService;
//    private final PrintResult printResult;
//
//
//    public MenuController(){
//        this.menuService = new MenuService();
//        this.printResult = new PrintResult();
//    }
//
//    public void selectAllMenu() {
//
//        List<MenuDTO> menuList = menuService.selectAllMenu();
//
//        // 정상 조회가 되었다면
//        if(menuList != null){
//            printResult.printMenuList(menuList);
//        } else {
//            printResult.printErrorMessage("selectList");
//        }
//
//
//    }
//
//
//    public void selectMenuByCode(Map<String, String> parameter) {
//
//        // 나중에 나올 개념이지만 나중에 화면에서 입력 받은 값을
//        // 컨트롤러가 전달 받게 되면 String 타입으로 넘어오게 된다.
//        // 사용자가 입력한 String 타입의 값을 우리가 설계한 자료형에 맞게 parsing
//        int code = Integer.parseInt(parameter.get("menuCode"));
//
//        MenuDTO menu = menuService.selectMenuByMenuCode(code);
//
//        if(menu != null){
//            printResult.printMenu(menu);
//        }else{
//            printResult.printErrorMessage("selectOne");
//        }
//
//
//    }
//
//    public void insertNewMenu(Map<String, String> parameter) {
//
//        String menuName = parameter.get("name");
//        int menuPrice = Integer.parseInt(parameter.get("price"));
//        int categoryCode = Integer.parseInt(parameter.get("category"));
//
//        // 서로 다른 자료형을 가진 연관있는 값을 클래스로 뭉쳐서 전달
//        // MenuDTO 클래스 사용
//        MenuDTO newMenu = new MenuDTO();
//        newMenu.setMenuName(menuName);
//        newMenu.setMenuPrice(menuPrice);
//        newMenu.setCategoryCode(categoryCode);
//
//        if(menuService.insertNewMenu(newMenu)){
//            printResult.printSuccessMessage("insert");
//        } else {
//            printResult.printErrorMessage("insert");
//        }
//
//    }
//
//    public void modifyMenu(Map<String, String> parameter) {
//        int code = Integer.parseInt(parameter.get("code"));
//        String name = parameter.get("name");
//        int price = Integer.parseInt(parameter.get("price"));
//        int categoryCode = Integer.parseInt(parameter.get("categoryCode"));
//
//        MenuDTO modifyMenu = new MenuDTO();
//        modifyMenu.setMenuCode(code);
//        modifyMenu.setMenuName(name);
//        modifyMenu.setMenuPrice(price);
//        modifyMenu.setCategoryCode(categoryCode);
//
//        if(menuService.modifyMenu(modifyMenu)){
//
//            printResult.printSuccessMessage("update");
//
//        }else{
//            printResult.printErrorMessage("update");
//
//        }
//
//
//    }
//
//    public void deleteMenu(Map<String, String> parameter) {
//        int menuCode = Integer.parseInt(parameter.get("menuCode"));
//
//
//
//        if(menuService.deleteMenu(menuCode)){
//
//            printResult.printSuccessMessage("delete");
//
//        }else{
//            printResult.printErrorMessage("delete");
//
//        }
//    }
//
//}
