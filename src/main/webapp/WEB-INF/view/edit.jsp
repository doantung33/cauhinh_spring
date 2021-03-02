<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 3/2/2021
  Time: 11:42 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Edit Student</title>
</head>
<body>
<form method="post">
    <input name="name" value="${student.name}">
    <input name="age" value="${student.age}">
    <input name="address" value="${student.address}">
    <button type="submit">Edit</button>
</form>

</body>
</html>
