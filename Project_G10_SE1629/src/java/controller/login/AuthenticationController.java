/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controller.login;

import MyUntils.*;
import dao.*;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import model.*;

/**
 *
 * @author NCC
 */
public class AuthenticationController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        if (request.getSession().getAttribute("dalogin") != null) {
            response.sendRedirect("index");
        } else {
            response.sendRedirect("home");
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        PrintWriter out = response.getWriter();
        Validate validate = new Validate();
        // student
        if (request.getParameter("login") != null || request.getParameter("signup") != null) {
            StudentDao studentDao = new StudentDao();
            String login = request.getParameter("login");
            if (login != null && login != "") {
                int countCheck = 0;
                String usernameup_login = request.getParameter("usernameup").trim();
                String passup_login = request.getParameter("passup").trim();
                String campusup_login = request.getParameter("campusup").trim();
                String roleup_login = request.getParameter("roleup").trim();
                Role role = new Role(Integer.parseInt(roleup_login));
                User user = new User(usernameup_login, passup_login, role);
                UserDao userDao = new UserDao();
                int checkU = userDao.checkUser(user); // check tai khoan 
                if (checkU != -1) {
                    if (roleup_login.equals("2")) {
                        Student student = studentDao.getStudentByidUser(checkU, campusup_login);
                        if (student != null) {
                            user = new User(student.getUser().getId(), usernameup_login, passup_login);
                            student.setUser(user);
                            countCheck++;
                            session.setAttribute("st_login_successful", student);
                            session.setAttribute("dalogin", student);
                            session.setMaxInactiveInterval(60 * 60 * 60);
                            response.sendRedirect("index");
                        }
                    }

                    if (roleup_login.equals("3")) {
                        countCheck++;
                    }
                    if (roleup_login.equals("4")) {
                        countCheck++;
                    }
                    if (roleup_login.equals("5")) {
                        countCheck++;
                    }
                }
                if (countCheck == 0) {
                    String mess = "Thông tin đăng nhập sai, hãy đăng nhập lại!";
                    request.setAttribute("usernameup", usernameup_login);
                    request.setAttribute("passup", passup_login);
                    request.setAttribute("campusup", campusup_login);
                    request.setAttribute("roleup", roleup_login);
                    request.setAttribute("messIn", mess);
                    request.getRequestDispatcher("student/index/home.jsp").forward(request, response);
                }

            }

            String signup = request.getParameter("signup");
            if (signup != null && signup != "") {
                String firstNamein_signup = request.getParameter("firstNamein").trim().toLowerCase();
                String lastNamein_signup = request.getParameter("lastNamein").trim().toLowerCase();
                String dateOfBirthin_signup = request.getParameter("dateOfBirthin").trim();
                String genderin_signup = request.getParameter("genderin").trim();
                String addressin_signup = request.getParameter("addressin").trim().toLowerCase();
                String telephonein_signup = request.getParameter("telephonein").trim();
                String emailin_signup = request.getParameter("emailin").trim().toLowerCase();
                String specializedin_signup = request.getParameter("specializedin").trim();
                String campusin_signup = request.getParameter("campusin").trim();

                String mess = "";
                int countCheck = 0;
                if (!validate.checkInputStringNotEmail(firstNamein_signup) || firstNamein_signup.length() < 2) {
                    mess = "First Name không hợp lệ  !!!";
                    request.setAttribute("firstNamein_mess", mess);
                    countCheck++;
                }
                if (!validate.checkInputStringNotEmail(lastNamein_signup) || lastNamein_signup.length() < 2) {
                    mess = "Last Name không hợp lệ  !!!";
                    request.setAttribute("lastNamein_mess", mess);
                    countCheck++;
                }
                if (dateOfBirthin_signup != null && dateOfBirthin_signup != "") {
                    Calendar c = Calendar.getInstance();
                    int y = c.get(Calendar.YEAR);
                    String[] dateArr = dateOfBirthin_signup.split("-");
                    int age = y - Integer.parseInt(dateArr[0]);
                    if (age <= 18) {
                        mess = "Chưa đủ tuổi đi học !!!";
                        request.setAttribute("ageup_mess", mess);
                        countCheck++;
                    } else if (age > 60) {
                        mess = "Quá 60 tuổi không được học !!!";
                        request.setAttribute("ageup_mess", mess);
                        countCheck++;
                    }
                } else {
                    mess = "Vui lòng nhập tuổi !!!";
                    request.setAttribute("notAgeup_mess", mess);
                    countCheck++;
                }

                if (!validate.checkInputStringNotEmail(addressin_signup) || addressin_signup.length() < 10) {
                    mess = "Địa chỉ không hợp lệ. VD: 123 ba đình hà nội !!!";
                    request.setAttribute("addressup_mess", mess);
                    countCheck++;
                }
                if (!validate.checkPhone(telephonein_signup) || telephonein_signup.length() < 10) {
                    mess = "Phone không hợp lệ chỉ nhận số ở Việt Nam !!!";
                    request.setAttribute("telephoneup_mess", mess);

                    countCheck++;
                }
                if (telephonein_signup.length() >= 10) {
                    if (studentDao.checkPhoneExit(telephonein_signup) == 1) {
                        mess = "Phone đã tồn tại !!!";
                        request.setAttribute("telephoneup_mess", mess);
                        countCheck++;
                    }
                }

                if (!validate.checkInputStringEmail(emailin_signup)) {
                    mess = "Email không hợp lệ !!!";
                    request.setAttribute("emailin_signup_mess", mess);
                    countCheck++;
                }
                if (studentDao.checkMailExit(emailin_signup) == 1) {
                    mess = "Email đã tồn tại !!!";
                    request.setAttribute("emailin_signup_mess", mess);
                    countCheck++;
                }
                if (countCheck != 0) {
                    request.setAttribute("firstNamein_signup", firstNamein_signup);
                    request.setAttribute("lastNameins_signup", lastNamein_signup);
                    request.setAttribute("addressin_signup", addressin_signup);
                    request.setAttribute("telephonein_signup", telephonein_signup);
                    request.setAttribute("emailin_signup", emailin_signup);
                    request.setAttribute("genderin_signup", genderin_signup);
                    request.setAttribute("specializedin_signup", specializedin_signup);
                    request.setAttribute("campusin_signup", campusin_signup);
                    request.setAttribute("messUp", mess);
                    request.setAttribute("dateOfBirthup_mess", dateOfBirthin_signup);
                    request.getRequestDispatcher("student/index/home.jsp").forward(request, response);
                } else {
                    User user = new User("", "");
                    Specializedin specializedin = new Specializedin(Integer.parseInt(specializedin_signup), "", "", "", "");
                    Campus campus = new Campus(Integer.parseInt(campusin_signup), "", "", "", "");
                    Status status = new Status(1, "");
                    Student student = new Student(-1, firstNamein_signup, lastNamein_signup, Integer.parseInt(genderin_signup) == 1 ? true : false,
                            dateOfBirthin_signup, telephonein_signup, emailin_signup, addressin_signup, specializedin_signup,
                            campusin_signup, specializedin, campus, status, "", user);
                    request.getSession().setAttribute("account_session_student", student);
                    response.sendRedirect("NextConfirmEmail");

                }

            }
        }

        //BQT
        if (request.getParameter("loginBQT") != null) {
            String loginBQT = request.getParameter("loginBQT");
            if (loginBQT != null && loginBQT != "") {
                int countCheck = 0;
                String usernameup_login = request.getParameter("usernameup").trim();
                String passup_login = request.getParameter("passup").trim();
                String campusup_login = request.getParameter("campusup").trim();
                Role role = new Role(1);
                User user = new User(usernameup_login, passup_login, role);
                UserDao userDao = new UserDao();
                int checkU = userDao.checkUser(user); // check tai khoan 
                if (checkU != -1) {
                    BqtDao bqtDao = new BqtDao();
                    BQT bqt = bqtDao.getBqt(checkU, campusup_login);
                    if (bqt != null) {
                        user = new User(bqt.getUser().getId(), usernameup_login, passup_login);
                        bqt.setUser(user);
                        countCheck++;
                        session.setAttribute("bqt_login_successful", bqt);
                        session.setAttribute("dalogin_bqt", bqt);
                        session.setMaxInactiveInterval(60 * 60 * 60);
                        response.sendRedirect("indexBQT?nextAccount=1");
                    }
                }
                if (countCheck == 0) {
                    String mess = "Thông tin đăng nhập sai, hãy đăng nhập lại!";
                    request.setAttribute("usernameup", usernameup_login);
                    request.setAttribute("passup", passup_login);
                    request.setAttribute("campusup", campusup_login);
                    request.setAttribute("messIn", mess);
                    request.getRequestDispatcher("bqt/home.jsp").forward(request, response);
                }

            }
        }

    }

    public Cookie addCookie(String nameT, String dataT) {
        Cookie cookie = new Cookie(nameT, dataT);
        cookie.setMaxAge(60);
        return cookie;

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
