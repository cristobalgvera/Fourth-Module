package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class OracleConnection {
	private final static String password = "12345";
	private final static String usuario = "BDD";
	private final static String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private Connection connection;

	public OracleConnection() {
		this.connection = conect(this.connection);
	}

	public Connection conect(Connection connection) {
		System.out.println("\n---------------------\n\nEstableciendo conexión");
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			connection = DriverManager.getConnection(url, usuario, password);
			System.out.println("Conexión exitosa");
		} catch (SQLException | ClassNotFoundException e) {
			System.out.println("No se pudo conectar a la base de datos - " + e.getMessage());
		}
		return connection;
	}

	public static void close(Connection connection, Statement statement, PreparedStatement pStatement,
			ResultSet resultSet) {
		try {
			if (resultSet != null)
				resultSet.close();
			if (pStatement != null)
				pStatement.close();
			if (statement != null)
				statement.close();
			connection.close();
			System.out.println("Desconexión exitosa");
		} catch (SQLException e) {
			System.out.println("La base de datos no está conectada - " + e.getMessage());
		}
		System.out.println("\n---------------------\n");
	}

	public Connection getConnection() {
		return connection;
	}

	public void setConnection(Connection connection) {
		this.connection = connection;
	}
}
