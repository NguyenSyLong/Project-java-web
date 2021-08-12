/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import DAL.CategoryDAO;
import DAL.ProductDAO;
import DAL.StockDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Category;
import model.Product;
import model.Sick;
import model.Stock;

/**
 *
 * @author Lehait
 */
public class ProductController extends HttpServlet {

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
        ProductDAO dao = new ProductDAO();
        CategoryDAO dao1 = new CategoryDAO();
        StockDAO dao2 = new StockDAO();
        dao1.getCate();
        ArrayList<Stock> stock = dao2.getStock();
        ArrayList<Product> pro = dao.getPro();
        ArrayList<Category> cate = dao1.getCate();
        ArrayList<Sick> sick = dao1.getSick();
        String indexPage= request.getParameter("index");
         if(indexPage==null){
            indexPage ="1";
        }
        int index = Integer.parseInt(indexPage);
       

        
        int total = dao.getTotalProduct();
        int endPage = total / 3;
        if (total % 3 != 0) {
            endPage++;
        }
        List<Product> pagingProduct = dao.pagingProduct(index);
        request.setAttribute("listST", stock);
        request.setAttribute("listC", cate);
        request.setAttribute("listP", pagingProduct);
        request.setAttribute("listS", sick);
        Cookie arr[] = request.getCookies();
        List<Product> list = new ArrayList<>();
        for (Cookie o : arr) {
            if (o.getName().equals("id")) {
                String txt[] = o.getValue().split(",");
                for (String s : txt) {
                    Product p =  dao.getProduct(s);
                  p.setAmount(1);
                    list.add(p);
                }
            }
        }
        for (int i = 0; i < list.size(); i++) {
            int count = 1;
            for (int j = i+1; j < list.size(); j++) {
                if(list.get(i).getId() == list.get(j).getId()){
                    count++;
                    list.remove(j);
                    j--;
                    list.get(i).setAmount(count);
                }
            }
        }
        request.setAttribute("endP", endPage);
        request.setAttribute("tag", index);
        request.setAttribute("count", list.size());
        request.getRequestDispatcher("Home.jsp").forward(request, response);

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
