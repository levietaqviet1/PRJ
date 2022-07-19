<%-- 
    Document   : MoveClassWithOther
    Created on : Jun 24, 2022, 3:25:45 PM
    Author     : 84399
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Move Class With Other Student</title>
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
            .table{
                display: flex;
                align-items: center;
                justify-content: center;
            }
        </style>
    </head>
    <body>
        <form action="MoveWith" method="post">
            <div class="move">

                <div class="title">
                    <h1> Move Class With Other Student </h1>
                </div>
                <div class="table">

                    <table>
                        <tr>
                            <td>
                                Campus:
                            </td>
                            <td>
                                <select style="border-radius: 10px; padding: 5px">
                                    <c:forEach var="t" items="${listCampus}">
                                        <option value="${t.id}"
                                                <c:if test="${campusin_signup == t.id}" >
                                            selected
                                            </c:if>>FU-${t.name}
                                        </option>
                                    </c:forEach>
                                </select>
                            </td>
                        </tr>
                        <tr>
                            <td>
                                Subject Code:
                            </td>
                            <td>
                                <input style="border-radius: 10px; padding: 5px" type="text" name="subject" required="">  
                            </td>
                        </tr>
                        <tr>
                            <td>
                                Student A:
                            </td>
                            <td>
                                <input style="border-radius: 10px; padding: 5px" type="text" name="nameA" required="">
                            </td>
                            <td>
                                Exchange With Student B:
                            </td>
                            <td>
                                <input style="border-radius: 10px; padding: 5px" type="text" name="nameB" required="">
                            </td>
                        </tr>
                        <tr>
                            <td>
                                From Class:
                            </td>
                            <td>
                                <input style="border-radius: 10px; padding: 5px" type="text" name="ClassA" required="">
                            </td>
                            <td>
                                To Class:
                            </td>
                            <td>
                                <input style="border-radius: 10px; padding: 5px" type="text" name="ClassB" required="">
                            </td>
                        </tr>

                    </table>
                </div>
                <div style="text-align: center">
                    <input style="background-color: beige;border-radius: 10px; padding: 5px" type="submit" name="OK" value="Send"> 
                    <input style="background-color:gainsboro;border-radius: 10px; padding: 5px " type="reset" name="cancel" value="Cancel">  
                </div>
                <div style=" text-align: center">
                    ${message}
                </div> 
            </div>
        </form>
    </body>
</html>
