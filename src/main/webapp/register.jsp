<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Register Page</title>
</head>
<body>
	<h1>Register Page</h1>
	<!-- Create a form with the action attribute to specific where to send the form-data when the form is submitted, method attribute to specific the method used (GET, POST, PUT, DELETE, Etc.) -->
	<form action="RegisterServlet" method="post">
	Username: <input type="text" name="username" size="20"><br>
	Password: <input type="text" name="password" size="20"><br>
	Email: <input type="text" name="email" size="30"><br>
	Langage: <select name="language">
		<option>English</option>
		<option>Japanese</option>
		<option>French</option>
	
	</select><br>
	<!-- Implement submit button with type = submit to perform the request when clicked -->
	<input type="submit" value="Submit" />
	</form>
</body>
</html>