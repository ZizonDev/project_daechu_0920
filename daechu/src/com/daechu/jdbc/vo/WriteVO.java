package com.daechu.jdbc.vo;

import java.sql.Date;

public class WriteVO {
    private int wrt_num;            // 작성 번호
    private String board_name;      // 게시판 이름
    private String title;           // 게시글 제목
    private String contents;        // 게시글 내용
    private Date wrt_date;          // 작성 날짜
    private String user_id;         // 고객 ID

    public WriteVO(int wrt_num, String board_name, String title, String contents, Date wrt_date, String user_id) {
        this.wrt_num = wrt_num;
        this.board_name = board_name;
        this.title = title;
        this.contents = contents;
        this.wrt_date = wrt_date;
        this.user_id = user_id;
    }

    public int getWrt_num() {
        return wrt_num;
    }

    public void setWrt_num(int wrt_num) {
        this.wrt_num = wrt_num;
    }

    public String getBoard_name() {
        return board_name;
    }

    public void setBoard_name(String board_name) {
        this.board_name = board_name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public Date getWrt_date() {
        return wrt_date;
    }

    public void setWrt_date(Date wrt_date) {
        this.wrt_date = wrt_date;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }
}
