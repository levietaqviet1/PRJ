/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controller.BQT;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 *
 * @author NCC
 */
public class addAccountBQT extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        if (request.getSession().getAttribute("dalogin_bqt") == null) {
            response.sendRedirect("homeBQT");
        } else {
            if (request.getParameter("roleAdd") != null) {
                int role = Integer.parseInt(request.getParameter("roleAdd"));
                if (role == 1) {
                    //bqt

                }
                if (role == 2) {
                    //sv
                }
                if (role == 3) {
                    //gv
                }
                if (role == 4) {
                    //cb
                }
                if (role == 5) {
                    //ph
                }
                request.setAttribute("updateID", role);
                request.getRequestDispatcher("bqt/index/AddAccountNew.jsp").forward(request, response);
            } else {
                request.setAttribute("addAccAttibu", "1");
                request.getRequestDispatcher("bqt/index/indexBQT.jsp").forward(request, response);
            }

        }

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
        if (request.getSession().getAttribute("dalogin_bqt") == null) {
            response.sendRedirect("homeBQT");
        } else {
            if (request.getParameter("roleAdd") != null) {
                int role = Integer.parseInt(request.getParameter("roleAdd"));
                if (role == 1) {
                    //bqt

                }
                if (role == 2) {
                    //sv
                }
                if (role == 3) {
                    //gv
                }
                if (role == 4) {
                    //cb
                }
                if (role == 5) {
                    //ph
                }
                request.setAttribute("updateID", role);
                request.getRequestDispatcher("bqt/index/AddAccountNew.jsp").forward(request, response);
            } else {
                request.setAttribute("addAccAttibu", "1");
                request.getRequestDispatcher("bqt/index/indexBQT.jsp").forward(request, response);
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
