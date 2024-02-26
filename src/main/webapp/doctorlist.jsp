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
</head>
<body>



<h1><i>Doctor list</i></h1>
<table border="1">
<tr><th>Doctor ID </th><th>Doctor name </th><th>Availability status</th><th>Cost</th><th>Action</th></tr>

<% 
List<Doctor> docts= (List <Doctor>)request.getAttribute("lists");

for (Doctor doc : docts){
%>
<tr><td><div><%= doc.getDid() %></div></td>
<td><div><%= doc.getDoctorname() %></div></td>
<td><div><%= doc.getAvailabilitystatus() %></div></td>
<td><div><%= doc.getCost() %></div></td>
<td><a href="finalappointmentbook.jsp?userid=<%=session.getAttribute("id")%>&petid=<%=session.getAttribute("petid")%>&doctorid=<%=doc.getDid()%>&doctorname=<%=doc.getDoctorname()%>&petname=<%=session.getAttribute("petname")%>" >Book an appointment</a>
</td></tr>
<% 
}

%>
</table>

</body>
</html>
