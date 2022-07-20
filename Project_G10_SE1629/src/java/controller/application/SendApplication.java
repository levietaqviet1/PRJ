/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controller.application;

import dao.ApplicationDAO;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Student;
import model.Application;

/**
 *
 * @author 84399
 */
public class SendApplication extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        if (request.getSession().getAttribute("dalogin") == null) {
            response.sendRedirect("home");
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        if (request.getSession().getAttribute("dalogin") == null) {
            response.sendRedirect("home");
        } else {
            ApplicationDAO dao = new ApplicationDAO();
            Student student = new Student();
            if (request.getSession().getAttribute("dalogin") != null) {
                if (request.getSession().getAttribute("st_login_successful") != null) {

                    String nameapp = request.getParameter("option");
                    String purpose = request.getParameter("purpose");
                    student = (Student) request.getSession().getAttribute("st_login_successful");
                    ApplicationDAO d = new ApplicationDAO();

                    if (request.getParameter("OK") != null) {
                        Application app = new Application(nameapp, " Nội dung đơn: " + purpose, student.getId(), String.valueOf(java.time.LocalDate.now()));
                        dao.insertApplication(app);
                        request.setAttribute("message", "Nộp đơn thành công! Send Application Sucessfully!");
                    }

                }

            }
            request.setAttribute("giaoDien", "6");
            request.getRequestDispatcher("student/index/indexStudent.jsp").forward(request, response);
        }

    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
