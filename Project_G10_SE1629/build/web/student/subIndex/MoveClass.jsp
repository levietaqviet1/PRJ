<%-- 
    Document   : MoveClass
    Created on : Jun 24, 2022, 8:18:40 AM
    Author     : 84399
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Move Class</title>
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
                max-width: 55rem;
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
        <form action="MoveClass?sid=1" method="post">
            <div class="move">

                <div class="title">
                    <h1> Move Class </h1>
                </div>

                <div class="table">
                    <table>
                        <tr>
                            <td>
                                Campus:
                            </td>
                            <td>
                                <select style="border-radius: 10px; padding: 5px" name="campus" required="">
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
                <div class="textA" style="text-align: center">
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
