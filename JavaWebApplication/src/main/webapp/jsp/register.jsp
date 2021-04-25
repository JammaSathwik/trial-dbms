<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register</title>
<link rel="stylesheet" type="text/css" href=style1.css>
</head>
<body>
<h1> Register Here</h1>
<form method="post" action="http://localhost:8085/JavaWebApplication/Register">
	<pre>
	Name: 
    <input type="text" name="name" placeholder="Enter Your Name">
	Email: 
    <input type="text" name="email" placeholder="Enter Your Email">
	Password: 
    <input type="password" name="password" placeholder="Enter Your Password">
	<input type="submit" value="SignUp">
	</pre>
</form>
</body>
</html>