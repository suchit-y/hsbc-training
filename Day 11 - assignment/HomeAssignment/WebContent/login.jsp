<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
	<form action="LoginValidate" method="post">
		<table>
			<tr>
				<td>Enter user name:</td>
				<td><input type="text" name="uname"></td>
			</tr>
			<tr>
				<td>Enter password:</td>
				<td><input type="password" name="pwd"></td>
			</tr>
			<tr>
				<td><input type="submit" value="login"></td>
			</tr>
		</table>
	</form>
</body>
</html>