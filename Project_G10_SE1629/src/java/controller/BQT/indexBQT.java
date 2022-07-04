/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controller.BQT;

import dao.OfficerFUDao;
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
import model.*;

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
        StudentDao studentDao = new StudentDao();
        if (session.getAttribute("dalogin_bqt") == null) {
            response.sendRedirect("homeBQT");
        }
        // BQT
        if (request.getParameter("sid") != null) {
            UserDao userDao = new UserDao();
            OfficerFUDao OfficerFUDao = new OfficerFUDao();
            String roleId = "";
            if (request.getParameter("update") != null) {
                //gv
                if (request.getParameter("update").equals("3")) {
                    teacherDao.updateById(request.getParameter("sid"));
                }
                //sv
                if (request.getParameter("update").equals("2")) {
                    studentDao.updateById(request.getParameter("sid"));
                }
                //can-bo
                if (request.getParameter("update").equals("4")) {
                    OfficerFUDao.updateById(request.getParameter("sid"));
                }
                roleId = request.getParameter("update");
            }

            if (request.getParameter("delete") != null) {
                //gv
                if (request.getParameter("delete").equals("3")) {
                    teacherDao.deleteByid(request.getParameter("sid"));
                    userDao.deleteByid(request.getParameter("tkid"));
                }
                //sv
                if (request.getParameter("delete").equals("2")) {
                    studentDao.deleteByid(request.getParameter("sid"));
                    userDao.deleteByid(request.getParameter("tkid"));
                }
                //can-bo
                if (request.getParameter("delete").equals("4")) {
                    OfficerFUDao.deleteByid(request.getParameter("sid"));
                    userDao.deleteByid(request.getParameter("tkid"));
                }

                roleId = request.getParameter("delete");
            }

            //sv
            response.sendRedirect("indexBQT?slRole=" + roleId);
        } else {
            if (session.getAttribute("bqt_login_successful") != null) {
                BQT bQT = (BQT) session.getAttribute("bqt_login_successful");
                Teacher teacher = new Teacher();
                RoleDao roleDao = new RoleDao();
                int roleId = 3;
                if (request.getParameter("slRole") != null) {
                    roleId = Integer.parseInt(request.getParameter("slRole"));
                }
                if (roleId == 2) {
                    ArrayList<Student> listStudent = studentDao.getAll();
                    request.setAttribute("listStudent", listStudent);
                }
                if (roleId == 3) {
                    ArrayList<Teacher> listTeacher = teacherDao.getAll();
                    request.setAttribute("listTeacher", listTeacher);
                }
                if (roleId == 4) {
                    OfficerFUDao OfficerFUDao = new OfficerFUDao();
                    ArrayList<OfficerFU> listOfficerFU = OfficerFUDao.getAll();
                    request.setAttribute("listOfficerFU", listOfficerFU);
                }
                ArrayList<Role> listRole = roleDao.getAll();
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

            // sinh vien
            if (roleId == 2) {
                String slStatus = "";
                if (request.getParameter("slStatus") != null && !request.getParameter("slStatus").equals("0")) {
                    slStatus = request.getParameter("slStatus");
                }

                StudentDao studentDao = new StudentDao();
                ArrayList<Student> listStudent;
                if (checkSearch != 0) {
                    if (searchArr.length == 1) {
                        listStudent = studentDao.getAllByInfo(searchArr[0], "", slStatus);
                    } else {
                        String lastN = "";
                        for (int i = 1; i < searchArr.length; i++) {
                            lastN += searchArr[i];
                        }
                        listStudent = studentDao.getAllByInfo(searchArr[0], lastN, slStatus);
                    }
                } else {
                    listStudent = studentDao.getAll(slStatus);
                }
                StatusDao statusDao = new StatusDao();
                ArrayList<Status> listStatus = statusDao.getAll();
                if (session.getAttribute("session_listStatusBQT") == null) {
                    session.setAttribute("session_listStatusBQT", listStatus);
                    session.setMaxInactiveInterval(60 * 60 * 60);
                }
                request.setAttribute("slStatus", slStatus);
                request.setAttribute("listStudent", listStudent);

            }

            //gv
            if (roleId == 3) {
                TeacherDao teacherDao = new TeacherDao();
                ArrayList<Teacher> listTeacher;
                if (checkSearch != 0) {
                    if (searchArr.length == 1) {
                        listTeacher = teacherDao.getAllByInfo(searchArr[0], "");
                    } else {
                        String lastN = "";
                        for (int i = 1; i < searchArr.length; i++) {
                            lastN += searchArr[i];
                        }
                        listTeacher = teacherDao.getAllByInfo(searchArr[0], lastN);
                    }
                } else {
                    listTeacher = teacherDao.getAll();
                }
                request.setAttribute("listTeacher", listTeacher);
            }

            //canbo
            if (roleId == 4) {
                OfficerFUDao OfficerFUDao = new OfficerFUDao();
                ArrayList<OfficerFU> listOfficerFU;
                if (checkSearch != 0) {
                    if (searchArr.length == 1) {
                        listOfficerFU = OfficerFUDao.getAllByInfo(searchArr[0], "");
                    } else {
                        String lastN = "";
                        for (int i = 1; i < searchArr.length; i++) {
                            lastN += searchArr[i];
                        }
                        listOfficerFU = OfficerFUDao.getAllByInfo(searchArr[0], lastN);
                    }
                } else {
                    listOfficerFU = OfficerFUDao.getAll();
                }
                request.setAttribute("listOfficerFU", listOfficerFU);
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
