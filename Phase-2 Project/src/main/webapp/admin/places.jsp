<%@ page import="com.simplilearn.dto.Place" %>
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
    <title>Places</title>
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
        <th>SNo.</th>
        <th>Source</th>
        <th>Destination</th>
    </tr>
    <%
        ArrayList<Place> places = (ArrayList<Place>) request.getAttribute("places");
        Integer i = 1;
        for(Place place: places) {
    %>
    <tr>
        <td><%= i++ %></td>
        <td><%=place.getPlace1()%></td>
        <td><%=place.getPlace2()%></td>
    </tr>
    <tr>
        <td><%= i++ %></td>
        <td><%=place.getPlace2()%></td>
        <td><%=place.getPlace1()%></td>
    </tr>
    <% } %>

</table>
</body>
</html>
