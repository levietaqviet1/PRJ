<%-- 
    Document   : View Application
    Created on : Jul 15, 2022, 4:05:58 PM
    Author     : 84399
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>View Application</title>
        <style>
            th{
                color: blue;
            }
            table{
                margin: 5px;
                justify-content: space-between;
                padding: 1rem;
            }
            td{
                justify-content: space-between;
            }
        </style>
    </head>
    <body>
        <h1>Thông tin xử lý đơn</h1>
        <form action="view" method="get">
            <table border="1">
                <thead>
                    <tr>
                        <th>Tên đơn</th>
                        <th>Nội dung đơn</th>
                        <th>Thời gian tạo đơn</th>
                        <th>Tình trạng đơn</th>
                        <th>Ngày cập nhật tình trạng đơn</th>
                        <th>Lưu ý</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach items="${listapp}" var="l">
                        <tr>
                            <td>${l.getAppName()}</td>
                            <td>${l.getNoidungapp()}</td>
                            <td>${l.getTimeguidon()}</td>
                            <td>
                                <c:if test="${l.getTinhtrangdonid() == 0}">
                                    Từ chối
                                </c:if>
                                <c:if test="${l.getTinhtrangdonid() == 1}">
                                    Chấp nhận
                                </c:if>
                                <c:if test="${l.getTinhtrangdonid() == null}">

                                </c:if>
                            </td>
                            <td>${l.getTimeduyetdon()}</td>
                            <td>${l.getLido()}</td>

                        </tr>
                    </c:forEach>
                </tbody>
            </table>
        </form>
            <c:forEach begin="${1}" end="${numpage}" var="i">
                <a href="view?xpage=${i}">${i}</a>
            </c:forEach>



    </body>
</html>
