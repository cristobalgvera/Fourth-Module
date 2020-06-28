package crud;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;

import database.OracleConnection;

public class Delete extends States {
	public static Object action(HttpServletRequest request) {
		defaultQuery = "DELETE FROM CLIENTES WHERE ID="+request.getParameter("id");
		try {
			oConnection = new OracleConnection();
			pStatement = oConnection.getConnection().prepareStatement(defaultQuery);
			pStatement.executeUpdate();
		} catch (SQLException e) {
			System.out.println("Create error: " + e.getMessage());
		}
		closeConnection();
		return registration;
	}
}
