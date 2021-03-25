<%@page import="java.util.Date"%>
<html>
<body>
<!-- Using JSP declarations here -->

<%!
	boolean flag;

	int calculateAddition(int firstNum, int secondNum){
		return firstNum + secondNum;
	}
%>





<h2>Hello <%= request.getParameter("learnerName") %> </h2>
<!-- Using JSP scriplets -->

 <%= "Hello JSP's" %>
<%= new Date() %>


<br>
 <%= calculateAddition(56, 909) %> 
</body>
</html>

