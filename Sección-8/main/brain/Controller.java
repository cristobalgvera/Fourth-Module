package brain;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import crud.*;
import data.Registry;

/**
 * Servlet implementation class Controller
 */
@WebServlet("/Action")
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;

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
		RequestDispatcher dispatcher;
		switch (action) {
		case "Crear":
			path = "create.jsp";
			break;
		case "Registrar":
			Create.action(request);
			request.setAttribute(attributeName, Read.action());
			break;
		case "Listar":
			request.setAttribute(attributeName, Read.action());
			break;
		case "Actualizar":
			path = "update.jsp";
			request = updateData(request);
			break;
		case "Cambiar":
			Update.action(request);
			request.setAttribute(attributeName, Read.action());
			break;
		case "Borrar":
			Delete.action(request);
			request.setAttribute(attributeName, Read.action());
			break;
		default:
			throw new IllegalArgumentException("Valor inesperado: '" + action + "'");
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
	
	protected HttpServletRequest updateData(HttpServletRequest request) {
		Registry registration = (Registry) Read.action(request.getParameter("id"));
		String city = registration.getData().get(0).get(4);
		request.setAttribute("registration", registration);
		request.setAttribute("city", city);
		return request;
	}
}
