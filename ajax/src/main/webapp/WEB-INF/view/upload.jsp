<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019\3\19 0019
  Time: 13:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="${pageContext.request.contextPath}/file/upload" method="post" enctype="multipart/form-data">
        文件：<input type="file" name="file"><br>
        <input type="submit">
    </form>
</body>
</html>
