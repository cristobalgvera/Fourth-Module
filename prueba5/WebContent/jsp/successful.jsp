<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>¡Accediste!</h1>
	<p>
		Usuario: ${client.getUser()}<br>
		Password: ${client.getPass()}<br>
		Hora ingreso: ${client.getConnectionTime()}
	</p>
	<pre>Si actualizas la hora se actualiza... BUG jeje</pre>
</body>
</html>