/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Account;
import model.Staff;

/**
 *
 * @author Lehait
 */
public class LoginDAO extends DBContext {

    public Account getAcc(String name, String pass) {

        try {
            String sql = "select * from Account where Username = ? and Password= ?";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, name);
            ps.setString(2, pass);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                return new Account(rs.getString(2), rs.getString(3),rs.getInt(4));
            }
        } catch (SQLException ex) {
            Logger.getLogger(LoginDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public void insertAcc(String name, String pass, int staffID) {
        try {
            String sql = "INSERT INTO [Account]\n"
                    + "           ([Username]\n"
                    + "           ,[Password]\n"
                    + "           ,[StaffID])\n"
                    + "     VALUES\n"
                    + "           (?\n"
                    + "           ,?\n"
                    + "           ,?)";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, name);
            ps.setString(2, pass);
            ps.setInt(3, staffID);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(LoginDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void insertStaff(Staff s) {
        try {
            String sql = "INSERT INTO [dbo].[Staff]\n"
                    + "           ([Name]\n"
                    + "           ,[Dob]\n"
                    + "           ,[Gender]\n"
                    + "           ,[Phone]\n"
                    + "           ,[Address])\n"
                    + "     VALUES\n"
                    + "           (?\n"
                    + "           ,?\n"
                    + "           ,?\n"
                    + "           ,?\n"
                    + "           ,?)";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, s.getName());
            ps.setDate(2, s.getDob());
            ps.setBoolean(3, s.isGender());
            ps.setString(4, s.getPhone());
            ps.setString(5, s.getAddress());
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(LoginDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    public int getLastStaffID(){
        try {
            String sql = "select Top(1) ID from Staff order by ID desc";
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                int id = resultSet.getInt("ID");
                return id;
            }
        } catch (SQLException ex) {
            Logger.getLogger(LoginDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    } 
    public ArrayList<Staff> getStaff() {
        ArrayList<Staff> list = new ArrayList<>();
        try {
            String sql = "select * from Staff";
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Staff(rs.getInt(1), rs.getString(2), rs.getDate(3), rs.getBoolean(4), rs.getString(5), rs.getString(6)));
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return list;
    }

    public static void main(String[] args) {
        LoginDAO dao = new LoginDAO();
        Account acc = dao.getAcc("long", "123");
        System.out.println(acc.getStaffID());
    }
}
