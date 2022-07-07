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

    public ArrayList<OfficerFU> getAll( String cam) {
        ArrayList<OfficerFU> listOfficerFU = new ArrayList<OfficerFU>();
        try {
            String sql = "  SELECT *\n"
                    + "  FROM [PRJ_G10].[dbo].[canBo] gv JOIN coSo cs ON gv.idCoSo = cs.idCoSo JOIN taiKhoan tk \n"
                    + "  ON gv.taiKhoanId = tk.taiKhoanId JOIN vaiTro vt ON tk.vaiTroId = vt.vaiTroId "
                    + "WHERE  cs.idCoSo like '%" + cam + "%' ";
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

    public ArrayList<OfficerFU> getAllByInfo(String firt, String last, String cam) {
        ArrayList<OfficerFU> listOfficerFU = new ArrayList<OfficerFU>();
        try {
            String sql = "  SELECT *\n"
                    + "  FROM [PRJ_G10].[dbo].[canBo] gv JOIN coSo cs ON gv.idCoSo = cs.idCoSo JOIN taiKhoan tk \n"
                    + "  ON gv.taiKhoanId = tk.taiKhoanId JOIN vaiTro vt ON tk.vaiTroId = vt.vaiTroId "
                    + "WHERE gv.firstName like '%" + firt + "%' AND lastName like '%" + last + "%'   AND cs.idCoSo like '%" + cam + "%' ";
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
                System.out.println(sql);
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

    public void update(OfficerFU officerFU) {
        try {
            String sql = "UPDATE [dbo].[canBo]\n"
                    + "   SET [firstName] = '" + officerFU.getFirstName() + "' \n"
                    + "      ,[lastName] =  '" + officerFU.getLastName() + "' \n"
                    + "      ,[gioiTinh] =  ? \n"
                    + "      ,[ngaySinh] =  '" + officerFU.getDate() + "' \n"
                    + "      ,[soDienThoai] = '" + officerFU.getPhone() + "' \n"
                    + "      ,[gmail] =  '" + officerFU.getGmail() + "' \n"
                    + "      ,[diaChi] =  '" + officerFU.getAddress() + "' \n"
                    + "      ,[idCoSo] =  '" + officerFU.getCampus().getId() + "' \n"
                    + "      ,[taiKhoanId] =  " + officerFU.getUser().getId() + " \n"
                    + " WHERE [canBoId] = " + officerFU.getId() + " ";
            PreparedStatement stm = cnn.prepareStatement(sql);
            stm.setBoolean(1, officerFU.isGender());
            System.out.println(sql);
            stm.executeUpdate();

        } catch (SQLException ex) {
            System.out.println("Loi OfficerFUDao  update(OfficerFU officerFU)  " + ex);
        }
    }

    public OfficerFU getOfficerByID(String id) {
        OfficerFU officerFU = new OfficerFU();
        try {
            String sql = "SELECT * \n"
                    + "FROM [PRJ_G10].[dbo].[canBo] gv JOIN coSo cs ON gv.idCoSo = cs.idCoSo JOIN taiKhoan tk \n"
                    + "ON gv.taiKhoanId = tk.taiKhoanId JOIN vaiTro vt ON tk.vaiTroId = vt.vaiTroId "
                    + "WHERE gv.canBoId = " + id + " ";
            PreparedStatement stm = cnn.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Campus campus = new Campus(rs.getInt("idCoSo"), rs.getNString("tenCoSo"), rs.getNString("diaChiCoSo"));
                Role role = new Role(rs.getInt("vaiTroId"), rs.getNString("tenVaiTro"));
                User user = new User(String.valueOf(rs.getInt("taiKhoanId")), role);
                officerFU = new OfficerFU(rs.getInt("canBoId"), rs.getNString("firstName"), rs.getNString("lastName"), rs.getBoolean("gioiTinh"),
                        rs.getNString("ngaySinh"), rs.getNString("soDienThoai"), rs.getNString("gmail"), rs.getNString("diaChi"),
                        campus, user);
            }

            return officerFU;
        } catch (SQLException ex) {
            System.out.println("Loi OfficerFUDao getOfficerByID(String id)  " + ex);
        }
        return null;
    }

    public void insert(OfficerFU s) {
        String sql = "INSERT INTO [dbo].[canBo]\n"
                + "           ([firstName],[lastName],[gioiTinh],[ngaySinh],[soDienThoai],[gmail],[diaChi],[idCoSo],[taiKhoanId])\n"
                + "  VALUES(?,?,?,?,?,?,?,?,?);";
        try {
            PreparedStatement stm = cnn.prepareStatement(sql);

            stm.setString(1, s.getFirstName());
            stm.setString(2, s.getLastName());
            stm.setBoolean(3, s.isGender());
            stm.setString(4, s.getDate());
            stm.setString(5, s.getPhone());
            stm.setString(6, s.getGmail());
            stm.setString(7, s.getAddress());
            stm.setInt(8, s.getCampus().getId());
            stm.setInt(9, Integer.parseInt(s.getUser().getId()));
            stm.executeUpdate();
        } catch (Exception e) {
            System.out.println("Loi OfficerFUDao insert(OfficerFU s)  " + e);
        }
    }
}
