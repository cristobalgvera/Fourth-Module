package crud;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import data.Registry;
import database.OracleConnection;

public abstract class States {
	static String defaultQuery;
	static final Registry registration = new Registry();
	static Statement statement;
	static ResultSet resultSet;
	static Connection connection = OracleConnection.conect();
}
