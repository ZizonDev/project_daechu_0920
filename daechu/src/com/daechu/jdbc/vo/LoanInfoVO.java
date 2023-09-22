package com.daechu.jdbc.vo;

public class LoanInfoVO {
    private int loan_number;
    private int user_number;
    private String name;
    private int product_number;
    private String product_name;
    private int rate;
    private int max_loan;
    private int period;

    public int getLoan_number() {
        return loan_number;
    }

    public void setLoan_number(int loan_number) {
        this.loan_number = loan_number;
    }

    public int getUser_number() {
        return user_number;
    }

    public void setUser_number(int user_number) {
        this.user_number = user_number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getProduct_number() {
        return product_number;
    }

    public void setProduct_number(int product_number) {
        this.product_number = product_number;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public int getMax_loan() {
        return max_loan;
    }

    public void setMax_loan(int max_loan) {
        this.max_loan = max_loan;
    }

    public int getPeriod() {
        return period;
    }

    public void setPeriod(int period) {
        this.period = period;
    }
}
