package crud;

import java.io.UnsupportedEncodingException;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;


import database.OracleConnection;

public class Create extends States {
	public static Object action(HttpServletRequest request) {
		defaultQuery = "INSERT INTO CLIENTES (NOMBRE, APELLIDO, RUT, CIUDAD, EDAD) VALUES (?, ?, ?, ?, ?)";
		String[] inputNames = {"name", "lastName", "rut", "city", "age"};
		try {
			oConnection = new OracleConnection();
			pStatement = oConnection.getConnection().prepareStatement(defaultQuery);
			request.setCharacterEncoding("UTF-8");
			for (int i = 0; i < inputNames.length; i++) {
				// TODO Request para codificación UTF-8
				pStatement.setString(i+1, request.getParameter(inputNames[i]));
//				System.out.println(request.getParameter(inputNames[i]));
			}
			pStatement.executeUpdate();
		} catch (SQLException | UnsupportedEncodingException e) {
			System.out.println("Create error: " + e.getMessage());
		}
		closeConnection();
		return registration;
	}
}
