package servlet;

import java.io.IOException;
import java.util.LinkedList;

import data.TipoHabitacionDao;
import entities.TipoHabitacion;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet({ "/TipoHabitacion", "/tipohabitacion", "/Tipohabitacion" })
public class TipoHabitacionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private TipoHabitacionDao tipoHabitacionDao;

	public void init() {
		tipoHabitacionDao = new TipoHabitacionDao();
	}

	public TipoHabitacionServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String action = request.getParameter("action");
		switch (action) {
		case "list":
			list(request, response);
			break;
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.getParameter("action");

	}

	private void list(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		LinkedList<TipoHabitacion> tipos = tipoHabitacionDao.list();
		request.setAttribute("listTipos", tipos);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/vistas/tipo-list.jsp");
		dispatcher.forward(request, response);

	}

}
