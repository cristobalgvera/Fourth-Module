<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>New Registry</title>
<style type="text/css">
form{
display: flex;
flex-flow: column;
align-items: center;
width = 50%;
box-sizing: border-box;
}
input, select{
width = 100%;
}
</style>
</head>
<body>
	<form action="Action">
		<input type="text" name="name" placeholder="Nombre" required>
		<input type="text" name="lastName" placeholder="Apellido" required>
		<input type="text" name="rut" placeholder="Rut" required>
		<select name="city">
			<option>Temuco</option>
			<option>Santiago</option>
			<option>Valdivia</option>
			<option>Valparaiso</option>
		</select>
		<input type="number" name="age" min="0" max="120" placeholder="Edad" required>
		<input type="submit" name="submit-btn" value="Registrar">
	</form>
</body>
</html>