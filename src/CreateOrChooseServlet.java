

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/createOrChoose")
public class CreateOrChooseServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.getRequestDispatcher("WEB-INF/createOrChoose.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		
		
		//choose
		
                String size =  (String) request.getParameter("size"); 
				Integer s = Integer.parseInt(size);
 
				Board board = new Board();
						
				board.getBoard(s);

               request.getSession().setAttribute("board", board);
               
               
               
            
                
		//Create
		/* 
		Board createBoard = new Board("1 2 3 4 5 6 7 8 9");
      	request.getSession().setAttribute("board", createBoard);
      	*/
		
		
      	response.sendRedirect("solver");
		
  
		
                if (request.getParameter("choose") != null) {
                	
                	
                	
                    response.sendRedirect("solveOrPlay");
                    
                    
        		}else if(request.getParameter("create") != null) {
        			
        			
        			response.sendRedirect("game");
        		}
        			
                
			
	}

}