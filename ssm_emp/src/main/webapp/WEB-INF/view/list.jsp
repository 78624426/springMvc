<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019\3\19 0019
  Time: 16:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1 align="center">员工信息列表</h1>
    <table align="center" border="1">
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Salary</th>
            <th>Gender</th>
        </tr>
        <c:forEach items="${emps}" var="e"></c:forEach>


    </table>
</body>
</html>
