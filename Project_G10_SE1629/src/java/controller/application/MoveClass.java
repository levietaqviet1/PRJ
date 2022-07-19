package controller.application;

import DAO_Thu.ApplicationDAO;
import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Student;
import modelTHU.Application;

/**
 *
 * @author 84399
 */
public class MoveClass extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.getRequestDispatcher("student/subIndex/MoveClass.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        if (request.getSession().getAttribute("dalogin") == null) {
            response.sendRedirect("home");
        }
        ApplicationDAO dao = new ApplicationDAO();
        Student student = new Student();
        if (request.getSession().getAttribute("dalogin") != null) {
            if (request.getSession().getAttribute("st_login_successful") != null) {

                String nameapp = "Move Class";
                String subcode = request.getParameter("subject");
                String fromclass = request.getParameter("ClassA");
                String toclass = request.getParameter("ClassB");
                student = (Student) request.getSession().getAttribute("st_login_successful");

                ApplicationDAO d = new ApplicationDAO();
                if (request.getParameter("OK") != null) {
                    Application app = new Application(nameapp, " Subject: " + subcode + " from " + fromclass + " to class " + toclass, student.getId(), String.valueOf(java.time.LocalDate.now()));
                    dao.insertApplication(app);
                    request.setAttribute("message", "Nộp đơn thành công! Send Application Sucessfully!");
                }

            }

        }
        request.setAttribute("giaoDien", "2");
        request.getRequestDispatcher("student/index/indexStudent.jsp").forward(request, response);
//        response.sendRedirect("index?sid=" + request.getParameter("sid"));

    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
