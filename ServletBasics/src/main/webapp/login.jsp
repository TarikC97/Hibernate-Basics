<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
</head>
<body>
	<%--Unsecure page  --%>
	<form action="Login" method="post">
		Username: <input type="text" name="name"><br>
		Password: <input type="password" name="pass"><br>
		<input type="submit" value="Login">
	</form>
</body>
</html>