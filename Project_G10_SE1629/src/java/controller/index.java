/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controller;

import MyUntils.RandomString;
import MyUntils.SendMail;
import MyUntils.Validate;
import dao.Dao;
import dao.RoleDao;
import dao.studentParentsDao;
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
            response.sendRedirect("home");
        } else {
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
                        if (giaodien > 8) {
                            giaodien = 1;
                        }
                    } catch (Exception e) {
                        request.getRequestDispatcher("student/index/home.jsp").forward(request, response);
                    }
                }
                if (giaodien == 8) {
                    response.sendRedirect("view");
                } else {
                    session.setAttribute("giaoDien", giaodien);
                    request.getRequestDispatcher("student/index/indexStudent.jsp").forward(request, response);
                }
            }
            if (session.getAttribute("st_login_tam_thoi") != null) {
                int giaodien = 0;
                if (request.getParameter("sid") != null) {
                    try {
                        giaodien = Integer.parseInt((String) request.getParameter("sid"));
                        if (giaodien != 0 && giaodien != 7) {
                            giaodien = 0;
                        }
                    } catch (Exception e) {
                        request.getRequestDispatcher("student/index/home.jsp").forward(request, response);
                    }
                }
                if (request.getParameter("thanhCongMaill") != null) {
                    request.setAttribute("suc_home0", "Thành Công");
                    request.setAttribute("succCodeHome0", "Xác minh emaill thành công. Vui lòng đăng xuất để đăng nhập lại.");
                }
                if (request.getParameter("erroMaill") != null) {
                    request.setAttribute("errorCodeHome0", "Mã sai vui lòng kiểm tra lại");
                    request.setAttribute("codeHome0", request.getParameter("erroMaill"));
                }
                session.setAttribute("giaoDien", giaodien);
                request.getRequestDispatcher("student/index/indexStudent.jsp").forward(request, response);
            }
            // gv
            if (session.getAttribute("st_login_teacher") != null) {
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
                        if (giaodien > 8) {
                            giaodien = 1;
                        }
                    } catch (Exception e) {
                         request.getRequestDispatcher("teacher/index.jsp").forward(request, response);
                    }
                }
//                if (giaodien == 8) {
//                    response.sendRedirect("view");
//                } else {
                session.setAttribute("giaoDien", giaodien);
                request.getRequestDispatcher("teacher/index.jsp").forward(request, response);
//                }
            }

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
        PrintWriter out = response.getWriter();
        HttpSession session = request.getSession();
        if (request.getSession().getAttribute("dalogin") == null) {
            response.sendRedirect("home");
        } else {
            if (request.getSession().getAttribute("st_login_tam_thoi") != null) {
                Student student = (Student) request.getSession().getAttribute("st_login_tam_thoi");
                Dao dao = new Dao();
                int countTrue = 0;
                Validate validate = new Validate();
                String txtFirstName = request.getParameter("txtFirstName");
                String txtLastName = request.getParameter("txtLastName");
                String gender = request.getParameter("gender");
                String txtEmail = request.getParameter("txtEmail");
                String dob = request.getParameter("dob");
                String txtPhone = request.getParameter("txtPhone");
                String ttAddress = request.getParameter("ttAddress");
                String slRole = request.getParameter("slRole");
                String slCampus = request.getParameter("slCampus");
                if (txtFirstName.length() < 2) {
                    countTrue++;
                    request.setAttribute("erroFirstName", "FirstName quá ngắn");
                } else {
                    if (!validate.checkInputStringNotEmail(txtFirstName)) {
                        countTrue++;
                        request.setAttribute("erroFirstName", "FirstName sai định dạng ko dấu ko ký tự đặc biệt");
                    }
                }
                if (txtLastName.length() < 2) {
                    countTrue++;
                    request.setAttribute("erroLastName", "LastName quá ngắn");
                } else {
                    if (!validate.checkInputStringNotEmail(txtLastName)) {
                        countTrue++;
                        request.setAttribute("erroLastName", "LastName sai định dạng ko dấu ko ký tự đặc biệt");
                    }
                }

                if (!validate.checkInputStringEmail(txtEmail)) {
                    countTrue++;
                    request.setAttribute("erroMail", "Email sai định dạng");
                } else {
                    if (dao.checkMailExit(txtEmail) == 1) {
                        countTrue++;
                        request.setAttribute("erroMail", "Email đã tồn tại vui lòng sử dụng mail khác");
                    }
                }
                if (!validate.checkPhone(txtPhone)) {
                    countTrue++;
                    request.setAttribute("erroPhone", "Phone sai định dạng chỉ nhận số ở Việt Nam");
                } else {
                    if (dao.checkPhoneExit(txtPhone) == 1) {
                        countTrue++;
                        request.setAttribute("erroPhone", "Phone đã tồn tại vui lòng sử dụng phone khác");
                    }
                }
                if (ttAddress.length() < 6) {
                    countTrue++;
                    request.setAttribute("erroAddress", "Địa chỉ quá ngắn");
                }
                if (getYear(student.getDateOfBirth()) - getYear(dob) <= 15) {
                    countTrue++;
                    request.setAttribute("errodob", "Phụ huynh phải lơn hơn ít nhất 15 tuổi");
                }
                if (getYear(student.getDateOfBirth()) - getYear(dob) > 100) {
                    countTrue++;
                    request.setAttribute("errodob", "Phụ huynh lớn hơn 100 tuổi vui lòng liên hệ cán bộ để cập nhập");
                }

                if (countTrue == 0) {
                    Campus campus = new Campus(Integer.parseInt(slCampus));
                    boolean gen = true;
                    if (gender.equals(0)) {
                        gen = false;
                    }
                    User user = new User();
                    StudentParents studentParents = new StudentParents(0, txtFirstName, txtLastName, gen, dob, txtPhone, txtEmail, ttAddress, campus, user, student, "", true);
                    session.setAttribute("parentStudenthome0", studentParents);
                    String code = sendGmailGetCode(studentParents);
                    session.setAttribute("codeXacMinhHome0", code);
                    session.setMaxInactiveInterval(60 * 60);
                } else {
                    request.setAttribute("home_0_txtFirstName", txtFirstName);
                    request.setAttribute("home_0_txtLastName", txtLastName);
                    request.setAttribute("home_0_gender", gender);
                    request.setAttribute("home_0_txtEmail", txtEmail);
                    request.setAttribute("home_0_dob", dob);
                    request.setAttribute("home_0_txtPhone", txtPhone);
                    request.setAttribute("home_0_ttAddress", ttAddress);
//                    out.print(dob+"sinh vien   "+ student.getDateOfBirth());
//                    return;

                }
                session.setAttribute("home_0_giaoDien", 0);
                request.getRequestDispatcher("student/index/indexStudent.jsp").forward(request, response);
            }
        }
    }

    public int getYear(String t) {
        String[] arr = t.split("-");
        return Integer.parseInt(arr[0]);
    }

    public String sendGmailGetCode(StudentParents studentParents) {
        String code = RandomString.RandomStringg(13);

        String topic = "FPT-University";
        String content = "<html lang=\"en\">\n"
                + "<head>\n"
                + "    <title></title>\n"
                + "    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n"
                + "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n"
                + "    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\" />\n"
                + "</head>\n"
                + "<body>\n"
                + "Dear " + studentParents.getFirstName() + "<br/>\n"
                + "We have received your information<br/>\n"
                + "Code: <span style=\"color: red;\">" + code + "</span><br/> "
                + "Please do not share code  with others<br/>\n"
                + "You can follow up through FPT University's website or wait for the next email to respond to your application<br/>"
                + "</body>\n"
                + "</html>";

        String acc_TK_Mail_Send = "phongdaotaofbt@gmail.com";
        String acc_MK_Mail_Send = "npmgjujnxbtswmit";
        SendMail.SendMail(studentParents.getGmail(), topic, content, acc_TK_Mail_Send, acc_MK_Mail_Send);
        return code;
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
