package com.daechu.jdbc.main;

import com.daechu.jdbc.dao.CustomerDAO;
import com.daechu.jdbc.dao.LoanProductDAO;
import com.daechu.jdbc.vo.LoanProductVO;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CustomerMode();
        PriorityMode();
    }

    public static void CustomerMode() {
        CustomerDAO dao = new CustomerDAO();
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("=".repeat(33) + " [ 대 추 ] " + "=".repeat(33));
            System.out.print("메뉴를 선택하세요 [1]가입 [2]로그인 [3]수정 [4]가입 정보 [5]게시판 [6]종료 : ");
            int sel = sc.nextInt();
            switch(sel) {
                case 1 :
                    dao.userSignUp();
                    System.out.println("회원 가입이 완료되었습니다.");
                    System.out.println("로그인 창으로 넘어갑니다.");
                case 2 :
                    int i = dao.userLogin();
                    if (i==0) break;
                    System.out.println("로그인이 완료되었습니다.");

                case 3 :

                case 4 :

                case 5 :

                case 6 :
                    System.out.println("대출 상품 추천 프로그램을 종료합니다.");
                    return;
            }
        }
    }

    public static void PriorityMode() {
        LoanProductDAO dao = new LoanProductDAO();
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("=".repeat(27) + " [ 우선 순위 선택 ] " + "=".repeat(27));
            System.out.print("최우선 순위를 선택하세요 [1]최저 금리 [2]최대 한도 [3]최대 대출 기간 : ");
            int sel = sc.nextInt();
            switch(sel) {
                case 1 :

                    dao.MinRateSort();
                case 2 :

                case 3 :

            }

        }
    }
}

