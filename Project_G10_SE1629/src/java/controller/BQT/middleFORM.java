/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controller.BQT;

import DAO_Thu.ApplicationDAO;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.time.LocalDate;
import java.util.ArrayList;
import modelTHU.Application;

/**
 *
 * @author 84399
 */
public class middleFORM extends HttpServlet {

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
        try ( PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet middleFORM</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet middleFORM at " + request.getContextPath() + "</h1>");
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
        if (request.getSession().getAttribute("bqt_login_successful") == null) {
            response.sendRedirect("homeBQT");
        } else {
            int id = Integer.parseInt(request.getParameter("index"));
            int option = Integer.parseInt(request.getParameter("option"));
            String lido = request.getParameter("lido");
            ApplicationDAO d = new ApplicationDAO();
            if (request.getParameter("submit") != null) {
                d.updateStatus(id, option, lido);
                ArrayList<Application> listapp = new ArrayList<>();
                listapp = d.getAll();

                int size = listapp.size();
                int numpage = (size % 10 == 0) ? size / 10 : size / 10 + 1;

                //Tìm page
                int page = 1;
                String xpage = request.getParameter("xpage");
                if (xpage != null) {
                    page = Integer.parseInt(xpage);
                }
                int start = (page - 1) * 10;
                int end = Math.min(page * 10 - 1, size - 1);

                ArrayList<Application> list = d.getListByPage(listapp, start, end);
                request.setAttribute("numpage", numpage);

                request.setAttribute("listapp", list);
                request.getRequestDispatcher("bqt/index/ViewApplication.jsp").forward(request, response);
            }
        }
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
