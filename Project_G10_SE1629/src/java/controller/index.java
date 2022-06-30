/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controller;

import dao.RoleDao;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.util.ArrayList;
import model.*;

/**
 *
 * @author NCC
 */
public class index extends HttpServlet {

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        HttpSession session = request.getSession();
        if (request.getSession().getAttribute("dalogin") == null) {
            response.sendRedirect("homeBQT");
        }
        // student
        if (session.getAttribute("st_login_successful") != null) {
            Student student = (Student) session.getAttribute("st_login_successful");

            int giaodien = 1;
            if (request.getParameter("sid") != null) {
                try {
                    giaodien = Integer.parseInt((String) request.getParameter("sid"));
                    if (student.getStatus().getId() == 1 || student.getStatus().getId() == 3) {
                        if (giaodien != 1 && giaodien != 7) {
                            giaodien = 1;
                        }
                    }
                    if (giaodien > 7) {
                        giaodien = 1;
                    }
                } catch (Exception e) {
                    request.getRequestDispatcher("student/index/home.jsp").forward(request, response);
                }

            }
            session.setAttribute("giaoDien", giaodien);
            request.getRequestDispatcher("student/index/indexStudent.jsp").forward(request, response);
        }
        
        // BQT
        if (session.getAttribute("bqt_login_successful") != null) {
            BQT bQT = (BQT) session.getAttribute("bqt_login_successful");
            Teacher teacher = new Teacher();
            TeacherDao teacherDao = new TeacherDao();
            RoleDao roleDao = new RoleDao();
            ArrayList<Teacher> listTeacher = teacherDao.getAll();
            ArrayList<Role> listRole = roleDao.getAll();
            request.setAttribute("listTeacher", listTeacher);
            request.setAttribute("listRole", listRole);
            request.getRequestDispatcher("bqt/index/indexBQT.jsp").forward(request, response);
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
