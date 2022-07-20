/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controller.BQT;

import MyUntils.*;
import dao.*;
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
public class listAccountBQTAdmin extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        BqtDao bqtDao = new BqtDao();
        UserDao userdao = new UserDao();
        Validate validate = new Validate();
        if (request.getSession().getAttribute("bqt_login_successful") == null) {
            response.sendRedirect("homeBQT");
        } else {
            if (request.getParameter("update") != null) {
                BQT bqt = bqtDao.getBqtById(request.getParameter("sid"));
                request.setAttribute("updatBqt", bqt);
                request.setAttribute("sid", request.getParameter("sid"));
                request.getRequestDispatcher("bqt/index/BQTAccountUpdate.jsp").forward(request, response);
            } else {
                if (request.getParameter("sid") != null) {
                    if (request.getParameter("delete") != null) {
                        BQT bqt = bqtDao.getBqtById(request.getParameter("sid"));
                        bqtDao.deleteById(bqt.getId());
                        userdao.deleteByid(bqt.getUser().getId());
                        response.sendRedirect("listAccountBQT-Admin");
                    } else {
                    }
                } else {
                    ArrayList<BQT> listBqt = bqtDao.getAll();
                    request.setAttribute("listBqt", listBqt);
                    request.getRequestDispatcher("bqt/index/BQTFPT.jsp").forward(request, response);
                }
                out.print("2");
            }
            out.print("1");

        }
        out.print("0");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        if (request.getSession().getAttribute("bqt_login_successful") == null) {
            response.sendRedirect("homeBQT");
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
                String password = request.getParameter("txtPassword");
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
                BQT bqt = bqtDao.getBqtById(request.getParameter("sid"));
                if (!email.equalsIgnoreCase(bqt.getGmail())) {
                    if (dao.checkMailExit(email) == 1) {
                        request.setAttribute("erroEmailUpdate", "Email đã tồn tại");
                        countTrue++;
                    }
                }
                if (!phone.equals(bqt.getPhone())) {
                    if (dao.checkPhoneExit(phone) == 1) {
                        request.setAttribute("erroPhoneUpdate", "Phone đã tồn tại");
                        countTrue++;
                    }
                }
                bqt = new BQT(Integer.parseInt(idAccount), firstName, lastName, gender, dob, phone, email, address, campus, user, "");
                if (countTrue != 0) {
                    request.setAttribute("updatBqt", bqt);
                    request.setAttribute("sid", request.getParameter("sid"));
                    request.getRequestDispatcher("bqt/index/BQTAccountUpdate.jsp").forward(request, response);
                }
                if (countTrue == 0) {
                    int coutCheckRole = 0;
                    if (password != null && !password.equals("")) {
                        user = new User(idUser, lastName, password);
                        userDao.updateUserPass(user);
                        coutCheckRole++;
                    }
                    bqtDao.updateById(bqt);
                    if (coutCheckRole != 0) {
                        String topic = "FPT-University";
                        String content = "<html lang=\"en\">\n"
                                + "<head>\n"
                                + "    <title></title>\n"
                                + "    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n"
                                + "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n"
                                + "    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\" />\n"
                                + "</head>\n"
                                + "<body>\n"
                                + "Dear " + firstName + "<br/>\n <br/>"
                                + "We have changed your account.<br/>\n"
                                + "You can login to check account<br/>\n"
                                + "Account: <span style='color: red;'> Not change </span><br/>\n"
                                + "Password: <span style='color: red;'> " + password + "</span><br/>\n"
                                + "</body>\n"
                                + "</html>";

                        String acc_TK_Mail_Send = "phongdaotaofbt@gmail.com";
                        String acc_MK_Mail_Send = "npmgjujnxbtswmit";
                        SendMail sen = new SendMail();
                        sen.sendFuncition(email, topic, content, acc_TK_Mail_Send, acc_MK_Mail_Send);
                    }
                    response.sendRedirect("listAccountBQT-Admin");
                }
            }
            //--------------------------------
            HttpSession session = request.getSession();
            if (request.getParameter("addSubAccou") != null) {
                response.sendRedirect("addAccountBQT");
            } else {
                if (request.getParameter("subSearch") != null) {
                    int checkSearch = 0;
                    String search = "";
                    String slCampusSearch = request.getParameter("slCampusSearch");
                    if (request.getParameter("search") != null) {
                        search = request.getParameter("search").trim();
                        search = search.replaceAll("\\s\\s+", " ").trim();
                    }
                    String[] searchArr = null;
                    if (search != null && !search.equals("")) {
                        search = search.trim();
                        searchArr = search.split(" ");
                        checkSearch++;
                    }
                    //BQT
                    BqtDao bqtDao = new BqtDao();
                    ArrayList<BQT> listBQT;

                    OfficerFUDao OfficerFUDao = new OfficerFUDao();
                    ArrayList<OfficerFU> listOfficerFU;

                    if (checkSearch != 0) {
                        if (searchArr.length == 1) {
                            listBQT = bqtDao.getAllByInfo(searchArr[0], "", slCampusSearch);
                        } else {
                            String lastN = "";
                            for (int i = 1; i < searchArr.length; i++) {
                                lastN += searchArr[i];
                            }
                            listBQT = bqtDao.getAllByInfo(searchArr[0], lastN, slCampusSearch);
                        }
                    } else {
                        listBQT = bqtDao.getAllByInfo("", "", slCampusSearch);
                    }
                    request.setAttribute("listBqt", listBQT);

                    request.setAttribute("campusID", slCampusSearch);
                    request.setAttribute("Tsearch", search);
                    request.getRequestDispatcher("bqt/index/BQTFPT.jsp").forward(request, response);

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
