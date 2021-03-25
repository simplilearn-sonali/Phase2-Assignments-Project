<%@page import="java.util.Date"%>
<%@page import="com.sonali.simplilearn.training.Sample" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Home Page</title>
</head>
<body>

<%
response.setContentType("text/html"); 
%>

<!-- Using jsp include  -->
<%@ include file="header.html" %>

<%-- <h3><%= new Date() %></h3> --%>

<h4><%= new Sample().getMessString() %></h4>


<%@ include file="footer.html" %>

<%
	/*  */out.println("How is this working?");
	out.println(request.getServletContext().getServerInfo());
	
	
%>
</body>
</html>