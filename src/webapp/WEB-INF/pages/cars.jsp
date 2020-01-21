<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<body>
<div align="center">
    <table border="1" cellpadding="5">
        <caption><h2>Cars</h2></caption>
<tr>
    <th>Number</th>
    <th>Name</th>
    <th>Series</th>
</tr>
<c:forEach var="car" items="${carsOfController}">
    <tr>
        <td>${car.number}</td>
        <td>${car.name}</td>
        <td>${car.series}</td>

    </tr>
</c:forEach>
    </table>
</div>
</body>
</html>
