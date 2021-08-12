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
import model.Customer;
import model.Order;
import model.OrderDetail;
import model.Product;
import model.Staff;

/**
 *
 * @author Lehait
 */
public class OrderDAO extends DBContext {

    public int getLastCusID() {
        try {
            String sql = "select Top(1) ID from Customer order by ID desc";
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

    public int getLastOrderID() {
        try {
            String sql = "select Top(1) ID from [Order]  order by ID desc";
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
     public ArrayList<Order> getOrder() {
        ArrayList<Order> list = new ArrayList<>();
        try {
            String sql = "select * from [Order] ";
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Order(rs.getInt(1), rs.getDate(2), rs.getFloat(3), rs.getFloat(4), rs.getInt(5), rs.getInt(6)));
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return list;
    }
     public ArrayList<Order> getOrderbyDate(String date) {
        ArrayList<Order> list = new ArrayList<>();
        try {
            String sql = "select * from [Order] where [Date] = '"+date+"'";
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Order(rs.getInt(1), rs.getDate(2), rs.getFloat(3), rs.getFloat(4), rs.getInt(5), rs.getInt(6)));
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return list;
    }
     public float getTotalbyDate(String date) {
       
        try {
            String sql = "select sum(TotalPrice) as [Total] from [Order] where [Date] = '"+date+"'";
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                float total = rs.getFloat("Total");
                return total;
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return 0;
    }
     public ArrayList<Date> getOrderDate() {
       ArrayList<Date> list =new ArrayList<>();
        try {
            String sql = "select distinct [Date] from [Order] order by [Date] ";
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Date date = rs.getDate("Date");
                list.add(date);
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return list;
    }
    public void insertCustomer(Customer s) {
        try {
            String sql = "INSERT INTO [Customer]\n"
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

    public void insertOrder(Order s) {
        try {
            String sql = "INSERT INTO [Order]\n"
                    + "           ([Date]\n"
                    + "           ,[Price]\n"
                    + "           ,[TotalPrice]\n"
                    + "           ,[Cusid]\n"
                    + "           ,[Staffid])\n"
                    + "     VALUES\n"
                    + "           (?\n"
                    + "           ,?\n"
                    + "           ,?\n"
                    + "           ,?\n"
                    + "           ,?)";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setDate(1, s.getDate());
            ps.setFloat(2, s.getPrice());
            ps.setFloat(3, s.getTotal());
            ps.setInt(4, s.getCusid());
            ps.setInt(5, s.getStaffid());

            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(LoginDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void insertOrder_Detail(OrderDetail s) {
        try {
            String sql = "INSERT INTO [dbo].[OrderDetail]\n"
                    + "           ([ProductId]\n"
                    + "           ,[OrderId]\n"
                    + "           ,[amount])\n"
                    + "     VALUES\n"
                    + "           (?\n"
                    + "           ,?\n"
                    + "           ,?)";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, s.getPro_id());
            ps.setInt(2, s.getOrder_id());
            ps.setInt(3, s.getAmount());

            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(LoginDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public ArrayList<Customer> getCustomer() {
        ArrayList<Customer> list = new ArrayList<>();
        try {
            String sql = "select * from Customer";
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Customer(rs.getInt(1), rs.getString(2), rs.getDate(3), rs.getBoolean(4), rs.getString(5), rs.getString(6)));
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return list;
    }
    public ArrayList<Customer> getCustomerdetail(int id) {
        ArrayList<Customer> list = new ArrayList<>();
        try {
            String sql = "select * from Customer where id = ? ";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Customer(rs.getInt(1), rs.getString(2), rs.getDate(3), rs.getBoolean(4), rs.getString(5), rs.getString(6)));
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return list;
    }
    public ArrayList<Order> getOdetail(int id) {
        ArrayList<Order> list = new ArrayList<>();
        try {
            String sql = "select * from [Order] where id = ? ";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new  Order(rs.getInt(1), rs.getDate(2), rs.getFloat(3), rs.getFloat(4), rs.getInt(5), rs.getInt(6)));
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return list;
    }
    public float getOrderbymonth(int m,int y) {
        ArrayList<Order> list = new ArrayList<>();
        try {
            String sql = "select  sum(TotalPrice) as TotalPrice from [Order] where  MONTH(Date)=? and YEAR(Date)=?";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, m);
            ps.setInt(2, y);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                return rs.getFloat(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return 0;
    }
    public ArrayList<OrderDetail> getOrderdetail(int id) {
        ArrayList<OrderDetail> list = new ArrayList<>();
        try {
            String sql = "select * from OrderDetail where OrderId = ? ";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new  OrderDetail(rs.getInt(1), rs.getInt(2), rs.getInt(3)));
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return list;
    }

    public static void main(String[] args) {
        OrderDAO dao = new OrderDAO();
//        dao.insertOrder(new Order(Date.valueOf("2020-09-08"),16000, 20000, 1, 1));
//        dao.insertCustomer(new Customer("long", Date.valueOf("2020-07-05"), true, "0933457892", "Ha Tinh"));
//        dao.insertOrder_Detail(new OrderDetail(1, 1, 1));
        float totalbyDate = dao.getOrderbymonth(3, 2021);
        System.out.println(totalbyDate);
      
       
    }

}
