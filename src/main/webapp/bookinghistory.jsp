<%@ page import="com.example.demo.*" %>
<%@page import="java.util.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="http://java.sun.com/jsp/jstl/core"%>

    
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



<h1><i>Booking History</i></h1>
<table border="1">
<tr><th>Bookingid</th><th>userid</th><th>doctorid</th><th>petid</th><th>ownername</th><th>petname</th><th>doctorname</th><th>appointmentstatus</th></tr>

<% 
List<Booking> books= (List <Booking>)request.getAttribute("lists");

for (Booking book : books){
%>
<tr><td><div><%= book.getBookingid() %></div></td>
<td><div><%= book.getUserid() %></div></td>
<td><div><%= book.getDoctorid() %></div></td>
<td><div><%= book.getPetid() %></div></td>
<td><div><%= book.getOwnername() %></div></td>
<td><div><%= book.getPetname() %></div></td>
<td><div><%= book.getDoctorname() %></div></td>
<td><div><%= book.getAppointmentstatus() %></div></td>

</td></tr>
<% 
}

%>
</table>
<span><a class="fixed" href="logoutprocess.jsp">Logout</a></span><br>

</body>
</html>
