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
public class StatusDao {

    Connection cnn; //Kết nối CSDL

    public StatusDao() {
        try {
            cnn = (new DBContext()).getConnection();
            System.out.println("COnnect successfully");
        } catch (Exception e) {
            System.out.println("Connect error:" + e.getMessage());
        }
    }

    public ArrayList<Status> getAll() {
        ArrayList<Status> listStatus = new ArrayList<Status>();
        try {
            String sql = "SELECT *\n"
                    + "  FROM [PRJ_G10].[dbo].[trangThai]";
            PreparedStatement stm = cnn.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Status status = new Status(rs.getInt(1), rs.getNString(2));
                listStatus.add(status);
            }

        } catch (SQLException ex) {
            System.out.println("Loi StatusDao getAll()  " + ex);
        }
        return listStatus;

    }
}
