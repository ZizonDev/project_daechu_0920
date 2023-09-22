package com.daechu.jdbc.vo;

public class LoanProductVO {
    private int product_number;         // 대출 상품 번호
    private String product_name;        // 대출 상품 이름
    private String bank_name;           // 대출 상품 제공 은행명
    private int rate;                   // 대출 상품 금리
    private int max_loan;               // 최대 대출 한도
    private int max_month;              // 최장 대출 기간
    private String job;                 // 고객 직업
    private String detail;              // 대출 상품 상세 정보

    public LoanProductVO(int product_number, String product_name, String bank_name, int rate, int max_loan, int max_month, String job, String detail) {
        this.product_number = product_number;
        this.product_name = product_name;
        this.bank_name = bank_name;
        this.rate = rate;
        this.max_loan = max_loan;
        this.max_month = max_month;
        this.job = job;
        this.detail = detail;
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

    public String getBank_name() {
        return bank_name;
    }

    public void setBank_name(String bank_name) {
        this.bank_name = bank_name;
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

    public int getMax_month() {
        return max_month;
    }

    public void setMax_month(int max_month) {
        this.max_month = max_month;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }
}
