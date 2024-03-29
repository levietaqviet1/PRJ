<%-- 
    Document   : ChanfPassBQT
    Created on : Jul 14, 2022, 12:18:03 PM
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
                    <li><a href="indexBQT?nextAccount=1" >
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
                    <li><a href="indexBQT?view=1" class="ac">
                            <i class="uil uil-thumbs-up" ></i>
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

            <div class="form-title" style="text-align: center;font-size: 50px;">View Application</div>

            <div class="form-content" style="width: 80%;height: auto; margin-left: 10%; padding-top: 0;padding-bottom: 0;">
                <!--can bo-->
                <c:if test = "${dalogin_bqt != null}">
                    <div>
                        <form action="ViewApplicationBQT" method="get">
                            <select name="loai"  style="width: auto;margin-left: 70px;margin-top: 20px;">

                                <option value="0"
                                        <c:if test="${loai == 0}">
                                            selected
                                        </c:if>
                                        >Tất cả</option>
                                <option value="1"
                                        <c:if test="${loai == 1}">
                                            selected
                                        </c:if>
                                        >Đã duyệt</option>
                                <option value="2"
                                        <c:if test="${loai == 2}">
                                            selected
                                        </c:if>
                                        >Chưa duyệt</option>
                                <option value="3"
                                        <c:if test="${loai == 3}">
                                            selected
                                        </c:if>
                                        >Đơn Accepted</option>
                                <option value="4"
                                        <c:if test="${loai == 4}">
                                            selected
                                        </c:if>
                                        >Đơn Rejected</option>
                            </select>
                            <input type="submit" name="OK" value="Search">

                        </form>
                    </div>
                    <table border="1" style="text-align: center">
                        <thead>
                            <tr style="border-bottom: solid 1px #2196f3; padding:  5px">
                                <th>Tên đơn</th>
                                <th>ID Sinh Viên</th>
                                <th>Nội dung đơn</th>
                                <th>Thời gian gửi đơn</th>
                                <th>Tình trạng đơn</th>
                                <th>Lưu ý</th>
                                <th>Ngày cập nhật tình trạng đơn</th>
                                <th>Update</th>
                            </tr>
                        </thead>
                        <tbody>
                            <c:forEach items="${listapp}" var="l">
                            <form action="middle" method="post"> 
                                <tr style="margin: 5px">
                                    <td>&nbsp;${l.appName} &nbsp;</td>
                                    <td>&nbsp;${l.getIdsv()} &nbsp;</td>
                                    <td>&nbsp;${l.getNoidungapp()} &nbsp;</td>
                                    <td>&nbsp;${l.getTimeguidon()} &nbsp;</td>
                                    <td form="formMIDDLE">&nbsp;
                                        <select name="option">
                                            <option
                                                <c:if test="${l.getTinhtrangdonid()== 0}">
                                                    selected
                                                </c:if>
                                                value="0">Reject</option>
                                            <option
                                                <c:if test="${l.getTinhtrangdonid()== 1}">
                                                    selected
                                                </c:if>
                                                value="1">Accept</option>
                                        </select>
                                        &nbsp;</td>
                                    <td><input type="text" name="lido" value="${l.getLido()}"></td>
                                    <td>&nbsp; ${l.getTimeduyetdon()}&nbsp;</td>
                                    <td><input type="submit" name="submit" value="Save"> <input hidden="" type="text" name="index" value="${l.getId()}"></td>
                                </tr>
                            </form>
                        </c:forEach>

                        </tbody>
                    </table>

                    <c:forEach begin="${1}" end="${numpage}" var="i">
                        <a href="ViewApplicationBQT?xpage=${i}&loai=${loai}&OK=1"><button style="padding: 5px; margin: auto">${i}</button> </a>
                    </c:forEach>
                </c:if>  
            </div>
        </div>
 <script type="module" src="https://unpkg.com/ionicons@5.5.2/dist/ionicons/ionicons.esm.js"></script>
    <script nomodule src="https://unpkg.com/ionicons@5.5.2/dist/ionicons/ionicons.js"></script>
        <script>

            function validateForm() {
                if (document.myForm.passwordNew.value != document.myForm.passwordNewConfirm.value) {
                    document.getElementById("errConfirm").innerHTML = "Mật khẩu xác nhận không khớp"
                    return false;
                } else {
                    document.getElementById("errConfirm").innerHTML = "";
                }

            }

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
