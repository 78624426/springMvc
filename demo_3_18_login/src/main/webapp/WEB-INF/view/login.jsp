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
    <form action="${pageContext.request.contextPath}/p1/submit" method="post">

        <input name="name" placeholder="用户名" value="${name}"><br>
        <input name="pass" type="password" placeholder="密码" value="${user.pass}"><br>
        boolean:<input name="ok"><br>
        年龄：<input name="a"><br>
        省:<input name="addr.province"><br>
        市:<input name="addr.city"><br>
        游戏<input type="checkbox" name="hobbies" value="游戏">
        旅游<input type="checkbox" name="hobbies" value="旅游">
        <input type="submit">
    </form>
<h1>msg:${m1}</h1>
</body>
</html>
