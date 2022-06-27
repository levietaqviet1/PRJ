<%-- 
    Document   : home
    Created on : Jun 27, 2022, 3:26:07 PM
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
        <h4>Thông báo:</h4>
        <h4>Tình trạng sinh viên: <span style="color: red">${st_login_successful.getStatus().getName()}</span> </h4>
        
    </body>
</html>
