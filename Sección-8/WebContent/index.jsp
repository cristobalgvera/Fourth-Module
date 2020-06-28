<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Index</title>
<style type="text/css">
table {
	margin: 20px 0px;
	border-collapse: collapse;
	border: 1px solid black;
	border-collapse: collapse;
	box-sizing: border-box;
	table-layout: fixed;
	width: 50%;
}

tr, td, th {
	border: 1px solid black;
	border: 1px solid blue;
	word-wrap: break-word;
}
</style>
</head>
<body>
	<form action="Action" method="post">
		<input type="submit" name="submit-btn" value="Crear"> <input
			type="submit" name="submit-btn" value="Listar"> <input
			type="submit" name="submit-btn" value="Actualizar"> <input
			type="submit" name="submit-btn" value="Borrar">
	</form>
	<table>
		<thead>
			<tr>
				<th>Nombre</th>
				<th>Apellido</th>
				<th>Rut</th>
				<th>Ciudad</th>
				<th>Edad</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${registration.getData()}" var="registry">
				<tr>
					<c:forEach items="${registry}" var="i">
						<td>${i}</td>
					</c:forEach>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>