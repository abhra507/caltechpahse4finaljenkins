<%@ page import="com.example.demo.*" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
a.fixed {
position: fixed;
right: 0;
top: 0;
width: 1260px;
}
</style>
</head>
<body>
<%

User ee=(User)request.getAttribute("emp");
%>
<h3><i> Welcome <%=ee.getName() %></i></h3>
<%
session.setAttribute("name",ee.getName());
session.setAttribute("id",ee.getUserid());
%>
<table>
<tr>
<td>
<form action="Bookappointment.jsp">
<input type="submit" value="Book an appointment">
</form>
</td>
</tr>
</table>

<span><a class="fixed" href="logoutprocess.jsp">Logout</a></span><br>

</body>
</html>
