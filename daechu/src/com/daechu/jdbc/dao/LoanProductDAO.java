package com.daechu.jdbc.dao;

import com.daechu.jdbc.util.Common;
import com.daechu.jdbc.vo.LoanProductVO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class LoanProductDAO {
    public List<LoanProductVO> listLoanProduct() {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        List<LoanProductVO> list = new ArrayList<>();
        try{
            conn = Common.getConnection();
            stmt = conn.createStatement();
            String query = "SELECT * FROM LOAN_PRODUCT";
            rs = stmt.executeQuery(query);

            while(rs.next()) {
                int product_number = rs.getInt("PRODUCT_NUMBER");
                String product_name = rs.getString("PRODUCT_NAME");
                String bank_name = rs.getString("BANK_NAME");
                int rate = rs.getInt("RATE");
                int max_loan = rs.getInt("MAX_LOAN");
                int max_month = rs.getInt("MAX_MONTH");
                String job = rs.getString("JOB");
                String detail = rs.getString("DETAIL");

                LoanProductVO vo = new LoanProductVO();
                vo.setProduct_number(product_number);
                vo.setProduct_name(product_name);
                vo.setBank_name(bank_name);
                vo.setRate(rate);
                vo.setMax_loan(max_loan);
                vo.setMax_month(max_month);
                vo.setJob(job);
                vo.setDetail(detail);

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
