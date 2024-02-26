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
<h1><i>Doctor appointment</i></h1>

<form action="booking">
Ownerid <input type="text" name="ownerid" value="<%=session.getAttribute("id")%>"><br>
<input type="hidden" name="petid" value="<%=session.getAttribute("petid")%>">
<input type="hidden" name="doctorid" value="<%=request.getParameter("doctorid")%>">
<input type="hidden" name="petname" value="<%=session.getAttribute("petname")%>">
<input type="hidden" name="doctorname" value="<%=request.getParameter("doctorname")%>">
<input type="hidden" name="ownername" value="<%=session.getAttribute("name")%>"><br><br>
<input type="submit" value="Book">
</form>

</body>
</html>
