<%-- 
    Document   : adminAccountUpdate
    Created on : Jun 24, 2022, 4:32:23 PM
    Author     : win
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<!--=== Coding by CodingLab | www.codinglabweb.com === -->
<html lang="en">

    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">

        <!----======== CSS ======== -->
        <link rel="stylesheet" href="cssBQT/style.css">
        <link rel="stylesheet" href="boot/bootstrap.min.css">
        <link rel="stylesheet" href="boot/bootstrap.css">
        <!----===== Iconscout CSS ===== -->
        <link rel="stylesheet" href="https://unicons.iconscout.com/release/v4.0.0/css/line.css">

        <!--<title>Admin Dashboard Panel</title>-->
    </head>

    <body>
        <form action="updateAccountController?ida=${requestScope.s.getAccountID()}" method="POST">
            <nav>
                <div class="logo-name">
                    <div class="logo-image">
                        <img src="images/logo.jpg" alt="">
                    </div>

                    <span class="logo_name"><a href="AdminPage" style="text-decoration: none;color: black">Admin Page</a></span>
                </div>

                <div class="menu-items">
                    <ul class="nav-links">
                        <li><a href="AdminPage">
                                <i class="uil uil-estate"></i>
                                <span class="link-name">Account</span>
                            </a></li>                
                        <li><a href="adminKinderPageHome">
                                <i class="uil uil-chart"></i>
                                <span class="link-name">Kindergartner</span>
                            </a></li>
                        <li><a href="#">
                                <i class="uil uil-thumbs-up"></i>
                                <span class="link-name">Class</span>
                            </a></li>
                        <li><a href="#">
                                <i class="uil uil-comments"></i>
                                <span class="link-name">Schedule</span>
                            </a></li>
                        <li><a href="#">
                                <i class="uil uil-share"></i>
                                <span class="link-name">Attendance</span>
                            </a></li>
                    </ul>

                    <ul class="logout-mode">
                        <li><a href="#">
                                <i class="uil uil-signout"></i>
                                <span class="link-name">Logout</span>
                            </a></li>
                        </li>
                    </ul>
                </div>
            </nav>

            <div class="dashboard">

                <div class="dash-lefttop">
                    <img src="https://i.pinimg.com/originals/72/45/fb/7245fb0ca786bb4a98fb8465e437c5bb.jpg" alt="">
                    <a href="#">User</a>
                </div>

                <div class="form-title" style="text-align: center;font-size: 50px;">Update Account</div>
                <div class="form-content" style="width: 80%;height: auto; margin-left: 10%; padding-top: 0;padding-bottom: 0;">

                    <div class="mb-3">
                        <label for="exampleFormControlInput1" class="form-label">First Name</label>
                        <input type="text" class="form-control" id="exampleFormControlInput1" name="txtFirstName" value="${s.firstName}" >
                    </div>
                    <div class="mb-3">
                        <label for="exampleFormControlInput1" class="form-label">Last Name</label>
                        <input type="text" class="form-control" id="exampleFormControlInput1" name="txtLastName" value="${s.lastName}">
                    </div>
                    <div class="rdCheck" style="display: flex">
                        <div class="form-check">
                            <label for="exampleFormControlInput1" class="form-label">Gender</label>
                            <input type="radio" name="gender" 

                                   <c:if test = "${s.gender}">
                                       checked=""
                                   </c:if>    
                                   value="male" />Male
                            <input type="radio" name="gender" 

                                   <c:if test = "${!s.gender}">
                                       checked=""
                                   </c:if>    
                                   value="female" />Female 
                            <br/>
                        </div>

                        
                    </div>

                    <div class="mb-3">
                        <label for="exampleFormControlInput1" class="form-label">Email</label>
                        <input type="email" class="form-control" id="exampleFormControlInput1" name="txtEmail" value="${s.email}" placeholder="name@example.com">
                    </div>
                    <div class="mb-3">
                        <label for="exampleFormControlInput1" class="form-label">Pass Word</label>
                        <input type="text" class="form-control" name="txtPassword" value="${s.password}" id="exampleFormControlInput1">
                    </div>

                    <div class="mb-3">
                        <label for="exampleFormControlInput1" class="form-label">DOB</label>
                        <input type="date" name="dob" value="${s.dob}"/>(yyyy-MM-dd)<br/>
                    </div>
                    <div class="mb-3">
                        <label for="exampleFormControlInput1" class="form-label">Number Phone</label>
                        <input type="text" class="form-control" id="exampleFormControlInput1" name="txtPhone" value="${s.phoneNumber}" placeholder="name@example.com">
                    </div>
                    <!--                    <div class="mb-3">
                                            <label for="exampleFormControlTextarea1" class="form-label">Address</label>
                                            <textarea class="form-control" id="exampleFormControlTextarea1" name="ttAddress"   rows="3"></textarea>
                                        </div>-->
                    <div class="mb-3">
                        <label for="exampleFormControlInput1" class="form-label">Address</label>
                        <input type="text" class="form-control" id="exampleFormControlInput1" name="ttAddress" value="${s.address}" placeholder="name@example.com">
                    </div>
                    <div class="mb-3">
                        <label for="exampleFormControlInput1" class="form-label">Image</label>
                        <input type="text" class="form-control" id="exampleFormControlInput1" name="txtImg" value="${s.image}" placeholder="name@example.com">
                    </div>
                    <label for="exampleFormControlInput1" class="form-label">Role</label>
                    <select class="form-select" name="slRole" aria-label="Default select example">
                        
                        <c:forEach items="${requestScope.listR}" var="role">
                            <option  value="${role.role_id}">${role.role_name}</option>
                        </c:forEach>
                    </select>
                    <div class="d-grid gap-2 d-md-block" style="margin-top: 30px; margin-bottom: 30px; ;">
                        <input type="submit" value="Save"/>
                        <button class="btn btn-primary" type="button" style="background-color: red;">Cancel X</button>
                    </div>
                </div>



            </div>



        </div>

    </form>

    <!-- <script src="agu.js"></script> -->
</body>

</html>
