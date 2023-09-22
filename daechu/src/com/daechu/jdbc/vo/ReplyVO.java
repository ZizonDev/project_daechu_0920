package com.daechu.jdbc.vo;

public class ReplyVO {
    private int comment_num;        // 댓글 번호
    private int wrt_num;            // 작성 번호
    private String comment_con;     // 댓글 내용
    private String user_id;         // 고객 ID

    public ReplyVO(int comment_num, int wrt_num, String comment_con, String user_id) {
        this.comment_num = comment_num;
        this.wrt_num = wrt_num;
        this.comment_con = comment_con;
        this.user_id = user_id;
    }

    public int getComment_num() {
        return comment_num;
    }

    public void setComment_num(int comment_num) {
        this.comment_num = comment_num;
    }

    public int getWrt_num() {
        return wrt_num;
    }

    public void setWrt_num(int wrt_num) {
        this.wrt_num = wrt_num;
    }

    public String getComment_con() {
        return comment_con;
    }

    public void setComment_con(String comment_con) {
        this.comment_con = comment_con;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }
}
