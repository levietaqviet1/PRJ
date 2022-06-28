/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import MyUntils.SHA_256;
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
            try {
                stm.setString(1, SHA_256.MySHA256(user.getUsername()));
                stm.setString(2, SHA_256.MySHA256(user.getUsername() + user.getPassword()));
            } catch (Exception e) {
            }
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                return rs.getInt("taiKhoanId");
            }

        } catch (SQLException ex) {
            System.out.println("Loi UserDao " + ex);
        }
        return -1;

    }

    public int checkAccountUser(String account) {
        try {
            String sql = "SELECT *\n"
                    + "  FROM [PRJ_G10].[dbo].[taiKhoan]\n"
                    + "  WHERE taiKhoan = ? ";
            PreparedStatement stm = cnn.prepareStatement(sql);
            try {
                stm.setString(1, SHA_256.MySHA256(account));
            } catch (Exception e) {
            }
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                return rs.getInt(1);
            }

        } catch (SQLException ex) {
            System.out.println("Loi UserDao " + ex);
        }
        return -1;

    }

    public void insertUserStudent(User user) {
        String sql = "INSERT INTO taiKhoan(taiKhoan,matKhau,vaiTroId)\n"
                + "  VALUES	(?, ?,2)";
        try {
            PreparedStatement stm = cnn.prepareStatement(sql);
            try {
                stm.setString(1, SHA_256.MySHA256(user.getUsername()));
                stm.setString(2, SHA_256.MySHA256(user.getUsername() + user.getPassword()));
            } catch (Exception e) {
            }
            stm.executeUpdate();
        } catch (Exception e) {
            System.out.println("Loi UserDao " + e);
        }
    }

    public void updateUserPass(User user) {
        String sql = "UPDATE taiKhoan\n"
                + "SET matKhau = ? \n"
                + "WHERE [taiKhoanId] = ? ";
        try {
            PreparedStatement stm = cnn.prepareStatement(sql);
            try {
                stm.setString(1, SHA_256.MySHA256(user.getUsername() + user.getPassword()));
                stm.setString(2, user.getId());
            } catch (Exception e) {
            }
            stm.executeUpdate();
        } catch (Exception e) {
            System.out.println("Loi UserDao " + e);
        }
    }

    public int getIdAccount() {
        try {
            String sql = "SELECT TOP (1) [taiKhoanId] \n"
                    + "  FROM [PRJ_G10].[dbo].[taiKhoan] \n"
                    + "  ORDER BY [taiKhoanId] DESC";
            PreparedStatement stm = cnn.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                return rs.getInt(1);
            }

        } catch (SQLException ex) {
            System.out.println("Loi UserDao " + ex);
        }

        return 1;

    }

    public static void main(String[] args) {
        UserDao u = new UserDao();
//        User us = new User("admin", "123789");
//        u.insertUserStudent(us);
        System.out.println(u.checkAccountUser("vietlSE1115"));

    }
}
