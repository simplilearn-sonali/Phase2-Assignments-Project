<%@ page import="com.simplilearn.dto.Flight" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: PreYunk
  Date: 1/24/2021
  Time: 12:30 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Book</title>
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

<table>
    <tr>
        <th>ID</th>
        <th>Source</th>
        <th>Destination</th>
        <th>Price</th>
        <th>Airline</th>
    </tr>
    <%
        ArrayList<Flight> flights = (ArrayList<Flight>) request.getAttribute("flights");
        if(flights == null)
            flights = new ArrayList<Flight>();
        Integer i = 1;
        if(flights.size() != 0)
        for(Flight flight: flights) {
    %>
    <tr>

        <%
            Integer price = flight.getPrice() * Integer.valueOf((String) request.getAttribute("nop"));
        %>
        <td><%=flight.getId()%></td>
        <td><%=flight.getPlace1()%></td>
        <td><%=flight.getPlace2()%></td>
        <td><%=price%></td>
        <td><%=flight.getAirline()%></td>
        <form action="<%= request.getContextPath() %>/BookController" method="post">
            <input hidden  name="id" value="<%= flight.getId() %>" >

            <input hidden  name="price" value="<%= price %>" >
            <input hidden  name="airline" value="<%= flight.getAirline() %>" >
            <td><button id="<%= flight.getId() %>" type="submit" >Book</button></td>
        </form>
    </tr>

    <% }
        else {
            %>
    <h3>No Flights Found</h3>
    <%
    } %>


</table>
</body>
</html>
