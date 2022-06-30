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
import java.util.*;
import model.*;

/**
 *
 * @author NCC
 */
public class RoleDao {

    Connection cnn; //Kết nối CSDL

    public RoleDao() {
        try {
            cnn = (new DBContext()).getConnection();
            System.out.println("COnnect successfully");
        } catch (Exception e) {
            System.out.println("Connect error:" + e.getMessage());
        }
    }

    public ArrayList<Role> getAll() {
        ArrayList<Role> listRole = new ArrayList<>();
        try {
            String sql = "SELECT  [vaiTroId]\n"
                    + "      ,[tenVaiTro]\n"
                    + "  FROM [PRJ_G10].[dbo].[vaiTro]";
            PreparedStatement stm = cnn.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                if (rs.getNString("tenVaiTro").equals("BQT")) {
                    continue;
                }
                Role role = new Role(rs.getInt("vaiTroId"), rs.getNString("tenVaiTro"));
                listRole.add(role);
            }

        } catch (SQLException ex) {
            System.out.println("Loi StudentDao " + ex);
        }
        return listRole;

    }

    public static void main(String[] args) {
        RoleDao roleDao = new RoleDao();
        ArrayList<Role> listRole = roleDao.getAll();
        for (Role role : listRole) {
            System.out.println(role.toString());
        }

    }
}
