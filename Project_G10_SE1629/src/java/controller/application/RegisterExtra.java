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
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import model.Student;
import model.Application;

/**
 *
 * @author 84399
 */
public class RegisterExtra extends HttpServlet {
    
    static Date checkDate(String string, String format) {
        Date date = new Date();
        SimpleDateFormat df = new SimpleDateFormat(format);
        df.setLenient(false);
        
            try {
                date = df.parse(string);
                return date;

            } catch (ParseException e) {
                System.out.println("Invalid date!!!");
            }
        
        return null;
    }

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

                String nameapp = "Register Extra Courses";
                String subcode = request.getParameter("subject");
                String subclass = request.getParameter("class");
                String time = request.getParameter("time");
                LocalDate date1 = LocalDate.parse(time);
                LocalDate date2 = java.time.LocalDate.now();
                if(!date1.isBefore(date2)) {
                    student = (Student) request.getSession().getAttribute("st_login_successful");
                    ApplicationDAO d = new ApplicationDAO();
                    if (request.getParameter("OK") != null) {
                        Application app = new Application(nameapp, "Subject: " + subcode + ", Class: " + subclass + ", Time study: " + time, student.getId(), String.valueOf(java.time.LocalDate.now()));
                        dao.insertApplication(app);
                        request.setAttribute("message", "Nộp đơn thành công! Send Application Sucessfully!");
                    }
                }else{
                    request.setAttribute("message", "Invalid Date!");
                }
            }
        }
        request.setAttribute("giaoDien", "4");
        request.getRequestDispatcher("student/index/indexStudent.jsp").forward(request, response);

    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
