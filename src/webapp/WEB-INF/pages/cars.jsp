<%@ page import="java.util.Locale" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>



<html>
<body>
<div align="center">
    <table border="1" cellpadding="5">
        <%--<caption><h2>Cars</h2></caption>--%>
        <caption><h2><spring:message code="nameCar"/></h2></caption>
        <tr>
            <th>Number</th>
            <th>Name</th>
            <th>Series</th>

            <c:forEach items="${carsOfController}" var="car">
        <tr>
            <td>${car.number}</td>
            <td>${car.name}</td>
            <td>${car.series}</td>

        </tr>
        </c:forEach>
        </tr>
    </table>
</div>
</body>
</html>
