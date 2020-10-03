<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration - Technical Support</title>
</head>
<body>
	<h1 align=center>Customer Registration</h1>
	<hr>
	<form action="CustomerAppController" method="post">
		<table>
			<tr>
				<td><label>First name: </label></td>
				<td><input type="text" name="fname"></td>
			</tr>
			<tr>
				<td><label>Last name: </label></td>
				<td><input type="text" name="lname"></td>
			</tr>
			<tr>
				<td><label>Phone number: </label></td>
				<td><input type="text" name="phone"></td>
			</tr>
			<tr>
				<td><label>Email: </label></td>
				<td><input type="email" name="email"></td>
			</tr>
			<tr>
				<td><input type="hidden" name="action" value="register"></td>
				<td colspan=2><input type="submit" value="Register"></td>
			</tr>
		</table>
	</form>
</body>
</html>