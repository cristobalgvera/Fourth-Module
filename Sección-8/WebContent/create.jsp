<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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
	<h1>Crear registro</h1>
	<form action="Action" method="post">
		<input type="text" name="name" placeholder="Nombre" required>
		<input type="text" name="lastName" placeholder="Apellido" required>
		<input type="text" name="rut" placeholder="Rut" required> <input
			type="number" name="age" min="0" max="120" placeholder="Edad"
			required> <select name="city">
			<option>Temuco</option>
			<option>Santiago</option>
			<option>Valdivia</option>
			<option>Valparaiso</option>
		</select> <input style="margin: 20px 0; width: 25%" type="submit" name="submit-btn" value="Registrar">
	</form>
</body>
</html>