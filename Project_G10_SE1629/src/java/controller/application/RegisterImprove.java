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
import java.time.LocalDate;
import model.Student;
import modelTHU.Application;

/**
 *
 * @author 84399
 */
public class RegisterImprove extends HttpServlet {

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

                String nameapp = "Register To Improve Mark";
                String subcode = request.getParameter("subject");
                String subclass = request.getParameter("class");
                String time = request.getParameter("time");
                LocalDate date1 = LocalDate.parse(time);
                LocalDate date2 = java.time.LocalDate.now();
                if (!date1.isBefore(date2)) {
                    student = (Student) request.getSession().getAttribute("st_login_successful");
                    ApplicationDAO d = new ApplicationDAO();
                    if (request.getParameter("OK") != null) {
                        Application app = new Application(nameapp, "Subject: " + subcode + ", Class: " + subclass + ", Time study: " + time, student.getId(), String.valueOf(java.time.LocalDate.now()));
                        dao.insertApplication(app);
                        request.setAttribute("message", "Nộp đơn thành công! Send Application Sucessfully!");
                    }
                } else {
                    request.setAttribute("message", "Invalid Date!");
                }

            }

        }
        request.setAttribute("giaoDien", "5");
        request.getRequestDispatcher("student/index/indexStudent.jsp").forward(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
