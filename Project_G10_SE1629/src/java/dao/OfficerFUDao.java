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
    String sql = "";

    public OfficerFUDao() {
        try {
            cnn = (new DBContext()).getConnection();
            System.out.println("COnnect successfully");
        } catch (Exception e) {
            System.out.println("Connect error:" + e.getMessage());
        }
    }

    public ArrayList<OfficerFU> getAll(String cam, String ac) {
        ArrayList<OfficerFU> listOfficerFU = new ArrayList<OfficerFU>();

        try {
            sql = "  SELECT *\n"
                    + "  FROM [PRJ_G10].[dbo].[canBo] gv JOIN coSo cs ON gv.idCoSo = cs.idCoSo JOIN taiKhoan tk \n"
                    + "  ON gv.taiKhoanId = tk.taiKhoanId JOIN vaiTro vt ON tk.vaiTroId = vt.vaiTroId "
                    + "WHERE  cs.idCoSo like '%" + cam + "%'"
                    + " AND gv.activeCB like '%" + ac + "%' ";
            PreparedStatement stm = cnn.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Campus campus = new Campus(rs.getInt("idCoSo"), rs.getNString("tenCoSo"), rs.getNString("diaChiCoSo"));
                Role role = new Role(rs.getInt("vaiTroId"), rs.getNString("tenVaiTro"));
                User user = new User(String.valueOf(rs.getInt("taiKhoanId")), role);
                OfficerFU officerFU = new OfficerFU(rs.getInt("canBoId"), rs.getNString("firstName"), rs.getNString("lastName"), rs.getBoolean("gioiTinh"),
                        rs.getNString("ngaySinh"), rs.getNString("soDienThoai"), rs.getNString("gmail"),
                        rs.getNString("diaChi"), campus, user, rs.getString("codeCB"), rs.getBoolean("activeCB"));
                listOfficerFU.add(officerFU);
            }

        } catch (SQLException ex) {
            System.out.println("Loi OfficerFUDao getAll() " + ex);
            System.out.println(sql);
        }
        return listOfficerFU;
    }

    public ArrayList<OfficerFU> getAllByInfo(String firt, String last, String cam, String ac) {
        ArrayList<OfficerFU> listOfficerFU = new ArrayList<OfficerFU>();
        try {
            sql = "  SELECT *\n"
                    + "  FROM [PRJ_G10].[dbo].[canBo] gv JOIN coSo cs ON gv.idCoSo = cs.idCoSo JOIN taiKhoan tk \n"
                    + "  ON gv.taiKhoanId = tk.taiKhoanId JOIN vaiTro vt ON tk.vaiTroId = vt.vaiTroId "
                    + "WHERE gv.firstName like '%" + firt + "%' AND lastName like '%" + last + "%'   AND cs.idCoSo like '%" + cam + "%' "
                    + " AND gv.activeCB like '%" + ac + "%' ";
            PreparedStatement stm = cnn.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Campus campus = new Campus(rs.getInt("idCoSo"), rs.getNString("tenCoSo"), rs.getNString("diaChiCoSo"));
                Role role = new Role(rs.getInt("vaiTroId"), rs.getNString("tenVaiTro"));
                User user = new User(String.valueOf(rs.getInt("taiKhoanId")), role);
                OfficerFU officerFU = new OfficerFU(rs.getInt("canBoId"), rs.getNString("firstName"), rs.getNString("lastName"), rs.getBoolean("gioiTinh"),
                        rs.getNString("ngaySinh"), rs.getNString("soDienThoai"), rs.getNString("gmail"),
                        rs.getNString("diaChi"), campus, user, rs.getString("codeCB)"), rs.getBoolean("activeCB"));
                listOfficerFU.add(officerFU);
                System.out.println(sql);
            }

        } catch (SQLException ex) {
            System.out.println("Loi OfficerFUDao getAll() " + ex);
            System.out.println(sql);
        }
        return listOfficerFU;
    }

    public void deleteByid(String id) {
        try {
            sql = "DELETE \n"
                    + "FROM canBo \n"
                    + "WHERE canBoId = " + id + "";
            PreparedStatement stm = cnn.prepareStatement(sql);
            stm.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Loi OfficerFUDao  deleteByid(String parameter) " + ex);
            System.out.println(sql);
        }
    }

    public void update(OfficerFU officerFU) {
        try {
            sql = "UPDATE [dbo].[canBo]\n"
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
            System.out.println(sql);
        }
    }

    public OfficerFU getOfficerByID(String id, String a) {
        OfficerFU officerFU = new OfficerFU();
        try {
            sql = "SELECT * \n"
                    + "FROM [PRJ_G10].[dbo].[canBo] gv JOIN coSo cs ON gv.idCoSo = cs.idCoSo JOIN taiKhoan tk \n"
                    + "ON gv.taiKhoanId = tk.taiKhoanId JOIN vaiTro vt ON tk.vaiTroId = vt.vaiTroId "
                    + "WHERE gv.canBoId = " + id + " "
                    + "AND gv.activeCB like '%" + a + "%' ";
            PreparedStatement stm = cnn.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Campus campus = new Campus(rs.getInt("idCoSo"), rs.getNString("tenCoSo"), rs.getNString("diaChiCoSo"));
                Role role = new Role(rs.getInt("vaiTroId"), rs.getNString("tenVaiTro"));
                User user = new User(String.valueOf(rs.getInt("taiKhoanId")), role);
                officerFU = new OfficerFU(rs.getInt("canBoId"), rs.getNString("firstName"), rs.getNString("lastName"), rs.getBoolean("gioiTinh"),
                        rs.getNString("ngaySinh"), rs.getNString("soDienThoai"), rs.getNString("gmail"), rs.getNString("diaChi"),
                        campus, user, rs.getString("codeCB"), rs.getBoolean("activeCB"));
            }

            return officerFU;
        } catch (SQLException ex) {
            System.out.println("Loi OfficerFUDao getOfficerByID(String id)  " + ex);
            System.out.println(sql);
        }
        return null;
    }

    public void insert(OfficerFU s) {
        sql = "INSERT INTO [dbo].[canBo]\n"
                + "           ([firstName],[lastName],[gioiTinh],[ngaySinh],[soDienThoai],[gmail],[diaChi],[idCoSo],[taiKhoanId],[codeCB],[activeCB])\n"
                + "  VALUES(?,?,?,?,?,?,?,?,?,?,1);";
        try {
            PreparedStatement stm = cnn.prepareStatement(sql);

            stm.setString(1, s.getFirstName().trim());
            stm.setString(2, s.getLastName().trim());
            stm.setBoolean(3, s.isGender());
            stm.setString(4, s.getDate().trim());
            stm.setString(5, s.getPhone().trim());
            stm.setString(6, s.getGmail().trim());
            stm.setString(7, s.getAddress().trim());
            stm.setInt(8, s.getCampus().getId());
            stm.setInt(9, Integer.parseInt(s.getUser().getId()));
            stm.setString(10, s.getCodeCB());
            stm.executeUpdate();
        } catch (Exception e) {
            System.out.println("Loi OfficerFUDao insert(OfficerFU s)  " + e);
            System.out.println(sql);
        }
    }

    public String getCodeofficerFU() {
        int count = 0;
        String relust = "";
        String t = "CB";
        try {

            sql = "SELECT TOP 1 [codeCB]\n"
                    + "  FROM [PRJ_G10].[dbo].[canBo]\n"
                    + "  ORDER BY [codeCB] DESC";
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
            System.out.println(sql);
        }

        return relust;
    }

    public void updateActive(OfficerFU officerFU) {
        try {
            sql = "UPDATE [dbo].[canBo]\n"
                    + "   SET [activeCB] =  ? \n"
                    + " WHERE [canBoId] = " + officerFU.getId() + " ";
            PreparedStatement stm = cnn.prepareStatement(sql);
            stm.setBoolean(1, officerFU.isActive());
            System.out.println(sql);
            stm.executeUpdate();

        } catch (SQLException ex) {
            System.out.println("Loi TeacherDao   updateActive(Teacher teacher)  " + ex);
            System.out.println(sql);
        }
    }

    public static void main(String[] args) {
        OfficerFUDao o = new OfficerFUDao();
        System.out.println(o.getCodeofficerFU());
    }

    public OfficerFU getOfficerFUByIdUser(int id, String campusup_login, String a) {
        OfficerFU officerFU = new OfficerFU();
        try {
            sql = "SELECT * \n"
                    + "FROM [PRJ_G10].[dbo].[canBo] gv JOIN coSo cs ON gv.idCoSo = cs.idCoSo JOIN taiKhoan tk \n"
                    + "ON gv.taiKhoanId = tk.taiKhoanId JOIN vaiTro vt ON tk.vaiTroId = vt.vaiTroId "
                    + "WHERE gv.taiKhoanId = " + id + " "
                    + "AND gv.idCoSo = " + campusup_login + " "
                    + "AND gv.activeCB like '%" + a + "%' ";
            PreparedStatement stm = cnn.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            System.out.println(sql);
            while (rs.next()) {
                Campus campus = new Campus(rs.getInt("idCoSo"), rs.getNString("tenCoSo"), rs.getNString("diaChiCoSo"));
                Role role = new Role(rs.getInt("vaiTroId"), rs.getNString("tenVaiTro"));
                User user = new User(String.valueOf(rs.getInt("taiKhoanId")), role);
                officerFU = new OfficerFU(rs.getInt("canBoId"), rs.getNString("firstName"), rs.getNString("lastName"), rs.getBoolean("gioiTinh"),
                        rs.getNString("ngaySinh"), rs.getNString("soDienThoai"), rs.getNString("gmail"), rs.getNString("diaChi"),
                        campus, user, rs.getString("codeCB"), rs.getBoolean("activeCB"));
                 return officerFU;
            }
           
           
        } catch (SQLException ex) {
            System.out.println("Loi OfficerFUDao getOfficerFUByIdUser(int id, String campusup_login, String a)" + ex);
            System.out.println(sql);
        }
        return null;
    }
}
