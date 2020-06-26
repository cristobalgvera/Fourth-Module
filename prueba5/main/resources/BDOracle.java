package resources;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class BDOracle
 */
@WebServlet("/BDOracle")
public class BDOracle extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public BDOracle() {
		super();
		conectar();
		// TODO Auto-generated constructor stub
	}

	public static Connection conectar() {
		Connection con = null;

		String password = "12345";
		String usuario = "BDD";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";

		Statement stmt = null;
		ResultSet rs = null;

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection(url, usuario, password);
			System.out.println("Conectado");
			String sql = "SELECT * FROM CLIENTES";

			stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);

			// step4 execute query
			rs = stmt.executeQuery(sql);
			rs.last(); // me voy al último
			int tamano = rs.getRow(); // capturo el tamaño
			System.out.println(tamano);
			rs.beforeFirst(); // lo dejo donde estaba para tratarlo
			while (rs.next()) {
				System.out.println(rs.getString("NOMBRE") + " " + rs.getString(2));
			}
			// step5 close the connection object
			con.close();
		} catch (SQLException | ClassNotFoundException e) {
			System.out.println("No se pudo conectar a la base de datos - " + e.getMessage());
			e.printStackTrace();
		}
		return con;
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
