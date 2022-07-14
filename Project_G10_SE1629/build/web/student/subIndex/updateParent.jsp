
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
        <link rel="stylesheet" href="bqt/cssBQT/style.css">
        <link rel="stylesheet" href="bqt/cssBQT/boot/bootstrap.min.css">
        <link rel="stylesheet" href="bqt/cssBQT/boot/bootstrap.css">
        <!----===== Iconscout CSS ===== -->


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

        <form action="index?sid=${requestScope.sid}&roleId=${requestScope.updateID}&idUser=${requestScope.userId}" method="POST">

            <div class="dashboard">

                <div class="form-title" style="text-align: center;font-size: 50px; color: red">Update Parent*</div>

                <div class="form-content" style="width: 80%;height: auto; margin-left: 10%; padding-top: 0;padding-bottom: 0;">

                    <div class="mb-3">
                        <label for="exampleFormControlInput11" class="form-label">First Name</label>
                        <input required type="text" class="form-control"  id="exampleFormControlInput11" name="txtFirstName" value="${studentParentsBQT.firstName}" >
                    </div>
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

                    <div class="mb-3">
                        <label for="exampleFormControlInput13" class="form-label">Email</label>
                        <input required type="email" class="form-control" id="exampleFormControlInput13" name="txtEmail" value="${studentParentsBQT.gmail}" placeholder="name@example.com">
                    </div>
                    <div class="mb-3">
                        <label for="exampleFormControlInput15" class="form-label">Date</label>
                        <input  type="date" name="dob" value="${studentParentsBQT.date}"/> <br/>
                    </div>
                    <div class="mb-3">
                        <label for="exampleFormControlInput16" class="form-label">Number Phone</label>
                        <input required type="text" class="form-control" id="exampleFormControlInput16" name="txtPhone" value="${studentParentsBQT.phone}" placeholder="name@example.com">
                    </div> 
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
                                <c:if test="${st_login_tam_thoi.campus.id == role.id}" var="t">
                                    <option  value="${role.id}"
                                             >FU-${role.name}</option>
                                </c:if>
                            </c:forEach>
                        </select>
                    </div>
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
