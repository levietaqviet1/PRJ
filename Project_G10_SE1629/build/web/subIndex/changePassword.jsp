<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
                margin: auto;
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
                margin: auto;
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
                <form action="changePasswor" method="Post">
                    <table>
                        <div class="input">
                            <c:if test="${oldPass_mess}" >
                                <tr>
                                    <td></td>
                                    <td><span style="color: red">${oldPass_mess}</span></td>
                                </tr>
                            </c:if>

                            <tr>
                                <td>
                                    Old Password:
                                </td>
                                <td>

                                    <input type="text" name="oldpass" value="${oldpass}" required style="border-radius: 10px; padding: 5px">
                                </td>
                            </tr>
                            <tr>
                                <td>
                                    New Password:
                                </td>
                                <td>
                                    <input type="text" name="newpass" value="${newpass}" required style="border-radius: 10px; padding: 5px"> 
                                </td>
                            </tr>
                            <c:if test="${confirm_mess}" >
                                <tr>
                                    <td></td>
                                    <td><span style="color: red">${confirm_mess}</span></td>
                                </tr>
                            </c:if>
                            <tr>
                                <td>
                                    Confirm Password:
                                </td>
                                <td>
                                    <input style="border-radius: 10px; padding: 5px" value="${confirm}" required type="text" name="confirm">
                                </td>
                            </tr>
                            <c:if test="${change_pass_succ}" >
                                <tr>
                                    <td></td>
                                    <td><span style="color: blue">${change_pass_succ}</span></td>
                                </tr>
                            </c:if>
                        </div>
                    </table>
            </div>
            <div>
                <input style="margin-left: 230px;background-color: beige;border-radius: 10px; padding: 5px" type="submit" name="OK" value="Change"> 
                </form>
            </div>
        </div>
    </body>
</html>
