<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Check Customer</title>
</head>
<body>
	<%
		String next = (String) request.getSession().getAttribute("next");
	%>
	<%
		if (next.equals("confirm")) {
	%><jsp:forward page="confirm.jsp" />
	<%
		} else {
	%><jsp:forward page="registerForm.jsp" />
	<%
		}
	%>
</body>
</html>