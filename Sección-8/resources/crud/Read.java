package crud;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class Read extends States {
	
	public static Object action() {
		defaultQuery = "SELECT * FROM CLIENTES";
		try {
			statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
			resultSet = statement.executeQuery(defaultQuery);
			while (resultSet.next()) {
				List<String> rowData = new ArrayList<>();
				for (int columnIndex = 1; columnIndex <= resultSet.getMetaData().getColumnCount(); columnIndex++) {
					rowData.add(resultSet.getString(columnIndex));
				}
				registration.setData(rowData);
			}
			connection.close();
		} catch (SQLException e) {
			System.out.println("Error: " + e.getMessage());
		}
		return registration;
	}
	
}
