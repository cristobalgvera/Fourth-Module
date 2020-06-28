package crud;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Read extends States {

	public static Object action() {
		defaultQuery = "SELECT * FROM CLIENTES";
		try {
			initiateConnection();
			statement = oConnection.getConnection().createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
					ResultSet.CONCUR_UPDATABLE);
			resultSet = statement.executeQuery(defaultQuery);
			while (resultSet.next()) {
				List<String> rowData = new ArrayList<>();
				for (int columnIndex = 1; columnIndex <= resultSet.getMetaData().getColumnCount(); columnIndex++) {
					rowData.add(resultSet.getString(columnIndex));
				}
				registration.setData(rowData);
			}
		} catch (SQLException e) {
			System.out.println("Read error: " + e.getMessage());
		}
		closeConnection();
		return registration;
	}

	public static Object action(String id) {
		defaultQuery = "SELECT * FROM CLIENTES WHERE ID=" + id;
		try {
			initiateConnection();
			statement = oConnection.getConnection().createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
					ResultSet.CONCUR_UPDATABLE);
			resultSet = statement.executeQuery(defaultQuery);
			while (resultSet.next()) {
				List<String> rowData = new ArrayList<>();
				for (int columnIndex = 1; columnIndex <= resultSet.getMetaData().getColumnCount(); columnIndex++) {
					rowData.add(resultSet.getString(columnIndex));
				}
				registration.setData(rowData);
			}
		} catch (SQLException e) {
			System.out.println("Read error: " + e.getMessage());
		}
		closeConnection();
		return registration;
	}
}
