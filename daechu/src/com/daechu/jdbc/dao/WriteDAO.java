package com.daechu.jdbc.dao;

import com.daechu.jdbc.util.Common;
import com.daechu.jdbc.vo.WriteVO;

import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class WriteDAO {
    public List<WriteVO> SelectWrite() {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        List<WriteVO> list = new ArrayList<>();
        try {
            conn = Common.getConnection();
            stmt = conn.createStatement();
            String query = "SELECT * FROM WRITE";
            rs = stmt.executeQuery(query);

            while(rs.next()) {
                int wrt_num = rs.getInt("WRT_NUM");
                String board_name = rs.getString("BOARD_NAME");
                String title = rs.getString("TITLE");
                String contents = rs.getString("CONTENTS");
                Date wrt_date = rs.getDate("WRT_DATE");
                String user_id = rs.getString("USER_ID");

                WriteVO vo = new WriteVO(wrt_num, board_name, title, contents, wrt_date, user_id);
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
