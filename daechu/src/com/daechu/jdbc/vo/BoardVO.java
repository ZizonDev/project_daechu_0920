package com.daechu.jdbc.vo;

public class BoardVO {
    private int board_number;       // 게시판 번호
    private String board_name;      // 게시판 이름

    public BoardVO(int board_number, String board_name) {
        this.board_number = board_number;
        this.board_name = board_name;
    }

    public int getBoard_number() {
        return board_number;
    }

    public void setBoard_number(int board_number) {
        this.board_number = board_number;
    }

    public String getBoard_name() {
        return board_name;
    }

    public void setBoard_name(String board_name) {
        this.board_name = board_name;
    }
}
