<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Logout page</title>
</head>
<body>
<%
session.invalidate();
%>
<h1><font color="Red">You are successfully logged out </font></h1>
<span><a href="login.jsp">click on the login page  </a></span>
</body>
</html>
