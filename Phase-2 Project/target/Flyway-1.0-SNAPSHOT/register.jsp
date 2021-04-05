<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: PreYunk
  Date: 1/24/2021
  Time: 1:40 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Register</title>
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
    <h3>Enter your Personal Details</h3>
    <form action="<%= request.getContextPath() %>/RegisterController" method="post">
        <input name="name" placeholder="Name" >

        <input name="email" placeholder="Email" type="email" >

        <input name="phone" placeholder="Phone No." type="number" >
        <button type="submit">Next</button>
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
