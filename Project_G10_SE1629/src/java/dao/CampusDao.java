/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import connect.DBContext;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.*;
import java.util.ArrayList;
import model.*;

/**
 *
 * @author NCC
 */
public class CampusDao {

    Connection cnn; //Kết nối CSDL

    public CampusDao() {
        try {
            cnn = (new DBContext()).getConnection();
            System.out.println("COnnect successfully");
        } catch (Exception e) {
            System.out.println("Connect error:" + e.getMessage());
        }
    }

    public ArrayList<Campus> getAll() {
        try {
            ArrayList<Campus> list = new ArrayList<Campus>();
            String sql = "SELECT *\n"
                    + "  FROM [PRJ_G10].[dbo].[coSo]";
            PreparedStatement stm = cnn.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
           
             while (rs.next()) {
                list.add(new Campus(rs.getInt(1), rs.getString(2), rs.getString(3), String.valueOf(rs.getDate(4)), String.valueOf(rs.getDate(5))));
            }
             return list;
        } catch (SQLException ex) {
            System.out.println("Loi CampusDao " + ex);
        }
        return null;

    }

}
