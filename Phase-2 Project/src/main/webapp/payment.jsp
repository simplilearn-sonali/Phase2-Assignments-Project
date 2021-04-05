<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: PreYunk
  Date: 1/24/2021
  Time: 4:49 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Payment</title>
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
    <h3>Enter your payment details</h3>
    <hr>
    <form action="<%=request.getContextPath() %>/PaymentController" method="post">
        <input name="cno" placeholder="Card number" maxlength="16" type="number"> &nbsp;&nbsp;&nbsp;&nbsp;

        <input name="cname" placeholder="Name on Card" type="text">

        <label> Valid Thru </label>
        <input name="expmm" placeholder="MM" type="number" maxlength="2" style="width: 50px">/<input name="expyy" placeholder="YY" type="number" maxlength="2" style="width: 50px">

        <input name="cvv" type="password" placeholder="CVV" maxlength="3">

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
