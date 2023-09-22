package com.daechu.jdbc.dao;

import com.daechu.jdbc.util.Common;
import com.daechu.jdbc.vo.LoanProductVO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class LoanProductDAO {
    Connection conn = null;
    Statement stmt = null;
    ResultSet rs = null;

    public List<LoanProductVO> listLoanProduct() {
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

                LoanProductVO vo = new LoanProductVO(product_number, product_name, bank_name, rate, max_loan, max_month, job, detail);

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

    public List<LoanProductVO> MinRateSort() {
        List<LoanProductVO> list = new ArrayList<>();
        try{
            conn = Common.getConnection();
            stmt = conn.createStatement();
            String query = "SELECT * FROM LOAN_PRODUCT WHERE JOB LIKE ? ORDER BY RATE;";
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

                LoanProductVO vo = new LoanProductVO(product_number, product_name, bank_name, rate, max_loan, max_month, job, detail);

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

    public List<LoanProductVO> MaxLoanSort() {
        List<LoanProductVO> list = new ArrayList<>();
        try{
            conn = Common.getConnection();
            stmt = conn.createStatement();
            String query = "SELECT * FROM LOAN_PRODUCT WHERE JOB LIKE ? ORDER BY DESC MAX_LOAN;";
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

                LoanProductVO vo = new LoanProductVO(product_number, product_name, bank_name, rate, max_loan, max_month, job, detail);

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

    public List<LoanProductVO> MaxMonthSort() {
        List<LoanProductVO> list = new ArrayList<>();
        try{
            conn = Common.getConnection();
            stmt = conn.createStatement();
            String query = "SELECT * FROM LOAN_PRODUCT WHERE JOB LIKE ? ORDER BY DESC MAX_MONTH;";
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

                LoanProductVO vo = new LoanProductVO(product_number, product_name, bank_name, rate, max_loan, max_month, job, detail);

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

    public void LoanProductPrint(List<LoanProductVO> list) {

    }


}
