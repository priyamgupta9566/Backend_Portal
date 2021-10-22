<%@page import="com.entity.Classes"%>
<%@page import ="java.util.Iterator" %>
<%@page import ="java.util.List" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Class-Subject details</title>
</head>
<body>
<h2>Class-Subject details</h2>
<table>
<tr>
<th>Class Id</th>
<th>Subject Id</th>
</tr>
<%
Object obj=request.getAttribute("obj");
List<Classes> listOfClasses=(List<Classes>)obj;
Iterator<Classes> li=listOfClasses.iterator();
while(li.hasNext())
{
	Classes cc=li.next();
	%>
	<tr>
		<td><%=cc.getCid()%></td>
		<td><%=cc.getCsid()%></td>
	</tr>
	<% 
}
%>

</table>
</body>
</html>
