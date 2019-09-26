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
	int loop = 0;
	Solver solver = new Solver();

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.getSession().setAttribute("solver", solver);

		request.getRequestDispatcher("WEB-INF/solver.jsp").forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		HttpSession sesjon = request.getSession(false);
		Board board = (Board) sesjon.getAttribute("board");

		if (request.getParameter("solve") != null) {

			Solver.sandwichPair(board);
			Solver.adjacentTriplets(board);
			Solver.pairInduction(board);
			Solver.doubleCorner(board);
			Solver.impossiblePair(board);
			
             int j = 0;
             
             //dei fleste brett vil bli løst på under 5 loop'ar
			while (j<5) {
				Solver.shadingAndUnshading(board);

				Solver.cornerClose(board);
				Solver.edgeClose(board);
				Solver.quadMiddle(board);
				// Solver.middleClose(board);

				Solver.cornerTechniques(board);
				Solver.advancedTechniqueOne(board);
				Solver.advancedTechniqueTwo(board);
				Solver.advancedTechniqueThree(board);
				// Solver.advancedTechniqueOneFour(board);
				// Solver.advancedTechniqueOneFive(board);
				
				j++;
			}
			
			
			MiddleCloseMaze.solveMaze(board);
		
			
			request.setAttribute("sbsDisables", checkSolved(board));
			request.setAttribute("solver", solver);
			response.sendRedirect("solver");

		} else if (request.getParameter("stepByStepSolve") != null) {

			if (loop == 0) {
				System.out.println("loop0");
				Solver.sandwichPair(board);
				solver.setSandwichPair(true);
				loop++;
				request.setAttribute("solver", solver);
				response.sendRedirect("solver");

			} else if (loop == 1) {
				Solver.adjacentTriplets(board);
				solver.setAdjacentTriplets(true);
				loop++;
				request.setAttribute("solver", solver);
				response.sendRedirect("solver");

			} else if (loop == 2) {
				Solver.pairInduction(board);
				solver.setPairInduction(true);
				loop++;
				request.setAttribute("solver", solver);
				response.sendRedirect("solver");

			} else if (loop == 3) {
				Solver.doubleCorner(board);
				solver.setDoubleCorner(true);
				loop++;
				checkSolved(board);
				request.setAttribute("solver", solver);
				response.sendRedirect("solver");
			} else if (loop == 4) {
				Solver.impossiblePair(board);
				solver.setImpossiblePair(true);
				loop++;
				checkSolved(board);
				request.setAttribute("solver", solver);
				response.sendRedirect("solver");
			} else if (loop == 5) {
				Solver.shadingAndUnshading(board);
				solver.setShadingAndUnshading(true);
				loop++;
				checkSolved(board);
				request.setAttribute("solver", solver);
				response.sendRedirect("solver");
			} else if (loop == 6) {
				Solver.cornerClose(board);
				solver.setCornerClose(true);
				loop++;
				request.setAttribute("sbsDisabled", checkSolved(board));
				request.setAttribute("solver", solver);
				response.sendRedirect("solver");
			} else if (loop == 7) {
				Solver.edgeClose(board);
				solver.setEdgeClose(true);
				loop++;
				request.setAttribute("sbsDisabled", checkSolved(board));
				request.setAttribute("solver", solver);
				response.sendRedirect("solver");
			} else if (loop == 8) {
				Solver.quadMiddle(board);
				solver.setQuadMiddle(true);
				loop++;
				request.setAttribute("sbsDisabled", checkSolved(board));
				request.setAttribute("solver", solver);
				response.sendRedirect("solver");
			} else if (loop == 9) {
				Solver.cornerTechniques(board);
				solver.setCornerTechniques(true);
				loop++;
				request.setAttribute("sbsDisabled", checkSolved(board));
				request.setAttribute("solver", solver);
				response.sendRedirect("solver");
			} else if (loop == 10) {
				Solver.advancedTechniqueOne(board);
				solver.setAdvancedTechniqueOne(true);
				loop++;
				request.setAttribute("sbsDisabled", checkSolved(board));
				request.setAttribute("solver", solver);
				response.sendRedirect("solver");
			} else if (loop == 11) {
				Solver.advancedTechniqueTwo(board);
				solver.setAdvancedTechniqueTwo(true);
				loop++;
				request.setAttribute("sbsDisabled", checkSolved(board));
				request.setAttribute("solver", solver);
				response.sendRedirect("solver");
			} else if (loop == 12) {
				Solver.advancedTechniqueThree(board);
				solver.setAdvancedTechniqueThree(true);
				loop++;
				request.setAttribute("sbsDisabled", checkSolved(board));
				request.setAttribute("solver", solver);
				response.sendRedirect("solver");
			} else if (loop == 13) {
				Solver.shadingAndUnshading(board);
				solver.setShadingAndUnshadingAgain(true);
				loop++;
				request.setAttribute("sbsDisabled", checkSolved(board));
				request.setAttribute("solver", solver);
				response.sendRedirect("solver");
			} else if (loop == 14) {
				Solver.cornerClose(board);
				solver.setCornerCloseAgain(true);
				loop++;
				request.setAttribute("sbsDisabled", checkSolved(board));
				request.setAttribute("solver", solver);
				response.sendRedirect("solver");
			} else if (loop == 15) {
				Solver.edgeClose(board);
				solver.setEdgeCloseAgain(true);
				loop++;
				request.setAttribute("sbsDisabled", checkSolved(board));
				request.setAttribute("solver", solver);
				response.sendRedirect("solver");
			} else if (loop == 16) {
				Solver.quadMiddle(board);
				solver.setQuadMiddleAgain(true);
				loop++;
				request.setAttribute("sbsDisabled", checkSolved(board));
				request.setAttribute("solver", solver);
				response.sendRedirect("solver");
			} else if (loop == 17) {
				Solver.cornerTechniques(board);
				solver.setCornerTechniquesAgain(true);
				loop++;
				request.setAttribute("sbsDisabled", checkSolved(board));
				request.setAttribute("solver", solver);
				response.sendRedirect("solver");
			} else if (loop == 18) {
				Solver.advancedTechniqueOne(board);
				solver.setAdvancedTechniqueOneAgain(true);
				loop++;
				request.setAttribute("sbsDisabled", checkSolved(board));
				request.setAttribute("solver", solver);
				response.sendRedirect("solver");
			} else if (loop == 19) {
				Solver.advancedTechniqueTwo(board);
				solver.setAdvancedTechniqueTwoAgain(true);
				loop++;
				request.setAttribute("sbsDisabled", checkSolved(board));
				request.setAttribute("solver", solver);
				response.sendRedirect("solver");
			} else if (loop == 20) {
				Solver.advancedTechniqueThree(board);
				solver.setAdvancedTechniqueThreeAgain(true);
				loop = 0;
				request.setAttribute("sbsDisabled", checkSolved(board));
				request.setAttribute("solver", solver);
				response.sendRedirect("solver");

			}

		} else if (request.getParameter("reset") != null) {
			Solver.reset(board);
			solver = new Solver();
			loop = 0;
			request.setAttribute("solver", solver);
			response.sendRedirect("solver");

		} else if (request.getParameter("home") != null) {
			response.sendRedirect("start");
		}else if(request.getParameter("maze") != null) {
			MiddleCloseMaze.solveMaze(board);
			response.sendRedirect("solver");
		}

	}

	private boolean checkSolved(Board board) {
		if (Solver.isSolved(board)) {
			String solution = Solver.solutionAsList(board);
			solver.setSolution(solution);
			loop = 0;

			return true;

		}
		return false;

	}
}
