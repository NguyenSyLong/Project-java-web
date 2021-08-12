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
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Import;
import model.Order;

/**
 *
 * @author Lehait
 */
public class ImportDAO extends DBContext {

    public void insertImport(Import s) {
        try {
            String sql = "INSERT INTO [dbo].[Import]\n"
                    + "           ([Date]\n"
                    + "           ,[Iprice]\n"
                    + "           ,[ProductId]\n"
                    + "           ,[StaffId])\n"
                    + "     VALUES\n"
                    + "           (?\n"
                    + "           ,?\n"
                    + "           ,?\n"
                    + "           ,?)";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setDate(1, s.getDate());
            ps.setFloat(2, s.getIprice());
            ps.setInt(3, s.getProductid());
            ps.setInt(4, s.getStaffid());

            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(LoginDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     public ArrayList<Import> getImport() {
        ArrayList<Import> list = new ArrayList<>();
        try {
            String sql = "select * from Import";
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Import(rs.getInt(1), rs.getDate(2), rs.getFloat(3), rs.getInt(4), rs.getInt(5)) );
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return list;
    }
     public ArrayList<Import> getImportbyDate(String date) {
        ArrayList<Import> list = new ArrayList<>();
        try {
            String sql = "select * from [Import] where [Date] = '"+date+"'";
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                 list.add(new Import(rs.getInt(1), rs.getDate(2), rs.getFloat(3), rs.getInt(4), rs.getInt(5)) );
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return list;
    }
    public static void main(String[] args) {
        ImportDAO dao = new ImportDAO();
        ArrayList<Import> aImport = dao.getImport();
        for (Import import1 : aImport) {
            System.out.println(import1);
        }
    }
}
