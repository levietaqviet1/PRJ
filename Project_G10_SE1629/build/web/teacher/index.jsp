<%-- 
    Document   : index
    Created on : Jul 20, 2022, 8:48:09 AM
    Author     : NCC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
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
            * {
                margin: 0;
                padding: 0;
                box-sizing: border-box;
                font-family: 'Poppins', sans-serif;
            }

            :root {
                --blue: #287bff;
                --while: #fff;
                --grey: #f5f5f5;
                --black1: #222;
                --black2: #999;

            }

            body {
                min-height: 100vh;
                overflow-x: hidden;
            }

            .container {
                position: relative;
                width: 100%;
            }

            .navigation {
                position: fixed;
                width: 300px;
                height: 100%;
                background: var(--blue);
                border-left: 10px solid var(--blue);
                transition: 0.5s;
                overflow: hidden;
            }

            .navigation.active {
                width: 80px;
            }

            .navigation ul {
                position: absolute;
                top: 0;
                left: 0;
                width: 100%;
            }

            .navigation ul li {
                position: relative;
                width: 100%;
                list-style: none;
                border-top-left-radius: 30px;
                border-bottom-left-radius: 30px;
            }

            .navigation ul li:hover,
            .navigation ul li.hovered {
                background-color: var(--while);
            }

            .navigation ul li:nth-child(1) {
                margin-bottom: 40px;
                pointer-events: none;
            }

            .navigation ul li a {
                position: relative;
                display: block;
                width: 100%;
                display: flex;
                text-decoration: none;
                color: var(--while);
            }

            .navigation ul li:hover a,
            .navigation ul li.hovered a {
                color: var(--blue);
            }

            .navigation ul li a .icon {
                position: relative;
                display: block;
                min-width: 60px;
                height: 60px;
                line-height: 70px;
                text-align: center;
            }

            .navigation ul li a .icon ion-icon {
                font-size: 1.75em;
            }

            .navigation ul li a .title {
                position: relative;
                display: block;
                padding: 0 10px;
                height: 60px;
                line-height: 60px;
                text-align: start;
                white-space: nowrap;
            }

            /*  */
            .navigation ul li:hover a::before {
                content: '';
                position: absolute;
                top: -50px;
                right: 0;
                width: 50px;
                height: 50px;
                background: transparent;
                border-radius: 50%;
                /* box-shadow: 35px 35px 0 10px var(--while); */
                pointer-events: none;
            }

            .navigation ul li:hover a::after {
                content: '';
                position: absolute;
                bottom: -50px;
                right: 0;
                width: 50px;
                height: 50px;
                background: transparent;
                border-radius: 50%;
                /* box-shadow: 35px -35px 0 10px var(--while); */
                pointer-events: none;
            }
            .navigation ul li:active a::before ,
            .navigation ul li.hovered a::before {
                content: '';
                position: absolute;
                top: -50px;
                right: 0;
                width: 50px;
                height: 50px;
                background: transparent;
                border-radius: 50%;
                box-shadow: 35px 35px 0 10px var(--while);
                pointer-events: none;
            }
            .navigation ul li:active a::after ,
            .navigation ul li.hovered a::after {
                content: '';
                position: absolute;
                bottom: -50px;
                right: 0;
                width: 50px;
                height: 50px;
                background: transparent;
                border-radius: 50%;
                box-shadow: 35px -35px 0 10px var(--while);
                pointer-events: none;
            }

            /* main */

            .main {
                position: absolute;
                width: calc(100% - 300px);
                left: 300px;
                min-height: 100vh;
                background: var(--while);
                transition: 0.5s;
            }

            .main.active {
                width: calc(100% - 80px);
                left: 80px;
            }

            .topbar {
                width: 100%;
                height: 60px;
                display: flex;
                justify-content: space-between;
                align-items: center;
                padding: 0 10px;
            }

            .toggle {
                position: relative;
                width: 60px;
                height: 60px;
                display: flex;
                justify-content: center;
                align-items: center;
                font-size: 2.5em;
                cursor: pointer;
            }

            .search {
                position: relative;
                width: 400px;
                margin: 0 10px;
            }

            .search label {
                position: relative;
                width: 100%;
            }

            .search label input {
                width: 100%;
                height: 40px;
                border-radius: 40px;
                padding: 5px 20px;
                padding-left: 35px;
                font-size: 18px;
                outline: none;
                border: 1px solid var(--black2);
            }

            .search label ion-icon {
                position: absolute;
                top: 0;
                left: 10px;
                font-size: 1.2em;
            }

            .user {
                position: relative;
                width: 40px;
                height: 40px;
                border-radius: 50%;
                overflow: hidden;
                cursor: pointer;
            }

            .user img {
                position: absolute;
                top: 0;
                left: 0;
                width: 100%;
                height: 100%;
                object-fit: cover;
            }
        </style>
    </head>

    <body>
        <div class="container">
            <div class="navigation">
                <ul>
                    <li>
                        <a href="#">
                            <span class="icon">
                                <div class="user">
                                    <img src="https://s3.ap-northeast-1.amazonaws.com/h.files/images/1655654596490_Cn6PveFXv2.png">
                                </div>
                            </span>
                            <span class="title"> <h3>FPT University</h3> </span>
                        </a>
                    </li>
                    <li>
                        <a href="index?sid=1">
                            <span class="icon">
                                <ion-icon name="home-outline"></ion-icon>
                            </span>
                            <span class="title">Trang chủ</span>
                        </a>
                    </li>
                    <li>
                        <a href="#">
                            <span class="icon">
                                <ion-icon name="cloud-done-outline"></ion-icon>
                            </span>
                            <span class="title">Tài khoản sinh viên</span>
                        </a>
                    </li>
                    <li >
                        <a href="#">
                            <span class="icon">
                                <ion-icon name="cloud-upload-outline"></ion-icon>
                            </span>
                            <span class="title">Đơn xin học</span>
                        </a>
                    </li>
                    <li class="hovered">
                        <a href="#">
                            <span class="icon">
                                <ion-icon name="log-out-outline"></ion-icon>
                            </span>
                            <span class="title">Đăng xuất</span>
                        </a>
                    </li>
                </ul>
            </div>

            <!-- main -->
            <div class="main">
                <div class="topbar">
                    <div class="toggle">
                        <ion-icon name="menu-outline"></ion-icon>
                    </div>
                </div>

            </div>
        </div>

        <script type="module" src="https://unpkg.com/ionicons@5.5.2/dist/ionicons/ionicons.esm.js"></script>
        <script nomodule src="https://unpkg.com/ionicons@5.5.2/dist/ionicons/ionicons.js"></script>

        <script>
            // MenuTogle
            let toggle = document.querySelector('.toggle');
            let navigation = document.querySelector('.navigation');
            let main = document.querySelector('.main');

            toggle.onclick = function () {
                navigation.classList.toggle('active');
                main.classList.toggle('active')
            }

            // them hover 
            // let list = document.querySelectorAll('.navigation li');
            // function activeLink() {
            //     list.forEach((item) =>
            //         item.classList.remove('hovered'));
            //     this.classList.add('hovered')
            // }

            // list.forEach((item) =>
            //     item.addEventListener('mouseover', activeLink))
        </script>
    </body>

</html>
