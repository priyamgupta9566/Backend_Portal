<%@page import="com.entity.Subject"%>
<%@page import ="java.util.Iterator" %>
<%@page import ="com.entity.Teacher" %>
<%@page import ="java.util.List" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Subject details</title>
</head>
<body>
<h2>Subject details</h2>
<table>
<tr>
<th>Subject Id</th>
<th>Subject Name</th>
</tr>
<%
Object obj=request.getAttribute("obj");
List<Subject> listOfSubject=(List<Subject>)obj;
Iterator<Subject> li=listOfSubject.iterator();
while(li.hasNext())
{
	Subject ss=li.next();
	%>
	<tr>
		<td><%=ss.getSid()%></td>
		<td><%=ss.getSname()%></td>
	</tr>
	<% 
}
%>
</table>
</body>
</html>
