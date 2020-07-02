package crud;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import data.Registry;
import database.OracleConnection;

public abstract class States {
	protected static String defaultQuery;
	protected static Registry registration;
	protected static Statement statement;
	protected static PreparedStatement pStatement;
	protected static ResultSet resultSet;
	protected static OracleConnection oConnection;

	protected static void initiateConnection() {
		registration = new Registry();
		oConnection = new OracleConnection();
	}

	protected static void closeConnection() {
		OracleConnection.close(oConnection.getConnection(), statement, pStatement, resultSet);
	}
}
