/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import MyUntils.SHA_256;
import connect.*;
import java.sql.*;
import java.util.ArrayList;
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
                    + "  FROM [PRJ_G10].[dbo].[sinhVien] s JOIN chuyenNganh cn "
                    + "ON s.idChuyenNganh = cn.idChuyenNganh JOIN coSo cs ON s.idCoSo = cs.idCoSo JOIN trangThai tt ON s.trangThaiId = tt.trangThaiId \n"
                    + "WHERE s.taiKhoanId = ? AND cs.idCoSo = ? ";
            PreparedStatement stm = cnn.prepareStatement(sql);
            stm.setInt(1, checkU);
            stm.setString(2, campusup_login);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Specializedin specializedin = new Specializedin(rs.getInt(17), rs.getString(18), rs.getString(19), String.valueOf(rs.getDate(20)), String.valueOf(rs.getDate(21)));
                Campus campus = new Campus(rs.getInt(22), rs.getString(23), rs.getString(24), String.valueOf(rs.getDate(25)), String.valueOf(rs.getDate(26)));
                Status status = new Status(rs.getInt(27), rs.getString(28));
                User user = new User(rs.getString(12), "", "");
                return new Student(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getBoolean(4), rs.getString(5),
                        rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(13), rs.getString(14),
                        specializedin, campus, status, rs.getBytes(15), rs.getString(16), user);
            }

        } catch (SQLException ex) {
            System.out.println("Loi StudentDao " + ex);
        }
        return null;
    }

    public ArrayList<Student> getAll(String st) {
        ArrayList<Student> listStudent = new ArrayList<Student>();
        try {
            String sql = " SELECT *\n"
                    + "FROM [PRJ_G10].[dbo].[sinhVien] s JOIN chuyenNganh cn \n"
                    + "ON s.idChuyenNganh = cn.idChuyenNganh JOIN coSo cs ON s.idCoSo = cs.idCoSo JOIN trangThai tt ON s.trangThaiId = tt.trangThaiId "
                    + "WHERE  s.trangThaiId like '%" + st + "%' ";
            PreparedStatement stm = cnn.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Specializedin specializedin = new Specializedin(rs.getInt("idChuyenNganh"), rs.getNString("tenChuyenNganh"), rs.getString("codeChuyenNganh"),
                        rs.getDate("dateStartCN") == null ? "null" : String.valueOf(rs.getDate("dateStartCN")), rs.getDate("dateEndCN") == null ? "null" : String.valueOf(rs.getDate("dateEndCN")));
                Campus campus = new Campus(rs.getInt("idCoSo"), rs.getNString("tenCoSo"), rs.getNString("diaChiCoSo"),
                        rs.getDate("dateStartCS") == null ? "null" : String.valueOf(rs.getDate("dateStartCS")), rs.getDate("dateEndCS") == null ? "null" : String.valueOf(rs.getDate("dateEndCS")));
                Status status = new Status(rs.getInt("trangThaiId"), rs.getNString("tenTrangThai"));
                Student student = new Student(rs.getInt("sinhVienId"), rs.getNString("firstName"), rs.getNString("lastName"), rs.getBoolean("gioiTinh"),
                        rs.getString("ngaySinh"), rs.getString("soDienThoai"), rs.getString("gmail"), rs.getString("diaChiSV"),
                        rs.getDate("batDauTuSV") == null ? "null" : String.valueOf(rs.getDate("batDauTuSV")), rs.getString("ketThucNgaySV"),
                        specializedin, campus, status, rs.getString("MSSV"));
                listStudent.add(student);
            }
            return listStudent;
        } catch (SQLException ex) {
            System.err.println("Loi StudentDao getAll() " + ex);
        }
        return null;
    }

    public ArrayList<Student> getAllByInfo(String frist, String last, String st) {
        ArrayList<Student> listStudent = new ArrayList<Student>();
        try {
            String sql = " SELECT *\n"
                    + "FROM [PRJ_G10].[dbo].[sinhVien] s JOIN chuyenNganh cn \n"
                    + "ON s.idChuyenNganh = cn.idChuyenNganh JOIN coSo cs ON s.idCoSo = cs.idCoSo JOIN trangThai tt ON s.trangThaiId = tt.trangThaiId "
                    + "WHERE s.firstName like '%" + frist + "%' AND s.lastName like '%" + last + "%'  AND s.trangThaiId like '%" + st + "%' ";
            PreparedStatement stm = cnn.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Specializedin specializedin = new Specializedin(rs.getInt("idChuyenNganh"), rs.getNString("tenChuyenNganh"), rs.getString("codeChuyenNganh"),
                        rs.getDate("dateStartCN") == null ? "null" : String.valueOf(rs.getDate("dateStartCN")), rs.getDate("dateEndCN") == null ? "null" : String.valueOf(rs.getDate("dateEndCN")));
                Campus campus = new Campus(rs.getInt("idCoSo"), rs.getNString("tenCoSo"), rs.getNString("diaChiCoSo"),
                        rs.getDate("dateStartCS") == null ? "null" : String.valueOf(rs.getDate("dateStartCS")), rs.getDate("dateEndCS") == null ? "null" : String.valueOf(rs.getDate("dateEndCS")));
                Status status = new Status(rs.getInt("trangThaiId"), rs.getNString("tenTrangThai"));
                Student student = new Student(rs.getInt("sinhVienId"), rs.getNString("firstName"), rs.getNString("lastName"), rs.getBoolean("gioiTinh"),
                        rs.getString("ngaySinh"), rs.getString("soDienThoai"), rs.getString("gmail"), rs.getString("diaChiSV"),
                        rs.getDate("batDauTuSV") == null ? "null" : String.valueOf(rs.getDate("batDauTuSV")), rs.getString("ketThucNgaySV"),
                        specializedin, campus, status, rs.getString("MSSV"));
                listStudent.add(student);
            }
            System.out.println(sql);
            return listStudent;
        } catch (SQLException ex) {
            System.err.println("Loi StudentDao getAllByInfo(String frist, String last) " + ex);
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
            System.err.println("Loi StudentDao checkMailExit(String maill) " + ex);
        }
        return -1;
    }

    public int checkPhoneExit(String phone) {
        try {

            String sql = "SELECT *\n"
                    + "  FROM [PRJ_G10].[dbo].[sinhVien]\n"
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
            System.err.println("Loi StudentDao  checkPhoneExit(String phone) " + ex);
        }
        return -1;
    }

    public int checkInforStudent(Student s) {
        try {
            String gen = s.isGender() ? "1" : "0";
            String sql = "SELECT *\n"
                    + "FROM [PRJ_G10].[dbo].[sinhVien]\n"
                    + "WHERE \n"
                    + "firstName = '" + s.getFirstName() + "' AND lastName = '" + s.getLastName() + "'\n"
                    + "AND ngaySinh = '" + s.getDateOfBirth() + "' \n"
                    + "AND gioiTinh = " + gen + " \n"
                    + "AND gmail = '" + s.getGmail() + "' \n"
                    + "AND idChuyenNganh = " + s.getSpecializedin().getId() + " \n"
                    + "AND idCoSo = " + s.getCampus().getId() + " \n"
                    + "AND taiKhoanId = " + s.getUser().getId() + " \n";
            PreparedStatement stm = cnn.prepareStatement(sql);

            ResultSet rs = stm.executeQuery();
            System.out.println(sql);
            while (rs.next()) {
                return 1;
            }

        } catch (SQLException ex) {
            System.out.println("Loi StudentDao " + ex);
        }
        System.out.println();
        return -1;
    }

    public String getMssv(String t) {
        int count = 0;
        String relust = "";
        try {

            String sql = "SELECT TOP (1)[MSSV]\n"
                    + "  FROM [PRJ_G10].[dbo].[sinhVien]\n"
                    + "   WHERE MSSV like '" + t + "%'\n"
                    + "   ORDER BY MSSV DESC";
            PreparedStatement stm = cnn.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                relust = rs.getString(1);
            }
            if (relust.equals("")) {
                return t + "000001";
            } else {
                int i = Integer.parseInt(relust.substring(2, relust.length()));
                i++;
                String iN = String.valueOf(i);
                count = iN.length();
                while (count < 6) {
                    iN = "0" + iN;
                    count = iN.length();
                }
                return t += iN;
            }

        } catch (SQLException ex) {
            System.out.println("Loi StudentDao " + ex);
        }

        return relust;
    }

    public static void main(String[] args) {
        StudentDao s = new StudentDao();
        System.out.println(s.getMssv("QT"));

    }

    public void insertStudent(Student s) {
        String sql = "INSERT INTO [dbo].[sinhVien] "
                + "( [firstName], [lastName], [gioiTinh], [ngaySinh], [soDienThoai], [gmail], "
                + "[diaChiSV], [idChuyenNganh], [idCoSo], [trangThaiId], [taiKhoanId], [batDauTuSV], [ketThucNgaySV], [imgData], [MSSV]) \n"
                + "   VALUES "
                + "( ?, ?, ?, ?, ?, ?, ?, ?, ?, 1, ?, GETDATE(), ?, ?, ?)";
        try {
            PreparedStatement stm = cnn.prepareStatement(sql);

            stm.setString(1, s.getFirstName());
            stm.setString(2, s.getLastName());
            stm.setBoolean(3, s.isGender());
            stm.setString(4, s.getDateOfBirth());
            stm.setString(5, s.getPhone());
            stm.setString(6, s.getGmail());
            stm.setString(7, s.getAddress());
            stm.setInt(8, s.getSpecializedin().getId());
            stm.setInt(9, s.getCampus().getId());
            stm.setInt(10, Integer.parseInt(s.getUser().getId()));
            stm.setString(11, s.getDateOfEnd());
            stm.setBytes(12, s.getImgStudent());
            stm.setString(13, s.getCodeStudent());
            stm.executeUpdate();
        } catch (Exception e) {
            System.out.println("Loi StudentDao insertStudent(Student s)  " + e);
        }
    }

    public void updateById(String parameter) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void deleteByid(String id) {
        try {
            String sql = "DELETE \n"
                    + "FROM sinhVien \n"
                    + "WHERE sinhVienId = " + id + "";
            PreparedStatement stm = cnn.prepareStatement(sql);
            stm.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Loi StudentDao  deleteByid(String parameter) " + ex);
        }
    }

}
