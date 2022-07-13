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

/**
 *
 * @author NCC
 */
public class Dao {

    String[] tb = {"sinhVien", "canBo", "giangVien", "phuHuynh", "quanTri"};
    Connection cnn; //Kết nối CSDL

    public Dao() {
        try {
            cnn = (new DBContext()).getConnection();
            System.out.println("COnnect successfully");
        } catch (Exception e) {
            System.out.println("Connect error:" + e.getMessage());
        }
    }

    public int checkMailExit(String maill) {
        try {

            for (String table : tb) {
                String sql = "SELECT *\n"
                        + "  FROM [PRJ_G10].[dbo].[" + table + "]\n"
                        + "  WHERE gmail = '" + maill.trim() + "' ";
                PreparedStatement stm = cnn.prepareStatement(sql);
                ResultSet rs = stm.executeQuery();
                while (rs.next()) {
                    return 1;
                }

            }

        } catch (SQLException ex) {
            System.err.println("Loi Dao checkMailExit(String maill) " + ex);
        }
        return -1;
    }

    public int checkPhoneExit(String phone) {
        try {
            for (String table : tb) {
                String sql = "SELECT *\n"
                        + " FROM [PRJ_G10].[dbo].[" + table + "]\n"
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
            }

        } catch (SQLException ex) {
            System.err.println("Loi Dao  checkPhoneExit(String phone) " + ex);
        }
        return -1;
    }

    public static void main(String[] args) {
        Dao d = new Dao();
        System.out.println(d.checkPhoneExit("0785469563"));
    }

}
