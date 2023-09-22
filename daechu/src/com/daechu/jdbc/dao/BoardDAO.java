package com.daechu.jdbc.dao;

import com.daechu.jdbc.util.Common;
import com.daechu.jdbc.vo.BoardVO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class BoardDAO {
    public List<BoardVO> listBoard() {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        List<BoardVO> list = new ArrayList<>();
        try {
            conn = Common.getConnection();
            stmt = conn.createStatement();
            String query = "SELECT * FROM BOARD";
            rs = stmt.executeQuery(query);

            while(rs.next()) {
                int board_number = rs.getInt("BOARD_NUMBER");
                String board_name = rs.getString("BOARD_NAME");

                BoardVO vo = new BoardVO();
                vo.setBoard_number(board_number);
                vo.setBoard_name(board_name);

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
