/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Product;
import model.Stock;

/**
 *
 * @author Lehait
 */
public class StockDAO extends DBContext {

    public ArrayList<Stock> getStock() {
        ArrayList<Stock> list = new ArrayList<>();
        try {
            String sql = "select * from Stock";
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Stock(rs.getInt(1), rs.getInt(2), rs.getInt(3)));
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return list;
    }

    public void updateStock(Stock s) {
        try {
            String sql = "UPDATE [dbo].[Stock]\n"
                    + "   SET  [amount] = ?\n"
                    + " WHERE ProductId = ?";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, s.getAmount());
            ps.setInt(2, s.getProductID());

            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(LoginDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void insertStock(Stock s) {
        try {
            String sql = "INSERT INTO [dbo].[Stock]\n"
                    + "           ([ProductId]\n"
                    + "           ,[amount])\n"
                    + "     VALUES\n"
                    + "           (?\n"
                    + "           ,?)";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, s.getProductID());
            ps.setInt(2, s.getAmount());

            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(LoginDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
