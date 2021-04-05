<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: PreYunk
  Date: 1/24/2021
  Time: 2:27 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Airlines</title>
    <style>
        table {
            font-family: arial, sans-serif;
            border-collapse: collapse;
            width: 100%;
        }

        td, th {
            border: 1px solid #dddddd;
            text-align: left;
            padding: 8px;
        }

        tr:nth-child(even) {
            background-color: #dddddd;
        }
    </style>
</head>
<body>
<a href="<%= request.getContextPath() %>/admin/admin.jsp">admin page</a>
<br>
<a href="<%= request.getContextPath() %>/index.jsp">Home page</a>
<br>
<table>
    <tr>
        <th>Name</th>
    </tr>
    <%
        ArrayList<String> airlines = (ArrayList<String>) request.getAttribute("airlines");
        for(String airline: airlines) {
    %>
    <tr>
        <td><%= airline %></td>
    </tr>

    <% } %>
</table>
</body>
</html>
