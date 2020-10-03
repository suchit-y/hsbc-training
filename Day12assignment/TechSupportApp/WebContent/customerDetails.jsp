<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="java.util.HashMap"%>
<%@page import="java.util.List"%>
<%@page import="java.util.Iterator"%>
<%@ page import="com.hsbc.tr.web.entity.Customer"%>
<%@ page import="com.hsbc.tr.web.entity.ServiceRequest"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer Details</title>
<style>
table, th, td {
	border: 1px solid black;
	border-collapse: collapse;
}

td {
	padding: 10px;
}
</style>
</head>
<body>

	<table border=2>
		<%
			List<Customer> custList = (List<Customer>) session.getAttribute("custList");
			HashMap<Customer, ServiceRequest> list = (HashMap<Customer, ServiceRequest>) session.getAttribute("list");
		%>
		<tr>
			<td><strong>Email</strong></td>
			<td><strong>First Name</strong></td>
			<td><strong>Last Name</strong></td>
			<td><strong>Phone</strong></td>
			<td><strong>problem</strong></td>
		</tr>
		<%
			for (Customer c : custList) {
		%>
		<tr>
			<td><%=c.getEmail()%></td>
			<td><%=c.getFname()%></td>
			<td><%=c.getLname()%></td>
			<td><%=c.getPhone()%></td>
			<td><%=list.get(c.getEmail())%></td>
		</tr>
		<%
			}
		%>
	</table>
</body>
</html>