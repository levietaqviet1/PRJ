/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controller.sendEmail;

import MyUntils.RandomString;
import MyUntils.SendMail;
import dao.SpecializedinDao;
import dao.StudentDao;
import dao.*;
import dao.studentParentsDao;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import model.Student;
import model.StudentParents;
import model.*;

/**
 *
 * @author NCC
 */
public class ConfirmEmail extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try ( PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */

            String id = request.getParameter("id");
            if (request.getSession().getAttribute("confirmEmail_st").equals(id)) {
                if (request.getSession().getAttribute("account_session_student") != null) {
                    Student student = (Student) request.getSession().getAttribute("account_session_student"); // hung lai dữ liệu
                    User user = new User();
                    UserDao userDao = new UserDao();
                    StudentDao studentDao = new StudentDao();
                    SpecializedinDao specializedinDao = new SpecializedinDao();
                    String[] userNameLast = student.getLastName().split(" "); // tach chuỗi
                    String userName = student.getFirstName();
                    for (String name : userNameLast) {
                        userName += name.charAt(0);
                    }
                    userName = userName.toLowerCase();
                    student.setCodeStudent(studentDao.getMssv(specializedinDao.getCodeSpecializedin(student.getDateOfStart())));
                    userName += student.getCodeStudent();
                    String pass = RandomString.RandomStringg(8);
                    user = new User(String.valueOf(userDao.getIdAccount() + 1), userName, pass);
                    student.setUser(user);
                    out.print(student.toString() + "<br/>");
                    out.print(user.toString());

                    userDao.insertUser(user, "2"); // insert user vao datase
                    studentDao.insertStudent(student); // insert student cao database

                    String topic = "FPT-University";
                    String content = "<html lang=\"en\">\n"
                            + "<head>\n"
                            + "    <title></title>\n"
                            + "    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n"
                            + "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n"
                            + "    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\" />\n"
                            + "</head>\n"
                            + "<body>\n"
                            + "Dear " + student.getFirstName() + "<br/>\n <br/>"
                            + "We have received your application to FPT University.<br/>\n"
                            + "You can login to check your application status<br/>\n"
                            + "Please do not share your account with others<br/>\n"
                            + "Account: <span style='color: red;'> " + student.getUser().getUsername() + "</span><br/>\n"
                            + "Password: <span style='color: red;'> " + student.getUser().getPassword() + "</span><br/>\n"
                            + "You can follow up through FPT University's website or wait for the next email to respond to your application<br/>"
                            + "</body>\n"
                            + "</html>";

                    String acc_TK_Mail_Send = "phongdaotaofbt@gmail.com";
                    String acc_MK_Mail_Send = "npmgjujnxbtswmit";
                    SendMail sen = new SendMail();
                    sen.sendFuncition(student.getGmail(), topic, content, acc_TK_Mail_Send, acc_MK_Mail_Send); 
                    HttpSession session = request.getSession();
                    session.setAttribute("suDungsendMall", "aa");
                    session.removeAttribute("confirmEmail_st");
                    session.removeAttribute("account_session_student");
                    session.setAttribute("confirmEmail_succ", "aa");
                    session.setMaxInactiveInterval(60 * 60);
                    response.sendRedirect("sendEmaillSu");

                }

            }
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        HttpSession session = request.getSession();
        if (request.getSession().getAttribute("st_login_tam_thoi") != null) {
            if (request.getSession().getAttribute("parentStudenthome0") != null) {
                if (request.getSession().getAttribute("codeXacMinhHome0") != null) {
                    String codeXm = (String) request.getSession().getAttribute("codeXacMinhHome0");
                    String codeHome0 = request.getParameter("codeHome0");
                    if (!codeXm.equals(codeHome0)) {
                        response.sendRedirect("index?erroMaill=codeHome0");
                    } else {
                        StudentParents studentParents = (StudentParents) request.getSession().getAttribute("parentStudenthome0");
                        studentParentsDao studentParentsDao = new studentParentsDao();
                        studentParentsDao.insert(studentParents);
                        response.sendRedirect("index?thanhCongMaill=1");
                    }

                }
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
