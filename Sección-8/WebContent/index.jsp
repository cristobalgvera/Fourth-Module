<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
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
	width: 70%;
}

tr, td, th {
	border: 1px solid black;
	border: 1px solid blue;
	word-wrap: break-word;
}

td, th {
	padding: 5px;
}

.actions {
	display: flex;
	justify-content: space-around;
}
</style>
</head>
<body>
	<form name="pForm" action="Action" method="post">
		<input type="submit" name="submit-btn" value="Crear"> <input
			type="submit" name="submit-btn" value="Listar">
	</form>
	<table>
		<thead>
			<tr>
				<th>Nombre</th>
				<th>Apellido</th>
				<th>Rut</th>
				<th>Ciudad</th>
				<th>Edad</th>
				<th colspan="2">Acciones</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${registration.getData()}" var="registry">
				<tr>
					<c:forEach var="i" begin="1" end="${fn:length(registry)-1}">
						<td>${registry.get(i)}</td>
					</c:forEach>
					<td colspan="2">
						<form class="actions" action="Action" method="post">
							<input type="submit" name="submit-btn" value="Actualizar">
							<input type="submit" name="submit-btn" value="Borrar"> <input
								type="hidden" name="id" value="${registry.get(0)}">
						</form>
					</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>