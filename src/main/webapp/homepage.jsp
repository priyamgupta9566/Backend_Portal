<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Homepage</title>
</head>
<body>
<h2>Welcome to Backend Home page.</h2>
<a href = "homepage.jsp"><button>Home</button></a><br><br>

<a href = "addTeacher.jsp"><button>Add Teacher</button></a>

<a href = "addSubject.jsp"><button>Add Subject</button></a>
<br><br>
<a href = "addClasses.jsp"><button>Assign Subject to Classes</button></a>
<br><br>
<a href = "assignTeachers.jsp"><button>Assign Teacher to Subjects</button></a>
<br><br>

<form action="LogoutController" method="get">
<button>Logout</button>
</form>

</body>
</html>