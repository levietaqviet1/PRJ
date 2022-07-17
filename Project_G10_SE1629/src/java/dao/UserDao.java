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
                    + "  WHERE taiKhoan = ? AND matKhau = ?  AND vaiTroId = ? ";
            PreparedStatement stm = cnn.prepareStatement(sql);
            try {
                stm.setString(1, SHA_256.MySHA256(user.getUsername()));
                stm.setString(2, SHA_256.MySHA256(user.getPassword() + "vietthuhieu"));
                stm.setInt(3, user.getRole().getId());
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

    public int checkPassWordById(User user) {
        try {
            String sql = "SELECT *\n"
                    + "FROM [PRJ_G10].[dbo].[taiKhoan]\n"
                    + "WHERE taiKhoanId = ? \n"
                    + "AND matKhau = ? ";
            PreparedStatement stm = cnn.prepareStatement(sql);
            try {
                stm.setString(1, user.getId());
                stm.setString(2, SHA_256.MySHA256(user.getPassword() + "vietthuhieu"));
            } catch (Exception e) {
            }
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                return 1;
            }

        } catch (SQLException ex) {
            System.out.println("Loi UserDao " + ex);
        }
        return -1;

    }

    public void insertUser(User user, String role) {
        String sql = "INSERT INTO taiKhoan(taiKhoan,matKhau,vaiTroId)\n"
                + "  VALUES	(?, ?,"+role+")";
        try {
            PreparedStatement stm = cnn.prepareStatement(sql);
            try {
                stm.setString(1, SHA_256.MySHA256(user.getUsername()));
                stm.setString(2, SHA_256.MySHA256(user.getPassword() + "vietthuhieu"));
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
                stm.setString(1, SHA_256.MySHA256(user.getPassword() + "vietthuhieu"));
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

    public void deleteByid(String id) {
        try {
            String sql = "DELETE \n"
                    + "FROM taiKhoan \n"
                    + "WHERE taiKhoanId = " + id + " ";
            PreparedStatement stm = cnn.prepareStatement(sql);
            stm.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Loi TeacherDao  UserDao (String parameter) " + ex);
        }
    }

    public void updateRoleById(String id, int slRole) {
         String sql = "UPDATE taiKhoan\n"
                + "SET vaiTroId = ? \n"
                + "WHERE [taiKhoanId] = ? ";
        try {
            PreparedStatement stm = cnn.prepareStatement(sql);
            try {
                stm.setInt(1, slRole);
                stm.setString(2, id);
            } catch (Exception e) {
            }
            stm.executeUpdate();
        } catch (Exception e) {
            System.out.println("Loi UserDao updateRoleById(String id, int slRole) " + e);
        }
    }
}
