<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Backend Portal</title>
</head>
<body>
<h2>Learner's Academy Backend Portal</h2>
<h2>Login Page</h2>
<form action="LoginController" method="get">
<label>Email Id</label>
<input type="email" name="email" placeholder="Enter e-mail id"><br/><br>
<label>Password</label>
<input type="password" name="pass" placeholder="Enter password"><br/><br>
<input type="submit" value="SignIn"/>
<input type="reset" value="Reset"/>
</form>
<br/>
<a href="SignUp.jsp">SignUp!!</a>
</body>
</html>