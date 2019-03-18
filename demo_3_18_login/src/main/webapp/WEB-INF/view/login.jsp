<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019\3\18 0018
  Time: 11:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="${pageContext.request.contextPath}/login" method="post">
        <input name="name" placeholder="用户名"><br>
        <input name="pass" type="password" placeholder="密码"><br>
        <input type="submit">
    </form>
</body>
</html>
