package brain;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import crud.*;

/**
 * Servlet implementation class Controller
 */
@WebServlet("/Action")
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
	static RequestDispatcher dispatcher;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Controller() {
		super();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String attributeName = "registration";
		String path = "index.jsp";
		String action = request.getParameter("submit-btn");
		switch (action) {
		case "Crear":
			break;
		case "Listar":
			request.setAttribute(attributeName, Read.action());
			break;
		case "Actualizar":
			break;
		case "Borrar":
			break;
		default:
			throw new IllegalArgumentException("Valor inesperado: " + action);
		}
		dispatcher = request.getRequestDispatcher(path);
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
