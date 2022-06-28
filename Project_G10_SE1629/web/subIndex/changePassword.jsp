<%-- 
   Document   : ForgotPassword
   Created on : Jun 28, 2022, 9:42:21 PM
   Author     : 84399
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Forgot Password</title>
        <style>
            *{
                font-family: "Verdana",sans-serif;
            }
            body{
                width: 100%;
                height: 100vh;
                background-image: linear-gradient(to right top,#d7e6f9,#f3d3b4,#ffffff);
                display: flex;
                align-items: center;
                justify-content: center;
            }
            table{
                font-size: 18px;
                border: 0.1px solid #917881;
                margin-bottom: 10px;
                border-radius: 10px;
                justify-content: space-between;
                border-spacing: 20px;
                padding: 1rem;


            }
            .regis{
                width: 100%;
                max-width: 35rem;
                background-color: #fff;
                border-radius: 10px;
                padding: 2rem 1rem;
            }
            .title{
                text-align: center;
            }
            .table{
                display: flex;
                align-items: center;
                justify-content: center;
            }
        </style>
    </head>
    <body>
        <div class="regis">
            <div class="title">

                <h1> Forgot Passwor </h1>
            </div>
            <div class="table">

                <table>
                    <div class="input">

                        <tr>
                            <td>
                                Old Password:
                            </td>
                            <td>
                                <input type="text" name="oldpass" style="border-radius: 10px; padding: 5px">
                            </td>
                        </tr>
                        <tr>
                            <td>
                                New Password:
                            </td>
                            <td>
                                <input type="text" name="newpass" style="border-radius: 10px; padding: 5px"> 
                            </td>
                        </tr>
                        <tr>
                            <td>
                                Confirm Password:
                            </td>
                            <td>
                                <input style="border-radius: 10px; padding: 5px" type="text" name="confirm">
                            </td>
                        </tr>

                    </div>
                </table>
            </div>
            <div>
                <input style="margin-left: 230px;background-color: beige;border-radius: 10px; padding: 5px" type="submit" name="OK" value="Change"> 
                <input style="background-color:gainsboro;border-radius: 10px; padding: 5px " type="reset" name="cancel" value="Cancel">  
            </div>
        </div>
    </body>
</html>
