<%-- 
    Document   : BQTAccountUpdate
    Created on : Jul 19, 2022, 5:02:18 PM
    Author     : NCC
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
            .ac{
                color: #255784;
                background: #4cae4c;
                box-shadow: 0 0 10px #4cae4c, 0 0 40px #4cae4c, 0 0 80px #4cae4c;
            }
        </style>
    </head>

    <body>

        <form action="addAccountBQT?sid=0" method="POST">
            <nav>
                <div class="logo-name">
                    <div class="logo-image">
                        <img src="https://s3.ap-northeast-1.amazonaws.com/h.files/images/1655654596490_Cn6PveFXv2.png" alt="khong co internet">
                    </div>

                    <span class="logo_name"><a href="indexBQT?nextListBQT=1" style="text-decoration: none;color: black">BQT FPT</a></span>
                </div>

                <div class="menu-items">
                    <ul class="nav-links">
                        <li><a href="indexBQT?nextAccount=1" class="">
                                <i class="uil uil-estate"></i>
                                <span class="link-name">Account</span>
                            </a></li>
                        <li><a href="indexBQT?nextClass=1">
                                <i class="uil uil-thumbs-up"></i>
                                <span class="link-name">Class</span>
                            </a></li>
                        <li><a href="indexBQT?recycleBin=1">
                                <i><ion-icon name="archive-outline"></ion-icon></i> 
                                <span class="link-name">Recycle Bin</span>
                            </a></li> 
                        <li><a href="changePassworBQT?id=1">
                                <i><ion-icon name="git-compare-outline"></ion-icon></i> 
                                <span class="link-name">Change Password</span>
                            </a></li>
                        <li><a href="indexBQT?view=1">
                                <i class="uil uil-thumbs-up"></i>
                                <span class="link-name">View Application</span>
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

                <div class="dash-lefttop ac">
                    <div class="form-title " style="margin: auto;font-size: 50px;">Add Account BQT</div>
                </div>



                <div class="form-content" style="width: 80%;height: auto; margin-left: 10%; padding-top: 0;padding-bottom: 0;">
                    <c:if test="${AddNewbqt == null}">
                        <span style="color: red">${erroFirstNameUpdate}</span>
                        <div class="mb-3">
                            <label for="exampleFormControlInput11" class="form-label">First Name</label>
                            <input required type="text" class="form-control" id="exampleFormControlInput11" name="txtFirstName" value="${updatBqt.firstName}" >
                        </div>
                        <span style="color: red" >${errolastNameUpdate}</span>
                        <div class="mb-3">
                            <label for="exampleFormControlInput12" class="form-label">Last Name</label>
                            <input required type="text" class="form-control" id="exampleFormControlInput12" name="txtLastName" value="${updatBqt.lastName}">
                        </div>
                        <div class="rdCheck" style="display: flex">
                            <div class="form-check">
                                <div class="form-label">Gender</div>
                                <input  type="radio" name="gender" id="gender1"
                                        <c:if test = "${updatBqt.gender}">
                                            checked
                                        </c:if>    
                                        value="male" /> <label for="gender1">Male</label> 
                                <input  type="radio" name="gender" id="gender2"
                                        <c:if test = "${!updatBqt.gender}">
                                            checked 
                                        </c:if>    
                                        value="female" /> <label for="gender2">Female</label>   
                                <br/>
                            </div>


                        </div>
                        <span style="color: red">${erroEmailUpdate}</span>
                        <div class="mb-3">
                            <label for="exampleFormControlInput13" class="form-label">Email</label>
                            <input required type="email" class="form-control" id="exampleFormControlInput13" name="txtEmail" value="${updatBqt.gmail}" placeholder="name@example.com">
                        </div>

                        <div class="mb-3">
                            <label for="exampleFormControlInput15" class="form-label">Date</label>
                            <input  type="date" name="dob" required value="${updatBqt.date}"/> <br/>
                        </div>
                        <span style="color: red" >${erroPhoneUpdate}</span>
                        <div class="mb-3">
                            <label for="exampleFormControlInput16" class="form-label">Number Phone</label>
                            <input required type="text" class="form-control" id="exampleFormControlInput16" name="txtPhone" value="${updatBqt.phone}" placeholder="name@example.com">
                        </div> 
                        <span style="color: red"  >${erroAddressUpdate}</span>
                        <div class="mb-3">
                            <label for="exampleFormControlInput17" class="form-label">Address</label>
                            <input required type="text" class="form-control" id="exampleFormControlInput17" name="ttAddress" value="${updatBqt.address}" placeholder="name@example.com">
                        </div>
                        <div class="mb-3">
                            <label for="exampleFormControlInput18" class="form-label">Role</label>
                            <select class="form-select" name="slRole" aria-label="Default select example">
                                <option>BQT</option>
                            </select>
                        </div>
                        <div class="mb-3">
                            <label for="exampleFormControlInput18" class="form-label">Campus</label>
                            <select class="form-select" name="slCampus" aria-label="Default select example">
                                <c:forEach items="${listCampus}" var="role">
                                    <option  value="${role.id}"
                                             <c:if test="${requestScope.updatBqt.campus.id == role.id}" var="t">
                                                 selected
                                             </c:if>
                                             >FU-${role.name}</option>
                                </c:forEach>
                            </select>
                        </div>
                    </c:if>
                    <c:if test="${AddNewbqt != null}">
                        <div class="form-title" style="text-align: center;font-size: 50px; color: #00bbff">Xác Minh Email BQT ${suc_home0}</div>
                        <div class="form-title" style="text-align: center;font-size: 20px; color: #00bbff">Lưu ý: Thư có thể nằm trong Thư rác (Junk Mail). Chức năng có hiệu lực trong vòng 10 phút</div>
                        <span style="color: red">${errorCodeHome0}</span>
                        <div class="mb-3">
                            <label for="exampleFormControlInput12" class="form-label">Mã Code:</label>
                            <input required type="text" class="form-control" id="exampleFormControlInput12" name="codeHome0" value="${codeHome0}">
                        </div>
                    </c:if>
                    <div class="d-grid gap-2 d-md-block" style="margin-top: 30px; margin-bottom: 30px; ;">
                        <input  type="submit" value="Save"/>
                        <a href="indexBQT?nextListBQT=1&remoAdd=0"><button class="btn btn-primary" type="button" style="background-color: red;">Cancel X</button> </a>
                    </div>

                </div>
            </div>
        </div>
        <script type="module" src="https://unpkg.com/ionicons@5.5.2/dist/ionicons/ionicons.esm.js"></script>
        <script nomodule src="https://unpkg.com/ionicons@5.5.2/dist/ionicons/ionicons.js"></script>
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
