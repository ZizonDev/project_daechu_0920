package com.daechu.jdbc.dao;

import com.daechu.jdbc.util.Common;
import com.daechu.jdbc.vo.CustomerVO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CustomerDAO {
    Connection conn = null;
    Statement stmt = null;
    PreparedStatement pStmt = null;
    ResultSet rs = null;
    static Scanner sc = new Scanner(System.in);
    List<CustomerVO> list = new ArrayList<>();
    public List<CustomerVO> CustomerList() {
        try {
            conn = Common.getConnection();
            stmt = conn.createStatement();
            String query = "SELECT * FROM CUSTOMER";
            rs = stmt.executeQuery(query);

            while(rs.next()) {
                int user_number = rs.getInt("USER_NUMBER");
                String user_id = rs.getString("USER_ID");
                String user_pw = rs.getString("USER_PW");
                String name = rs.getString("NAME");
                String rrn = rs.getString("RRN");
                int credit_score_n = rs.getInt("CREDIT_SCORE_N");
                int credit_score_k = rs.getInt("CREDIT_SCORE_K");
                String phone_num = rs.getString("PHONE_NUM");
                String email = rs.getString("EMAIL");
                String job = rs.getString("JOB");
                int income = rs.getInt("INCOME");
                String bank = rs.getString("BANK");
                int account = rs.getInt("ACCOUNT");

                CustomerVO vo = new CustomerVO(user_number, user_id, user_pw, name, rrn, credit_score_n, credit_score_k, phone_num, email, job, income, bank, account);
                list.add(vo);
            }
            Common.close(rs);
            Common.close(stmt);
            Common.close(conn);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public void userSignUp() {
        System.out.println("회원 정보를 입력하세요.");
        System.out.print("ID : ");
        String user_id = sc.next();
        System.out.print("PW : ");
        String user_pw = sc.next();
        System.out.print("이름 : ");
        String name = sc.next();
        System.out.print("주민등록번호 : ");
        String rrn = sc.next();
        System.out.print("NICE 신용평가점수 : ");
        int credit_score_n = sc.nextInt();
        System.out.print("KCB 신용평가점수 : ");
        int credit_score_k = sc.nextInt();
        System.out.print("전화번호 : ");
        String phone_num = sc.next();
        System.out.print("이메일 : ");
        String email = sc.next();
        System.out.print("직업 : ");
        String job = sc.next();
        System.out.print("소득(백만 원) : ");
        int income = sc.nextInt();
        System.out.print("주거래은행 : ");
        String bank = sc.next();
        System.out.print();
    }

}
