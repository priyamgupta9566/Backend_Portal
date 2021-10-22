<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Assign Teachers to Subjects...</h2>
<form action="AssignTeacherController" method="post">
<label>Teacher Id</label>
<input type="text" name="stid" placeholder="Enter Teacher Id"><br/><br>
<label>Subject Id</label>
<input type="text" name="sid" placeholder="Enter Subject Id"><br/><br>
<input type="submit" value="Store Record">
<input type="reset" value="Reset">

<br/><br/>
<a href="http://localhost:8787/Backend_Portal/AssignTeacherController">
Show List
</a>
<br/><br>
<a href="homepage.jsp">
Main Menu
</a>
</form>

</body>
</html>