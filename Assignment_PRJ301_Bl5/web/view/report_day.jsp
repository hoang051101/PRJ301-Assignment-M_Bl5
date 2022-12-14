<%-- 
    Document   : report_day
    Created on : Aug 22, 2022, 7:41:47 PM
    Author     : Admin
--%>

<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <table border ="1px">
            <tr>
                <td>Tên</td>
                <td>Chức vụ</td>
                <td>Mặt hàng</td>

                <c:forEach items="${requestScope.dates}" var="d">
                    <td
                        <c:if test="${d.dow eq 1}">
                            style ="background-color: yellow"
                        </c:if>
                        >
                        <fmt:formatDate pattern= "dd"
                                        value= "${d.value}"/> <br/>

                        <fmt:formatDate  pattern="EEE"
                                         value="${d.value}"/>

                    </td>
                </c:forEach>
                <td>Tổng ngày làm</td>
                <td>Tổng ngày nghỉ có phép</td>
                <td>Tổng ngày nghỉ không phép</td>
            </tr>
            <c:forEach items="${requestScope.emps}" var="e">
                <tr>
                    <td>${e.name}</td>
                    <td>${e.position}</td>
                    <td>${e.pname}</td>

                    <c:forEach items="${requestScope.dates}" var="d">
                        <td
                            <c:if test="${d.dow eq 1}">
                                style ="background-color: yellow"
                            </c:if>
                            >
                            <c:forEach items="${e.working}" var="t">
                                <c:if test="${d.value eq t.cidate}">
                                    x                               
                                </c:if>
                                <c:if test="${d.value != t.cidate}">
                                    O                               
                                </c:if>
                            </c:forEach>
                        </td> 
                    </tr>
                </c:forEach>
            </c:forEach>

        </table>
    </body>
</html>


