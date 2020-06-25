package com.java;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class login
 */
@WebServlet("/login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Login() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String user = request.getParameter("user");
		String pass = request.getParameter("pass");

		String credentials = "root";
		RequestDispatcher dispatcher;

		if (credentials.equals(user) && credentials.equals(pass)) {
			dispatcher = request.getRequestDispatcher("jsp/successful.jsp");

			// Obtener fecha y hora del sistema para conexión
			LocalDateTime myDateObj = LocalDateTime.now();
			DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
			String formattedDate = myDateObj.format(myFormatObj);

			// Creamos el objeto cliente de la clase User
			Object client = new User(user, pass, formattedDate);
			
			/* 
			 * Asignamos atributos del usuario a la sesión, es decir,
			 * estos atributos quedarán insertados en el servidor y
			 * hasta que este no sea reiniciado, estos atributos existirán
			*/
			request.getSession().setAttribute("client", client);
		} else {
			dispatcher = request.getRequestDispatcher("html/error.html");
		}

		// Transmitimos la respuesta mediante el dispatcher
		dispatcher.forward(request, response);
	}

}
