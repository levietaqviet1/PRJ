/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import MyUntils.RandomString;
import MyUntils.SendMail;
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

    public ArrayList<StudentParents> getAll(String idCam, String a) {
        StudentDao studentDao = new StudentDao();
        ArrayList<StudentParents> listStudentParents = new ArrayList<StudentParents>();
        try {
            String sql = "SELECT *\n"
                    + "FROM [PRJ_G10].[dbo].[phuHuynh] s \n"
                    + " JOIN coSo cs ON s.idCoSo = cs.idCoSo JOIN taiKhoan tk ON s.taiKhoanId = tk.taiKhoanId JOIN sinhVien sv ON s.sinhVienId = sv.sinhVienId "
                    + "WHERE  cs.idCoSo like '%" + idCam + "%' "
                    + "AND s.acctivePH like '%" + a + "%' ";
            PreparedStatement stm = cnn.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Campus campus = new Campus(rs.getInt("idCoSo"), rs.getNString("tenCoSo"), rs.getNString("diaChiCoSo"),
                        rs.getDate("dateStartCS") == null ? "null" : String.valueOf(rs.getDate("dateStartCS")), rs.getDate("dateEndCS") == null ? "null" : String.valueOf(rs.getDate("dateEndCS")));
                User user = new User(String.valueOf(rs.getInt("taiKhoanId")));
                Student student = studentDao.getStudentByidStudent(rs.getInt("sinhVienId"), "" + a + "");
                StudentParents studentParents = new StudentParents(rs.getInt("phuHuynhId"), rs.getNString("firstName"), rs.getNString("lastName"), rs.getBoolean("gioiTinh"),
                        rs.getString("ngaySinh"), rs.getString("soDienThoai"), rs.getString("gmail"), rs.getString("diaChiSV"), campus, user, student, rs.getString("codePH"), rs.getBoolean("acctivePH"));
                listStudentParents.add(studentParents);
            }
            return listStudentParents;
        } catch (SQLException ex) {
            System.err.println("Loi StudentParentsDao  getAll(String idCam)" + ex);
        }
        return null;
    }

    public void update(StudentParents studentParents) {
        try {
            String sql = "UPDATE [dbo].[phuHuynh]\n"
                    + "   SET [firstName] = '" + studentParents.getFirstName() + "' \n"
                    + "      ,[lastName] =  '" + studentParents.getLastName() + "' \n"
                    + "      ,[gioiTinh] =  ? \n"
                    + "      ,[ngaySinh] =  '" + studentParents.getDate() + "' \n"
                    + "      ,[soDienThoai] = '" + studentParents.getPhone() + "' \n"
                    + "      ,[gmail] =  '" + studentParents.getGmail() + "' \n"
                    + "      ,[diaChi] =  '" + studentParents.getAddress() + "' \n"
                    + "      ,[idCoSo] =  '" + studentParents.getCampus().getId() + "' \n"
                    + " WHERE [phuHuynhId] = " + studentParents.getId() + " ";
            System.out.println(sql);
            PreparedStatement stm = cnn.prepareStatement(sql);
            stm.setBoolean(1, studentParents.isGender());
            stm.executeUpdate();

        } catch (SQLException ex) {
            System.out.println("Loi StudentParentsDao  update(StudentParents studentParents) " + ex);
        }
    }

    public ArrayList<StudentParents> getAllByInfo(String firt, String last, String cam, String a) {
        StudentDao studentDao = new StudentDao();
        ArrayList<StudentParents> listStudentParents = new ArrayList<StudentParents>();
        try {
            String sql = "SELECT *\n"
                    + "FROM [PRJ_G10].[dbo].[phuHuynh] s\n"
                    + " JOIN coSo cs ON s.idCoSo = cs.idCoSo JOIN taiKhoan tk ON s.taiKhoanId = tk.taiKhoanId JOIN sinhVien sv ON s.sinhVienId = sv.sinhVienId "
                    + "WHERE s.firstName like '%" + firt + "%' AND s.lastName like '%" + last + "%'   AND cs.idCoSo like '%" + cam + "%' "
                    + "AND s.acctivePH  like '%" + a + "%' ";
            PreparedStatement stm = cnn.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Campus campus = new Campus(rs.getInt("idCoSo"), rs.getNString("tenCoSo"), rs.getNString("diaChiCoSo"),
                        rs.getDate("dateStartCS") == null ? "null" : String.valueOf(rs.getDate("dateStartCS")), rs.getDate("dateEndCS") == null ? "null" : String.valueOf(rs.getDate("dateEndCS")));
                User user = new User(String.valueOf(rs.getInt("taiKhoanId")));
                Student student = studentDao.getStudentByidStudent(rs.getInt("sinhVienId"), "" + a + "");
                StudentParents studentParents = new StudentParents(rs.getInt("phuHuynhId"), rs.getNString("firstName"), rs.getNString("lastName"), rs.getBoolean("gioiTinh"),
                        rs.getString("ngaySinh"), rs.getString("soDienThoai"), rs.getString("gmail"), rs.getString("diaChiSV"), campus, user, student, rs.getString("codePH"), rs.getBoolean("acctivePH"));
                listStudentParents.add(studentParents);
            }
            return listStudentParents;
        } catch (SQLException ex) {
            System.err.println("Loi studentParentsDao  getAllByInfo(String firt, String last, String cam)" + ex);
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
            System.out.println(sql);
            while (rs.next()) {
                Campus campus = new Campus(rs.getInt("idCoSo"), rs.getNString("tenCoSo"), rs.getNString("diaChiCoSo"),
                        rs.getDate("dateStartCS") == null ? "null" : String.valueOf(rs.getDate("dateStartCS")), rs.getDate("dateEndCS") == null ? "null" : String.valueOf(rs.getDate("dateEndCS")));
                User user = new User(String.valueOf(rs.getInt("taiKhoanId")));
                Student student = studentDao.getStudentByidStudent(rs.getInt("sinhVienId"), "1");
                StudentParents studentParents = new StudentParents(rs.getInt("phuHuynhId"), rs.getNString("firstName"), rs.getNString("lastName"), rs.getBoolean("gioiTinh"),
                        rs.getString("ngaySinh"), rs.getString("soDienThoai"), rs.getString("gmail"), rs.getString("diaChi"), campus, user, student, rs.getString("codePH"), rs.getBoolean("acctivePH"));
                return studentParents;
            }

        } catch (SQLException ex) {
            System.err.println("Loi studentParentsDao   getStudentParentsByIdStudent(String id)" + ex);
        }
        return null;
    }

    public StudentParents getStudentParentsByIdParent(String id, String a) {
        StudentDao studentDao = new StudentDao();
        try {
            String sql = "SELECT *\n"
                    + "FROM [PRJ_G10].[dbo].[phuHuynh] s\n"
                    + " JOIN coSo cs ON s.idCoSo = cs.idCoSo JOIN taiKhoan tk ON s.taiKhoanId = tk.taiKhoanId "
                    + "WHERE s.phuHuynhId = " + id + ""
                    + "AND s.acctivePH like '%" + a + "%' ";
            PreparedStatement stm = cnn.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            System.out.println(sql);
            while (rs.next()) {
                Campus campus = new Campus(rs.getInt("idCoSo"), rs.getNString("tenCoSo"), rs.getNString("diaChiCoSo"),
                        rs.getDate("dateStartCS") == null ? "null" : String.valueOf(rs.getDate("dateStartCS")), rs.getDate("dateEndCS") == null ? "null" : String.valueOf(rs.getDate("dateEndCS")));
                User user = new User(String.valueOf(rs.getInt("taiKhoanId")));
                Student student = studentDao.getStudentByidStudent(rs.getInt("sinhVienId"), "" + a + "");
                StudentParents studentParents = new StudentParents(rs.getInt("phuHuynhId"), rs.getNString("firstName"), rs.getNString("lastName"), rs.getBoolean("gioiTinh"),
                        rs.getString("ngaySinh"), rs.getString("soDienThoai"), rs.getString("gmail"), rs.getString("diaChi"), campus, user, student, rs.getString("codePH"), rs.getBoolean("acctivePH"));
                return studentParents;
            }

        } catch (SQLException ex) {
            System.err.println("Loi studentParentsDao   getStudentParentsByIdParent(String id) " + ex);
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

    public void insert(StudentParents s) {
        UserDao userDao = new UserDao();
        String[] userNameLast = s.getLastName().split(" ");
        String userName = s.getFirstName();
        for (String name : userNameLast) {
            userName += name.charAt(0);
        }
        userName = userName.toLowerCase();
        String code = getCode();
        userName += code;
        String password = RandomString.RandomStringg(8);
        User user = new User(String.valueOf(userDao.getIdAccount() + 1), userName, password);
        userDao.insertUser(user, "5"); // insert user vao datase
        s.setUser(user);
        try {
            String sql = "INSERT INTO [dbo].[phuHuynh] "
                    + "([firstName] ,[lastName] ,[gioiTinh] ,[ngaySinh] ,[soDienThoai] ,[gmail] "
                    + ",[diaChi] ,[idCoSo] ,[taiKhoanId] ,[sinhVienId] ,[codePH] ,[acctivePH])"
                    + "VALUES (?,?,?,?,?,?,?,?,?,?,?,1)";
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
            stm.setInt(10, s.getStudent().getId());
            stm.setString(11, code);
            stm.executeUpdate();
            sendMaill(s);
        } catch (SQLException ex) {
            System.err.println("Loi studentParentsDao  insert(StudentParents studentParents)  " + ex);
        }

    }

    public void updateActive(StudentParents studentParents) {
        try {
            String sql = "UPDATE [dbo].[phuHuynh]\n"
                    + "   SET [acctivePH] =  ? \n"
                    + " WHERE [phuHuynhId] = " + studentParents.getId() + " ";
            PreparedStatement stm = cnn.prepareStatement(sql);
            stm.setBoolean(1, studentParents.isActiveSP());
            System.out.println(sql);
            stm.executeUpdate();

        } catch (SQLException ex) {
            System.out.println("Loi studentParentsDao   updateActive(Teacher teacher)  " + ex);
        }
    }

    public String getCode() {
        int count = 0;
        String relust = "";
        String t = "PH";
        try {

            String sql = "SELECT TOP 1 [codePH]\n"
                    + "  FROM [PRJ_G10].[dbo].[phuHuynh]\n"
                    + "  ORDER BY codePH DESC";
            PreparedStatement stm = cnn.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                relust = rs.getString(1).trim();
            }
            if (relust.equals("") || relust == null) {
                return t + "1";
            } else {
                int i = Integer.parseInt(relust.substring(2, relust.length()));
                i++;
                String iN = String.valueOf(i);
                return t += iN;
            }

        } catch (SQLException ex) {
            System.out.println("Loi studentParentsDao  getCode()" + ex);
        }

        return relust;
    }

    private void sendMaill(StudentParents s) {
        String code = RandomString.RandomStringg(13);

        String topic = "FPT-University";
        String content = "<html lang=\"en\">\n"
                + "<head>\n"
                + "    <title></title>\n"
                + "    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n"
                + "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n"
                + "    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\" />\n"
                + "</head>\n"
                + "<body>\n"
                + "Dear " + s.getFirstName() + "<br/>\n"
                + "We have received your information<br/>\n"
                + "Please do not share your account with anyone else<br/>\n"
                + "Account: <span style='color: red;'> " + s.getUser().getUsername() + "</span><br/>\n"
                + "Password: <span style='color: red;'> " + s.getUser().getPassword() + "</span><br/>\n"
                + "You can follow up through FPT University's website or wait for the next email to respond to your application<br/>"
                + "</body>\n"
                + "</html>";

        String acc_TK_Mail_Send = "phongdaotaofbt@gmail.com";
        String acc_MK_Mail_Send = "npmgjujnxbtswmit";
        SendMail sen = new SendMail();
        sen.sendFuncition(s.getGmail(), topic, content, acc_TK_Mail_Send, acc_MK_Mail_Send); 
    }

    public static void main(String[] args) {
        studentParentsDao s = new studentParentsDao();
        System.out.println(s.getCode());
    }

}
