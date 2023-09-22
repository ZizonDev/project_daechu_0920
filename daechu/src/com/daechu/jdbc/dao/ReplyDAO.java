package com.daechu.jdbc.dao;

import com.daechu.jdbc.util.Common;
import com.daechu.jdbc.vo.ReplyVO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ReplyDAO {
    public List<ReplyVO> SelectReply() {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        List<ReplyVO> list = new ArrayList<>();
        try {
            conn = Common.getConnection();
            stmt = conn.createStatement();
            String query = "SELECT * FROM REPLY";
            rs = stmt.executeQuery(query);

            while(rs.next()) {
                int comment_num = rs.getInt("COMMENT_NUM");
                int wrt_num = rs.getInt("WRT_NUM");
                String comment_con = rs.getString("COMMENT_CON");
                String user_id = rs.getString("USER_ID");

                ReplyVO vo = new ReplyVO(comment_num, wrt_num, comment_con, user_id);
                vo.setComment_num(comment_num);
                vo.setWrt_num(wrt_num);
                vo.setComment_con(comment_con);
                vo.setUser_id(user_id);

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