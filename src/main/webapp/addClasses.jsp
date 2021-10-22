<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Assign classes subjects</title>
</head>
<body>
<h2>Add Subject to Classes...</h2>

<form action="ClassesController" method="post">
<label>Class Id</label>
<input type="text" name="cid" placeholder="Enter Class"><br/><br>
<label>Subject Id</label>
<input type="text" name="csid" placeholder="Enter Subject Id"><br/><br>
<input type="submit" value="Store Record">
<input type="reset" value="Reset">

<br/><br/>
<a href="http://localhost:8787/Backend_Portal/ClassesController">
Show all classes
</a>
<br/><br>
<a href="homepage.jsp">
Main Menu
</a>

</form>
</body>
</html>