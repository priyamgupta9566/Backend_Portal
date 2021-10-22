<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Teacher</title>
</head>
<body>
<h2>Add Teacher...</h2>

<form action="TeacherController" method="post">
<label>Teacher Id</label>
<input type="text" name="tid" placeholder="Enter Teacher Id"><br/><br>
<label>Teacher Name</label>
<input type="text" name="tname" placeholder="Enter Teacher Name"><br/><br>
<input type="submit" value="Store Record">
<input type="reset" value="Reset">

<br/><br/>
<a href="http://localhost:8787/Backend_Portal/TeacherController">
Show all teachers
</a>
<br/><br>
<a href="homepage.jsp">
Main Menu
</a>

</form>
</body>
</html>