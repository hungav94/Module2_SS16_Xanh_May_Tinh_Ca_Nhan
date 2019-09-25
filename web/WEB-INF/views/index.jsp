<%--
  Created by IntelliJ IDEA.
  User: An Viet Hung
  Date: 9/25/2019
  Time: 4:44 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Máy Tính</title>
</head>
<body>
<h1>Calculator</h1>
<form action="/result" method="post">
    <input type="text" name="num1" /> &nbsp;
    <input type="text" name="num2" /> <br><br>
    <input type="submit" name="operator" value="Addition(+)">
    <input type="submit" name="operator" value="Subtraction(-)">
    <input type="submit" name="operator" value="Multiplication(X)">
    <input type="submit" name="operator" value="Division(/)">
</form>
</body>
</html>
