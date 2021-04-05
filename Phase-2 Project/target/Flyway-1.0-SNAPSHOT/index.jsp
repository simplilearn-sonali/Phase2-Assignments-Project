<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: PreYunk
  Date: 1/24/2021
  Time: 12:13 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Welcome to Flyway</title>
    <style>
        body {
            text-align: center;
            box-sizing: border-box;
            display: flex;
            align-items: center;
            justify-content: center;
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
    <h2>Welcome To Flyway</h2>
    <a href="<%= request.getContextPath() %>/login.jsp">Admin Login</a>
    <br>
    <br>
    <hr>
    <form action="<%= request.getContextPath() %>/SearchController" method="post">
        <label for="source"> Enter Source </label>
        <input id="source" name="source" type="text" placeholder="Source">
        <br>
        <label for="dest"> Enter Destination </label>
        <input id="dest" name="dest" type="text" placeholder="Destination">
        <br>
        <label for="dot"> Enter Date of Travel </label>
        <input id="dot" name="dot" type="date" placeholder="Date of Travel">
        <br>
        <label for="nop"> Enter No. of persons </label>
        <input id="nop" name="nop" type="number" placeholder="Number of Persons">
        <br>
        <button type="submit" >Submit</button>
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
</body>
</html>
