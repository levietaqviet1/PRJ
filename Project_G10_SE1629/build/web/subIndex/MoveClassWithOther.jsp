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
            .move{
                width: 100%;
                max-width: 60rem;
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
                            <input style="border-radius: 10px; padding: 5px" type="text" name="subject">  
                        </td>
                    </tr>
                    <tr>
                        <td>
                            Student A:
                        </td>
                        <td>
                            <input style="border-radius: 10px; padding: 5px" type="text" name="nameA">
                        </td>
                        <td>
                            Exchange With Student B:
                        </td>
                        <td>
                            <input style="border-radius: 10px; padding: 5px" type="text" name="nameB">
                        </td>
                    </tr>
                    <tr>
                        <td>
                            From Class:
                        </td>
                        <td>
                            <input style="border-radius: 10px; padding: 5px" type="text" name="ClassA">
                        </td>
                        <td>
                            To Class:
                        </td>
                        <td>
                            <input style="border-radius: 10px; padding: 5px" type="text" name="ClassB">
                        </td>
                    </tr>
                        
                </table>
            </div>
                <div>
                    <input style="margin-left: 400px;background-color: beige;border-radius: 10px; padding: 5px" type="submit" name="OK" value="Send"> 
                    <input style="background-color:gainsboro;border-radius: 10px; padding: 5px " type="reset" name="cancel" value="Cancel">  
                </div>
        </div>
    </body>
</html>
