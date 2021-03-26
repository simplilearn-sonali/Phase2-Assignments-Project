<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Dashboard</title>
</head>
<body>
<%
/* Check whether user is not logged in */
if(session.getAttribute("userName") == null){
	/* Redirect to the login  */
	response.sendRedirect("index.jsp");
}
else{


out.println("Welcome " + session.getAttribute("userName") + ", you are now logged in<br>");
%>
<hr>
<a href="logout">Logout</a>
<%
}
%>
</body>
</html>