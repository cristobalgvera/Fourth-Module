<%@ page import="testJSP.testJAVA"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSP</title>
</head>
<body>
	<h1>FINISHED</h1>
	<%!int count = 10;%>
	<%
		String nombre = request.getParameter("name");
		String apellido = request.getParameter("lastName");
// 		out.println("The Number is " + count + "\nNombre: " + nombre);
	%>
	<c:out value="Prueba"></c:out><br>
	<%= testJAVA.saludos(nombre, apellido) %>
</body>
</html>