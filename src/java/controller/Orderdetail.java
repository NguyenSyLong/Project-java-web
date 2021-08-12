/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import DAL.LoginDAO;
import DAL.OrderDAO;
import DAL.ProductDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Customer;
import model.Order;
import model.OrderDetail;
import model.Product;
import model.Staff;

/**
 *
 * @author Lehait
 */
public class Orderdetail extends HttpServlet {

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
        int id = Integer.parseInt(request.getParameter("id"));
        OrderDAO dao = new OrderDAO();
        LoginDAO dao1 = new LoginDAO();
        ProductDAO dao2 = new ProductDAO();
        ArrayList<Product> products = new ArrayList<>();
        ArrayList<Order> order = dao.getOdetail(id);
        ArrayList<Customer> customer = dao.getCustomerdetail(id);
        ArrayList<OrderDetail> orderdetail = dao.getOrderdetail(id);
        for (OrderDetail o : orderdetail) {
            products.add(dao2.getProdetail(o.getPro_id()));
        }
        ArrayList<Staff> staff =dao1.getStaff();
        request.setAttribute("listO", order);
        request.setAttribute("listOr", orderdetail);
        request.setAttribute("listP", products);
        request.setAttribute("listC", customer);
        request.setAttribute("listS", staff);
        request.getRequestDispatcher("OrderDetail.jsp").forward(request, response);
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
        processRequest(request, response);
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
