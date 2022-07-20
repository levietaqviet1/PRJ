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
        <style>
            body {
                background-color: rgb(0, 140, 255);
            }

            .ac {
                color: #842551;
                background: #81D742;
                box-shadow: 0 0 10px #81D742, 0 0 40px #81D742, 0 0 80px #81D742;
            }
            input:hover {
                color: #5b8425;
                background: #f32160;
                box-shadow: 0 0 10px #f32160, 0 0 40px #f32160, 0 0 80px #f32160;
            }

            .av {
                color: #842551;
                background: #d76042;
                box-shadow: 0 0 10px #d76042, 0 0 40px #d76042, 0 0 80px #d76042;
            }
        </style>
    </head>

    <body>
        <div class="main ac">
            <h3 style="text-align: center;">Chức Năng Này Chưa Hoàn Thành</h3>
            <h3 style="text-align: center;">Vui Lòng Đăng Xuất Để Thực Hiện Chức Năng Khác</h3>
        </div>
        <div class="logout" style="text-align: center;">
            <form action="LogOutController?LogId=1" method="POST">
                <input class="av" style="font-size: 25px; border: none;"  type="submit" value="Log Out">
            </form>
        </div>
    </body>

</html>