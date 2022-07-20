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
import model.BQT;
import model.*;

/**
 *
 * @author NCC
 */
public class BqtDao {

    Connection cnn; //Kết nối CSDL
    String sql;

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
            sql = "SELECT *\n"
                    + "FROM [PRJ_G10].[dbo].[quanTri] qt JOIN coSo c ON qt.idCoSo = c.idCoSo\n"
                    + "WHERE qt.taiKhoanId = ? AND c.idCoSo = ? ";
            PreparedStatement stm = cnn.prepareStatement(sql);
            stm.setInt(1, checkU);
            stm.setString(2, campusup_login);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Campus campus = new Campus(rs.getInt("idCoSo"), rs.getNString("tenCoSo"), "", "", "");
                User user = new User(String.valueOf(rs.getInt("taiKhoanId")));
                return new BQT(rs.getInt("quanTriId"), rs.getNString("firstName"), rs.getNString("lastName"), rs.getBoolean("gioiTinh"), rs.getNString("ngaySinh"),
                        rs.getNString("soDienThoai"), rs.getNString("gmail"), rs.getNString("diaChi"), campus, user, rs.getString("maCodeQT"));
            }

        } catch (SQLException ex) {
            System.out.println("Loi BqtDao " + ex);
            System.out.println(sql);
        }
        return null;
    }

    public int checkInforBQT(BQT b) {
        try {
            String gen = b.isGender() ? "1" : "0";
            sql = "SELECT *\n"
                    + "FROM [PRJ_G10].[dbo].[quanTri]\n"
                    + "WHERE \n"
                    + "firstName = '" + b.getFirstName() + "' AND lastName = '" + b.getLastName() + "'\n"
                    + "AND ngaySinh = '" + b.getDate() + "' \n"
                    + "AND gioiTinh = " + gen + " \n"
                    + "AND gmail = '" + b.getGmail() + "' \n"
                    + "AND idCoSo = " + b.getCampus().getId() + " \n"
                    + "AND taiKhoanId = " + b.getUser().getId() + " \n";
            PreparedStatement stm = cnn.prepareStatement(sql);

            ResultSet rs = stm.executeQuery();
            System.out.println(sql);
            while (rs.next()) {
                return 1;
            }

        } catch (SQLException ex) {
            System.out.println("Loi BqtDao checkInforBQT(BQT b) " + ex);
            System.out.println(sql);
        }
        System.out.println();
        return -1;
    }

    public int checkPhoneExit(String phone) {
        try {
            sql = "SELECT *\n"
                    + "  FROM [PRJ_G10].[dbo].[quanTri]\n"
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
            System.err.println("Loi BqtDao  checkPhoneExit(String phone) " + ex);
            System.out.println(sql);
        }
        return -1;
    }

    public ArrayList<BQT> getAll() {
        ArrayList<BQT> list = new ArrayList<BQT>();
        try {
            sql = "SELECT *\n"
                    + "FROM [PRJ_G10].[dbo].[quanTri] qt JOIN coSo c ON qt.idCoSo = c.idCoSo";
            PreparedStatement stm = cnn.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Campus campus = new Campus(rs.getInt("idCoSo"), rs.getNString("tenCoSo"), "", "", "");
                User user = new User(String.valueOf(rs.getInt("taiKhoanId")));
                list.add(new BQT(rs.getInt("quanTriId"), rs.getNString("firstName"), rs.getNString("lastName"), rs.getBoolean("gioiTinh"), rs.getNString("ngaySinh"),
                        rs.getNString("soDienThoai"), rs.getNString("gmail"), rs.getNString("diaChi"), campus, user, rs.getString("maCodeQT")));
            }
            return list;

        } catch (SQLException ex) {
            System.out.println("Loi BqtDao " + ex);
            System.out.println(sql);
        }
        return null;

    }

    public BQT getBqtById(String id) {

        try {
            sql = "SELECT *\n"
                    + "FROM [PRJ_G10].[dbo].[quanTri] qt JOIN coSo c ON qt.idCoSo = c.idCoSo"
                    + "  WHERE qt.[quanTriId] = " + id + "";
            PreparedStatement stm = cnn.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Campus campus = new Campus(rs.getInt("idCoSo"), rs.getNString("tenCoSo"), "", "", "");
                User user = new User(String.valueOf(rs.getInt("taiKhoanId")));
                return (new BQT(rs.getInt("quanTriId"), rs.getNString("firstName"), rs.getNString("lastName"), rs.getBoolean("gioiTinh"), rs.getNString("ngaySinh"),
                        rs.getNString("soDienThoai"), rs.getNString("gmail"), rs.getNString("diaChi"), campus, user, rs.getString("maCodeQT")));
            }
        } catch (SQLException ex) {
            System.out.println("Loi BqtDao " + ex);
            System.out.println(sql);
        }
        return null;

    }

    public void deleteById(int id) {
        try {
            sql = "DELETE \n"
                    + "FROM quanTri \n"
                    + "WHERE quanTriId = " + id + "";
            PreparedStatement stm = cnn.prepareStatement(sql);
            stm.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Loi deleteById " + ex);
            System.out.println(sql);
        }
    }

    public void updateById(BQT bqt) {
        try {
            sql = "UPDATE [dbo].[quanTri]\n"
                    + "   SET [firstName] = '" + bqt.getFirstName() + "' \n"
                    + "      ,[lastName] =  '" + bqt.getLastName() + "' \n"
                    + "      ,[gioiTinh] =  ? \n"
                    + "      ,[ngaySinh] =  '" + bqt.getDate() + "' \n"
                    + "      ,[soDienThoai] = '" + bqt.getPhone() + "' \n"
                    + "      ,[gmail] =  '" + bqt.getGmail() + "' \n"
                    + "      ,[diaChi] =  '" + bqt.getAddress() + "' \n"
                    + "      ,[idCoSo] =  '" + bqt.getCampus().getId() + "' \n"
                    + "      ,[taiKhoanId] =  " + bqt.getUser().getId() + " \n"
                    + " WHERE [quanTriId] = " + bqt.getId() + " ";
            PreparedStatement stm = cnn.prepareStatement(sql);
            stm.setBoolean(1, bqt.isGender());
            System.out.println(sql);
            stm.executeUpdate();

        } catch (SQLException ex) {
            System.out.println(" updateById(BQT bqt) " + ex);
            System.out.println(sql);
        }
    }

    public ArrayList<BQT> getAllByInfo(String firt, String last, String cam) {
        ArrayList<BQT> list = new ArrayList<BQT>();
        try {
            sql = "SELECT *\n"
                    + "FROM [PRJ_G10].[dbo].[quanTri] qt JOIN coSo c ON qt.idCoSo = c.idCoSo"
                    + " WHERE qt.firstName like '%" + firt + "%' AND qt.lastName like '%" + last + "%'   AND c.idCoSo like '%" + cam + "%' ";
            PreparedStatement stm = cnn.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Campus campus = new Campus(rs.getInt("idCoSo"), rs.getNString("tenCoSo"), "", "", "");
                User user = new User(String.valueOf(rs.getInt("taiKhoanId")));
                list.add(new BQT(rs.getInt("quanTriId"), rs.getNString("firstName"), rs.getNString("lastName"), rs.getBoolean("gioiTinh"), rs.getNString("ngaySinh"),
                        rs.getNString("soDienThoai"), rs.getNString("gmail"), rs.getNString("diaChi"), campus, user, rs.getString("maCodeQT")));
            }
            return list;

        } catch (SQLException ex) {
            System.out.println("Loi BqtDao getAllByInfo(String firt, String last, String cam)  " + ex);
            System.out.println(sql);
        }
        return null;
    }

    public void insert(BQT s) {
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
        userDao.insertUser(user, "1"); // insert user vao datase
        s.setUser(user);
        try {
             sql = "INSERT INTO [dbo].[quanTri] "
                    + "([firstName] ,[lastName] ,[gioiTinh] ,[ngaySinh] ,[soDienThoai] ,[gmail] ,[diaChi] ,[idCoSo] ,[taiKhoanId] ,[maCodeQT])"
                    + "VALUES (?,?,?,?,?,?,?,?,?,?)";
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
            stm.setString(10, code);
            stm.executeUpdate();
            sendMaill(s);
        } catch (SQLException ex) {
            System.err.println("Loi BqtDao  insert(BQT s)  " + ex);
            System.out.println(sql);
        }
    }

    private String getCode() {
        int count = 0;
        String relust = "";
        String t = "QT";
        try {
            sql = "SELECT TOP 1  [maCodeQT]\n"
                    + "  FROM [PRJ_G10].[dbo].[quanTri]\n"
                    + "  ORDER BY maCodeQT DESC";
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
            System.out.println("Loi BqtDao  getCode()" + ex);
            System.out.println(sql);
        }
        return relust;
    }

    private void sendMaill(BQT s) {
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
}
