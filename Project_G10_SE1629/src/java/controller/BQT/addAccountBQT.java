/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controller.BQT;

import MyUntils.RandomString;
import MyUntils.SendMail;
import MyUntils.Validate;
import dao.BqtDao;
import dao.Dao;
import dao.UserDao;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import model.BQT;
import model.Campus;
import model.StudentParents;
import model.User;

/**
 *
 * @author NCC
 */
public class addAccountBQT extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        if (request.getSession().getAttribute("dalogin_bqt") == null) {
            response.sendRedirect("homeBQT");
        } else {
            if (request.getParameter("erroMaill") != null) {
                request.setAttribute("errorCodeHome0", "Mã sai vui lòng kiểm tra lại");
                request.setAttribute("codeHome0", request.getParameter("erroMaill"));
            }
            request.getRequestDispatcher("bqt/index/AddAccountNew.jsp").forward(request, response);
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
        if (request.getSession().getAttribute("dalogin_bqt") == null) {
            response.sendRedirect("homeBQT");
        } else {
            HttpSession session = request.getSession();
            if (request.getSession().getAttribute("AddNewbqt") != null) {

                String codeHome0 = "";
                if (request.getParameter("codeHome0") != null) {
                    codeHome0 = request.getParameter("codeHome0");
                }

                String codeXm = "1";
                if (request.getSession().getAttribute("codeXacMinhHomeAddBQT") != null) {
                    codeXm = (String) request.getSession().getAttribute("codeXacMinhHomeAddBQT");
                }
                if (!codeXm.equals(codeHome0)) {
                    response.sendRedirect("addAccountBQT?erroMaill=" + codeHome0);
                } else {
                    BqtDao bqtDao = new BqtDao();
                    BQT bqt = (BQT) request.getSession().getAttribute("AddNewbqt");
                    bqtDao.insert(bqt);
                    session.removeAttribute("AddNewbqt");
                    response.sendRedirect("indexBQT?nextListBQT=1");
                }
            } else {
                if (request.getParameter("sid") != null) {
                    BqtDao bqtDao = new BqtDao();
                    UserDao userDao = new UserDao();
                    Validate validate = new Validate();
                    //update
                    int countTrue = 0;
                    String idAccount = request.getParameter("sid");
                    String idUser = request.getParameter("idUser");
                    String firstName = request.getParameter("txtFirstName").trim();
                    if (firstName.length() < 2) {
                        request.setAttribute("erroFirstNameUpdate", "First Name quá ngắn");
                        countTrue++;
                    } else {
                        if (!validate.checkInputStringNotEmail(firstName)) {
                            request.setAttribute("erroFirstNameUpdate", "Sai định dạng chỉ nhập chữ không dấu và không chứa ký tự đặc biệt");
                            countTrue++;
                        }
                    }
                    String lastName = request.getParameter("txtLastName").trim();
                    if (lastName.length() < 2) {
                        request.setAttribute("errolastNameUpdate", "Last Name quá ngắn");
                        countTrue++;
                    } else {
                        if (!validate.checkInputStringNotEmail(lastName)) {
                            request.setAttribute("errolastNameUpdate", "Sai định dạng chỉ nhập chữ không dấu và không chứa ký tự đặc biệt");
                            countTrue++;
                        }
                    }

                    boolean gender = request.getParameter("gender").equals("1") ? true : false;
                    String email = request.getParameter("txtEmail").trim();
                    if (!validate.checkInputStringEmail(email)) {
                        request.setAttribute("erroEmailUpdate", "Email không hợp lệ");
                        countTrue++;
                    }
                    String dob = request.getParameter("dob");
                    String phone = request.getParameter("txtPhone").trim();
                    if (!validate.checkPhone(phone)) {
                        request.setAttribute("erroPhoneUpdate", "Chỉ nhận phone ở Việt Nam");
                        countTrue++;
                    }
                    String address = request.getParameter("ttAddress").trim();
                    if (address.length() < 5) {
                        request.setAttribute("erroAddressUpdate", "Address quá ngắn");
                        countTrue++;
                    } else {
                        if (!validate.checkInputStringNotEmail(lastName)) {
                            request.setAttribute("erroAddressUpdate", "Sai định dạng chỉ nhập chữ không dấu và không chứa ký tự đặc biệt");
                            countTrue++;
                        }
                    }
                    int slCampus = Integer.parseInt(request.getParameter("slCampus"));
                    Campus campus = new Campus(slCampus);
                    User user = new User(idUser);
                    Dao dao = new Dao();
                    if (dao.checkMailExit(email) == 1) {
                        request.setAttribute("erroEmailUpdate", "Email đã tồn tại");
                        countTrue++;
                    }

                    if (dao.checkPhoneExit(phone) == 1) {
                        request.setAttribute("erroPhoneUpdate", "Phone đã tồn tại");
                        countTrue++;
                    }

                    BQT bqt = new BQT(Integer.parseInt(idAccount), firstName, lastName, gender, dob, phone, email, address, campus, user, "");
                    if (countTrue != 0) {
                        request.setAttribute("updatBqt", bqt);
                        request.setAttribute("sid", request.getParameter("sid"));
                        request.getRequestDispatcher("bqt/index/AddAccountNew.jsp").forward(request, response);
                    }
                    if (countTrue == 0) {
                        String code = sendGmailGetCode(bqt);
                        session.setAttribute("AddNewbqt", bqt);
                        session.setAttribute("codeXacMinhHomeAddBQT", code);
                        session.setMaxInactiveInterval(60 * 10);
                        response.sendRedirect("addAccountBQT");

                    }
                }
            }
        }
    }

    public String sendGmailGetCode(BQT studentParents) {
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
