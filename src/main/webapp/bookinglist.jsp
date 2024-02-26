<%@ page import="com.example.demo.*" %>
<%@page import="java.util.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
Booking books= (Booking)request.getAttribute("lists");
%>


<h1><i>Booking list</i></h1>

<table border="1">
<tr><th>Owner Name </th><th>Pet Name </th><th>Doctor Name</th><th>Appointment Status</th></tr>

<tr><td><%= books.getOwnername() %></td>
<td><%= books.getPetname() %></td>
<td><%= books.getDoctorname()%></td>
<td><%= books.getAppointmentstatus()%></td></tr>

</table><br><br>
<form action="history">
<input type="submit" value="listofbooking">
</form>

</body>
</html>
