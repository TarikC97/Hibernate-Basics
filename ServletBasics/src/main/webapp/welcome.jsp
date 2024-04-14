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
		response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
	   //Veryfing for one browser
		if(session.getAttribute("username")==null){
			response.sendRedirect("login.jsp");
		}
	
	%>
	<%-- JSTL  --%>
	<%-- JDBC Servlet --%>
	<%-- MavenJSP --%>
	<%-- Dao --%>
	<%-- JDBC Sessions--%>
	<%--File Uploading Servlet-Url --%>
	<%-- Hibernate Intro --%>
	<%-- Hibernate-Practical --%>
	Welcome ${username}
	<a href="videos.jsp">Videos here!</a>
	
	<form action="logout">
		<input type="submit" value="Logout">
	</form>

</body>
</html>