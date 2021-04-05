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
            text-align: center;
            width: 50%;
            border: 1px solid black;
            padding: 20px;
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

<br>
<div class="wrapper">
    <form action="<%= request.getContextPath() %>/admin/PasswordController" method="post">
        <input name="password" type="password" placeholder="Password">
        <br>
        <br>
        <button type="submit">Submit</button></form>
    <br>
    <br>
    <br>
    <a href="<%= request.getContextPath() %>/admin/admin.jsp">admin page</a>
    <br>
    <br>
    <br>
    <br>
    <br>
    <br>
    <a href="<%= request.getContextPath() %>/index.jsp">Home page</a>
    <br>
</div>
</body>
</html>