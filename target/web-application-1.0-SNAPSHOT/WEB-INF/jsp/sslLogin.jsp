<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE HTML>
<html xmlns:th="http://www.thymeleaf.org">
<head>
    <title>Getting Started: Serving Web Content</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
</head>
<body>
<h1><c:out value="${message}"/></h1>
<form action="/ssl-login" method="POST">
    <table>
        <tr></tr>
        <tr>
            <td><label for="userName"> User Name</label></td>
            <td><input type="text" id="userName" name="userName"></td>
        </tr>
        <tr>
            <td><label for="password">Password</label></td>
            <td><input type="password" id="password" name="password"></td>
        </tr>
        <tr>
            <td></td>
            <td>
                <button type="submit" name="Submit" value="Submit">Submit</button>
            </td>
        </tr>
    </table>
</form>
</body>
</html>