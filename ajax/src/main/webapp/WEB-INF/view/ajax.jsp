<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019\3\19 0019
  Time: 10:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.js"></script>
    <script type="text/javascript">
        $(function () {
            $("#name").blur(function () {
                $.ajax({
                    type:"post",
                    url:"${pageContext.request.contextPath}/ajax/checkUser",
                    data:{"name":$("#name").val()},
                    success:function (data) {
                        $("#msg").html(data);
                    }
                });
                $.ajax({
                    type:"post",
                    url:"${pageContext.request.contextPath}/ajax/findUser",
                    data:{"name":$("#name").val()},
                    dataType:"json",
                    success:function (user) {
                        $("#username").html(user.userName);
                        $("#pass").html(user.pass);
                        $("#birth").html(user.birth);
                    }
                });
            });
        });
    </script>
</head>
<body>
<input type="text" id="name" ><span id="msg"></span><hr>
    name:<span id="username"></span><hr><br>
    pass:<span id="pass"></span><br>
    birth:<span id="birth"></span>
</body>
</html>
