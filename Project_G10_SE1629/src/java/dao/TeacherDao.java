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

    public ArrayList<Teacher> getAll( String a) {
        ArrayList<Teacher> listTeacher = new ArrayList<Teacher>();
        try {
            String sql = "SELECT * \n"
                    + "FROM [PRJ_G10].[dbo].[giangVien] gv JOIN coSo cs ON gv.idCoSo = cs.idCoSo JOIN taiKhoan tk \n"
                    + "ON gv.taiKhoanId = tk.taiKhoanId JOIN vaiTro vt ON tk.vaiTroId = vt.vaiTroId "
                    + "WHERE gv.activeGv like '%" + a + "%'";
            PreparedStatement stm = cnn.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Campus campus = new Campus(rs.getInt("idCoSo"), rs.getNString("tenCoSo"), rs.getNString("diaChiCoSo"));
                Role role = new Role(rs.getInt("vaiTroId"), rs.getNString("tenVaiTro"));
                User user = new User(String.valueOf(rs.getInt("taiKhoanId")), role);
                Teacher teacher = new Teacher(rs.getInt("giangVienId"), rs.getNString("firstName"), rs.getNString("lastName"), rs.getBoolean("gioiTinh"),
                        rs.getNString("ngaySinh"), rs.getNString("ngayBatDauLamViec"), rs.getNString("ngayNghiLam"),
                        rs.getNString("soDienThoai"), rs.getNString("gmail"), rs.getNString("diaChi"),
                        campus, user, rs.getString("maGiangVien"), rs.getBoolean("activeGV"));
                listTeacher.add(teacher);
            }

        } catch (SQLException ex) {
            System.out.println("Loi TeacherDao getAll(int i) " + ex);
        }
        return listTeacher;

    }

    public ArrayList<Teacher> getAllByInfo(String firt, String last, String cam , String a) {
        ArrayList<Teacher> listTeacher = new ArrayList<Teacher>();
        try {
            String sql = "SELECT * \n"
                    + "FROM [PRJ_G10].[dbo].[giangVien] gv JOIN coSo cs ON gv.idCoSo = cs.idCoSo JOIN taiKhoan tk \n"
                    + "ON gv.taiKhoanId = tk.taiKhoanId JOIN vaiTro vt ON tk.vaiTroId = vt.vaiTroId "
                    + "WHERE gv.firstName like '%" + firt + "%' AND lastName like '%" + last + "%'  AND cs.idCoSo like '%" + cam + "%' "
                    + "AND gv.activeGv like '%" + a + "%'";
            PreparedStatement stm = cnn.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Campus campus = new Campus(rs.getInt("idCoSo"), rs.getNString("tenCoSo"), rs.getNString("diaChiCoSo"));
                Role role = new Role(rs.getInt("vaiTroId"), rs.getNString("tenVaiTro"));
                User user = new User(String.valueOf(rs.getInt("taiKhoanId")), role);
                Teacher teacher = new Teacher(rs.getInt("giangVienId"), rs.getNString("firstName"), rs.getNString("lastName"), rs.getBoolean("gioiTinh"),
                        rs.getNString("ngaySinh"), rs.getNString("ngayBatDauLamViec"), rs.getNString("ngayNghiLam"),
                        rs.getNString("soDienThoai"), rs.getNString("gmail"), rs.getNString("diaChi"),
                        campus, user, rs.getString("maGiangVien"), rs.getBoolean("activeGV"));
                listTeacher.add(teacher);
            }

        } catch (SQLException ex) {
            System.out.println("Loi TeacherDao getAllByInfo(int i, String firt, String last) " + ex);
        }
        return listTeacher;

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

    public Teacher getTeacherById(String id, String a) {
        Teacher teacher = new Teacher();
        try {
            String sql = "SELECT * \n"
                    + "FROM [PRJ_G10].[dbo].[giangVien] gv JOIN coSo cs ON gv.idCoSo = cs.idCoSo JOIN taiKhoan tk \n"
                    + "ON gv.taiKhoanId = tk.taiKhoanId JOIN vaiTro vt ON tk.vaiTroId = vt.vaiTroId "
                    + "WHERE gv.giangVienId = " + id + " "
                    + "AND gv.activeGv like '%" + a + "%'";
            PreparedStatement stm = cnn.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Campus campus = new Campus(rs.getInt("idCoSo"), rs.getNString("tenCoSo").trim(), rs.getNString("diaChiCoSo"));
                Role role = new Role(rs.getInt("vaiTroId"), rs.getNString("tenVaiTro").trim());
                User user = new User(String.valueOf(rs.getInt("taiKhoanId")), role);
                teacher = new Teacher(rs.getInt("giangVienId"), rs.getNString("firstName").trim(), rs.getNString("lastName").trim(), rs.getBoolean("gioiTinh"),
                        rs.getNString("ngaySinh"), rs.getNString("ngayBatDauLamViec"), rs.getNString("ngayNghiLam"),
                        rs.getNString("soDienThoai").trim(), rs.getNString("gmail"), rs.getNString("diaChi").trim(),
                        campus, user, rs.getString("maGiangVien").trim(), rs.getBoolean("activeGV"));
            }

        } catch (SQLException ex) {
            System.out.println("Loi TeacherDao getAll(int i) " + ex);
        }
        return teacher;
    }

    public void insert(Teacher s) {
        String sql = "INSERT INTO [dbo].[giangVien] "
                + "([firstName] ,[lastName] ,[gioiTinh] ,[ngaySinh] ,[ngayBatDauLamViec] ,[soDienThoai] ,[gmail] ,[diaChi] ,[idCoSo] ,[taiKhoanId],[maGiangVien],[activeGV])\n"
                + "     VALUES(?,?,?,?,?,?,?,?,?,?,?,1);";
        try {
            PreparedStatement stm = cnn.prepareStatement(sql);

            stm.setString(1, s.getFirstName());
            stm.setString(2, s.getLastName());
            stm.setBoolean(3, s.isGender());
            stm.setString(4, s.getDate());
            stm.setString(5, String.valueOf(java.time.LocalDate.now()));
            stm.setString(6, s.getPhone());
            stm.setString(7, s.getGmail());
            stm.setString(8, s.getAddress());
            stm.setInt(9, s.getCampus().getId());
            stm.setInt(10, Integer.parseInt(s.getUser().getId()));
            stm.setString(11, s.getCodeTearcher());
            stm.executeUpdate();
        } catch (Exception e) {
            System.out.println("Loi TeacherDao insert(Teacher s)  " + e);
        }
    }

    public static void main(String[] args) {
        System.out.println(String.valueOf(java.time.LocalDate.now()));

    }

    public void update(Teacher teacher) {
        try {
            String sql = "UPDATE [dbo].[giangVien]\n"
                    + "   SET [firstName] = '" + teacher.getFirstName() + "' \n"
                    + "      ,[lastName] =  '" + teacher.getLastName() + "' \n"
                    + "      ,[gioiTinh] =  ? \n"
                    + "      ,[ngaySinh] =  '" + teacher.getDate() + "' \n"
                    + "      ,[ngayBatDauLamViec] =  '" + teacher.getDateOfStart() + "' \n"
                    + "      ,[ngayNghiLam] =  '" + teacher.getDateOfEnd() + "' \n"
                    + "      ,[soDienThoai] = '" + teacher.getPhone() + "' \n"
                    + "      ,[gmail] =  '" + teacher.getGmail() + "' \n"
                    + "      ,[diaChi] =  '" + teacher.getAddress() + "' \n"
                    + "      ,[idCoSo] =  '" + teacher.getCampus().getId() + "' \n"
                    + "      ,[taiKhoanId] =  " + teacher.getUser().getId() + " \n"
                    + " WHERE [giangVienId] = " + teacher.getId() + " ";
            PreparedStatement stm = cnn.prepareStatement(sql);
            stm.setBoolean(1, teacher.isGender());
           
            System.out.println(sql);
            stm.executeUpdate();

        } catch (SQLException ex) {
            System.out.println("Loi TeacherDao   update(Teacher teacher)  " + ex);
        }
    }
    
      public void updateActive(Teacher teacher) {
        try {
            String sql = "UPDATE [dbo].[giangVien]\n"
                    + "   SET [activeGV] =  ? \n"
                    + " WHERE [giangVienId] = " + teacher.getId() + " ";
            PreparedStatement stm = cnn.prepareStatement(sql);
            stm.setBoolean(1, teacher.isActive());
            System.out.println(sql);
            stm.executeUpdate();

        } catch (SQLException ex) {
            System.out.println("Loi TeacherDao   updateActive(Teacher teacher)  " + ex);
        }
    }

    public String getCodeTeacher() {
        int count = 0;
        String relust = "";
        String t = "GV";
        try {

            String sql = "SELECT TOP 1 [maGiangVien]\n"
                    + "  FROM [PRJ_G10].[dbo].[giangVien]\n"
                    + "  ORDER BY maGiangVien DESC";
            PreparedStatement stm = cnn.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
           while (rs.next()) {
                relust = rs.getString(1);
            }
            if (relust.equals("")) {
                return t + "1";
            } else {
                int i = Integer.parseInt(relust.substring(2, relust.length()));
                i++;
                String iN = String.valueOf(i);
                return t += iN;
            }

        } catch (SQLException ex) {
            System.out.println("Loi TeacherDao getCodeTeacher()" + ex);
        }

        return relust;
    }
}
