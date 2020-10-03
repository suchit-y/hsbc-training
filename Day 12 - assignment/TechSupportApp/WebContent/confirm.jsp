<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Confirmation</title>
</head>
<body>
	<h2>User registered...</h2>
	<form action="CustomerAppController" method="get">
		<input type="hidden" name="action" value="display"> <input
			type="submit" value="Display">
	</form>
	<br>
	<button onclick="window.location.href='welcome.html'">Service
		Request</button>
	<%--  <jsp:include page="getName.jsp" />  --%>
</body>
</html>