/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controller.login;

import MyUntils.Validate;
import dao.StudentDao;
import dao.UserDao;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Student;
import model.User;

/**
 *
 * @author NCC
 */
public class AuthenticationController extends HttpServlet {

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
        try ( PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */

        }
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
        request.getRequestDispatcher("index/home.jsp").forward(request, response);
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
        request.setCharacterEncoding("UTF-8");
        Cookie c_userd = new Cookie("username", "");
        Cookie c_passd = new Cookie("password", "");
        c_userd.setMaxAge(0);
        c_passd.setMaxAge(0);
        response.addCookie(c_userd);
        response.addCookie(c_passd);
        Validate validate = new Validate();

        String login = request.getParameter("login");
        if (login != null && login != "") {
            String usernameup_login = request.getParameter("usernameup").trim();
            String passup_login = request.getParameter("passup").trim();
            String campusup_login = request.getParameter("campusup").trim();
            String roleup_login = request.getParameter("roleup").trim();

            User user = new User(usernameup_login, passup_login);
            UserDao userDao = new UserDao();
            int checkU = userDao.checkUser(user); // check tai khoan 
            if (checkU != -1) {
                if (roleup_login.equals("1")) {
                    StudentDao studentDao = new StudentDao();
                    Student student = studentDao.getStudent(checkU, campusup_login);
                    if (student != null) {
                        PrintWriter out = response.getWriter();
                        out.print(student.getStatus());
                    }
                }

                if (roleup_login.equals("2")) {

                }
                if (roleup_login.equals("3")) {

                }
                if (roleup_login.equals("4")) {

                }
            }String mess = "Thông tin đăng nhập sai, hãy đăng nhập lại!";
            if (!validate.checkInputStringEmail(usernameup_login)) {
                 mess = "sai";
            }
            

            request.setAttribute("usernameup", usernameup_login);
            request.setAttribute("passup", passup_login);
            request.setAttribute("campusup", campusup_login);
            request.setAttribute("roleup", roleup_login);
            
            request.setAttribute("messIn", mess);

//            request.getRequestDispatcher("index/home.jsp").forward(request, response);

        }

        String signup = request.getParameter("signup");
        if (signup != null && signup != "") {
            String username_signup = request.getParameter("usernamein").trim();
            String password_signup = request.getParameter("passin").trim();
            String conpass_signup = request.getParameter("conpassin").trim();
            String firstNamein_signup = request.getParameter("firstNamein").trim();
            String lastNamein_signup = request.getParameter("lastNamein").trim();
            String dateOfBirthin_signup = request.getParameter("dateOfBirthin").trim();
            String addressin_signup = request.getParameter("addressin").trim();
            String telephonein_signup = request.getParameter("telephonein").trim();
            String emailin_signup = request.getParameter("emailin").trim();
            String specializedin_signup = request.getParameter("specializedin").trim();
            String campusin_signup = request.getParameter("campusin").trim();
            
           
            
            
            
            String mess = "Thông tin đăng nhập sai, hãy đăng nhập lại!";
            request.setAttribute("messUp", mess);
            request.getRequestDispatcher("index/home.jsp").forward(request, response);
        }
//        request.getRequestDispatcher("index/home.jsp").forward(request, response);
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
