/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import connect.*;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.User;

/**
 *
 * @author NCC
 */
public class UserDao {

    Connection cnn; //Kết nối CSDL

    public UserDao() {
        try {
            cnn = (new DBContext()).getConnection();
            System.out.println("COnnect successfully");
        } catch (Exception e) {
            System.out.println("Connect error:" + e.getMessage());
        }
    }

    public int checkUser(User user) {
        try {
            String sql = "SELECT *\n"
                    + "  FROM [PRJ_G10].[dbo].[taiKhoan]\n"
                    + "  WHERE taiKhoan = ? AND matKhau = ?";
            PreparedStatement stm = cnn.prepareStatement(sql);
            stm.setString(1, user.getUsername());
            stm.setString(2, user.getPassword());
            ResultSet rs = stm.executeQuery();
           while(rs.next()) {
                return rs.getInt("taiKhoanId");
            }

        } catch (SQLException ex) {
            System.out.println("Loi UserDao " + ex);
        }
        return -1;

    }
}
