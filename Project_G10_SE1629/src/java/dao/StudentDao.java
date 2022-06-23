/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import connect.*;
import java.sql.*;
import model.*;

/**
 *
 * @author NCC
 */
public class StudentDao {

    Connection cnn; //Kết nối CSDL

    public StudentDao() {
        try {
            cnn = (new DBContext()).getConnection();
            System.out.println("COnnect successfully");
        } catch (Exception e) {
            System.out.println("Connect error:" + e.getMessage());
        }
    }

    public Student getStudent(int checkU, String campusup_login) {
        try {
            String sql = "SELECT *\n"
                    + "  FROM [PRJ_G10].[dbo].[sinhVien] s JOIN chuyenNganh cn ON s.idChuyenNganh = cn.idChuyenNganh JOIN coSo cs ON s.idCoSo = cs.idCoSo JOIN trangThai tt ON s.trangThaiId = tt.trangThaiId \n"
                    + "  WHERE s.taiKhoanId = ? AND cs.idCoSo = ? ";
            PreparedStatement stm = cnn.prepareStatement(sql);
            stm.setInt(1, checkU);
            stm.setString(2, campusup_login);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Specializedin specializedin = new Specializedin(rs.getInt(16), rs.getString(17), rs.getString(18), String.valueOf(rs.getDate(19)), String.valueOf(rs.getDate(20)));
                Campus campus = new Campus(rs.getInt(21), rs.getString(22), rs.getString(23), String.valueOf(rs.getDate(24)), String.valueOf(rs.getDate(25)));
                Status status = new Status(rs.getInt(26), rs.getString(27));
                return new Student(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getBoolean(4), rs.getString(5),
                        rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(13), rs.getString(14),
                        specializedin, campus, status, rs.getBytes(15));
            }

        } catch (SQLException ex) {
            System.out.println("Loi StudentDao " + ex);
        }
        return null;
    }

    public int checkMailExit(String maill) {
        try {
            String sql = "SELECT *\n"
                    + "  FROM [PRJ_G10].[dbo].[sinhVien]\n"
                    + "  WHERE gmail = ? ";
            PreparedStatement stm = cnn.prepareStatement(sql);
            stm.setString(1, maill);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                return 1;
            }

        } catch (SQLException ex) {
            System.out.println("Loi StudentDao " + ex);
        }
        return -1;
    }

    public int checkPhoneExit(String phone) {
        try {
            String sql = "SELECT *\n"
                    + "  FROM [PRJ_G10].[dbo].[sinhVien]\n"
                    + "  WHERE soDienThoai = ? OR soDienThoai = ?";
            PreparedStatement stm = cnn.prepareStatement(sql);
            stm.setString(1, phone);
            stm.setString(2, "+84"+phone.substring(1,phone.length()));
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                return 1;
            }

        } catch (SQLException ex) {
            System.out.println("Loi StudentDao " + ex);
        }
        return -1;
    }

    public static void main(String[] args) {
        StudentDao s = new StudentDao();

    }

}
