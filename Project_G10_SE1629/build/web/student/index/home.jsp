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
                                    <div class="wizard-navigation">
                                        <ul>
                                            <c:choose>
                                                <c:when test="${requestScope.messIn != null}">
                                                    <li><a href="#captain"  data-toggle="tab">Đăng nhập</a></li>
                                                    <li><a href="#details"  data-toggle="tab">Đăng ký</a></li>
                                                    </c:when>
                                                    <c:when test="${requestScope.messUp != null}">
                                                    <li><a href="#details"  data-toggle="tab">Đăng ký</a></li>
                                                    <li><a href="#captain"  data-toggle="tab">Đăng nhập</a></li>
                                                    </c:when>
                                                    <c:otherwise>
                                                    <li><a href="#captain"  data-toggle="tab">Đăng nhập</a></li>
                                                    <li><a href="#details"  data-toggle="tab">Đăng ký</a></li>
                                                    </c:otherwise>
                                                </c:choose>

                                        </ul>
                                    </div>

                                    <div class="tab-content">
                                        <div class="tab-pane" id="details">
                                            <div class="row">
                                                <div class="col-sm-12">
                                                    <h4 class="info-text"> Hãy điền thông tin bạn muốn đăng ký.</h4>
                                                </div>
                                                <div class="col-sm-3" ></div>
                                                <div class="col-sm-6" >

                                                    <div class="input-group">
                                                        <span id="clear" class="input-group-addon">
                                                            <i class="material-icons">person</i>
                                                        </span><span id = "message" style="color:red">${requestScope.firstNamein_mess} </span> 
                                                    </span><span id = "message" style="color:red">${requestScope.tessssst} </span> 
                                                <div class="form-group label-floating" >
                                                    <label class="control-label">First Name</label>
                                                    <input name="firstNamein"  value="${requestScope.firstNamein_signup}"  type="text" class="form-control">
                                                </div>
                                            </div>

                                            <div class="input-group">
                                                <span class="input-group-addon">
                                                    <i class="material-icons">person</i>
                                                </span> <span id = "message" style="color:red">${requestScope.lastNamein_mess} </span> 
                                                <div class="form-group label-floating" >
                                                    <label class="control-label">Last Name</label>

                                                    <input  name="lastNamein" value="${requestScope.lastNameins_signup}" type="text" class="form-control">
                                                </div>
                                            </div> 



                                            <div class="input-group">
                                                <span class="input-group-addon">
                                                    <i class="material-icons">date_range</i>
                                                </span><span id = "message" style="color:red">${requestScope.ageup_mess}<br/>${requestScope.notAgeup_mess} </span> 
                                                <div class="form-group label-floating" >

                                                    <label class=" ">Date Of Birth</label>
                                                    <input  id="clear1"  name="dateOfBirthin"  value="${requestScope.dateOfBirthup_mess}"  type="date" class="form-control">
                                                </div>
                                            </div> 

                                            <div class="input-group">
                                                <span class="input-group-addon">
                                                    <i class="material-icons">person</i>
                                                </span>
                                                <div class="form-group label-floating" >
                                                    <label class="control-label">Gender</label>
                                                    <c:choose>
                                                        <c:when test="${requestScope.genderin_signup ==0}">
                                                            <input type="radio" name="genderin" value="1" id="Male"  > <label
                                                                for="Male"> Male </label>
                                                            <input type="radio" name="genderin" value="0"checked id="Female" ><label
                                                                for="Female"> Female </label>
                                                        </c:when>
                                                        <c:otherwise>
                                                            <input type="radio" name="genderin" value="1" checked id="Male"  > <label
                                                                for="Male"> Male </label>
                                                            <input type="radio" name="genderin" value="0" id="Female" ><label
                                                                for="Female"> Female </label>
                                                        </c:otherwise>
                                                    </c:choose>


                                                </div>
                                            </div> 

                                            <div class="input-group">
                                                <span class="input-group-addon">
                                                    <i class="material-icons">location_on</i>
                                                </span><span id = "message" style="color:red">${requestScope.addressup_mess}</span> 
                                                <div class="form-group label-floating" >
                                                    <label class="control-label">Address</label>
                                                    <input name="addressin" type="text" value="${requestScope.addressin_signup}" id="address" class="form-control">
                                                </div>
                                            </div> 

                                            <div class="input-group">
                                                <span class="input-group-addon">
                                                    <i class="material-icons">call</i>
                                                </span><span id = "message" style="color:red">${requestScope.telephoneup_mess}</span> 
                                                <div class="form-group label-floating" >
                                                    <label class="control-label">Telephone</label>
                                                    <input  type="text"  name="telephonein" value="${requestScope.telephonein_signup}"  id="telephone"  class="form-control">
                                                </div>
                                            </div> 

                                            <div class="input-group">
                                                <span class="input-group-addon">
                                                    <i class="material-icons">email</i>
                                                </span> <span id = "message" style="color:red">${requestScope.emailin_signup_mess}</span> 
                                                <div class="form-group label-floating" >
                                                    <label class="control-label">Email</label>
                                                    <input type="text" name="emailin" value="${requestScope.emailin_signup}"  class="form-control">
                                                </div>
                                            </div>

                                            <div class="input-group">
                                                <span class="input-group-addon">
                                                    <i class="material-icons">touch_app</i>
                                                </span>
                                                <div class="form-group label-floating" >
                                                    <label class="control-label">Specialized</label>
                                                    <select style=" width: 100%;" class="" name="specializedin">
                                                        <c:forEach var="t" items="${listSpecializedin}">
                                                            <option value="${t.id}"
                                                                    <c:if test="${specializedin_signup == t.id}" >
                                                                        selected
                                                                    </c:if>>${t.name} 
                                                            </option>
                                                        </c:forEach>
                                                    </select>
                                                </div>
                                            </div>  

                                            <div class="input-group">
                                                <span class="input-group-addon">
                                                    <i class="material-icons">touch_app</i>
                                                </span>
                                                <div class="form-group label-floating" >
                                                    <label class="control-label">Select Campus</label>
                                                    <select style="width: 100%;" class="" name="campusin">
                                                        <c:forEach var="t" items="${listCampus}">
                                                            <option value="${t.id}"
                                                                    <c:if test="${campusin_signup == t.id}" >
                                                                        selected
                                                                    </c:if>>FU-${t.name}
                                                            </option>
                                                        </c:forEach>
                                                    </select>
                                                    <span id = "message" style="color:red">${requestScope.mess} </span> 
                                                </div>
                                            </div>  

                                        </div>
                                        <div class="col-sm-3" ></div>

                                    </div>

                                </div>

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
                                                    <label class="control-label">Select Role</label>
                                                    <select name="roleup" id="" style="width: 100%;" >
                                                        <c:forEach var="t" items="${listRole}">
                                                            <option value="${t.id}"
                                                                    <c:if test="${roleup == t.id}" >
                                                                        selected
                                                                    </c:if>
                                                                    >${t.name}</option>
                                                        </c:forEach>
                                                    </select>
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
                                <c:choose>
                                    <c:when test="${requestScope.messIn != null}">
                                        <input type='submit' class='btn btn-next btn-fill btn-danger btn-wd' name='login' value='Đăng nhập' />
                                        <input type='submit' id="signup"  class='btn btn-finish  btn-fill btn-danger btn-wd' name='signup' value='Đăng ký' />
                                </form>
                                <form action="nextForgotPass" method="Get">
                                    <br/>
                                    <input type='submit' class='btn btn-next btn-fill btn-danger btn-wd' name='forPass' value='Forgot Passwood' />

                                </form>
                            </c:when>
                            <c:when test="${requestScope.messUp != null}">
                                <input type='submit' class='btn btn-finish btn-fill btn-danger btn-wd' name='login' value='Đăng nhập' />
                                <input type='submit' id="signup"  class='btn btn-next  btn-fill btn-danger btn-wd' name='signup' value='Đăng ký' />
                                </form>
                                <form action="nextForgotPass" method="Get">
                                    <br/>
                                    <input type='submit' class='btn btn-finish btn-fill btn-danger btn-wd' name='forPass' value='Forgot Passwood' />

                                </form>
                            </c:when>
                            <c:otherwise>
                                <input type='submit' class='btn btn-next btn-fill btn-danger btn-wd' name='login' value='Đăng nhập' />
                                <input type='submit' id="signup"  class='btn btn-finish  btn-fill btn-danger btn-wd' name='signup' value='Đăng ký' />
                                </form>      

                                <form action="nextForgotPass" method="Get">
                                    <br/>
                                    <input type='submit' class='btn btn-next btn-fill btn-danger btn-wd' name='forPass' value='Forgot Passwood' />

                                </form>
                            </c:otherwise>
                        </c:choose> 



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
