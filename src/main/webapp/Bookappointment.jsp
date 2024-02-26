<%@ page import="com.example.demo.*" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1><i>Request Page</i></h1>


<form action="inputrequest">
pet name <input type="text" name="petname"><br>
pet age <input type="text" name="petage"><br>
pet size <input type="text" name="petsize"><br>
pet sex <input type="text" name="petsex"><br>
user id <input type="text" value="<%=session.getAttribute("id")%>" name="userid"><br>
user name <input type="text" value="<%=session.getAttribute("name")%>" name="username"><br>
<input type="submit" value="submitrequest">
</form>
</body>
</html>