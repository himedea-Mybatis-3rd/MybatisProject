package com.naver.project1;

import com.naver.project1.view.MenuViewGyunam;
import com.naver.project1.view.MenuViewKeunHee;

public class Application {
    public static void main(String[] args) {

        MenuViewKeunHee view = new MenuViewKeunHee();
        view.MenuViewKeunHee();

        MenuViewGyunam view2 = new MenuViewGyunam();
        view2.selectView();
    }
}