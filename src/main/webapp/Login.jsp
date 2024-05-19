<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
</head>
<body>

	<h1>Login Page</h1>
	<!-- Create a form with the action attribute to specific where to send the form-data when the form is submitted, method attribute to specific the method used (GET, POST, PUT, DELETE, Etc.) -->
	<form action="LoginServlet" method="post">
	Username: <input type="text" name="username" size="20">
	Password: <input type="text" name="password" size="20">
	<!-- Implement submit button with type = submit to perform the request when clicked -->
	<input type="submit" value="Submit" />
	</form>
	
</body>
</html>