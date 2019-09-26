
import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/start")
public class StartServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.getRequestDispatcher("WEB-INF/start.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		if (request.getParameter("size") != null) {

			String size = (String) request.getParameter("size");
			Integer s = Integer.parseInt(size);

			Board board = new Board();

			board.getBoard(s);

			request.getSession().setAttribute("board", board);

		} else if (request.getParameter("createInput") != null) {
			
			String numbers = (String) request.getParameter("createInput");

			Board board = Board.createBoard(numbers);

			request.getSession().setAttribute("board", board);
		}

		if (request.getParameter("solve") != null) {

			response.sendRedirect("solver");

		} else if (request.getParameter("play") != null) {

			response.sendRedirect("game");

		}

	}

}
