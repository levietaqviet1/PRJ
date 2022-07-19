/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controller.BQT;

import DAO_Thu.ApplicationDAO;
import dao.OfficerFUDao;
import dao.StudentDao;
import dao.TeacherDao;
import dao.UserDao;
import dao.studentParentsDao;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.util.ArrayList;
import model.OfficerFU;
import model.Student;
import model.StudentParents;
import model.Teacher;
import modelTHU.Application;

/**
 *
 * @author 84399
 */
public class ViewApplicationBQT extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        if (request.getSession().getAttribute("dalogin_bqt") == null) {
            response.sendRedirect("homeBQT");
        } else {
            ArrayList<Application> listapp = new ArrayList<Application>();
            ApplicationDAO d = new ApplicationDAO();
            listapp = d.getAll();
            if (request.getParameter("OK") != null) {
                if (request.getParameter("loai") != null) {
                    String loai = request.getParameter("loai");
                    if (loai.equals("0")) {
                        listapp = d.getAll();
                    }
                    if (loai.equals("1")) {
                        listapp = d.getAccepted();
                    }
                    if (loai.equals("2")) {
                        listapp = d.getNOTApproved();
                    }
                    if (loai.equals("3")) {
                        listapp = d.getAccepted();
                    }
                    if (loai.equals("4")) {
                        listapp = d.getRejected();
                    }
                }

            }

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
            request.setAttribute("loai", request.getParameter("loai"));

            request.getSession().setAttribute("listapp", list);
            request.getRequestDispatcher("bqt/index/ViewApplication.jsp").forward(request, response);
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
