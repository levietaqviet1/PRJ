/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controller.BQT;

import MyUntils.RandomString;
import MyUntils.SendMail;
import MyUntils.Validate;
import dao.*;
import dao.TeacherDao;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import model.*;

/**
 *
 * @author NCC
 */
public class updateAccount extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.sendRedirect("homeBQT");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        if (request.getSession().getAttribute("bqt_login_successful") == null) {
            response.sendRedirect("homeBQT");
        } else {
            int countTrue = 0;
            Validate validate = new Validate();
            String idAccount = request.getParameter("sid");
            int roleId = Integer.parseInt(request.getParameter("roleId"));
            String idUser = request.getParameter("idUser");
            String firstName = request.getParameter("txtFirstName");
            if (firstName.length() < 2) {
                request.setAttribute("erroFirstNameUpdate", "First Name quá ngắn");
                countTrue++;
            } else {
                if (!validate.checkInputStringNotEmail(firstName)) {
                    request.setAttribute("erroFirstNameUpdate", "Sai định dạng chỉ nhập chữ không dấu và không chứa ký tự đặc biệt");
                    countTrue++;
                }
            }
            String lastName = request.getParameter("txtLastName");
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
            String phone = request.getParameter("txtPhone");
            if (!validate.checkPhone(phone)) {
                request.setAttribute("erroPhoneUpdate", "Chỉ nhận phone ở Việt Nam");
                countTrue++;
            }
            String address = request.getParameter("ttAddress");
            if (address.length() < 5) {
                request.setAttribute("erroAddressUpdate", "Address quá ngắn");
                countTrue++;
            } else {
                if (!validate.checkInputStringNotEmail(lastName)) {
                    request.setAttribute("erroAddressUpdate", "Sai định dạng chỉ nhập chữ không dấu và không chứa ký tự đặc biệt");
                    countTrue++;
                }
            }
            int slRole = Integer.parseInt(request.getParameter("slRole"));
            int slCampus = Integer.parseInt(request.getParameter("slCampus"));
            int slSpecializedin = 0;
            if (request.getParameter("slSpecializedin") != null) {
                slSpecializedin = Integer.parseInt(request.getParameter("slSpecializedin"));
            }
            int slStatus = 0;
            if (request.getParameter("slStatus") != null) {
                slStatus = Integer.parseInt(request.getParameter("slStatus"));
            }
            Status status = new Status(slStatus, "");
            Specializedin specializedin = new Specializedin(slSpecializedin);
            Campus campus = new Campus(slCampus);
            User user = new User(idUser);
            //dao
            StudentDao studentDao = new StudentDao();
            TeacherDao teacherDao = new TeacherDao();
            OfficerFUDao officerFUDao = new OfficerFUDao();
            studentParentsDao studentParentsDao1 = new studentParentsDao();
            SpecializedinDao specializedinDao = new SpecializedinDao();
            UserDao userDao = new UserDao();
            Dao dao = new Dao();
            //sv
            if (roleId == 2) {
                Student student = studentDao.getStudentByidStudent(Integer.parseInt(idAccount), "");
                if (!email.equalsIgnoreCase(student.getGmail())) {
                    if (dao.checkMailExit(email) == 1) {
                        request.setAttribute("erroEmailUpdate", "Email đã tồn tại");
                        countTrue++;
                    }
                }
                if (!phone.equals(student.getPhone())) {
                    if (dao.checkPhoneExit(phone) == 1) {
                        request.setAttribute("erroPhoneUpdate", "Phone đã tồn tại");
                        countTrue++;
                    }
                }
                if (countTrue!=0) {
                    
                }

            }
            int coutCheckRole = 0;
            String role = "";
            String account = "Not Change";
            if (slRole != roleId) {
                if (password == null || password.equals("")) {
                    password = RandomString.RandomStringg(8);
                }
                String[] userNameLast = lastName.split(" ");
                String userName = firstName;
                for (String name : userNameLast) {
                    userName += name.charAt(0);
                }
                userName = userName.toLowerCase();
                if (slRole == 2) {
                    //sv
                    specializedin = new Specializedin(1);
                    Student student = new Student(roleId, firstName, lastName, gender, dob, phone, email, address, "", "", specializedin, campus, status, "", user);
                    student.setCodeStudent(studentDao.getMssv(specializedinDao.getCodeSpecializedin(String.valueOf(specializedin.getId()))));
                    userName += student.getCodeStudent();
                    user = new User(String.valueOf(userDao.getIdAccount() + 1), userName, password);
                    student.setUser(user);

                    userDao.insertUser(user, "2"); // insert user vao datase
                    studentDao.insertStudent(student); // insert student cao database
                    coutCheckRole++;
                    account = student.getUser().getUsername();
                    role = "Student";
                }
                if (slRole == 3) {
                    //gv
                    String code = teacherDao.getCodeTeacher();
                    userName += code;
                    user = new User(String.valueOf(userDao.getIdAccount() + 1), userName, password);
                    userDao.insertUser(user, "3"); // insert user vao datase
                    Teacher teacher = new Teacher(roleId, firstName, lastName, gender, dob, "", "", phone, email, address, campus, user, code, true);
                    teacherDao.insert(teacher); // nhap teacher
                    role = "Teacher";
                    account = teacher.getUser().getUsername();
                    coutCheckRole++;
                }
                if (slRole == 4) {
                    //cb
                    String code = officerFUDao.getCodeofficerFU();
                    userName += code;
                    user = new User(String.valueOf(userDao.getIdAccount() + 1), userName, password);
                    userDao.insertUser(user, "4"); // insert user vao datase
                    OfficerFU officerFU = new OfficerFU(roleId, firstName, lastName, gender, dob, phone, email, address, campus, user, code, true);
                    officerFUDao.insert(officerFU);
                    role = "Officer FU";
                    account = officerFU.getUser().getUsername();
                    coutCheckRole++;
                }

                userDao.updateRoleById(user.getId(), slRole);
            }
            String dateOfStart = String.valueOf(java.time.LocalDate.now());

            if (roleId == 2) {
                if (slRole != roleId) {
                    StudentParents studentParents1 = studentParentsDao1.getStudentParentsByIdStudent(String.valueOf(idAccount));
                    if (studentParents1 != null) {
                        studentParentsDao1.deleteByid(String.valueOf(studentParents1.getId()));
                    }
                    studentDao.deleteByid(idAccount);
                } else {
                    Student student = new Student(Integer.parseInt(idAccount), firstName, lastName, gender, dob, phone, email, address, request.getParameter("dobStart"), request.getParameter("dobEnd") == null ? "" : request.getParameter("dobEnd"), specializedin, campus, status, "", user);
                    studentDao.update(student);
                    role = "Student";
                }
            }

            if (roleId == 3) { // done
                if (slRole != roleId) {
                    teacherDao.deleteByid(idAccount);
                    if (slRole != 3) {
                        userDao.deleteByid(idUser);
                    }
                } else {
                    Teacher teacher = new Teacher(Integer.parseInt(idAccount), firstName, lastName, gender, dob, request.getParameter("dobStart"), request.getParameter("dobEnd") == null ? "" : request.getParameter("dobEnd"), phone, email, address, campus, user, "", true);
                    teacherDao.update(teacher);
                    role = "Teacher";
                }
            }
            if (roleId == 4) {
                if (slRole != roleId) {
                    officerFUDao.deleteByid(String.valueOf(idAccount));
                    if (slRole != 4) {
                        userDao.deleteByid(idUser);
                    }
                } else {
                    OfficerFU officerFU = new OfficerFU(Integer.parseInt(idAccount), firstName, lastName, gender, dob, phone, email, address, campus, user, "", true);
                    officerFUDao.update(officerFU);
                    role = "Officer FU";
                }
            }
            if (roleId == 5) {
                StudentParents studentParents = new StudentParents(Integer.parseInt(idAccount), firstName, lastName, gender, dob, phone, email, address, campus, "", true);
                studentParentsDao1.update(studentParents);
                role = "Student Parents";
            }

            if (slRole == roleId) {
                if (password != null && !password.equals("")) {
                    user = new User(idUser, lastName, password);
                    userDao.updateUserPass(user);
                    coutCheckRole++;
                }
            }
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
                        + "You are a " + role + " now<br/>\n"
                        + "Account: <span style='color: red;'> " + account + "</span><br/>\n"
                        + "Password: <span style='color: red;'> " + password + "</span><br/>\n"
                        + "</body>\n"
                        + "</html>";

                String acc_TK_Mail_Send = "phongdaotaofbt@gmail.com";
                String acc_MK_Mail_Send = "npmgjujnxbtswmit";
                SendMail.SendMail(email, topic, content, acc_TK_Mail_Send, acc_MK_Mail_Send);
            }
            response.sendRedirect("indexBQT?nextAccount=1&slRole=" + slRole);

        }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
