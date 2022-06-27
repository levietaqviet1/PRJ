<%-- 
    Document   : SendApplication
    Created on : Jun 25, 2022, 2:10:40 PM
    Author     : 84399
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Send an application</title>
        <style>
            body{
                width: 100%;
                height: 100vh;
                background-image: linear-gradient(to right top,#d7e6f9,#f3d3b4,#ffffff);
                display: flex;
                align-items: center;
                justify-content: center;
            }
            *{
                font-family: "Verdana",sans-serif;
                padding: 0;
            }
            table{
                font-size: 18px;
                border: 0.1px solid #917881;
                margin-bottom: 10px;
                border-radius: 10px;
                display: flex;
                justify-content: space-between;
                border-spacing: 15px;

            }
            td{
                justify-content: space-between;
            }
            .move{
                width: 100%;
                max-width: 40rem;
                background-color: #fff;
                border-radius: 10px;
                padding: 4rem 2rem;
            }
            .title{
                text-align: center;
            }




        </style>
    </head>
    <body>
        <form>
            <div class="move">
                <div class="title">
                    <h1 > Send An Application  </h1>
                </div>
                <div class="a">
                    <table>
                        <tr>
                            <td>
                                Application type
                            </td>
                            <td>
                                <select style="background: #fff; font-size: 18px; border-color: orange; border-radius: 10px; padding: 5px">
                                    <option>Đăng kí thi cải thiện điểm</option>
                                    <option>Chuyển đổi tín chỉ</option>
                                    <option>Đề nghị chuyển cơ sở</option>
                                    <option>Đề nghị chuyển ngành</option>
                                </select>
                            </td>
                        </tr>
                        <tr>
                            <td class="i">
                                Purpose:
                            </td>
                            <td>
                                <textarea style="border-radius: 10px; padding: 5px" id="id" name="purpose" rows="10" cols="40"></textarea>
                            </td>
                        </tr>
                    </table>
                </div>
                <div class="submit">
                    <br><input style="background-color: beige; font-size: 18px; margin-left: 280px;border-radius: 10px;padding: 5px" type="submit" name="OK" value="Send">

                </div>
            </div>
        </form>

    </body>
</html>
