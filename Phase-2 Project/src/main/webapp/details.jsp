<%@ page import="com.simplilearn.dto.Details" %><%--

--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Details</title>
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
        a {
            box-sizing: border-box;
            padding: 5px;
            color: white;
            background-color: black;
            margin: 10px;
        }
    </style>
</head>
<body>
<table>
   <% Details detail = (Details) request.getAttribute("details");%>
    <tr>
        <td>Name</td>
        <td><%= detail.getName() %></td>
    </tr>
    <tr> 
        <td>Email Id</td>
        <td><%= detail.getEmail() %></td>
    </tr>
    <tr>
        <td>Phone Number</td>
        <td><%= detail.getPhone() %></td>
    </tr>
    <tr>
        <td>Source</td>
        <td><%= detail.getSource() %></td>
    </tr>
    <tr>
        <td>Destination</td>
        <td><%= detail.getDest() %></td>
    </tr>
    <tr>
        <td>Airline</td>
        <td><%= detail.getAirlines() %></td>
    </tr>
    <tr>
        <td>Date of Travel</td>
        <td><%= detail.getDot() %></td>
    </tr>
    <tr>
        <td>No of Persons</td>
        <td><%= detail.getNop() %></td>
    </tr>
    <tr>
        <td>Price</td>
        <td><%= detail.getPrice() %></td>
    </tr>
    <tr>
        <td>Flight Name</td>
        <td><%= detail.getId() %></td>
    </tr>
</table>
<br><br><br>
<a href="<%= request.getContextPath() %>/payment.jsp">Confirm</a>
<footer>
  <p><h2>Project developed by Sonali Kastoori</h2></p>
</footer>
</body>
</html>
