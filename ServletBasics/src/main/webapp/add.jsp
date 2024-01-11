<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSP Intro</title>
</head>
<body bgcolor ="grey">
		<%    
		
				int b1 = Integer.parseInt(request.getParameter("num1"));
				int b2= Integer.parseInt(request.getParameter("num2"));
				int rez=b1+b2;
				out.println("Result:"+rez);	
		%>
</body>
</html>