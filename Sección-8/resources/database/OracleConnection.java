package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class OracleConnection {

	public static Connection conect() {
		Connection connection = null;
		String password = "12345";
		String usuario = "BDD";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			connection = DriverManager.getConnection(url, usuario, password);
			System.out.println("Conexión exitosa");
		} catch (SQLException | ClassNotFoundException e) {
			System.out.println("No se pudo conectar a la base de datos - " + e.getMessage());
		}
		return connection;
	}
	
	public void close(Connection connection) {
		try {
			connection.close();
			System.out.println("Desconexión exitosa");
		} catch (SQLException e) {
			System.out.println("La base de datos no está conectada - " + e.getMessage());
		}
	}
}
