package servlet;

import java.io.IOException;
import java.util.List;

import entities.TipoHabitacion;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet({ "/TipoHabitacion", "/tipohabitacion", "/Tipohabitacion" })
public class TipoHabitacionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

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
		List<TipoHabitacion> tipos = null;

	}

}
