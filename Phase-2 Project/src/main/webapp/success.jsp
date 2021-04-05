<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Success</title>
</head>
<body>
<h1> Operation Completed Successfully</h1>
<h3>${msg}</h3>
<br>
<a href="<%= request.getContextPath() %>/index.jsp">HOME</a>
<footer>
  <p><h2>Project developed by Sonali Kastoori</h2></p>
</footer>
</body>
</html>