/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controller;

import dao.CampusDao;
import dao.RoleDao;
import dao.SpecializedinDao;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import model.Campus;
import model.Role;
import model.Specializedin;
import model.Student;
import model.User;

/**
 *
 * @author NCC
 */
public class homeBQT extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        if (request.getSession().getAttribute("dalogin") != null) {
            response.sendRedirect("index");
        } else {
            if (request.getSession().getAttribute("listCampus") == null) {
                CampusDao campusDao = new CampusDao();
                RoleDao roleDao = new RoleDao();
                SpecializedinDao specializedinDao = new SpecializedinDao();
                ArrayList<Campus> listCampus = campusDao.getAll();
                ArrayList<Specializedin> listSpecializedin = specializedinDao.getAll();
                ArrayList<Role> listRole = roleDao.getAll();
                request.getSession().setAttribute("listCampus", listCampus);
                request.getSession().setAttribute("listRole", listRole);
                request.getSession().setAttribute("listSpecializedin", listSpecializedin);
                if (request.getSession().getAttribute("account_session_student") != null) {
                    Student student = (Student) request.getSession().getAttribute("account_session_student");
                    User user = (User) request.getSession().getAttribute("account_session_user");
                    request.setAttribute("firstNamein_signup", student.getFirstName());
                    request.setAttribute("lastNamein_signup", student.getLastName());

//                request.setAttribute("password_signup2", user.getPassword());
//                request.setAttribute("conpass_signup", user.getPassword());
                    request.setAttribute("addressin_signup", student.getAddress());
                    request.setAttribute("telephonein_signup", student.getPhone());
                    request.setAttribute("emailin_signup", student.getGmail());
                    request.setAttribute("genderin_signup", student.isGender() ? "1" : "0");
                    request.setAttribute("specializedin_signup", student.getDateOfStart());
                    request.setAttribute("campusin_signup", student.getDateOfEnd());
                    request.setAttribute("messUp", "123");
                    request.setAttribute("dateOfBirthup_mess", student.getDateOfBirth());

                }

            }
            request.getRequestDispatcher("bqt/home.jsp").forward(request, response);
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
