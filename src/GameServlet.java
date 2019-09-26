import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/game")
public class GameServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.getRequestDispatcher("WEB-INF/game.jsp").forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		HttpSession sesjon = request.getSession(false);

		Board board = (Board) sesjon.getAttribute("board");

		if (request.getParameter("hint") != null) {
			//Game.hint(board);
			response.sendRedirect("game");
		} else if (request.getParameter("check") != null) {
			//Game.check(board);
			response.sendRedirect("game");
		} else if (request.getParameter("showSolution") != null) {
			Game.showSolution(board);
			response.sendRedirect("game");
		} else if (request.getParameter("reset") != null) {
			Game.reset(board);
			response.sendRedirect("game");
		} else if (request.getParameter("home") != null) {
			response.sendRedirect("start");
		} 

	}

}