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
public class studentParentsDao {

    Connection cnn; //Kết nối CSDL

    public studentParentsDao() {
        try {
            cnn = (new DBContext()).getConnection();
            System.out.println("COnnect successfully");
        } catch (Exception e) {
            System.out.println("Connect error:" + e.getMessage());
        }
    }

    public ArrayList<StudentParents> getAll(String idCam) {
        StudentDao studentDao = new StudentDao();
        ArrayList<StudentParents> listStudentParents = new ArrayList<StudentParents>();
        try {
            String sql = "SELECT *\n"
                    + "FROM [PRJ_G10].[dbo].[phuHuynh] s\n"
                    + " JOIN coSo cs ON s.idCoSo = cs.idCoSo JOIN taiKhoan tk ON s.taiKhoanId = tk.taiKhoanId JOIN sinhVien sv ON s.sinhVienId = sv.sinhVienId "
                    + "WHERE  cs.idCoSo like '%" + idCam + "%' ";
            PreparedStatement stm = cnn.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Campus campus = new Campus(rs.getInt("idCoSo"), rs.getNString("tenCoSo"), rs.getNString("diaChiCoSo"),
                        rs.getDate("dateStartCS") == null ? "null" : String.valueOf(rs.getDate("dateStartCS")), rs.getDate("dateEndCS") == null ? "null" : String.valueOf(rs.getDate("dateEndCS")));
                User user = new User(String.valueOf(rs.getInt("taiKhoanId")));
                Student student = studentDao.getStudentByidStudent(rs.getInt("sinhVienId"));
                StudentParents studentParents = new StudentParents(rs.getInt("phuHuynhId"), rs.getNString("firstName"), rs.getNString("lastName"), rs.getBoolean("gioiTinh"),
                        rs.getString("ngaySinh"), rs.getString("soDienThoai"), rs.getString("gmail"), rs.getString("diaChiSV"), campus, user, student);
                listStudentParents.add(studentParents);
            }
            return listStudentParents;
        } catch (SQLException ex) {
            System.err.println("Loi studentParentsDao getAll() " + ex);
        }
        return null;
    }

    public ArrayList<StudentParents> getAllByInfo(String firt, String last, String cam) {
        StudentDao studentDao = new StudentDao();
        ArrayList<StudentParents> listStudentParents = new ArrayList<StudentParents>();
        try {
            String sql = "SELECT *\n"
                    + "FROM [PRJ_G10].[dbo].[phuHuynh] s\n"
                    + " JOIN coSo cs ON s.idCoSo = cs.idCoSo JOIN taiKhoan tk ON s.taiKhoanId = tk.taiKhoanId JOIN sinhVien sv ON s.sinhVienId = sv.sinhVienId "
                    + "WHERE s.firstName like '%" + firt + "%' AND s.lastName like '%" + last + "%'   AND cs.idCoSo like '%" + cam + "%' ";
            PreparedStatement stm = cnn.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Campus campus = new Campus(rs.getInt("idCoSo"), rs.getNString("tenCoSo"), rs.getNString("diaChiCoSo"),
                        rs.getDate("dateStartCS") == null ? "null" : String.valueOf(rs.getDate("dateStartCS")), rs.getDate("dateEndCS") == null ? "null" : String.valueOf(rs.getDate("dateEndCS")));
                User user = new User(String.valueOf(rs.getInt("taiKhoanId")));
                Student student = studentDao.getStudentByidStudent(rs.getInt("sinhVienId"));
                StudentParents studentParents = new StudentParents(rs.getInt("phuHuynhId"), rs.getNString("firstName"), rs.getNString("lastName"), rs.getBoolean("gioiTinh"),
                        rs.getString("ngaySinh"), rs.getString("soDienThoai"), rs.getString("gmail"), rs.getString("diaChiSV"), campus, user, student);
                listStudentParents.add(studentParents);
            }
            return listStudentParents;
        } catch (SQLException ex) {
            System.err.println("Loi studentParentsDao getAll() " + ex);
        }
        return null;

    }

    public StudentParents getStudentParentsByIdStudent(String id) {
        StudentDao studentDao = new StudentDao();
        try {
            String sql = "SELECT *\n"
                    + "FROM [PRJ_G10].[dbo].[phuHuynh] s\n"
                    + " JOIN coSo cs ON s.idCoSo = cs.idCoSo JOIN taiKhoan tk ON s.taiKhoanId = tk.taiKhoanId "
                    + "WHERE s.sinhVienId = " + id + "";
            PreparedStatement stm = cnn.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Campus campus = new Campus(rs.getInt("idCoSo"), rs.getNString("tenCoSo"), rs.getNString("diaChiCoSo"),
                        rs.getDate("dateStartCS") == null ? "null" : String.valueOf(rs.getDate("dateStartCS")), rs.getDate("dateEndCS") == null ? "null" : String.valueOf(rs.getDate("dateEndCS")));
                User user = new User(String.valueOf(rs.getInt("taiKhoanId")));
                Student student = studentDao.getStudentByidStudent(rs.getInt("sinhVienId"));
                StudentParents studentParents = new StudentParents(rs.getInt("phuHuynhId"), rs.getNString("firstName"), rs.getNString("lastName"), rs.getBoolean("gioiTinh"),
                        rs.getString("ngaySinh"), rs.getString("soDienThoai"), rs.getString("gmail"), rs.getString("diaChi"), campus, user, student);
                return studentParents;
            }

        } catch (SQLException ex) {
            System.err.println("Loi studentParentsDao getAll() " + ex);
        }
        return null;
    }

    public void deleteByid(String id) {
        try {
            String sql = "DELETE \n"
                    + "FROM phuHuynh \n"
                    + "WHERE phuHuynhId = " + id + "";
            PreparedStatement stm = cnn.prepareStatement(sql);
            stm.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Loi studentParentsDao  deleteByid(String parameter) " + ex);
        }

    }

}
