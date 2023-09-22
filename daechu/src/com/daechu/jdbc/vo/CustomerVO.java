package com.daechu.jdbc.vo;

public class CustomerVO {
    private int user_number;        // 고객 번호
    private String user_id;         // 고객 ID
    private String user_pw;         // 고객 PW
    private String name;            // 고객 이름
    private String rrn;             // 고객 주민등록번호
    private int credit_score_n;     // nice 신용 평점
    private int credit_score_k;     // kcb 신용 평점
    private String phone_num;       // 고객 전화 번호
    private String email;           // 고객 e-mail
    private String job;             // 고객 직업
    private int income;             // 고객 소득
    private String bank;            // 고객 주거래 은행
    private int account;            // 고객 계좌 번호

    public CustomerVO(int user_number, String user_id, String user_pw, String name, String rrn, int credit_score_n, int credit_score_k, String phone_num, String email, String job, int income, String bank, int account) {
        this.user_number = user_number;
        this.user_id = user_id;
        this.user_pw = user_pw;
        this.name = name;
        this.rrn = rrn;
        this.credit_score_n = credit_score_n;
        this.credit_score_k = credit_score_k;
        this.phone_num = phone_num;
        this.email = email;
        this.job = job;
        this.income = income;
        this.bank = bank;
        this.account = account;
    }

    public int getUser_number() {
        return user_number;
    }

    public void setUser_number(int user_number) {
        this.user_number = user_number;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getUser_pw() {
        return user_pw;
    }

    public void setUser_pw(String user_pw) {
        this.user_pw = user_pw;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRrn() {
        return rrn;
    }

    public void setRrn(String rrn) {
        this.rrn = rrn;
    }

    public int getCredit_score_n() {
        return credit_score_n;
    }

    public void setCredit_score_n(int credit_score_n) {
        this.credit_score_n = credit_score_n;
    }

    public int getCredit_score_k() {
        return credit_score_k;
    }

    public void setCredit_score_k(int credit_score_k) {
        this.credit_score_k = credit_score_k;
    }

    public String getPhone_num() {
        return phone_num;
    }

    public void setPhone_num(String phone_num) {
        this.phone_num = phone_num;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public int getIncome() {
        return income;
    }

    public void setIncome(int income) {
        this.income = income;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public int getAccount() {
        return account;
    }

    public void setAccount(int account) {
        this.account = account;
    }
}
