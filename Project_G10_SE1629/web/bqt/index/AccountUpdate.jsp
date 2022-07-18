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
        <title>FPT University Academic Portal</title>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="icon" type="image/png" href="https://s3.ap-northeast-1.amazonaws.com/h.files/images/1655654596490_Cn6PveFXv2.png" />

        <!----======== CSS ======== -->
        <link rel="stylesheet" href="bqt/cssBQT/style.css">
        <link rel="stylesheet" href="bqt/cssBQT/boot/bootstrap.min.css">
        <link rel="stylesheet" href="bqt/cssBQT/boot/bootstrap.css">
        <!----===== Iconscout CSS ===== -->
        <link rel="stylesheet" href="https://unicons.iconscout.com/release/v4.0.0/css/line.css">

        <!--<title>Admin Dashboard Panel</title>-->
        <style>
            b {
                position: absolute;
                background-color: red;
                width: 10px;
                height: 10px;
                pointer-events: none;
                border-radius: 90%;
            }

            b::before {
                content: '';
                position: absolute;
                width: 100%;
                height: 100%;
                background: #00bcd4;
                border-radius: 50%;
                animation: moveParticles 2s linear infinite;
            }

            @keyframes moveParticles {
                0%
                {
                    transform: translate(0);
                }
                100%
                {
                    transform: translate(300px);
                }
            }
            a:hover {
                color: #255784;
                background: #2196f3;
                box-shadow: 0 0 10px #2196f3, 0 0 40px #2196f3, 0 0 80px #2196f3;
            }
        </style>
    </head>

    <body>

        <form action="updateAccount?sid=${requestScope.sid}&roleId=${requestScope.updateID}&idUser=${requestScope.userId}" method="POST">
            <nav>
                <div class="logo-name">
                    <div class="logo-image">
                        <img src="https://s3.ap-northeast-1.amazonaws.com/h.files/images/1655654596490_Cn6PveFXv2.png" alt="khong co internet">
                    </div>

                    <span class="logo_name"><a href="#" style="text-decoration: none;color: black">BQT FPT</a></span>
                </div>

                <div class="menu-items">
                    <ul class="nav-links">
                        <li><a href="indexBQT?nextAccount=1">
                                <i class="uil uil-estate"></i>
                                <span class="link-name">Account</span>
                            </a></li>
                        <li><a href="indexBQT?nextClass=1">
                                <i class="uil uil-thumbs-up"></i>
                                <span class="link-name">Class</span>
                            </a></li>
                        <li><a href="changePassworBQT?id=1">
                                <i class="uil uil-thumbs-up"></i>
                                <span class="link-name">Change Password</span>
                            </a></li>
                    </ul>

                    <ul class="logout-mode">
                        <li><a href="LogOutController?LogId=2">
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

                <div class="form-title" style="text-align: center;font-size: 50px;">Update Account</div>

                <div class="form-content" style="width: 80%;height: auto; margin-left: 10%; padding-top: 0;padding-bottom: 0;">
                    <!--                     phuHuynh         -->
                    <c:if test = "${studentParentsBQT != null}">
                        <span>${erroFirstNameUpdate}</span>
                        <div class="mb-3">
                            <label for="exampleFormControlInput11" class="form-label">First Name</label>
                            <input required type="text" class="form-control"  id="exampleFormControlInput11" name="txtFirstName" value="${studentParentsBQT.firstName}" >
                        </div>
                        <span>${errolastNameUpdate}</span>
                        <div class="mb-3">
                            <label for="exampleFormControlInput12" class="form-label">Last Name</label>
                            <input required type="text" class="form-control" id="exampleFormControlInput12" name="txtLastName" value="${studentParentsBQT.lastName}">
                        </div>
                        <div class="rdCheck" style="display: flex">
                            <div class="form-check">
                                <div class="form-label">Gender</div>
                                <input  type="radio" name="gender" id="gender1"
                                        <c:if test = "${studentParentsBQT.gender}">
                                            checked
                                        </c:if>    
                                        value="1" /> <label for="gender1">Male</label> 
                                <input  type="radio" name="gender" id="gender2"
                                        <c:if test = "${!studentParentsBQT.gender}">
                                            checked 
                                        </c:if>    
                                        value="0" /> <label for="gender2">Female</label>   
                                <br/>
                            </div>


                        </div>
                        <span>${erroEmailUpdate}</span>
                        <div class="mb-3">
                            <label for="exampleFormControlInput13" class="form-label">Email</label>
                            <input required type="email" class="form-control" id="exampleFormControlInput13" name="txtEmail" value="${studentParentsBQT.gmail}" placeholder="name@example.com">
                        </div>
                        <div class="mb-3">
                            <label for="exampleFormControlInput14" class="form-label">Pass Word</label>
                            <input  type="text" class="form-control"  placeholder="Không cần ghi nếu ko muốn thay đổi mật khẩu"  name="txtPassword" value="" id="exampleFormControlInput14">
                        </div>

                        <div class="mb-3">
                            <label for="exampleFormControlInput15" class="form-label">Date</label>
                            <input  type="date" name="dob" value="${studentParentsBQT.date}"/> <br/>
                        </div>
                        <span>${erroPhoneUpdate}</span>
                        <div class="mb-3">
                            <label for="exampleFormControlInput16" class="form-label">Number Phone</label>
                            <input required type="text" class="form-control" id="exampleFormControlInput16" name="txtPhone" value="${studentParentsBQT.phone}" placeholder="name@example.com">
                        </div> 
                        <span>${erroAddressUpdate}</span>
                        <div class="mb-3">
                            <label for="exampleFormControlInput17" class="form-label">Address</label>
                            <input required type="text" class="form-control" id="exampleFormControlInput17" name="ttAddress" value="${studentParentsBQT.address}" placeholder="name@example.com">
                        </div>
                        <div class="mb-3">
                            <label for="exampleFormControlInput18" class="form-label">Role</label>
                            <select class="form-select" name="slRole" aria-label="Default select example">
                                <c:forEach items="${listRole}" var="role">
                                    <c:if test="${role.id == 5}">
                                        <option  value="${role.id}"  selected >${role.name}</option>
                                    </c:if>   
                                </c:forEach>

                            </select>
                        </div>

                        <div class="mb-3">
                            <label for="exampleFormControlInput18" class="form-label">Campus</label>
                            <select class="form-select" name="slCampus" aria-label="Default select example">

                                <c:forEach items="${listCampus}" var="role">
                                    <option  value="${role.id}"
                                             <c:if test="${requestScope.studentParentsBQT.campus.id == role.id}" var="t">
                                                 selected
                                             </c:if>
                                             >FU-${role.name}</option>
                                </c:forEach>
                            </select>
                        </div>
                    </c:if>  

                    <!--                     gv         -->
                    <c:if test = "${teacherBQT != null}">
                        <span>${erroFirstNameUpdate}</span>
                        <div class="mb-3">
                            <label for="exampleFormControlInput11" class="form-label">First Name</label>
                            <input required type="text" class="form-control"  id="exampleFormControlInput11" name="txtFirstName" value="${teacherBQT.firstName}" >
                        </div>
                        <span>${errolastNameUpdate}</span>
                        <div class="mb-3">
                            <label for="exampleFormControlInput12" class="form-label">Last Name</label>
                            <input required type="text" class="form-control" id="exampleFormControlInput12" name="txtLastName" value="${teacherBQT.lastName}">
                        </div>
                        <div class="rdCheck" style="display: flex">
                            <div class="form-check">
                                <div class="form-label">Gender</div>
                                <input  type="radio" name="gender" id="gender1"
                                        <c:if test = "${teacherBQT.gender}">
                                            checked
                                        </c:if>    
                                        value="1" /> <label for="gender1">Male</label> 
                                <input  type="radio" name="gender" id="gender2"
                                        <c:if test = "${!teacherBQT.gender}">
                                            checked 
                                        </c:if>    
                                        value="0" /> <label for="gender2">Female</label>   
                                <br/>
                            </div>


                        </div>
                        <span>${erroEmailUpdate}</span>
                        <div class="mb-3">
                            <label for="exampleFormControlInput13" class="form-label">Email</label>
                            <input required type="email" class="form-control" id="exampleFormControlInput13" name="txtEmail" value="${teacherBQT.gmail}" placeholder="name@example.com">
                        </div>

                        <div class="mb-3">
                            <label for="exampleFormControlInput14" class="form-label">Pass Word</label>
                            <input  type="text" class="form-control"  placeholder="Không cần ghi nếu ko muốn thay đổi mật khẩu"  name="txtPassword" value="" id="exampleFormControlInput14">
                        </div>

                        <div class="mb-3">
                            <label for="exampleFormControlInput15" class="form-label">Date</label>
                            <input  type="date" name="dob" value="${teacherBQT.date}"/> <br/>
                        </div>
                        <div class="mb-3">
                            <label for="exampleFormControlInput15" class="form-label">Date Of Start</label>
                            <input  type="date" name="dobStart" value="${teacherBQT.dateOfStart}"/> <br/>
                        </div>
                        <div class="mb-3">
                            <label for="exampleFormControlInput15" class="form-label">Date Of End</label>
                            <input  type="date" name="dobEnd" value="${teacherBQT.dateOfEnd}"/> <br/>
                        </div>
                        <span>${erroPhoneUpdate}</span>
                        <div class="mb-3">
                            <label for="exampleFormControlInput16" class="form-label">Number Phone</label>
                            <input required type="text" class="form-control" id="exampleFormControlInput16" name="txtPhone" value="${teacherBQT.phone}" placeholder="name@example.com">
                        </div> 
                        <span>${erroAddressUpdate}</span>
                        <div class="mb-3">
                            <label for="exampleFormControlInput17" class="form-label">Address</label>
                            <input required type="text" class="form-control" id="exampleFormControlInput17" name="ttAddress" value="${teacherBQT.address}" placeholder="name@example.com">
                        </div>
                        <div class="mb-3">
                            <label for="exampleFormControlInput18" class="form-label">Role</label>
                            <select class="form-select" name="slRole" aria-label="Default select example">
                                <c:forEach items="${listRole}" var="role">
                                    <c:if test="${role.id != 5}">
                                        <option  value="${role.id}"
                                                 <c:if test="${requestScope.teacherBQT.user.role.id == role.id}" var="t">
                                                     selected
                                                 </c:if>
                                                 >${role.name}</option>
                                    </c:if>   
                                </c:forEach>

                            </select>
                        </div>

                        <div class="mb-3">
                            <label for="exampleFormControlInput18" class="form-label">Campus</label>
                            <select class="form-select" name="slCampus" aria-label="Default select example">

                                <c:forEach items="${listCampus}" var="role">
                                    <option  value="${role.id}"
                                             <c:if test="${requestScope.teacherBQT.campus.id == role.id}" var="t">
                                                 selected
                                             </c:if>
                                             >FU-${role.name}</option>
                                </c:forEach>
                            </select>
                        </div>
                    </c:if>  


                    <!--sv-->
                    <c:if test = "${studentBQT != null}">
                        <span>${erroFirstNameUpdate}</span>
                        <div class="mb-3">
                            <label for="exampleFormControlInput11" class="form-label">First Name</label>
                            <input required type="text" class="form-control" id="exampleFormControlInput11" name="txtFirstName" value="${studentBQT.firstName}" >
                        </div>
                        <span>${errolastNameUpdate}</span>
                        <div class="mb-3">
                            <label for="exampleFormControlInput12" class="form-label">Last Name</label>
                            <input required type="text" class="form-control" id="exampleFormControlInput12" name="txtLastName" value="${studentBQT.lastName}">
                        </div>
                        <div class="rdCheck" style="display: flex">
                            <div class="form-check">
                                <div class="form-label">Gender</div>
                                <input  type="radio" name="gender" id="gender1"
                                        <c:if test = "${studentBQT.gender}">
                                            checked
                                        </c:if>    
                                        value="male" /> <label for="gender1">Male</label> 
                                <input  type="radio" name="gender" id="gender2"
                                        <c:if test = "${!studentBQT.gender}">
                                            checked 
                                        </c:if>    
                                        value="female" /> <label for="gender2">Female</label>   
                                <br/>
                            </div>


                        </div>
                         <span>${erroEmailUpdate}</span>
                        <div class="mb-3">
                            <label for="exampleFormControlInput13" class="form-label">Email</label>
                            <input required type="email" class="form-control" id="exampleFormControlInput13" name="txtEmail" value="${studentBQT.gmail}" placeholder="name@example.com">
                        </div>
                        <div class="mb-3">
                            <label for="exampleFormControlInput14" class="form-label">Pass Word</label>
                            <input  type="text" class="form-control"  placeholder="Không cần ghi nếu ko muốn thay đổi mật khẩu"  name="txtPassword" value="" id="exampleFormControlInput14">
                        </div>

                        <div class="mb-3">
                            <label for="exampleFormControlInput15" class="form-label">Date</label>
                            <input  type="date" name="dob" value="${studentBQT.dateOfBirth}"/> <br/>
                        </div>
                        <div class="mb-3">
                            <label for="exampleFormControlInput15" class="form-label">Date Of Start</label>
                            <input  type="date" name="dobStart" value="${studentBQT.dateOfStart}"/> <br/>
                        </div>
                        <div class="mb-3">
                            <label for="exampleFormControlInput15" class="form-label">Date Of End</label>
                            <input  type="date" name="dobEnd" value="${studentBQT.dateOfEnd}"/> <br/>
                        </div>
                        <span>${erroPhoneUpdate}</span>
                        <div class="mb-3">
                            <label for="exampleFormControlInput16" class="form-label">Number Phone</label>
                            <input required type="text" class="form-control" id="exampleFormControlInput16" name="txtPhone" value="${studentBQT.phone}" placeholder="name@example.com">
                        </div> 
                        <span>${erroAddressUpdate}</span>
                        <div class="mb-3">
                            <label for="exampleFormControlInput17" class="form-label">Address</label>
                            <input required type="text" class="form-control" id="exampleFormControlInput17" name="ttAddress" value="${studentBQT.address}" placeholder="name@example.com">
                        </div>
                        <div class="mb-3">
                            <label for="exampleFormControlInput18" class="form-label">Role</label>
                            <select class="form-select" name="slRole" aria-label="Default select example">

                                <c:forEach items="${listRole}" var="role">
                                    <c:if test="${role.id != 5}">
                                        <option  value="${role.id}"
                                                 <c:if test="${requestScope.studentBQT.user.role.id == role.id}" var="t">
                                                     selected
                                                 </c:if>
                                                 >${role.name}</option>
                                    </c:if>
                                </c:forEach>
                            </select>
                        </div>
                        <div class="mb-3">
                            <label for="exampleFormControlInput18" class="form-label">Status</label>
                            <select class="form-select" name="slStatus" aria-label="Default select example">
                                <c:forEach items="${session_listStatusBQT}" var="role">
                                    <option  value="${role.id}"
                                             <c:if test="${requestScope.studentBQT.status.id == role.id}" var="t">
                                                 selected
                                             </c:if>
                                             >${role.name}</option>
                                </c:forEach>
                            </select>
                        </div>
                        <div class="mb-3">
                            <label for="exampleFormControlInput18" class="form-label">Specializedin</label>
                            <select class="form-select" name="slSpecializedin" aria-label="Default select example">
                                <c:forEach items="${listSpecializedin}" var="role">
                                    <option  value="${role.id}"
                                             <c:if test="${requestScope.studentBQT.specializedin.id == role.id}" var="t">
                                                 selected
                                             </c:if>
                                             >${role.name}</option>
                                </c:forEach>
                            </select>
                        </div>
                        <div class="mb-3">
                            <label for="exampleFormControlInput18" class="form-label">Campus</label>
                            <select class="form-select" name="slCampus" aria-label="Default select example">
                                <c:forEach items="${listCampus}" var="role">
                                    <option  value="${role.id}"
                                             <c:if test="${requestScope.studentBQT.campus.id == role.id}" var="t">
                                                 selected
                                             </c:if>
                                             >FU-${role.name}</option>
                                </c:forEach>
                            </select>
                        </div>

                    </c:if>  

                    <!--can bo-->
                    <c:if test = "${oficerFUBQT != null}">
                        <span>${erroFirstNameUpdate}</span>
                        <div class="mb-3">
                            <label for="exampleFormControlInput11" class="form-label">First Name</label>
                            <input required type="text" class="form-control" id="exampleFormControlInput11" name="txtFirstName" value="${oficerFUBQT.firstName}" >
                        </div>
                        <span>${errolastNameUpdate}</span>
                        <div class="mb-3">
                            <label for="exampleFormControlInput12" class="form-label">Last Name</label>
                            <input required type="text" class="form-control" id="exampleFormControlInput12" name="txtLastName" value="${oficerFUBQT.lastName}">
                        </div>
                        <div class="rdCheck" style="display: flex">
                            <div class="form-check">
                                <div class="form-label">Gender</div>
                                <input  type="radio" name="gender" id="gender1"
                                        <c:if test = "${oficerFUBQT.gender}">
                                            checked
                                        </c:if>    
                                        value="male" /> <label for="gender1">Male</label> 
                                <input  type="radio" name="gender" id="gender2"
                                        <c:if test = "${!oficerFUBQT.gender}">
                                            checked 
                                        </c:if>    
                                        value="female" /> <label for="gender2">Female</label>   
                                <br/>
                            </div>


                        </div>
                         <span>${erroEmailUpdate}</span>
                        <div class="mb-3">
                            <label for="exampleFormControlInput13" class="form-label">Email</label>
                            <input required type="email" class="form-control" id="exampleFormControlInput13" name="txtEmail" value="${oficerFUBQT.gmail}" placeholder="name@example.com">
                        </div>
                        <div class="mb-3">
                            <label for="exampleFormControlInput14" class="form-label">Pass Word</label>
                            <input  type="text" class="form-control"  placeholder="Không cần ghi nếu ko muốn thay đổi mật khẩu"  name="txtPassword" value="" id="exampleFormControlInput14">
                        </div>

                        <div class="mb-3">
                            <label for="exampleFormControlInput15" class="form-label">Date</label>
                            <input  type="date" name="dob" value="${oficerFUBQT.date}"/> <br/>
                        </div>
                        <span>${erroPhoneUpdate}</span>
                        <div class="mb-3">
                            <label for="exampleFormControlInput16" class="form-label">Number Phone</label>
                            <input required type="text" class="form-control" id="exampleFormControlInput16" name="txtPhone" value="${oficerFUBQT.phone}" placeholder="name@example.com">
                        </div> 
                        <span>${erroAddressUpdate}</span>
                        <div class="mb-3">
                            <label for="exampleFormControlInput17" class="form-label">Address</label>
                            <input required type="text" class="form-control" id="exampleFormControlInput17" name="ttAddress" value="${oficerFUBQT.address}" placeholder="name@example.com">
                        </div>
                        <div class="mb-3">
                            <label for="exampleFormControlInput18" class="form-label">Role</label>
                            <select class="form-select" name="slRole" aria-label="Default select example">

                                <c:forEach items="${listRole}" var="role">
                                    <c:if test="${role.id != 5}">
                                        <option  value="${role.id}"
                                                 <c:if test="${requestScope.oficerFUBQT.user.role.id == role.id}" var="t">
                                                     selected
                                                 </c:if>
                                                 >${role.name}</option>
                                    </c:if>
                                </c:forEach>
                            </select>
                        </div>
                        <div class="mb-3">
                            <label for="exampleFormControlInput18" class="form-label">Campus</label>
                            <select class="form-select" name="slCampus" aria-label="Default select example">
                                <c:forEach items="${listCampus}" var="role">
                                    <option  value="${role.id}"
                                             <c:if test="${requestScope.oficerFUBQT.campus.id == role.id}" var="t">
                                                 selected
                                             </c:if>
                                             >FU-${role.name}</option>
                                </c:forEach>
                            </select>
                        </div>

                    </c:if>  


                    <div class="d-grid gap-2 d-md-block" style="margin-top: 30px; margin-bottom: 30px; ;">
                        <input  type="submit" value="Save"/>
                        <a href="indexBQT?slRole=${requestScope.updateID}&nextAccount=1"><button class="btn btn-primary" type="button" style="background-color: red;">Cancel X</button> </a>
                    </div>
                </div>
            </div>
        </div>
        <script>
            document.addEventListener('mousemove', function (e) {
                let body = document.querySelector('body');
                let particles = document.createElement('b');
                let x = e.offsetX;
                let y = e.offsetY;

                particles.style.left = x + 'px';
                particles.style.top = y + 'px';
                body.appendChild(particles);

                let size = Math.random() * 8;
                particles.style.width = 2 + size + 'px';
                particles.style.height = 2 + size + 'px';

                let transformValue = Math.random() * 3600;
                particles.style.transform = 'rotate(' + transformValue + 'deg)';

                setTimeout(function () {
                    particles.remove()
                }, 200)

            })
        </script>

    </form>

    <!-- <script src="agu.js"></script> -->
</body>

</html>
