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
                return  new BQT(rs.getInt("quanTriId"), rs.getNString("firstName"), rs.getNString("lastName"), rs.getBoolean("gioiTinh") , rs.getNString("ngaySinh")
                        , rs.getNString("soDienThoai"), rs.getNString("gmail"), rs.getNString("diaChi"), campus, user);
            }

        } catch (SQLException ex) {
            System.out.println("Loi StudentDao " + ex);
        }
        return null;
    }
}
