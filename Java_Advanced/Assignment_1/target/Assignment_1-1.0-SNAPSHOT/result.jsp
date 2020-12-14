<%--
  Created by IntelliJ IDEA.
  User: AD
  Date: 12/14/2020
  Time: 6:31 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Result</title>
</head>
<body>
    <%
        int num1 = Integer.parseInt(request.getParameter("num1"));
        int num2 = Integer.parseInt(request.getParameter("num2"));
        String o = request.getParameter("o");

        if(o.equals("+")){
            out.print(num1 + " + " + num2 + " = " + (num1 + num2));
        } else if (o.equals("-")) {
            out.print(num1 + " - " + num2 + " = " + (num1 - num2));
        } else if (o.equals("*")) {
            out.print(num1 + " x " + num2 + " = " + (num1 * num2));
        } else if (o.equals("/")) {
            out.print(num1 + " : " + num2 + " = " + ((float)num1 / (float)num2));
        }
    %>
</body>
</html>
