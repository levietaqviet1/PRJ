package DAO_Thu;

import connect.DBContext;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import modelTHU.Application;

/**
 *
 * @author 84399
 */
public class ApplicationDAO {

    Connection cnn; //Kết nối CSDL

    public ApplicationDAO() {
        try {
            cnn = (new DBContext()).getConnection();
            System.out.println("COnnect successfully");
        } catch (Exception e) {
            System.out.println("Connect error:" + e.getMessage());
        }
    }

    public ArrayList<Application> getAll() {
        ArrayList<Application> list = new ArrayList<Application>();
        try {
            String sql = "select * from Application";
            PreparedStatement stm = cnn.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                list.add(new Application(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getString(5), rs.getString(6),
                        rs.getInt(7),rs.getString(8)));
            }
        } catch (Exception e) {
            System.out.println("Loi get All Application: " + e.getMessage());
        }

        return list;
    }
    public ArrayList<Application> getApproved() {
        ArrayList<Application> list = new ArrayList<Application>();
        try {
            String sql = "select * from Application where tinhtrangdonid IS NOT NULL";
            PreparedStatement stm = cnn.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                list.add(new Application(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getString(5), rs.getString(6),
                        rs.getInt(7),rs.getString(8)));
            }
        } catch (Exception e) {
            System.out.println("Loi get All Application: " + e.getMessage());
        }

        return list;
    }
    public ArrayList<Application> getNOTApproved() {
        ArrayList<Application> list = new ArrayList<Application>();
        try {
            String sql = "select * from Application where tinhtrangdonid IS NULL";
            PreparedStatement stm = cnn.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                list.add(new Application(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getString(5), rs.getString(6),
                        rs.getInt(7),rs.getString(8)));
            }
        } catch (Exception e) {
            System.out.println("Loi get All Application: " + e.getMessage());
        }

        return list;
    }
    public ArrayList<Application> getRejected() {
        ArrayList<Application> list = new ArrayList<Application>();
        try {
            String sql = "select * from Application where tinhtrangdonid = '0'";
            PreparedStatement stm = cnn.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                list.add(new Application(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getString(5), rs.getString(6),
                        rs.getInt(7),rs.getString(8)));
            }
        } catch (Exception e) {
            System.out.println("Loi get All Application: " + e.getMessage());
        }

        return list;
    }
    public ArrayList<Application> getAccepted() {
        ArrayList<Application> list = new ArrayList<Application>();
        try {
            String sql = "select * from Application where tinhtrangdonid = '1'";
            PreparedStatement stm = cnn.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                list.add(new Application(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getString(5), rs.getString(6),
                        rs.getInt(7),rs.getString(8)));
            }
        } catch (Exception e) {
            System.out.println("Loi get All Application: " + e.getMessage());
        }

        return list;
    }
    public ArrayList<Application> getAllbyId(String id) {
        ArrayList<Application> list = new ArrayList<Application>();
        try {
            String sql = "select * from Application where idsv = '"+ id + "'";
            PreparedStatement stm = cnn.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                list.add(new Application(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getString(5), rs.getString(6), rs.getInt(7),rs.getString(8)));
            }
        } catch (Exception e) {
            System.out.println("Loi get All Application by Id: " + e.getMessage());
        }

        return list;
    }

    public void insertApplication(Application a) {
        String sql = "INSERT INTO [dbo].[Application]"
                + "([appName] , [noidungapp] , [idsv] , [timeguidon] , [tinhtrangdonid])"
                + "VALUES"
                + "( ?, ?, ?, ?, 3)";
        try {
            PreparedStatement stm = cnn.prepareStatement(sql);
            stm.setString(1, a.getAppName());
            stm.setString(2, a.getNoidungapp());
            stm.setInt(3, a.getIdsv());
            stm.setString(4, a.getTimeguidon());
            stm.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error Insert Application [ApplicationDAO]");
        }

    }

    public void updateStatus(int id, int option, String lido) {
        try {
            Statement stm = cnn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            String strUpdate = "update Application set tinhtrangdonid='" + option + "'"
                    + " , timeduyetdon = '" + String.valueOf(java.time.LocalDate.now()) + "'"
                    + " , lido = '" + lido + "'"
                    + " where appid='" + id + "' ";
            System.out.println(strUpdate);
            stm.execute(strUpdate);

        } catch (SQLException e) {
            System.out.println("Update Status: " + e.getMessage());
        }

    }
     public ArrayList<Application> getListByPage(ArrayList<Application> listAll, int start, int end) {
        ArrayList<Application> list = new ArrayList<Application>();
        for (int i = start; i <= end; i++) {
            list.add(listAll.get(i));
        }
        return list;
    }

    public static void main(String[] args) {
        ApplicationDAO d = new ApplicationDAO();
        ArrayList<Application> list = new ArrayList<>();
        list = d.getAll();
        for (Application application : list) {
        System.out.println(application.toString());
        }
    }

}
