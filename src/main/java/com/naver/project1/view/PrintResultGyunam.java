package com.naver.project1.view;


import com.naver.project1.model.dto.EmployeeDTOGyunam;

import java.util.List;

public class PrintResultGyunam {

    public void printList(List<EmployeeDTOGyunam> result) {

        System.out.println("조회하신 결과입니다.");
        for (EmployeeDTOGyunam em : result) {
            System.out.println(em.getEmpName());
        }
    }

    public void printErrorMessage(String errorString) {

        String errorMessage = "";
        switch (errorString) {
            case "errorSelectList" :
                errorMessage = "요청하신 조회에 실패하였습니다.";
                break;
            case "insertError" :
                errorMessage = "항목 추가에 실패하였습니다.";
                break;
            case "updateError" :
                errorMessage = "업데이트가 실패하였습니다.";
                break;
            case "deleteError" :
                errorMessage = "업데이트에 실패하였습니다.";

        }
        System.out.println(errorMessage);
    }

    public void printSuccessMessage(String successString) {

        String successMessage = "";
        switch (successString) {
            case "insertSuccess" :
                successMessage = "항목 추가가 완료되었습니다.";
                break;
            case "updateSuccess" :
                successMessage = "업데이트가 성공하였습니다.";
                break;
            case "deleteSuccess" :
                successMessage = "삭제에 성공하였습니다.";
                break;
        }
        System.out.println(successMessage);
    }
}
