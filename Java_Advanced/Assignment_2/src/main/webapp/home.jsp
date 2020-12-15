<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
    <%! String name = ""; %>

    <%
        Cookie[] cookies = request.getCookies();
        for (Cookie c: cookies) {
            if(c.getName().equals("name")){
                name = c.getValue();
            }
        }

        out.print("<p>Hello "+ name +"</p>");
    %>
</body>
</html>
