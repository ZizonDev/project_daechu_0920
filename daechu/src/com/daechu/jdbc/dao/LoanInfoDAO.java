package com.daechu.jdbc.dao;

import com.daechu.jdbc.util.Common;
import com.daechu.jdbc.vo.LoanInfoVO;
import com.daechu.jdbc.vo.LoanProductVO;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class LoanInfoDAO {
    Connection conn = null;
    Statement stmt = null;
    PreparedStatement pStmt = null;
    ResultSet rs = null;
    List<LoanInfoVO> list = new ArrayList<>();
    public List<LoanInfoVO> SelectLoanInfo() {
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

                LoanInfoVO vo = new LoanInfoVO(loan_number, user_number, name, product_number, product_name, rate, max_loan, period);

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

    public void newLoanInfo() {
        String query = "INSERT INTO LOAN_INFO VALUES(LOAN_NUMBER_SEQ.NEXTVAL, USER_NUMBER_SEQ.NEXTVAL, ?, PRODUCT_NUMBER_SEQ.NEXTVAL, ?, ?, ?, ?)";
        try {
            conn = Common.getConnection();
            pStmt = conn.prepareStatement(query);
            pStmt.setString(1, name);
        } catch (Exception e){
            e.printStackTrace();
        }
        Common.close(pStmt);
        Common.close(conn);

    }
}
