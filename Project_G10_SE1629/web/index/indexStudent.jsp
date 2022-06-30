<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%-- 
    Document   : indexStudent
    Created on : Jun 26, 2022, 5:32:32 PM
    Author     : Viet
--%>
<%
if (request.getSession().getAttribute("dalogin") == null) {
            response.sendRedirect("home");
        }
if (request.getSession().getAttribute("st_login_successful") == null) {
            response.sendRedirect("index");
        }
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

    <head>
        <title>FPT University Academic Portal</title>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="icon" type="image/png" href="https://s3.ap-northeast-1.amazonaws.com/h.files/images/1655654596490_Cn6PveFXv2.png" />
        <style>
            body {
                font-family: "Verdana",sans-serif;
                transition: background-color .5s;
            }

            .sidenav {
                height: 100%;
                width: 0;
                position: fixed;
                z-index: 1;
                top: 0;
                left: 0;
                background-image: linear-gradient(to right top, #d7e6f9, #f3d3b4, #ffffff);
                overflow-x: hidden;
                transition: 0.5s;

            }

            .sidenav a {
                padding: 8px 8px 8px 32px;
                text-decoration: none;
                font-size: 15px;
                color: #818181;

                display: block;
                transition: 0.3s;
            }

            .sidenav a:hover {
                color: #f1f1f1;
                background-color: #2196F3;
            }

            .sidenav a:active {
                background-color: #4121f3;
                color: #f1f1f1;

            }

            .acti10 {
                background-color: #4121f3;
                color: #f3d3b4;
                font-weight: bold;

            }


            .sidenav .closebtn {
                position: absolute;
                top: 0;
                right: 25px;
                font-size: 36px;
                margin-left: 50px;
            }

            #main {
                transition: margin-left .5s;
                padding: 16px;
                float: left;
                width: 10%;
                height: 100%;
            }

            #right {

                float: right;
                width: 89%;
                height: 100%;
            }

            @media screen and (max-height: 450px) {
                .sidenav {
                    padding-top: 15px;
                }

                .sidenav a {
                    font-size: 18px;
                }


            }



            body {
                width: 100%;
                height: 100vh;
                background-image: linear-gradient(to right top, #d7e6f9, #f3d3b4, #ffffff);
            }


            .clear {
                clear: both;
            }

            .sidenav .closebtn{
                padding: 1px !important;
                margin: 5px;
            }
        </style>


    </head>

    <body>


        <div id="mySidenav" class="sidenav">
            <a href="javascript:void(0)" class="closebtn" onclick="closeNav()">&times;</a><br /><br /><br />
            <form>

                <a <c:if test="${giaoDien == 1}" var="t">
                        class="acti10"
                    </c:if> href="index?sid=1">Home</a>
                <c:if test="${st_login_successful.getStatus().id!=1}" var="t">
                    <a <c:if test="${giaoDien == 2}" var="t">
                            class="acti10"
                        </c:if> href="index?sid=2">MoveClass
                    </a>
                    <a <c:if test="${giaoDien == 3}" var="t">
                            class="acti10"
                        </c:if> href="index?sid=3">MoveClassWithOther</a>
                    <a <c:if test="${giaoDien == 4}" var="t">
                            class="acti10"
                        </c:if> href="index?sid=4">RegisterExtraCourses</a>
                    <a <c:if test="${giaoDien == 5}" var="t">
                            class="acti10"
                        </c:if> href="index?sid=5">RegisterImproveMark</a>
                    <a <c:if test="${giaoDien == 6}" var="t">
                            class="acti10"
                        </c:if> href="index?sid=6">SendApplication</a>
                </c:if>
                <a <c:if test="${giaoDien == 7}" var="t">
                        class="acti10"
                    </c:if> href="index?sid=7">Change Password</a>
                <a href="LogOutController?LogId=${giaoDien}">
                    <i class="uil uil-signout"></i>
                    <span class="link-name">Logout</span>
                </a>
            </form>


        </div>
        <div class="container">
            <div id="main">
                <span id="p" style="font-size:30px;cursor:pointer" onclick="openNav()">&#9776</span>
            </div>
            <div id="right">

                <div class="hearder"><c:choose>
                        <c:when test="${giaoDien == 1}">
                            <%@include file="../subIndex/home.jsp" %>
                        </c:when>
                        <c:when test="${giaoDien == 2}">
                            <%@include file="../subIndex/MoveClass.jsp" %>
                        </c:when>
                        <c:when test="${giaoDien == 3}">
                            <%@include file="../subIndex/MoveClassWithOther.jsp" %>
                        </c:when>
                        <c:when test="${giaoDien == 4}"> 
                            <%@include file="../subIndex/RegisterExtraCourses.jsp" %>
                        </c:when>
                        <c:when test="${giaoDien == 5}"> 
                            <%@include file="../subIndex/RegisterImproveMark.jsp" %>
                        </c:when>
                        <c:when test="${giaoDien == 6}"> 
                            <%@include file="../subIndex/SendApplication.jsp" %>
                        </c:when>
                        <c:when test="${giaoDien == 7}"> 
                            <%@include file="../subIndex/changePassword.jsp" %>
                        </c:when>
                    </c:choose>


                </div>
            </div>
            <div class="clear"></div>
        </div>


        <script>

            function openNav() {

                document.getElementById("mySidenav").style.width = "20%";
                document.getElementById("main").style.marginLeft = "18%";
                document.body.style.backgroundColor = "rgba(0,0,0,0.4)";
                document.getElementById("p").innerHTML = "";
                document.getElementById("right").style.width = "80%";
            }

            function closeNav() {

                document.getElementById("mySidenav").style.width = "0";
                document.getElementById("main").style.marginLeft = "0px";
                document.body.style.backgroundColor = "white";
                document.getElementById("p").innerHTML = "&#9776";
                document.getElementById("right").style.width = "89%";
            }
        </script>
        <!--   Core JS Files   -->

    </body>

</html>
