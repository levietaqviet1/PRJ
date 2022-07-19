<%-- 
    Document   : BQTFPT
    Created on : Jul 18, 2022, 9:00:25 PM
    Author     : NCC
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<c:if test=" ${bqt_login_successful == null}">
    <% 
    response.sendRedirect("indexBQT");
    %>
</c:if>
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
                background: #81D742;
                box-shadow: 0 0 10px #81D742, 0 0 40px #81D742, 0 0 80px #81D742;
            }

        </style>
    </head>

    <body>

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
            <div class="dash-lefttop"> 

            </div>

            <form action="listAccountBQT-Admin" method="POST" >
                <div class="dash-bottom">
                    <input class="form-control me-2" type="search" name="search" placeholder="Search: EX le viet or l v" value="${Tsearch}" aria-label="Search">
                    <button class="btn btn-outline-success" name="subSearch"value="2" type="submit">Search</button>
                </div>
                <div class="sl-id" style="display: flex;">
                    <div>
                        <select name="slRole"  style="width: auto;margin-left: 70px;margin-top: 20px;">
                            <option value="1" >BQT</option>
                        </select>
                    </div>
                    <div>
                        <select name="slCampusSearch"  style="width: auto;margin-left: 70px;margin-top: 20px;">
                            <option value="">All Campus</option>
                            <c:forEach items="${listCampus}"  var="campus">
                                <option value="${campus.id}" 
                                        <c:if test="${campusID == campus.id }" >selected</c:if>
                                        >FU-${campus.name}</option>
                            </c:forEach>
                        </select>
                    </div>
                    <div>
                        <input type="submit" value="Add new BQT" name="addSubAccou" style="width: auto;margin-left: 70px;margin-top: 20px;"/>
                    </div>
                </div>

                <div class="dash-bottomtable">
                    <table class="table" >
                        <!--BQT-->

                        <thead>
                            <tr> 
                                <th scope="col">First Name</th>
                                <th scope="col">Last Name</th>
                                <th scope="col">Name</th>
                                <th scope="col">Gender</th>
                                <th scope="col">Email</th>
                                <th scope="col">Dob</th>
                                <th scope="col">Phone Number</th>
                                <th scope="col">Address</th>
                                <th scope="col">Role</th>
                                <th scope="col">Update</th>
                                <th scope="col">Delete</th>
                            </tr>
                        </thead>
                        <tbody>
                            <c:forEach items="${requestScope.listBqt}" var="t"  >
                                <tr>
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
                                    <td><a href="listAccountBQT-Admin?sid=${t.id}&update=0&tkid=${t.user.id}">Update</a></td>
                                    <c:if test="${t.id != bqt_login_successful.id}">
                                        <td><a href="listAccountBQT-Admin?sid=${t.id}&delete=0&tkid=${t.user.id}">Delete</a></td>
                                    </c:if>
                                    <c:if test="${t.id == bqt_login_successful.id}">
                                        <td></td>
                                    </c:if>
                                </tr>
                            </c:forEach>
                        </tbody>

                        </form>

                    </table>

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

        <!-- <script src="agu.js"></script> -->
    </body>

</html>