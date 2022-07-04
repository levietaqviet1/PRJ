/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import connect.DBContext;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.BQT;
import model.*;

/**
 *
 * @author NCC
 */
public class BqtDao {

    Connection cnn; //Kết nối CSDL

    public BqtDao() {
        try {
            cnn = (new DBContext()).getConnection();
            System.out.println("COnnect successfully");
        } catch (Exception e) {
            System.out.println("Connect error:" + e.getMessage());
        }
    }

    public BQT getBqt(int checkU, String campusup_login) {
        try {
            String sql = "SELECT *\n"
                    + "FROM [PRJ_G10].[dbo].[quanTri] qt JOIN coSo c ON qt.idCoSo = c.idCoSo\n"
                    + "WHERE qt.taiKhoanId = ? AND c.idCoSo = ? ";
            PreparedStatement stm = cnn.prepareStatement(sql);
            stm.setInt(1, checkU);
            stm.setString(2, campusup_login);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Campus campus = new Campus(rs.getInt("idCoSo"), rs.getNString("tenCoSo"), "", "", "");
                User user = new User(String.valueOf(rs.getInt("taiKhoanId")));
                return new BQT(rs.getInt("quanTriId"), rs.getNString("firstName"), rs.getNString("lastName"), rs.getBoolean("gioiTinh"), rs.getNString("ngaySinh"),
                         rs.getNString("soDienThoai"), rs.getNString("gmail"), rs.getNString("diaChi"), campus, user);
            }

        } catch (SQLException ex) {
            System.out.println("Loi BqtDao " + ex);
        }
        return null;
    }
    
       public int checkInforBQT(BQT b) {
        try {
            String gen = b.isGender() ? "1" : "0";
            String sql = "SELECT *\n"
                    + "FROM [PRJ_G10].[dbo].[quanTri]\n"
                    + "WHERE \n"
                    + "firstName = '" + b.getFirstName() + "' AND lastName = '" + b.getLastName() + "'\n"
                    + "AND ngaySinh = '" + b.getDate() + "' \n"
                    + "AND gioiTinh = " + gen + " \n"
                    + "AND gmail = '" + b.getGmail() + "' \n"
                    + "AND idCoSo = " + b.getCampus().getId() + " \n"
                    + "AND taiKhoanId = " + b.getUser().getId() + " \n";
            PreparedStatement stm = cnn.prepareStatement(sql);

            ResultSet rs = stm.executeQuery();
            System.out.println(sql);
            while (rs.next()) {
                return 1;
            }

        } catch (SQLException ex) {
            System.out.println("Loi BqtDao checkInforBQT(BQT b) " + ex);
        }
        System.out.println();
        return -1;
    }

    public int checkPhoneExit(String phone) {
        try {

            String sql = "SELECT *\n"
                    + "  FROM [PRJ_G10].[dbo].[quanTri]\n"
                    + "  WHERE soDienThoai = ? OR soDienThoai = ?";
            PreparedStatement stm = cnn.prepareStatement(sql);
            if (String.valueOf(phone.charAt(0)).equals("+")) {
                phone = "0" + phone.substring(3, phone.length());
            }

            stm.setString(1, phone);
            stm.setString(2, "+84" + phone.substring(1, phone.length()));
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                return 1;
            }

        } catch (SQLException ex) {
            System.err.println("Loi BqtDao  checkPhoneExit(String phone) " + ex);
        }
        return -1;
    }
}
