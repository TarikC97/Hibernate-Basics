<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome Page</title>
</head>
<body>
	<%--Secure page  --%>
	<%
		if(session.getAttribute("username")==null){
			response.sendRedirect("login.jsp");
		}
	
	%>
	<%-- JSTL  --%>
	Welcome ${username}
	<a href="videos.jsp">Videos here!</a>
	
	<form action="logout">
		<input type="submit" value="Logout">
	</form>

</body>
</html>