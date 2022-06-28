<%-- 
    Document   : sendSuEmail
    Created on : Jun 24, 2022, 11:00:29 AM
    Author     : NCC
--%>
<%
    if (request.getAttribute("nextAdd") != null) {
     
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="location.locationHot" %>
<!DOCTYPE html>
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
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/latest/css/font-awesome.min.css" />

        <!-- CSS Files -->
        <!--<link href="assets/css/bootstrap.min.css" rel="stylesheet" />-->
        <link href="css/login/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <!--<link href="assets/css/material-bootstrap-wizard.css" rel="stylesheet" />-->
        <link href="css/login/material-bootstrap-wizard.css" rel="stylesheet" type="text/css"/>
        <!-- CSS Just for demo purpose, don't include it in your project -->
        <link href="css/login/demo.css" rel="stylesheet" type="text/css"/>
        <link href="css/load/loadCss.css" rel="stylesheet" type="text/css"/>
        <style>
            #imgEmail {
                width: 100%;
                height: 300px;
                padding: 0px;
            }

            #imgEmail img {
                margin-left: auto;
                margin-right: auto;
                width: 100%;
                height: 100%;
                object-fit: contain;
            }
        </style>
    </head>
    <body>
        <div id="preloder">
            <div class="loader"></div>
        </div>
        <div class="image-container set-full-height" style="background-image: url('https://i.imgur.com/duhzz35.jpeg')">
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
            <div class="container">
                <div class="row">
                    <div class="col-sm-8 col-sm-offset-2">
                        <!--      Wizard container        -->
                        <div class="wizard-container">
                            <div class="card wizard-card" style="padding-bottom: 0;" data-color="red" id="wizard">
                                <div class="wizard-header" style="padding-bottom: 0;">
                                    <h3 class="wizard-title">
                                        ${title}
                                    </h3>
                                    <h5>Lưu ý: Thư có thể nằm trong Thư rác (Junk Mail). Chức năng có hiệu lực trong vòng 1 ngày</h5>
                                    <div id='imgEmail'>
                                        <img src="https://png.pngtree.com/element_our/20190601/ourlarge/pngtree-check-mark-gold-foil-material-element-image_1345783.jpg" alt="">
                                    </div>
                                </div>

                            </div>
                        </div>
                        <div class="wizard-footer" style="text-align: center">
                           
                           
                            <a href="https://mail.google.com/mail/u/1/?pli=1#all"><button type='button' class='btn btn-next btn-fill btn-danger btn-wd' name='login' value='' >Move Email</button></a>
                            <a href="home"><button type='button' id="signup"  class='btn btn-finish  btn-fill btn-danger btn-wd' name='signup' >Move Home</button></a>

                        </div>
                    </div>
                </div>
            </div>
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
<%}else{
        response.sendRedirect("home");
    }
%>