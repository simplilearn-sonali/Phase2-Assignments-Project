<%@ page import="java.util.ArrayList" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
		 pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin Login</title>
	<style>
		body {
			text-align: center;
			box-sizing: border-box;
			display: flex;
			align-items: center;
			justify-content: center;
			margin-top: 100px;
		}
		.wrapper {
			text-align: center;
			width: 50%;
			border: 1px solid black;
		}
		a {
			padding: 10px;
			color: white;
			background-color: black;
		}
		input {
			margin: 10px;
		}
	</style>
</head>
<body>
	<div class="wrapper">
		<form action="<%= request.getContextPath() %>/LoginController" method="post">
			<h3>Enter the password for admin</h3>
			<input name="password" type="password" placeholder="Password"/>
			<button type="submit">Submit</button>
		</form>
		<ul>
			<%
				ArrayList<String> messages = (ArrayList<String>) request.getAttribute("msgs");
				if(messages != null) {
					for(String msg: messages) { %>
			<li style="color: red;"> <%= msg %> </li>
			<%
					}
				} %>
		</ul>
	</div>
<footer>
  <p><h2>Project developed by Sonali Kastoori</h2></p>
</footer>
</body>
</html>