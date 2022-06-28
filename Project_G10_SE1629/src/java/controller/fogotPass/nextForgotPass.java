/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controller.fogotPass;

import MyUntils.*;
import dao.*;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import model.*;

/**
 *
 * @author NCC
 */
public class nextForgotPass extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        if (request.getParameter("forPass") != null) {
            request.getRequestDispatcher("index/forgotPassW.jsp").forward(request, response);
        } else {
            response.sendRedirect("home");
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
        if (request.getSession().getAttribute("dalogin") != null) {
            response.sendRedirect("index");
        } else {
            if (request.getParameter("forgot") != null) {
                PrintWriter out = response.getWriter();
                int countCheck = 0;
                int countTrue = 0;
                Validate validate = new Validate();
                StudentDao studentDao = new StudentDao();
                UserDao userDao = new UserDao();
                String accountFor = request.getParameter("accountFor").trim();
                String firstNameFor = request.getParameter("firstNameFor").trim().toLowerCase();
                String lastNameFor = request.getParameter("lastNameFor").trim().toLowerCase();
                String dateOfBirthinFor = request.getParameter("dateOfBirthinFor").trim();
                String genderinFor = request.getParameter("genderinFor").trim();

                String telephoneFor = request.getParameter("telephoneFor").trim();
                String emailFor = request.getParameter("emailFor").trim().toLowerCase();
                String specializedFor = request.getParameter("specializedFor").trim();
                String campusFor = request.getParameter("campusFor").trim();
                String mess = "";
                if (accountFor.length() > 2) {
                    int idAccount = userDao.checkAccountUser(accountFor);

                    if (idAccount != -1) {

                        if (!validate.checkInputStringNotEmail(firstNameFor) || firstNameFor.length() < 2
                                || !validate.checkInputStringNotEmail(lastNameFor) || lastNameFor.length() < 2
                                || dateOfBirthinFor == null || !validate.checkPhone(telephoneFor)
                                || telephoneFor.length() < 10 || !validate.checkInputStringEmail(emailFor)) {
                            countCheck++;
                        }

                        if (countCheck == 0) {
                            if (studentDao.checkPhoneExit(telephoneFor) == 1) {
                                Specializedin specializedin = new Specializedin(Integer.parseInt(specializedFor));
                                Campus campus = new Campus(Integer.parseInt(campusFor));
                                User user = new User(String.valueOf(idAccount));
                                Student student = new Student(firstNameFor, lastNameFor, genderinFor.equals("1") ? true : false, dateOfBirthinFor,
                                        telephoneFor, emailFor, specializedin, campus, user);
                                String pass = RandomString.RandomStringg(12);
                                user = new User(String.valueOf(idAccount), accountFor, pass);
                                userDao.updateUserPass(user);
                                if (studentDao.checkInforStudent(student) == 1) {
                                    countTrue++;
                                    String topic = "FPT-University-Password Recovery";
                                    String content = "<html lang=\"en\">\n"
                                            + "<head>\n"
                                            + "    <title></title>\n"
                                            + "    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n"
                                            + "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n"
                                            + "    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\" />\n"
                                            + "</head>\n"
                                            + "<body>\n"
                                            + "Dear " + student.getFirstName() + "<br/>\n <br/>"
                                            + "We have received your password reset request.<br/>\n"
                                            + "Account: <span style='color: green;'> " + accountFor + "</span><br/>\n"
                                            + "Password: <span style='color: green;'> " + user.getPassword() + "</span><br/>\n"
                                            + "You can follow up through FPT University's website or wait for the next email to respond to your application<br/>"
                                            + "</body>\n"
                                            + "</html>";

                                    String acc_TK_Mail_Send = "phongdaotaofbt@gmail.com";
                                    String acc_MK_Mail_Send = "npmgjujnxbtswmit";
                                    SendMail.SendMail(student.getGmail(), topic, content, acc_TK_Mail_Send, acc_MK_Mail_Send);
                                    HttpSession session = request.getSession();
                                    session.setAttribute("suDungsendMall", "aa");
                                    session.removeAttribute("confirmEmail_st");
                                    session.removeAttribute("account_session_student");
                                    session.setAttribute("confirmEmail_forPass", "aa");
                                    session.setMaxInactiveInterval(60 * 60);
                                    response.sendRedirect("sendEmaillSu");
                                }

                            }
                        }

                    }
                }
                if (countTrue == 0) {
                    request.setAttribute("accountFor", accountFor);
                    request.setAttribute("firstNameFor", firstNameFor);
                    request.setAttribute("lastNameFor", lastNameFor);
                    request.setAttribute("dateOfBirthinFor", dateOfBirthinFor);
                    request.setAttribute("genderinFor", genderinFor);
                    request.setAttribute("telephoneFor", telephoneFor);
                    request.setAttribute("emailFor", emailFor);
                    request.setAttribute("specializedFor", specializedFor);
                    request.setAttribute("campusFor", campusFor);
                    request.setAttribute("accountFor_mess", "Sai thông tin hoặc account không tồn tại");
                    request.getRequestDispatcher("index/forgotPassW.jsp").forward(request, response);

                }

            } else {
                request.getRequestDispatcher("index/forgotPassW.jsp").forward(request, response);
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
