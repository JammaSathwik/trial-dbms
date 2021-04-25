<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
<link rel="stylesheet" type="text/css" href=style1.css>
</head>
<body>
<h1> Login Here</h1>
<form method="post" action="http://localhost:8085/JavaWebApplication/LoginPage">
	<pre>
	Name:   
    <input type="text" name="name" placeholder="Enter Your Name">
	Password: 
    <input type="text" name="password" placeholder="Enter Your Password">
	<input type="submit" value="Login">
	</pre>
</form>
</body>
</html>