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

Pet ee=(Pet)request.getAttribute("petobject");
%>

<%
session.setAttribute("petname",ee.getPetname());
session.setAttribute("petid",ee.getPetid());
%>
<h1><i>Pet doctor appointment booking page</i></h1>
<table border="1">
<tr><th>Pet ID </th><th>Pet name </th><th>Pet age</th><th>Pet size </th><th>Pet sex</th><th>Owner id</th><th>Owner name</th><th>Action</th></tr>

<tr><td><%=ee.getPetid()%></td><td><%=ee.getPetname()%></td><td><%=ee.getPetage() %></td><td><%=ee.getPetsize() %></td><td><%=ee.getPetsex() %></td><td><%=ee.getUserid() %></td>
<td><%=ee.getUsername() %></td><td><a href="doctorbook.jsp?userid=<%=ee.getUserid()%>&petid=<%=ee.getPetid()%>&username=<%=ee.getUsername()%>&petname=<%=ee.getPetname()%> ">Book</a></td></tr>

</table>

</body>
</html>
