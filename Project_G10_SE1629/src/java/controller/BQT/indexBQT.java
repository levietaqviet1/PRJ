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
import dao.studentParentsDao;
import model.*;

/**
 *
 * @author NCC
 */
public class indexBQT extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        if (request.getSession().getAttribute("bqt_login_successful") == null) {
            response.sendRedirect("homeBQT");
        }
        PrintWriter out = response.getWriter();
        HttpSession session = request.getSession();
        TeacherDao teacherDao = new TeacherDao();
        StudentDao studentDao = new StudentDao();
        studentParentsDao studentParentsDao = new studentParentsDao();

        // BQT
        if (request.getParameter("sid") != null) {
            UserDao userDao = new UserDao();
            OfficerFUDao OfficerFUDao = new OfficerFUDao();
            String roleId = "";
            if (request.getParameter("update") != null) {
                request.setAttribute("updateID", request.getParameter("update"));
                request.setAttribute("sid", request.getParameter("sid"));
                //gv
                if (request.getParameter("update").equals("3")) {
                    Teacher teacher = teacherDao.getTeacherById(request.getParameter("sid"));
                    request.setAttribute("teacherBQT", teacher);
                    request.setAttribute("userId", teacher.getUser().getId());
                }
                //sv
                if (request.getParameter("update").equals("2")) {
                    Student student = studentDao.getStudent(Integer.parseInt(request.getParameter("sid")), request.getParameter("campusId"));
                    request.setAttribute("studentBQT", student);
                    request.setAttribute("userId", student.getUser().getId());
                }
                //can-bo
                if (request.getParameter("update").equals("4")) {
                    OfficerFU oficerFU = OfficerFUDao.getOfficerByID(request.getParameter("sid"));
                    request.setAttribute("oficerFUBQT", oficerFU);
                    request.setAttribute("userId", oficerFU.getUser().getId());
                }
                //phuHuynh
                if (request.getParameter("update").equals("5")) {
                    StudentParents studentParents = studentParentsDao.getStudentParentsByIdParent(request.getParameter("sid"));
                    request.setAttribute("studentParentsBQT", studentParents);
                    out.print(studentParents);
                    request.setAttribute("userId", studentParents.getUser().getId());

                }
                request.getRequestDispatcher("bqt/index/AccountUpdate.jsp").forward(request, response);
            }

            if (request.getParameter("delete") != null) {
                //gv
                if (request.getParameter("delete").equals("3")) {
                    Teacher teacher = new Teacher(Integer.parseInt(request.getParameter("sid")), false);
                    teacherDao.updateActive(teacher);
                }
                //sv
                if (request.getParameter("delete").equals("2")) {
                    StudentParents studentParents = studentParentsDao.getStudentParentsByIdStudent(request.getParameter("sid"));
                    if (studentParents != null) {
                        studentParents.setActiveSP(false);
                        studentParentsDao.updateActive(studentParents);
//                        userDao.deleteByid(String.valueOf(studentParents.getUser().getId()));
                    }
                    Student student = new Student(Integer.parseInt(request.getParameter("sid")), false);
                    studentDao.updateActive(student);
//                    studentDao.deleteByid(request.getParameter("sid"));
//                    userDao.deleteByid(request.getParameter("tkid"));

                }
                //can-bo
                if (request.getParameter("delete").equals("4")) {
                    OfficerFU officerFU = new OfficerFU(Integer.parseInt(request.getParameter("sid")), false);
                    OfficerFUDao.updateActive(officerFU);
                }
                //phu-huynh
                if (request.getParameter("delete").equals("5")) {
//                    studentParentsDao.deleteByid(request.getParameter("sid"));
//                    userDao.deleteByid(request.getParameter("tkid"));
                    StudentParents studentParents = studentParentsDao.getStudentParentsByIdParent(request.getParameter("sid"));
                    studentParents.setActiveSP(false);
                    studentParentsDao.updateActive(studentParents);
                }

                roleId = request.getParameter("delete");
                response.sendRedirect("indexBQT?nextAccount=1&slRole=" + roleId);
            }

            //sv
        } else {
            if (session.getAttribute("bqt_login_successful") != null) {
                BQT bQT = (BQT) session.getAttribute("bqt_login_successful");
                Teacher teacher = new Teacher();
                RoleDao roleDao = new RoleDao();

                if (request.getParameter("nextClass") != null) {

                }
                if (request.getParameter("nextAccount") != null) {
                    int roleId = 5;
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
                        ArrayList<OfficerFU> listOfficerFU = OfficerFUDao.getAll("", "1");
                        request.setAttribute("listOfficerFU", listOfficerFU);
                    }
                    if (roleId == 5) {
                        ArrayList<StudentParents> listStudentParents = studentParentsDao.getAll("");
                        request.setAttribute("listStudentParents", listStudentParents);
                    }

                    request.setAttribute("roleId", roleId);
                    request.getRequestDispatcher("bqt/index/indexBQT.jsp").forward(request, response);
                }

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
                int roleId = Integer.parseInt(request.getParameter("slRole"));
                String[] searchArr = null;
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
                            listStudent = studentDao.getAllByInfo(searchArr[0], "", slStatus, slCampusSearch);
                        } else {
                            String lastN = "";
                            for (int i = 1; i < searchArr.length; i++) {
                                lastN += searchArr[i];
                            }
                            listStudent = studentDao.getAllByInfo(searchArr[0], lastN, slStatus, slCampusSearch);
                        }
                    } else {
                        listStudent = studentDao.getAll(slStatus, slCampusSearch);
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
                            listTeacher = teacherDao.getAllByInfo(searchArr[0], "", slCampusSearch);
                        } else {
                            String lastN = "";
                            for (int i = 1; i < searchArr.length; i++) {
                                lastN += searchArr[i];
                            }
                            listTeacher = teacherDao.getAllByInfo(searchArr[0], lastN, slCampusSearch);
                        }
                    } else {
                        listTeacher = teacherDao.getAllByInfo("", "", slCampusSearch);
                    }
                    request.setAttribute("listTeacher", listTeacher);
                }

                //canbo
                if (roleId == 4) {
                    OfficerFUDao OfficerFUDao = new OfficerFUDao();
                    ArrayList<OfficerFU> listOfficerFU;
                    if (checkSearch != 0) {
                        if (searchArr.length == 1) {
                            listOfficerFU = OfficerFUDao.getAllByInfo(searchArr[0], "", slCampusSearch, "1");
                        } else {
                            String lastN = "";
                            for (int i = 1; i < searchArr.length; i++) {
                                lastN += searchArr[i];
                            }
                            listOfficerFU = OfficerFUDao.getAllByInfo(searchArr[0], lastN, slCampusSearch, "1");
                        }
                    } else {
                        listOfficerFU = OfficerFUDao.getAll(slCampusSearch, "1");
                    }
                    request.setAttribute("listOfficerFU", listOfficerFU);
                }

                // phu huynh
                if (roleId == 5) {
                    studentParentsDao studentParentsDao = new studentParentsDao();
                    ArrayList<StudentParents> listStudentParents;
                    if (checkSearch != 0) {
                        if (searchArr.length == 1) {
                            listStudentParents = studentParentsDao.getAllByInfo(searchArr[0], "", slCampusSearch);
                        } else {
                            String lastN = "";
                            for (int i = 1; i < searchArr.length; i++) {
                                lastN += searchArr[i];
                            }
                            listStudentParents = studentParentsDao.getAllByInfo(searchArr[0], lastN, slCampusSearch);
                        }
                    } else {
                        listStudentParents = studentParentsDao.getAll(slCampusSearch);
                    }
                    request.setAttribute("listStudentParents", listStudentParents);
                }
                request.setAttribute("campusID", slCampusSearch);
                request.setAttribute("Tsearch", search);
                request.setAttribute("roleId", roleId);
                request.getRequestDispatcher("bqt/index/indexBQT.jsp").forward(request, response);

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
