/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import DAL.OrderDAO;
import DAL.ProductDAO;
import DAL.StockDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Customer;
import model.Order;
import model.OrderDetail;
import model.Product;
import model.Stock;

/**
 *
 * @author Lehait
 */
public class OrderController extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet OrderController</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet OrderController at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String name = request.getParameter("Name");
        Date dob = Date.valueOf(request.getParameter("Dob"));
        Date OrderDate = Date.valueOf(request.getParameter("ODate"));
        boolean gender = request.getParameter("gender").equals("male");
        String address = request.getParameter("Address");
        String phone = request.getParameter("Phone");
        
        Cookie arr[] = request.getCookies();
        PrintWriter out = response.getWriter();
        List<Product> list = new ArrayList<>();
        ProductDAO dao = new ProductDAO();
        OrderDAO dao1 = new OrderDAO();
        dao1.insertCustomer(new Customer(name, dob, gender, phone, address));
        StockDAO dao2 = new StockDAO();
        
        for (Cookie o : arr) {
            if (o.getName().equals("id")) {
                String txt[] = o.getValue().split(",");
                for (String s : txt) {
                    Product p = dao.getProduct(s);
                    p.setAmount(1);
                    list.add(p);
                }
            }
            
        }
        for (int i = 0; i < list.size(); i++) {
            int count = 1;
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i).getId() == list.get(j).getId()) {
                    count++;
                    list.remove(j);
                    j--;
                    list.get(i).setAmount(count);
                }
            }
        }
        float total = 0;
        for (Product o : list) {
            total = total + o.getAmount() * o.getPrice();
            
        }
        for (Cookie o : arr) {
            
            if (o.getName().equals("staffid")) {
                int Staffid = Integer.parseInt(o.getValue());
                dao1.insertOrder(new Order(OrderDate,total,(float)(1.1* total), dao1.getLastCusID(), Staffid));
            }
        }
        
        ArrayList<Stock> stock = dao2.getStock();
        for (Product o : list) {
            dao1.insertOrder_Detail(new OrderDetail(o.getId(), dao1.getLastOrderID(), o.getAmount()));
            for (Stock i : stock) {
                if (i.getId() == o.getId()) {
                    dao2.updateStock(new Stock(o.getId(), i.getAmount() - o.getAmount()));
                }
            }
            
        }
        for (Cookie o : arr) {
            
            if (o.getName().equals("id")) {
               o.setMaxAge(0);
               response.addCookie(o);
            }
        }
        
        response.sendRedirect("list");
        
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
