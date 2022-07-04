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
import java.util.ArrayList;
import model.*;

/**
 *
 * @author NCC
 */
public class OfficerFUDao {

    Connection cnn; //Kết nối CSDL

    public OfficerFUDao() {
        try {
            cnn = (new DBContext()).getConnection();
            System.out.println("COnnect successfully");
        } catch (Exception e) {
            System.out.println("Connect error:" + e.getMessage());
        }
    }

    public ArrayList<OfficerFU> getAll() {
        ArrayList<OfficerFU> listOfficerFU = new ArrayList<OfficerFU>();
        try {
            String sql = "  SELECT *\n"
                    + "  FROM [PRJ_G10].[dbo].[canBo] gv JOIN coSo cs ON gv.idCoSo = cs.idCoSo JOIN taiKhoan tk \n"
                    + "  ON gv.taiKhoanId = tk.taiKhoanId JOIN vaiTro vt ON tk.vaiTroId = vt.vaiTroId";
            PreparedStatement stm = cnn.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Campus campus = new Campus(rs.getInt("idCoSo"), rs.getNString("tenCoSo"), rs.getNString("diaChiCoSo"));
                Role role = new Role(rs.getInt("vaiTroId"), rs.getNString("tenVaiTro"));
                User user = new User(String.valueOf(rs.getInt("taiKhoanId")), role);
                OfficerFU officerFU = new OfficerFU(rs.getInt("canBoId"), rs.getNString("firstName"), rs.getNString("lastName"), rs.getBoolean("gioiTinh"),
                        rs.getNString("ngaySinh"), rs.getNString("soDienThoai"), rs.getNString("gmail"),
                        rs.getNString("diaChi"), campus, user);
                listOfficerFU.add(officerFU);
            }

        } catch (SQLException ex) {
            System.out.println("Loi OfficerFUDao getAll() " + ex);
        }
        return listOfficerFU;
    }

    public ArrayList<OfficerFU> getAllByInfo( String firt, String last) {
        ArrayList<OfficerFU> listOfficerFU = new ArrayList<OfficerFU>();
        try {
            String sql = "  SELECT *\n"
                    + "  FROM [PRJ_G10].[dbo].[canBo] gv JOIN coSo cs ON gv.idCoSo = cs.idCoSo JOIN taiKhoan tk \n"
                    + "  ON gv.taiKhoanId = tk.taiKhoanId JOIN vaiTro vt ON tk.vaiTroId = vt.vaiTroId"
                    + "WHERE gv.firstName like '%" + firt + "%' AND lastName like '%" + last + "%' ";
            PreparedStatement stm = cnn.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Campus campus = new Campus(rs.getInt("idCoSo"), rs.getNString("tenCoSo"), rs.getNString("diaChiCoSo"));
                Role role = new Role(rs.getInt("vaiTroId"), rs.getNString("tenVaiTro"));
                User user = new User(String.valueOf(rs.getInt("taiKhoanId")), role);
                OfficerFU officerFU = new OfficerFU(rs.getInt("canBoId"), rs.getNString("firstName"), rs.getNString("lastName"), rs.getBoolean("gioiTinh"),
                        rs.getNString("ngaySinh"), rs.getNString("soDienThoai"), rs.getNString("gmail"),
                        rs.getNString("diaChi"), campus, user);
                listOfficerFU.add(officerFU);
            }

        } catch (SQLException ex) {
            System.out.println("Loi OfficerFUDao getAll() " + ex);
        }
        return listOfficerFU;
    }
    
      public void deleteByid(String id) {
        try {
            String sql = "DELETE \n"
                    + "FROM canBo \n"
                    + "WHERE canBoId = " + id + "";
            PreparedStatement stm = cnn.prepareStatement(sql);
            stm.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Loi OfficerFUDao  deleteByid(String parameter) " + ex);
        }
    }

    public void updateById(String parameter) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
