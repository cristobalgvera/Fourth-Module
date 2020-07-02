<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Nuevo registro</title>
<style type="text/css">
body {
	display: flex;
	flex-flow: column;
	align-items: center;
}

form {
	display: flex;
	flex-flow: column;
	align-items: center;
	width: 50%;
}

input, select {
	width: 75%;
}
</style>
</head>
<body>
	<h1>Actualizar registro</h1>
	<c:set var="registry" value="${registration.getData().get(0)}" />
	<form action="Action" method="post">
		<input type="hidden" name="id" value="${registry.get(0)}"> <input
			type="text" name="name" placeholder="Nombre"
			value="${registry.get(1)}" required> <input type="text"
			name="lastName" placeholder="Apellido" value="${registry.get(2)}"
			required> <input type="text" name="rut" placeholder="Rut"
			value="${registry.get(3)}" required> <input type="number"
			name="age" min="0" max="120" value="${registry.get(5)}"
			placeholder="Edad" required> <select name="city">
			<option>Temuco</option>
			<option>Santiago</option>
			<option>Valdivia</option>
			<option>Valparaiso</option>
		</select> <input style="margin: 20px 0; width: 25%" type="submit"
			name="submit-btn" value="Cambiar">
	</form>
	<%
		String city = (String) request.getAttribute("city");
	%>
</body>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script type="text/javascript">
	$("select").val("<%=city%>")
</script>
</html>