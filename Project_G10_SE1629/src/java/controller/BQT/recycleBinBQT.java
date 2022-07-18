/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controller.BQT;

import dao.OfficerFUDao;
import dao.RoleDao;
import dao.StatusDao;
import dao.StudentDao;
import dao.TeacherDao;
import dao.UserDao;
import dao.studentParentsDao;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.util.ArrayList;
import model.BQT;
import model.OfficerFU;
import model.Status;
import model.Student;
import model.StudentParents;
import model.Teacher;

/**
 *
 * @author NCC
 */
public class recycleBinBQT extends HttpServlet {
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        if (request.getSession().getAttribute("bqt_login_successful") == null) {
            response.sendRedirect("homeBQT");
        } else {
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
                        Teacher teacher = new Teacher(Integer.parseInt(request.getParameter("sid")), true);
                        teacherDao.updateActive(teacher);
                    }
                    //sv
                    if (request.getParameter("update").equals("2")) {
                        StudentParents studentParents = studentParentsDao.getStudentParentsByIdStudent(request.getParameter("sid"));
                        studentParents.setActiveSP(true);
                        studentParentsDao.updateActive(studentParents);
                        Student student = new Student(Integer.parseInt(request.getParameter("sid")), true);
                        studentDao.updateActive(student);
                    }
                    //can-bo
                    if (request.getParameter("update").equals("4")) {
                        OfficerFU oficerFU = new OfficerFU(Integer.parseInt(request.getParameter("sid")), true);
                        OfficerFUDao.updateActive(oficerFU);
                    }
                    //phuHuynh
                    if (request.getParameter("update").equals("5")) {
                        StudentParents studentParents = new StudentParents(Integer.parseInt(request.getParameter("sid")), true);
                        studentParentsDao.updateActive(studentParents);
                    }
                    roleId = request.getParameter("update");
                    response.sendRedirect("recycleBinBQT?nextAccount=1&slRole=" + roleId);
                }
                
                if (request.getParameter("delete") != null) {
                    //gv
                    if (request.getParameter("delete").equals("3")) {
                        Teacher teacher = teacherDao.getTeacherById(request.getParameter("sid"), "0");
                        teacherDao.deleteByid(String.valueOf(teacher.getId()));
                        userDao.deleteByid(teacher.getUser().getId());
                    }
                    //sv
                    if (request.getParameter("delete").equals("2")) {
                        StudentParents studentParents = studentParentsDao.getStudentParentsByIdStudent(request.getParameter("sid"));
                        if (studentParents != null) {
                            studentParentsDao.deleteByid(String.valueOf(studentParents.getId()));
                            userDao.deleteByid(String.valueOf(studentParents.getUser().getId()));
                        }
                        studentDao.deleteByid(request.getParameter("sid"));
                        userDao.deleteByid(request.getParameter("tkid"));
                    }
                    //can-bo
                    if (request.getParameter("delete").equals("4")) {
                        OfficerFU officerFU = OfficerFUDao.getOfficerByID(request.getParameter("sid"), "");
                        OfficerFUDao.deleteByid(String.valueOf(officerFU.getId()));
                        userDao.deleteByid(officerFU.getUser().getId());
                    }
                    //phu-huynh
                    if (request.getParameter("delete").equals("5")) {
                        studentParentsDao.deleteByid(request.getParameter("sid"));
                        userDao.deleteByid(request.getParameter("tkid"));
                    }
                    
                    roleId = request.getParameter("delete");
                    response.sendRedirect("recycleBinBQT?nextAccount=1&slRole=" + roleId);
                }

                //sv
            } else {
                BQT bQT = (BQT) session.getAttribute("bqt_login_successful");
                Teacher teacher = new Teacher();
                RoleDao roleDao = new RoleDao();
                
                if (request.getParameter("nextClass") != null) {
                    request.getRequestDispatcher("bqt/index/ClassBQT.jsp").forward(request, response);
                }
                if (request.getParameter("nextAccount") != null) {
                    int roleId = 2;
                    if (request.getParameter("slRole") != null) {
                        roleId = Integer.parseInt(request.getParameter("slRole"));
                    }
                    if (roleId == 2) {
                        ArrayList<Student> listStudent = studentDao.getAll("0");
                        request.setAttribute("listStudent", listStudent);
                    }
                    if (roleId == 3) {
                        ArrayList<Teacher> listTeacher = teacherDao.getAll("0");
                        request.setAttribute("listTeacher", listTeacher);
                    }
                    if (roleId == 4) {
                        OfficerFUDao OfficerFUDao = new OfficerFUDao();
                        ArrayList<OfficerFU> listOfficerFU = OfficerFUDao.getAll("", "0");
                        request.setAttribute("listOfficerFU", listOfficerFU);
                    }
                    if (roleId == 5) {
                        ArrayList<StudentParents> listStudentParents = studentParentsDao.getAll("", "0");
                        request.setAttribute("listStudentParents", listStudentParents);
                    }
                    
                    request.setAttribute("roleId", roleId);
                    request.getRequestDispatcher("bqt/index/RecycleBinBQT.jsp").forward(request, response);
                }
                if (request.getParameter("recycleBin") != null) {
                    response.sendRedirect("recycleBinBQT");
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
                            listStudent = studentDao.getAllByInfo(searchArr[0], "", slStatus, slCampusSearch, "0");
                        } else {
                            String lastN = "";
                            for (int i = 1; i < searchArr.length; i++) {
                                lastN += searchArr[i];
                            }
                            listStudent = studentDao.getAllByInfo(searchArr[0], lastN, slStatus, slCampusSearch, "0");
                        }
                    } else {
                        listStudent = studentDao.getAll(slStatus, slCampusSearch, "0");
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
                            listTeacher = teacherDao.getAllByInfo(searchArr[0], "", slCampusSearch, "0");
                        } else {
                            String lastN = "";
                            for (int i = 1; i < searchArr.length; i++) {
                                lastN += searchArr[i];
                            }
                            listTeacher = teacherDao.getAllByInfo(searchArr[0], lastN, slCampusSearch, "0");
                        }
                    } else {
                        listTeacher = teacherDao.getAllByInfo("", "", slCampusSearch, "0");
                    }
                    request.setAttribute("listTeacher", listTeacher);
                }

                //canbo
                if (roleId == 4) {
                    OfficerFUDao OfficerFUDao = new OfficerFUDao();
                    ArrayList<OfficerFU> listOfficerFU;
                    if (checkSearch != 0) {
                        if (searchArr.length == 1) {
                            listOfficerFU = OfficerFUDao.getAllByInfo(searchArr[0], "", slCampusSearch, "0");
                        } else {
                            String lastN = "";
                            for (int i = 1; i < searchArr.length; i++) {
                                lastN += searchArr[i];
                            }
                            listOfficerFU = OfficerFUDao.getAllByInfo(searchArr[0], lastN, slCampusSearch, "0");
                        }
                    } else {
                        listOfficerFU = OfficerFUDao.getAll(slCampusSearch, "0");
                    }
                    request.setAttribute("listOfficerFU", listOfficerFU);
                }

                // phu huynh
                if (roleId == 5) {
                    studentParentsDao studentParentsDao = new studentParentsDao();
                    ArrayList<StudentParents> listStudentParents;
                    if (checkSearch != 0) {
                        if (searchArr.length == 1) {
                            listStudentParents = studentParentsDao.getAllByInfo(searchArr[0], "", slCampusSearch, "0");
                        } else {
                            String lastN = "";
                            for (int i = 1; i < searchArr.length; i++) {
                                lastN += searchArr[i];
                            }
                            listStudentParents = studentParentsDao.getAllByInfo(searchArr[0], lastN, slCampusSearch, "0");
                        }
                    } else {
                        listStudentParents = studentParentsDao.getAll(slCampusSearch, "0");
                    }
                    request.setAttribute("listStudentParents", listStudentParents);
                }
                request.setAttribute("campusID", slCampusSearch);
                request.setAttribute("Tsearch", search);
                request.setAttribute("roleId", roleId);
                request.getRequestDispatcher("bqt/index/RecycleBinBQT.jsp").forward(request, response);
                
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
