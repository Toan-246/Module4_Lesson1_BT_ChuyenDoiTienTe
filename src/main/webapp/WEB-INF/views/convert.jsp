<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>$Title$</title>
</head>
<body>
<form action="/convert" method="post">
    <label for="usd">USD</label>
    <input type="number" name="usd" id="usd" value="${usd}">
    <label for="usd">Rate</label>
    <input type="number" name="rate" id="rate" value="23000" disabled>
    <button>Convert</button>
    <label for="vnd">VND</label>
    <input type="number" name="vnd" id="vnd" disabled value="${vnd}">
</form>

</body>
</html>
