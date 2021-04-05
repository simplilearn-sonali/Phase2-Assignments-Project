<%@ page import="com.simplilearn.dto.Flight" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: PreYunk
  Date: 1/24/2021
  Time: 2:28 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Flights</title>
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
<br>
<table>
    <tr>
        <th>ID</th>
        <th>Source</th>
        <th>Destination</th>
        <th>Price</th>
    </tr>
    <%
        ArrayList<Flight> flights = (ArrayList<Flight>) request.getAttribute("flights");
        for(Flight flight: flights) {
    %>
    <tr>
        <td><%=flight.getId()%></td>
        <td><%=flight.getPlace1()%></td>
        <td><%=flight.getPlace2()%></td>
        <td><%=flight.getPrice()%></td>
    </tr>
    <tr>
        <td><%=flight.getId()%></td>
        <td><%=flight.getPlace2()%></td>
        <td><%=flight.getPlace1()%></td>
        <td><%=flight.getPrice()%></td>
    </tr>
    <% } %>

</table>

</body>
</html>
