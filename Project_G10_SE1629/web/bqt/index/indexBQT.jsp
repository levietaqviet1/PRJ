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
        <title>FPT University Academic Portal</title>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="icon" type="image/png" href="https://s3.ap-northeast-1.amazonaws.com/h.files/images/1655654596490_Cn6PveFXv2.png" />
        <!----======== CSS ======== -->
        <link rel="stylesheet" href="cssBQT/style.css">
        <link rel="stylesheet" href="cssBQT/boot/bootstrap.min.css">
        <link rel="stylesheet" href="cssBQT/boot/bootstrap.css">
        <!----===== Iconscout CSS ===== -->
        <link rel="stylesheet" href="https://unicons.iconscout.com/release/v4.0.0/css/line.css">

        <!--<title>Admin Dashboard Panel</title>-->
    </head>

    <body>
        <form action="AdminPage" method="POST">
            <nav>
                <div class="logo-name">
                    <div class="logo-image">
                        <img src="https://s3.ap-northeast-1.amazonaws.com/h.files/images/1655654596490_Cn6PveFXv2.png" alt="khong co internet">
                    </div>

                    <span class="logo_name"><a href="AdminPage" style="text-decoration: none;color: black">BQT FPT</a></span>
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
                        <li><a href="LogOutController?LogId=1">
                                <i class="uil uil-signout"></i>
                                <span class="link-name">Logout</span>
                            </a></li>
                        </li>
                    </ul>
                </div>
            </nav>

            <div class="dashboard">

                <div class="dash-lefttop">

                </div>

                <div class="dash-bottom">

                    <input class="form-control me-2" type="search" name="search" placeholder="Search" aria-label="Search">
                    <button class="btn btn-outline-success" type="submit">Search</button>


                </div>
                <div class="sl-id" style="display: flex;">

                    <div>
                        <select name="slRole"  style="width: auto;margin-left: 70px;margin-top: 20px;">
                            <option value="0" selected>All</option>
                            <c:forEach items="${requestScope.listRole}" var="roles">
                                <option value="${roles.id}">${roles.name}</option>
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

                                <th scope="col">Dob</th>
                                <th scope="col">Phone Number</th>
                                <th scope="col">Address</th>

                                <th scope="col">Role_id</th>
                                <th scope="col">Update</th>
                                <th scope="col">Delete</th>

                            </tr>
                        </thead>
                        <tbody>
                            <c:forEach items="${requestScope.listTeacher}" var="t" >
                                <tr>
                                    <th scope="row">${t.id}</th>
                                    <td>${t.firstName}</td>
                                    <td>${t.lastName}</td>
                                    <td>${t.lastName} ${t.firstName} </td>
                                    <td>

                                        <c:if test="${t.gender == true}" >
                                            Male
                                        </c:if>    
                                        <c:if test="${t.gender == false}" >
                                            FeMale
                                        </c:if>  
                                    </td>
                                    <td>${t.gmail}</td>

                                    <td>${t.date}</td>
                                    <td>${t.phone}</td>
                                    <td>${t.address}</td>

                                    <td>
                                        ${t.user.role.name}
                                    </td>
                                    <td><a href="updateAccountController?sid=${t.id}">Update</a></td>
                                    <td><a href="deleteAccount?sid=${t.id}">Delete</a></td>
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