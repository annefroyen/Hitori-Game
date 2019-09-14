

import java.io.IOException;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.text.WordUtils;


@WebServlet("/home")
public class StartServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.getRequestDispatcher("WEB-INF/home.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

			    String size = (String) request.getParameter("size");
                String difficulty = (String) request.getParameter("difficulty");
			
                request.getSession().setAttribute("size", size);
                request.getSession().setAttribute("difficulty", difficulty);
                
                Integer s = Integer.parseInt(size);
                Integer d = Integer.parseInt(difficulty);
                
            //    Board newBoard = createBoard(s, d);
                
			response.sendRedirect("game");

	}

}