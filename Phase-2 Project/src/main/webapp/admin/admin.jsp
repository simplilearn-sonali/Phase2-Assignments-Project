<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
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
            display: flex;
            flex-flow: column;
            align-items: center;
            justify-content: space-around;
            text-align: center;
            width: 50%;
            border: 1px solid black;
            height: 50vh;
        }
        a {
            box-sizing: border-box;
            padding: 5px;
            color: white;
            background-color: black;
            margin: 10px;
        }
        input {
            margin: 10px;
        }
    </style>
</head>
<body>
<br>
<div class="wrapper">
<a href="<%= request.getContextPath() %>/admin/password.jsp">Change Password</a>
<br>
<a href="<%= request.getContextPath() %>/admin/PlacesController">Master list for Places</a>
<br>
<a href="<%= request.getContextPath() %>/admin/AirlinesController">Master list for Airlines</a>
<br>
<a href="<%= request.getContextPath() %>/admin/FlightsController">Master list for Flights</a>
    <br>
    <a href="<%= request.getContextPath() %>/index.jsp">HOME</a>
</div>
</body>
</html>