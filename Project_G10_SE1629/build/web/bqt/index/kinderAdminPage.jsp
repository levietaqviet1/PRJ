<%-- 
    Document   : kinderAdminPage
    Created on : Jun 24, 2022, 5:08:41 PM
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
        <form action="adminKinderPageHome">

            <nav>
                <div class="logo-name">
                    <div class="logo-image">
                        <img src="images/logo.jpg" alt="">
                    </div>

                    <span class="logo_name">Admin Page</span>
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
                <div class="dash-bottom">

                    <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search">
                    <button class="btn btn-outline-success" type="submit">Search</button>


                </div>
                <div class="sl-id" style="display: flex;">
                    <div>
                        <select  style="width: 30%;margin-left: 70px;margin-top: 20px;">
                            <option selected>All</option>
                            <option value="1">One</option>
                            <option value="2">Two</option>
                            <option value="3">Three</option>
                        </select>
                    </div>
                    <div>
                        <button  type="submit" style="width: 40%;margin-left: 70px;margin-top: 20px;"><a href="addKinderByAdmin">Add</a> </button> 
                    </div>

                </div>
                <div class="dash-bottomtable">
                    <table class="table" >
                        <thead>
                            <tr>
                                <th scope="col">KinderID</th>
                                <th scope="col">ParentID</th>
                                <th scope="col">FirstName</th>
                                <th scope="col">LastName</th>
                                <th scope="col">DOB</th>
                                <th scope="col">Gender</th>
                                <th scope="col">Img</th>
                                <th scope="col">Update</th>
                                <th scope="col">Delete</th>

                            </tr>
                        </thead>
                        <tbody>
                            <c:forEach items="${requestScope.list}" var="lts">
                                <tr>
                                    <th scope="row">${lts.kinderId}</th>
                                    <td>${lts.parentId}</td>
                                    <td>${lts.firstName}</td>
                                    <td>${lts.lastName}</td>
                                    <td>${lts.dob}</td>
                                    <td>${lts.gender}</td>
                                    <td><img src="${lts.img}" alt="hình ảnh"/></td>
                                    <td><a href="updateKinderController?sid=${lts.kinderId}">Update</a> </td>
                                    <td><a href="deleteKinder?sid=${lts.kinderId}">Delete</a> </td>
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
