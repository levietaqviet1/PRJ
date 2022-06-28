/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controller.sendEmail;

import MyUntils.RandomString;
import MyUntils.SendMail;
import dao.SpecializedinDao;
import dao.StudentDao;
import dao.UserDao;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import model.Student;
import model.User;

/**
 *
 * @author NCC
 */
public class ConfirmEmail extends HttpServlet {

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
             
            String id = request.getParameter("id");
             
            
            if (request.getSession().getAttribute("confirmEmail_st").equals(id)) {
                if (request.getSession().getAttribute("account_session_student") != null) {
                    Student student = (Student) request.getSession().getAttribute("account_session_student");
                    User user = new User();
                    UserDao userDao = new UserDao();
                    StudentDao studentDao = new StudentDao();
                    SpecializedinDao specializedinDao = new SpecializedinDao();
                    String[] userNameLast = student.getLastName().split(" ");
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
                    out.print(student.toString()+"<br/>");
                    out.print(user.toString());
                   
                    
                    userDao.insertUserStudent(user); // insert user vao datase
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
                            + "Account: " + student.getUser().getUsername() + "<br/>\n"
                            + "Password: " + student.getUser().getPassword() + "<br/>\n"
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
                    session.setAttribute("confirmEmail_succ", "aa");
                    session.setMaxInactiveInterval(60*60); 
                    response.sendRedirect("sendEmaillSu");

//                    
//                    request.setAttribute("lastNamein_signup", student.getLastName());
//                    request.setAttribute("password_signup2", user.getPassword());
//                    request.setAttribute("conpass_signup", user.getPassword());
//                    request.setAttribute("addressin_signup", student.getAddress());
//                    request.setAttribute("telephonein_signup", student.getPhone());
//                    request.setAttribute("emailin_signup", student.getGmail());
//                    request.setAttribute("genderin_signup", student.isGender() ? "1" : "0");
//                    request.setAttribute("specializedin_signup", student.getDateOfStart());
//                    request.setAttribute("campusin_signup", student.getDateOfEnd());
//                    request.setAttribute("messUp", "123");
//                    request.setAttribute("dateOfBirthup_mess", student.getDateOfBirth());
//                    request.setAttribute("tessssst", "aaaaaaaaaaaaaaaaaaaaaa");
                     
                }
            out.print("aaaaaaaaaaaa");
        }

//            response.sendRedirect("home");
                    
                   
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
        processRequest(request, response);
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
        processRequest(request, response);
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
