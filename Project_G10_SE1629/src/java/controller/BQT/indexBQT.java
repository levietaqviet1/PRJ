/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controller.BQT;

import dao.RoleDao;
import dao.StatusDao;
import dao.StudentDao;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.util.ArrayList;
import model.BQT;
import model.Role;
import model.Teacher;
import dao.TeacherDao;
import dao.UserDao;
import model.Status;
import model.Student;

/**
 *
 * @author NCC
 */
public class indexBQT extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        HttpSession session = request.getSession();
        TeacherDao teacherDao = new TeacherDao();
        if (session.getAttribute("dalogin_bqt") == null) {
            response.sendRedirect("homeBQT");
        }
        // BQT
        if (request.getParameter("sid") != null) {
            UserDao userDao = new UserDao();
            //gv-canbo
            if (request.getParameter("update")!=null &&request.getParameter("update").equals("gv_cb")) {
                teacherDao.updateById(request.getParameter("sid"));
            }
            if (request.getParameter("delete") !=null && request.getParameter("delete").equals("gv_cb")) {
                teacherDao.deleteByid(request.getParameter("sid"));
                userDao.deleteByid(request.getParameter("tkid"));
            }
            //sv
            StudentDao studentDao = new StudentDao();
             if (request.getParameter("update")!=null &&request.getParameter("update").equals("sv")) {
                studentDao.updateById(request.getParameter("sid"));
            }
            if (request.getParameter("delete") !=null && request.getParameter("delete").equals("sv")) {
                studentDao.deleteByid(request.getParameter("sid"));
                userDao.deleteByid(request.getParameter("tkid"));
            }
            response.sendRedirect("indexBQT");
        } else {
            if (session.getAttribute("bqt_login_successful") != null) {
                BQT bQT = (BQT) session.getAttribute("bqt_login_successful");
                Teacher teacher = new Teacher();
                RoleDao roleDao = new RoleDao();
                int roleId = 3;
                ArrayList<Teacher> listTeacher = teacherDao.getAll(roleId);
                ArrayList<Role> listRole = roleDao.getAll();
                request.setAttribute("listTeacher", listTeacher);
                session.setAttribute("session_listRoleBQT", listRole);
                session.setMaxInactiveInterval(60 * 60 * 60);
                request.setAttribute("roleId", roleId);
                request.getRequestDispatcher("bqt/index/indexBQT.jsp").forward(request, response);
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
        HttpSession session = request.getSession();
        if (request.getParameter("subSearch") != null) {
            int checkSearch = 0;
            String search = "";
            if (request.getParameter("search") != null) {
                search = request.getParameter("search").trim();
                search = search.replaceAll("\\s\\s+", " ").trim();
            }
            int roleId = Integer.parseInt(request.getParameter("slRole"));
            String[] searchArr = search.split(" ");
            if (search != null && !search.equals("")) {
                search = search.trim();
                searchArr = search.split(" ");
                checkSearch++;
            }
            //gv-can bo
            if (roleId == 3 || roleId == 4) {
                TeacherDao teacherDao = new TeacherDao();
                ArrayList<Teacher> listTeacher;
                if (checkSearch != 0) {
                    if (searchArr.length == 1) {
                        listTeacher = teacherDao.getAllByInfo(roleId, searchArr[0], "");
                    } else {
                        String lastN = "";
                        for (int i = 1; i < searchArr.length; i++) {
                            lastN += searchArr[i];
                        }
                        listTeacher = teacherDao.getAllByInfo(roleId, searchArr[0], lastN);
                    }
                } else {
                    listTeacher = teacherDao.getAll(roleId);
                }
                request.setAttribute("listTeacher", listTeacher);
            }
            // sinh vien
            if (roleId == 2) {
                String slStatus = "";
                if (request.getParameter("slStatus")!= null && !request.getParameter("slStatus").equals("0")) {
                    slStatus = request.getParameter("slStatus");
                }
              
                StudentDao studentDao = new StudentDao();
                ArrayList<Student> listStudent;
                if (checkSearch != 0) {
                    if (searchArr.length == 1) {
                        listStudent = studentDao.getAllByInfo(searchArr[0], "",slStatus);
                    } else {
                        String lastN = "";
                        for (int i = 1; i < searchArr.length; i++) {
                            lastN += searchArr[i];
                        }
                        listStudent = studentDao.getAllByInfo(searchArr[0], lastN,slStatus);
                    }
                } else {
                    listStudent = studentDao.getAll(slStatus);
                }
                StatusDao statusDao = new StatusDao();
                ArrayList<Status> listStatus = statusDao.getAll();
                if (session.getAttribute("session_listStatusBQT") == null) {
                    session.setAttribute("session_listStatusBQT", listStatus);
                    session.setMaxInactiveInterval(60*60*60);
                }
                request.setAttribute("slStatus", slStatus);
                request.setAttribute("listStudent", listStudent);

            }
            request.setAttribute("Tsearch", search);
            request.setAttribute("roleId", roleId);
            request.getRequestDispatcher("bqt/index/indexBQT.jsp").forward(request, response);

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
