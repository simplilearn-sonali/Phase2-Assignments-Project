<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP Starter</title>
</head>
<body>


<h1><% out.println("Hello JSP's");%></h1>
<h3><% out.println(new Date()); %></h3>

<p>
<%
	out.println("Addition of numbers is : " + (45 + 90));
%>
</p>

<%-- <%
	for(int value = 534; value <= 935; value++){
		out.println(value + "<br>");
	}
%> --%>

<select>
	<option>Please select your ID:</option>
	<%
		for(int value = 667; value <= 1249; value++){
			%>
			<option><% out.println(value); %></option>
	<%		
		}
	%>
</select>
</body>
</html>