/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controller.Passwor;

import dao.*;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.*;

/**
 *
 * @author NCC
 */
public class changePassworBQT extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        if (request.getSession().getAttribute("dalogin_bqt") == null) {
            response.sendRedirect("homeBQT");
        } else {
            request.getRequestDispatcher("bqt/index/ChanfPassBQT.jsp").forward(request, response);

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
            int countCheck = 0;
            String password = request.getParameter("password");
            String passwordNew = request.getParameter("passwordNew");
            String passwordNewConfirm = request.getParameter("passwordNewConfirm");
            BQT bqt = (BQT) request.getSession().getAttribute("bqt_login_successful");
            UserDao userDao = new UserDao();
            User user = bqt.getUser();
            user.setPassword(password);
            int checkExit = userDao.checkPassWordById(user);
            if (checkExit == -1) {
                countCheck++;
                request.setAttribute("oldPass_mess", "Mật khẩu cũ bị sai nếu quên vui lòng lấy lại mật khẩu");
            }
            if (countCheck != 0) {
                request.setAttribute("oldpass", password);
                request.setAttribute("newpass", passwordNew);
                request.setAttribute("confirm", passwordNewConfirm);
            }
            if (countCheck == 0) {
                user.setPassword(passwordNew);
                userDao.updateUserPass(user);
                request.setAttribute("change_pass_succ", "Đã thay mật khẩu thành công");
            }
            request.getRequestDispatcher("bqt/index/ChanfPassBQT.jsp").forward(request, response);

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
