<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Subject</title>
</head>
<body>
<h2>Add Subject...</h2>
<form action="SubjectController" method="post">
<label>Subject Id</label>
<input type="text" name="sid" placeholder="Enter Subject Id"><br/><br>
<label>Subject Name</label>
<input type="text" name="sname" placeholder="Enter Subject Name"><br/><br>
<input type="submit" value="Store Record">
<input type="reset" value="Reset">
<br/><br/>
<a href="http://localhost:8787/Backend_Portal/SubjectController">
Show all subjects
</a>
<br/><br>
<a href="homepage.jsp">
Main Menu
</a>
</form>
</body>
</html>