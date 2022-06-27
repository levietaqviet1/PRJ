<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%-- 
    Document   : demo.jsp
    Created on : Jun 2, 2022, 5:55:29 PM
    Author     : NCC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <table border="1">
            <tr>
                <th>MON</th>
                <th>TUE</th>
                <th>WED</th>
                <th>THU</th>
                <th>FRI</th> 
                <th>SAT</th> 
                <th>SUN</th> 
                <th></th> 
            </tr>
            <tr>
                <%
                 
                 if (request.getAttribute("mang00")!= null) {
                   
                    %><td>aaaaaaaaaaaaaaaaaaaaaa</td><%
                 }
                %>
                

            </tr>
        </table>
    </body>
</html>
