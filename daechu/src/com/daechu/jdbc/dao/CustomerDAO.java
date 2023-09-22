package com.daechu.jdbc.dao;

import com.daechu.jdbc.util.Common;
import com.daechu.jdbc.vo.CustomerVO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class CustomerDAO {
    public List<CustomerVO> listCustomer() {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        List<CustomerVO> list = new ArrayList<>();
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

                CustomerVO vo = new CustomerVO();
                vo.setUser_number(user_number);
                vo.setUser_id(user_id);
                vo.setUser_pw(user_pw);
                vo.setName(name);
                vo.setRrn(rrn);
                vo.setCredit_score_n(credit_score_n);
                vo.setCredit_score_k(credit_score_k);
                vo.setPhone_num(phone_num);
                vo.setEmail(email);
                vo.setJob(job);
                vo.setIncome(income);
                vo.setBank(bank);
                vo.setAccount(account);

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
}
