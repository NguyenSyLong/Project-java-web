/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import DAL.CategoryDAO;
import DAL.ImportDAO;
import DAL.ProductDAO;
import DAL.StockDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Category;
import model.Import;
import model.Product;
import model.Stock;

/**
 *
 * @author Lehait
 */
public class AddProductController extends HttpServlet {

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
            out.println("<title>Servlet AddProductController</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet AddProductController at " + request.getContextPath() + "</h1>");
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
        CategoryDAO dao = new CategoryDAO();
        ArrayList<Category> cate = dao.getCate();
        request.setAttribute("listC", cate);
        request.getRequestDispatcher("AddP.jsp").forward(request, response);
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
        Date date = Date.valueOf(request.getParameter("Date"));
        float price = Float.parseFloat(request.getParameter("OPrice"));
        float iprice = Float.parseFloat(request.getParameter("IPrice"));
        int amount = Integer.parseInt(request.getParameter("amount"));
        int cateid = Integer.parseInt(request.getParameter("select"));
        String desc = request.getParameter("Desc");
        String origin = request.getParameter("Origin");
        String image = request.getParameter("Image");
        ProductDAO dao = new ProductDAO();
        dao.insertProduct(new Product(name, desc, origin, image, price, cateid));
        ImportDAO dao1 = new ImportDAO();
        StockDAO dao2 = new StockDAO();
         Cookie arr[] = request.getCookies();
        for (Cookie o : arr) {
            
            if (o.getName().equals("staffid")) {
                int Staffid = Integer.parseInt(o.getValue());
               dao1.insertImport(new Import(date, iprice, dao.getLastProductID(), Staffid)); 
            }
        }
        dao2.insertStock(new Stock(dao.getLastProductID(), amount));
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
