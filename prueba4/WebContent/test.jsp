<%@ page import="testJSP.testJAVA"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>FINISHED</h1>
	<%!int count = 10;%>
	<%
		String nombre = request.getParameter("name");
		String apellido = request.getParameter("lastName");
// 		out.println("The Number is " + count + "\nNombre: " + nombre);
	%>
	<%= testJAVA.saludos(nombre, apellido) %>
</body>
</html>