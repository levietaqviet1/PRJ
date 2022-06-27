<%-- 
    Document   : RegisterImproveMark
    Created on : Jun 24, 2022, 3:18:07 PM
    Author     : 84399
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Register To Improve Mark</title>
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

                <h1> Register To Improve Mark </h1>
            </div>
            <div class="table">

                <table>
                    <div class="input">
                        
                        <tr>
                            <td>
                                Campus:
                            </td>
                            <td>
                                <select style="border-radius: 10px; padding: 5px"><option>FU-HL</option></select>
                            </td>
                        </tr>
                        <tr>
                            <td>
                                Subject Code:
                            </td>
                            <td>
                                <input style="border-radius: 10px; padding: 5px" type="text" name="subject">  
                            </td>
                        </tr>
                        <tr>
                            <td>
                                Class:
                            </td>
                            <td>
                                <input style="border-radius: 10px; padding: 5px" type="text" name="class">
                            </td>
                        </tr>
                        <tr>
                            <td>
                                Thời gian học:
                            </td>
                            <td>
                                <input style="border-radius: 10px; padding: 5px" type="date" name="time">
                            </td>
                        </tr>
                        
                    </div>
                </table>
            </div>
            <div>
                    <input style="margin-left: 230px;background-color: beige;border-radius: 10px; padding: 5px" type="submit" name="OK" value="Send"> 
                    <input style="background-color:gainsboro;border-radius: 10px; padding: 5px " type="reset" name="cancel" value="Cancel">  
                </div>
        </div>
    </body>
</html>
