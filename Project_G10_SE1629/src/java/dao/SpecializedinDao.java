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
public class SpecializedinDao {

    Connection cnn; //Kết nối CSDL

    public SpecializedinDao() {
        try {
            cnn = (new DBContext()).getConnection();
            System.out.println("COnnect successfully");
        } catch (Exception e) {
            System.out.println("Connect error:" + e.getMessage());
        }
    }

    public ArrayList<Specializedin> getAll() {
        try {
            ArrayList<Specializedin> list = new ArrayList<Specializedin>();
            String sql = "SELECT *\n"
                    + "  FROM [PRJ_G10].[dbo].[chuyenNganh]";
            PreparedStatement stm = cnn.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();

            while (rs.next()) {
                list.add(new Specializedin(rs.getInt(1), rs.getString(2), rs.getString(3), String.valueOf(rs.getDate(4)), String.valueOf(rs.getDate(5))));
            }
return list;
        } catch (SQLException ex) {
            System.out.println("Loi SpecializedinDao " + ex);
        }
        return null;

    }

}
