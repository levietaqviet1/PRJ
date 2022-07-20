/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controller.sendEmail;

import MyUntils.RandomString;
import MyUntils.SendMail;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import location.locationHot;
import model.Student;
import model.User;

/**
 *
 * @author NCC
 */
public class NextConfirmEmail extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        if (request.getSession().getAttribute("account_session_student") != null) {
            Student student = (Student) request.getSession().getAttribute("account_session_student");
            locationHot location = new locationHot();
            String code = RandomString.RandomStringg(6);
            String topic = "FPT-Xác minh Email";
            String content = "<html lang=\"en\">\n"
                    + "<head>\n"
                    + "    <title></title>\n"
                    + "    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n"
                    + "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n"
                    + "    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\" />\n"
                    + "</head>\n"
                    + "<body>\n"
                    + "    Hello " + student.getFirstName() + " " + student.getLastName() + " !  Please click on the link below to activate Email:\n"
                    + "     <a href='http://localhost:" + String.valueOf(location.getLocal()) + "/Project_G10_SE1629/ConfirmEmail?id=" + code + "'><span style=\"color: red ;\">Click here</span></a> <br/>\n"
                    + "   Note: The activation link is only valid for 1 day. Thanks !\n"
                    + "</body>\n"
                    + "</html>";

            String acc_TK_Mail_Send = "phongdaotaofbt@gmail.com";
            String acc_MK_Mail_Send = "npmgjujnxbtswmit";
            SendMail sen = new SendMail();
            sen.sendFuncition(student.getGmail(), topic, content, acc_TK_Mail_Send, acc_MK_Mail_Send);

            HttpSession session = request.getSession();
            session.setAttribute("suDungsendMall", code);
            session.setAttribute("confirmEmail_st", code);
            session.setMaxInactiveInterval(60 * 60 * 24);
            response.sendRedirect("sendEmaillSu");

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
