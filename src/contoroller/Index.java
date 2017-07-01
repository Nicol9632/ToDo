package contoroller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * メインのサーブレット
 * @author Akane Ota
 */


/**
 * Servlet implementation class Index
 */
@WebServlet("/Index")
public class Index extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		RequestDispatcher disp = request.getRequestDispatcher("WEB-INF/view/main.jsp");
		disp.forward(request, response);
		return;

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String page = request.getParameter("page");

		switch (page) {
		case "main":{
			RequestDispatcher disp = request.getRequestDispatcher("WEB-INF/view/main.jsp");
			disp.forward(request, response);
			return;
		}
		case "contents":{
			RequestDispatcher disp = request.getRequestDispatcher("WEB-INF/view/contents.jsp");
			disp.forward(request, response);
			return;
		}
		case "search":{
			RequestDispatcher disp = request.getRequestDispatcher("WEB-INF/view/search.jsp");
			disp.forward(request, response);
			return;
		}
		default:{
			RequestDispatcher disp = request.getRequestDispatcher("WEB-INF/view/main.jsp");
			disp.forward(request, response);
		}	break;
		}
	}

}
