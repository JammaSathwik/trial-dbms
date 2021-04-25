<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
Hello doctor Please enter your details to view your appointments
<form method="post" action="http://localhost:8085/JavaWebApplication/doctorsviewpage">
	<pre>
	Name: <input type="text" name="name" placeholder="Enter Your Name">
	Password: <input type="text" name="password" placeholder="Enter Your Password">
	<input type="submit" value="Login">
	</pre>
</form>
</body>
</html>