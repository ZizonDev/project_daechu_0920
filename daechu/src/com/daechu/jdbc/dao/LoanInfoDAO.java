package com.daechu.jdbc.dao;

import com.daechu.jdbc.util.Common;
import com.daechu.jdbc.vo.LoanInfoVO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class LoanInfoDAO {
    public List<LoanInfoVO> listLoanInfo() {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        List<LoanInfoVO> list = new ArrayList<>();
        try{
            conn = Common.getConnection();
            stmt = conn.createStatement();
            String query = "SELECT * FROM LOAN_INFO";
            rs = stmt.executeQuery(query);

            while(rs.next()) {
                int loan_number = rs.getInt("LOAN_NUMBER");
                int user_number = rs.getInt("USER_NUMBER");
                String name = rs.getString("NAME");
                int product_number = rs.getInt("PRODUCT_NUMBER");
                String product_name = rs.getString("PRODUCT_NAME");
                int rate = rs.getInt("RATE");
                int max_loan = rs.getInt("MAX_LOAN");
                int period = rs.getInt("PERIOD");

                LoanInfoVO vo = new LoanInfoVO();
                vo.setLoan_number(loan_number);
                vo.setUser_number(user_number);
                vo.setName(name);
                vo.setProduct_number(product_number);
                vo.setProduct_name(product_name);
                vo.setRate(rate);
                vo.setMax_loan(max_loan);
                vo.setPeriod(period);

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
