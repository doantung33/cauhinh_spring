<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 3/1/2021
  Time: 11:54 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>hello world
</h1>
<table>
    <tr>
        <td>Name</td>
        <td>Age</td>
        <td>Address</td>
    </tr>
    <c:forEach items="${student}" var="s">
        <tr>
            <td>${s.name}</td>
            <td>${s.age}</td>
            <td>${s.address}</td>
        </tr>
    </c:forEach>

</table>
</body>
</html>
