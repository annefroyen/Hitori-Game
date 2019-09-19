import java.io.IOException;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.lang3.text.WordUtils;

@WebServlet("/solver")
public class SolverServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.getRequestDispatcher("WEB-INF/solver.jsp").forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		HttpSession sesjon = request.getSession(false);

		Board board = (Board) sesjon.getAttribute("board");

		Solver solver = new Solver();

		if (request.getParameter("solve") != null) {

			Solver.sandwichPair(board);
			solver.setSandwichPair(true);

			Solver.adjacentTriplets(board);
			solver.setAdjacentTriplets(true);

			Solver.shading(board);
			solver.setShading(true);

			/// board sine squares blir oppdatert, last inn siden på nytt og tegn ny tabell.
			request.getSession().setAttribute("board", board);
			request.getSession().setAttribute("solver", solver);

			response.sendRedirect("solver");
		} else if (request.getParameter("hint") != null) {
			System.out.println(board.getSize());
			response.sendRedirect("solver");
		} else if (request.getParameter("slow solve") != null) {
			// istedenfor å skrive ut in tabellen, skal den skrive ut solved tabellen med
			// rett farge

		} else {
			// ???
		}

	}
}
