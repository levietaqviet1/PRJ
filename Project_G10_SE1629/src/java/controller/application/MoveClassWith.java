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
import model.Student;
import modelTHU.Application;

/**
 *
 * @author 84399
 */
public class MoveClassWith extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        if (request.getSession().getAttribute("dalogin") == null) {
            response.sendRedirect("home");
        }
        ApplicationDAO dao = new ApplicationDAO();
        Student student = new Student();
        if (request.getSession().getAttribute("dalogin") != null) {
            if (request.getSession().getAttribute("st_login_successful") != null) {

                String nameapp = "Move Class With Other Student";
                String subcode = request.getParameter("subject");
                String nameA = request.getParameter("nameA");
                String nameB = request.getParameter("nameB");
                String fromclass = request.getParameter("ClassA");
                String toclass = request.getParameter("ClassB");
                student = (Student) request.getSession().getAttribute("st_login_successful");

                ApplicationDAO d = new ApplicationDAO();
                if (request.getParameter("OK") != null) {
                    Application app = new Application(nameapp, " Subject: " + subcode + ", Student: " + nameA + ", Exchange With Student: " + nameB + " from " + fromclass + " to class " + toclass, student.getId(), String.valueOf(java.time.LocalDate.now()));
                    dao.insertApplication(app);
                    request.setAttribute("message", "Nộp đơn thành công!  Send Application Sucessfully!");
                }

            }

        }
        request.setAttribute("giaoDien", "3");
        request.getRequestDispatcher("student/index/indexStudent.jsp").forward(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
