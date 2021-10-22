<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>SignUp</title>
</head>
<body>
<h2>Learner's Academy Backend Portal</h2>
<h2>Create Account</h2>
<form action="LoginController" method="post">
<label>Email Id</label>
<input type="email" name="email"><br/><br>
<label>Password</label>
<input type="password" name="pass"><br/><br>
<input type="submit" value="SignUp!"/>
<input type="reset" value="Reset"/>
</form>
</body>
</html>