<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Using more JSP Implicit Objects</title>
</head>
<body>
<%
/* Using HttpSession in a JSP - the implicit way */

/* Using ServletContext - the implicit way again  */
application.setAttribute("name", "Sharath");
session.setAttribute("name", "Sonali");
out.println("Value from session variable is : " + session.getAttribute("name"));
out.println("Value from context variable is : " + application.getAttribute("name")); 
%>
</body>
</html>


<!-- HttpSession theSession = request.getSession() -->
<!-- ServletContext context = request.getServletContext() -->