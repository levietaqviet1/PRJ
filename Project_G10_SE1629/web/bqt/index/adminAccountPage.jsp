<%-- 
    Document   : adminAccountPage
    Created on : Jun 22, 2022, 11:14:47 PM
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
        <link rel="stylesheet" href="css/style.css">
        <link rel="stylesheet" href="boot/bootstrap.min.css">
        <link rel="stylesheet" href="boot/bootstrap.css">
        <!----===== Iconscout CSS ===== -->
        <link rel="stylesheet" href="https://unicons.iconscout.com/release/v4.0.0/css/line.css">

        <!--<title>Admin Dashboard Panel</title>-->
    </head>

    <body>
        <form action="AdminPage" method="POST">
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
                    <a href="#" style="text-decoration: none">User</a>
                </div>

                <div class="dash-bottom">

                    <input class="form-control me-2" type="search" name="search" placeholder="Search" aria-label="Search">
                    <button class="btn btn-outline-success" type="submit">Search</button>


                </div>
                <div class="sl-id" style="display: flex;">
                    <!--                    <div>
                                            <select name="slL"  style="width: auto;margin-left: 70px;margin-top: 20px;">
                                                <option selected>All</option>
                                                <option value="1">One</option>
                                                <option value="2">Two</option>
                                                <option value="3">Three</option>
                                            </select>
                    
                                        </div>-->
                    <div>
                        <select name="slRole"  style="width: auto;margin-left: 70px;margin-top: 20px;">
                            <option value="0" selected>All</option>
                            <c:forEach items="${requestScope.roles}" var="roles">
                                <option value="${roles.role_id}">${roles.role_name}</option>
                            </c:forEach>
                        </select>

                    </div>
                    <div>
                        <button  type="submit" style="width: 40%;margin-left: 70px;margin-top: 20px;"><a href="addAccountController" style="text-decoration: none">Add</a> </button> 
                    </div>

                </div>


                <div class="dash-bottomtable">
                    <table class="table" >
                        <thead>

                            <tr>
                                <th scope="col">ID</th>
                                <th scope="col">First Name</th>
                                <th scope="col">Last Name</th>
                                <th scope="col">Name</th>
                                <th scope="col">Gender</th>
                                <th scope="col">Email</th>
                                <th scope="col">Password</th>
                                <th scope="col">Dob</th>
                                <th scope="col">Phone Number</th>
                                <th scope="col">Address</th>
                                <th scope="col">Img</th>
                                <th scope="col">Role_id</th>
                                <th scope="col">Update</th>
                                <th scope="col">Delete</th>

                            </tr>
                        </thead>
                        <tbody>
                            <c:forEach items="${requestScope.ac}" var="t" >
                                <tr>
                                    <th scope="row">${t.accountID}</th>
                                    <td>${t.firstName}</td>
                                    <td>${t.lastName}</td>
                                    <td>${t.firstName} ${t.lastName}</td>
                                    <td>

                                        <c:if test="${t.gender == true}" >
                                            Male
                                        </c:if>    
                                        <c:if test="${t.gender == false}" >
                                            FeMale
                                        </c:if>  
                                    </td>
                                    <td>${t.email}</td>
                                    <td>${t.password}</td>
                                    <td>${t.dob}</td>
                                    <td>${t.phoneNumber}</td>
                                    <td>${t.address}</td>
                                    <td>${t.image}</td>
                                    <td>
                                        <c:if test="${t.roleId == 1}" >
                                            Admin
                                        </c:if> 
                                        <c:if test="${t.roleId == 2}" >
                                            Teacher
                                        </c:if> 
                                        <c:if test="${t.roleId == 3}" >
                                            Parent
                                        </c:if> 
                                    </td>
                                    <td><a href="updateAccountController?sid=${t.accountID}">Update</a></td>
                                    <td><a href="deleteAccount?sid=${t.accountID}">Delete</a></td>
                                </tr>
                            </c:forEach>

                        </tbody>
                    </table>
                </div>


            </div>
        </form>



        <!-- <script src="agu.js"></script> -->
    </body>

</html>