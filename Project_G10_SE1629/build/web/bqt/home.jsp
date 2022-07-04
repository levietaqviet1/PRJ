<%-- 
   Document   : home2
   Created on : Jun 23, 2022, 3:45:17 AM
   Author     : Viet
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.ArrayList"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html lang="en">
    <head>
        <meta charset="utf-8" />
        <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
        <title>FPT University Academic Portal</title>

        <meta content='width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0' name='viewport' />
        <meta name="viewport" content="width=device-width" />

        <link rel="apple-touch-icon" sizes="75x75" href="img/d.png" />
        <link rel="icon" type="image/png" href="https://s3.ap-northeast-1.amazonaws.com/h.files/images/1655654596490_Cn6PveFXv2.png" />

        <!--     Fonts and icons     -->
        <link rel="stylesheet" type="text/css" href="https://fonts.googleapis.com/css?family=Roboto:300,400,500,700|Roboto+Slab:400,700|Material+Icons" />
        <!--<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/latest/css/font-awesome.min.css" />-->

        <!-- CSS Files -->
        <!--<link href="assets/css/bootstrap.min.css" rel="stylesheet" />-->
        <link href="css/login/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <!--<link href="assets/css/material-bootstrap-wizard.css" rel="stylesheet" />-->
        <link href="css/login/material-bootstrap-wizard.css" rel="stylesheet" type="text/css"/>
        <!-- CSS Just for demo purpose, don't include it in your project -->
        <link href="css/login/demo.css" rel="stylesheet" type="text/css"/>
        <link href="css/load/loadCss.css" rel="stylesheet" type="text/css"/>
        <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
        <%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>

    </head>

    <body>

        <div id="preloder">
            <div class="loader"></div>
        </div>

        <div class="image-container set-full-height" style="background-image: url('https://i.imgur.com/duhzz35.jpeg')">
            <!--   Creative Tim Branding   -->
            <a href="#">
                <div class="logo-container">
                    <div class="logo">
                        <img src="https://s3.ap-northeast-1.amazonaws.com/h.files/images/1655654596490_Cn6PveFXv2.png">
                    </div>
                    <div class="brand">
                        FPT University 
                    </div>
                </div>
            </a>

            <!--   Big container   -->
            <div class="container">
                <div class="row">
                    <div class="col-sm-8 col-sm-offset-2">
                        <!--      Wizard container        -->
                        <div class="wizard-container">
                            <div class="card wizard-card" data-color="red" id="wizard">



                                <form id="myform" action="AuthenticationController" method="POST" >
                                    <!--        You can switch " data-color="blue" "  with one of the next bright colors: "green", "orange", "red", "purple"             -->
                                    <div class="wizard-header">
                                        <h3 class="wizard-title">
                                            Tham gia nào
                                        </h3>
                                        <h5>Nếu bạn là người mới hãy đăng ký, bạn đã tham gia trước đó hãy đăng nhập.</h5>
                                    </div>
                                    <div hidden class="wizard-navigation">
                                        <ul>
                                            <li ><a href="#captain"  data-toggle="tab"></a></li>
                                        </ul>
                                    </div>

                                    <div class="tab-content">
                                        <div class="tab-pane" id="captain">
                                            <div class="row">
                                                <div class="col-sm-12">
                                                    <h4 class="info-text"> Hãy điền thông tin đăng nhập của bạn.</h4>
                                                    <span id = "messageIn"class="info-text" > <h4 style="color: red">${requestScope.messIn} </h4> </span> 
                                                </div>
                                                <div class="col-sm-3" ></div>
                                                <div class="col-sm-6" > 

                                                    <div class="input-group">
                                                        <span class="input-group-addon">
                                                            <i class="material-icons">person</i>
                                                        </span>
                                                        <div class="form-group label-floating" >
                                                            <label class="control-label">Account</label>
                                                            <input name="usernameup" type="text" value="${usernameup}" class="form-control">
                                                        </div>
                                                    </div>

                                                    <div class="input-group">
                                                        <span class="input-group-addon">
                                                            <i class="material-icons">lock_outline</i>
                                                        </span>
                                                        <div class="form-group label-floating" >
                                                            <label class="control-label">Your Password</label>
                                                            <input name="passup" type="password" value="${passup}" class="form-control">
                                                        </div>
                                                    </div>


                                                    <div class="input-group">
                                                        <span class="input-group-addon">
                                                            <i class="material-icons">touch_app</i>
                                                        </span>
                                                        <div class="form-group label-floating" >
                                                            <label class="control-label">Select Campus</label>
                                                            <select style="width: 100%;" class="" name="campusup">
                                                                <c:forEach var="t" items="${listCampus}">
                                                                    <option value="${t.id}"
                                                                            <c:if test="${campusup == t.id}" >
                                                                                selected
                                                                            </c:if>
                                                                            >FU-${t.name}</option>
                                                                </c:forEach>

                                                            </select>

                                                        </div>
                                                    </div>  
                                                </div>

                                                <div class="col-sm-3" ></div>

                                            </div>

                                        </div>

                                    </div>

                                    <div class="wizard-footer" style="text-align: center">
                                        <input type='submit' class='btn btn-finish btn-fill btn-danger btn-wd' name='loginBQT' value='Đăng nhập' />
                                </form>      

                                <form action="nextForgotPass?bqt=1" method="Get">
                                    <br/>
                                    <input type='submit' class='btn btn-finish btn-fill btn-danger btn-wd' name='forPassBQT' value='Forgot Passwood' />
                                </form>
                                <div class="clearfix"></div>
                            </div>


                        </div>
                    </div> <!-- wizard container -->
                </div>
            </div> <!-- row -->
        </div> <!--  big container -->


    </div>

</body>
<!--   Core JS Files   -->
<!--<script src="assets/js/jquery-2.2.4.min.js" type="text/javascript"></script>-->
<script src="js/login/jquery-2.2.4.min.js" type="text/javascript"></script>
<script src="js/login/bootstrap.min.js" type="text/javascript"></script>
<!--<script src="assets/js/bootstrap.min.js" type="text/javascript"></script>-->
<script src="js/login/jquery.bootstrap.js" type="text/javascript"></script>

<!--  Plugin for the Wizard -->
<script src="js/login/material-bootstrap-wizard.js"></script>

<!--  More information about jquery.validate here: http://jqueryvalidation.org/	 -->
<script src="js/login/jquery.validate.min.js"></script>

<script src="js/login/main.js"></script>


</html>
