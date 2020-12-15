<%--
  Created by IntelliJ IDEA.
  User: AD
  Date: 12/15/2020
  Time: 8:48 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
    <form action="/login" method="post">
        <label for="uname"> Username: </label><br>
        <input id="uname" type="text" name="username"><br>
        <label for="passw"> Username: </label><br>
        <input id="passw" type="password" name="password"><br>
        <button type="submit"> Login </button>
    </form>
</body>
</html>
