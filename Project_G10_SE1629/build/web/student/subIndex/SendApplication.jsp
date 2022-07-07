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
            td{
                justify-content: space-between;
            }
            .move{
                width: 100%;
                max-width: 80%;
                background-color: #fff;
                border-radius: 10px;
                padding: 2rem 1rem;
                margin: auto;
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
                                <textarea style="border-radius: 10px; padding: 5px" id="id" name="purpose" rows="25" cols="100"></textarea>
                            </td>
                        </tr>
                    </table>
                </div>
                <div class="submit" style="text-align: center">
                    <br><input style="background-color: beige; font-size: 18px; border-radius: 10px;padding: 5px" type="submit" name="OK" value="Send">

                </div>
            </div>
        </form>

    </body>
</html>
