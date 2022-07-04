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
import model.Campus;
import model.Role;
import model.Teacher;
import model.User;

/**
 *
 * @author NCC
 */
public class TeacherDao {

    Connection cnn; //Kết nối CSDL

    public TeacherDao() {
        try {
            cnn = (new DBContext()).getConnection();
            System.out.println("COnnect successfully");
        } catch (Exception e) {
            System.out.println("Connect error:" + e.getMessage());
        }
    }

    public ArrayList<Teacher> getAll() {
        ArrayList<Teacher> listTeacher = new ArrayList<Teacher>();
        try {
            String sql = "SELECT * \n"
                    + "FROM [PRJ_G10].[dbo].[giangVien] gv JOIN coSo cs ON gv.idCoSo = cs.idCoSo JOIN taiKhoan tk \n"
                    + "ON gv.taiKhoanId = tk.taiKhoanId JOIN vaiTro vt ON tk.vaiTroId = vt.vaiTroId";
            PreparedStatement stm = cnn.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Campus campus = new Campus(rs.getInt("idCoSo"), rs.getNString("tenCoSo"), rs.getNString("diaChiCoSo"));
                Role role = new Role(rs.getInt("vaiTroId"), rs.getNString("tenVaiTro"));
                User user = new User(String.valueOf(rs.getInt("taiKhoanId")), role);
                Teacher teacher = new Teacher(rs.getInt("giangVienId"), rs.getNString("firstName"), rs.getNString("lastName"), rs.getBoolean("gioiTinh"),
                        rs.getNString("ngaySinh"), rs.getNString("ngayBatDauLamViec"), rs.getNString("ngayNghiLam"),
                        rs.getNString("soDienThoai"), rs.getNString("gmail"), rs.getNString("diaChi"),
                        campus, user);
                listTeacher.add(teacher);
            }

        } catch (SQLException ex) {
            System.out.println("Loi TeacherDao getAll(int i) " + ex);
        }
        return listTeacher;

    }

    public ArrayList<Teacher> getAllByInfo( String firt, String last) {
        ArrayList<Teacher> listTeacher = new ArrayList<Teacher>();
        try {
            String sql = "SELECT * \n"
                    + "FROM [PRJ_G10].[dbo].[giangVien] gv JOIN coSo cs ON gv.idCoSo = cs.idCoSo JOIN taiKhoan tk \n"
                    + "ON gv.taiKhoanId = tk.taiKhoanId JOIN vaiTro vt ON tk.vaiTroId = vt.vaiTroId "
                    + "WHERE gv.firstName like '%" + firt + "%' AND lastName like '%" + last + "%' ";
            PreparedStatement stm = cnn.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Campus campus = new Campus(rs.getInt("idCoSo"), rs.getNString("tenCoSo"), rs.getNString("diaChiCoSo"));
                Role role = new Role(rs.getInt("vaiTroId"), rs.getNString("tenVaiTro"));
                User user = new User(String.valueOf(rs.getInt("taiKhoanId")), role);
                Teacher teacher = new Teacher(rs.getInt("giangVienId"), rs.getNString("firstName"), rs.getNString("lastName"), rs.getBoolean("gioiTinh"),
                        rs.getNString("ngaySinh"), rs.getNString("ngayBatDauLamViec"), rs.getNString("ngayNghiLam"),
                        rs.getNString("soDienThoai"), rs.getNString("gmail"), rs.getNString("diaChi"),
                        campus, user);
                listTeacher.add(teacher);
            }

        } catch (SQLException ex) {
            System.out.println("Loi TeacherDao getAllByInfo(int i, String firt, String last) " + ex);
        }
        return listTeacher;

    }

    public void updateById(String parameter) {

    }

    public void deleteByid(String id) {
        try {
            String sql = "DELETE \n"
                    + "FROM giangVien \n"
                    + "WHERE giangVienId = " + id + "";
            PreparedStatement stm = cnn.prepareStatement(sql);
            stm.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Loi TeacherDao  deleteByid(String parameter) " + ex);
        }
    }
}
