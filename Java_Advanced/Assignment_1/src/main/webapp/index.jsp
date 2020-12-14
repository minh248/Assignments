<%@ page import="java.time.LocalDate" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP demo</title>
</head>
<body>
    <div id="ex1">
        <h1>Hello world</h1>

        <% out.print("Welcome to JSP"); %>
        <br>

        <%=LocalDate.now()%>
        <br>

        <%! String name = "Minh"; %>
        <%="Hello " + name%>
        <br>

        <%@ include file="now.jsp"%>
        <br>
        <br>

        <form action="welcome.jsp" method="post">
            <input type="text" name="username" autofocus>
            <button type="submit">Submit</button>
        </form>
        <br>
    </div>
    <div id="ex2" style="border-top: 1px solid">
        <form action="result.jsp">
            <lable>Number 1:</lable><br>
            <input type="text" name="num1"><br>
            <lable>Number 2:</lable><br>
            <input type="text" name="num2"><br>
            <button type="submit" name="o" value="+">+</button>
            <button type="submit" name="o" value="-">-</button>
            <button type="submit" name="o" value="*">*</button>
            <button type="submit" name="o" value="/">/</button>
        </form>
        <br>
        <br>
    </div>
</body>
</html>