/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controller.application;

import DAO_Thu.ApplicationDAO;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import model.Student;
import modelTHU.Application;

/**
 *
 * @author 84399
 */
public class ViewApplication extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        if (request.getSession().getAttribute("dalogin") == null) {
            response.sendRedirect("home");
        } else {
            Student student = new Student();
            student = (Student) request.getSession().getAttribute("st_login_successful");
            ArrayList<Application> listapp = new ArrayList<Application>();
            ApplicationDAO d = new ApplicationDAO();
            listapp = d.getAllbyId(String.valueOf(student.getId()));

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

            request.getSession().setAttribute("listapp", list);
            request.setAttribute("giaoDien", "8");
            request.getRequestDispatcher("student/index/indexStudent.jsp").forward(request, response);
        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
