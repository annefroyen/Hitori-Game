
public class MiddleCloseMaze {

	static int whiteSquareRow;
	static int whiteSquareColumn;

	public static int[][] boardToMaze(Board board) {

		Square[][] squares = board.getSquares();
		int[][] maze = new int[board.getSize()][board.getSize()];

		for (int r = 0; r < board.getSize(); r++) {
			for (int c = 0; c < board.getSize(); c++) {

				if (squares[r][c].getColour() == ColourEnum.BLACK) {
					maze[r][c] = 1;
				}
			}
		}
		return maze;

	}

	public static int[][] mazeToBoard(Board board) {

		Square[][] squares = board.getSquares();
		int[][] maze = new int[board.getSize()][board.getSize()];

		for (int r = 0; r < maze.length; r++) {
			for (int c = 0; c < maze[r].length; c++) {

				if (squares[r][c].getColour() == ColourEnum.BLACK) {
					maze[r][c] = 1;
				}
			}
		}
		return maze;

	}

	static boolean isSafe(Square[][] squares, int x, int y) {
		return (x >= 0 && x < squares.length && y >= 0 && y < squares.length
				&& squares[x][y].getColour() != ColourEnum.BLACK);
	}

	static void isWhite(Square[][] squares, int r, int c) {
		if (squares[r][c].getColour() == ColourEnum.WHITE) {
			whiteSquareRow = r;
		    whiteSquareColumn = c;
		}

	}

	public static void solveMaze(Board board) {

		Square[][] squares = board.getSquares();
		int size = squares.length* squares.length;
		int s = board.getSize();
		int sol[][] = new int[s][s];
		System.out.println(s);
		
		
		for (int i = size-1; i >=0; i--) {
	
			 System.out.println("for loop 1");
			 
			    	if (solveMazeUtil(squares, 0, i, sol, s - 1, 666)) {
						squares[whiteSquareRow][whiteSquareColumn] = new Square(
								squares[whiteSquareRow][whiteSquareColumn].getNumber(), ColourEnum.COLOURED);
						 System.out.println("top to bottom");
					} 
					
				
					if (solveMazeUtil(squares, s - 1, i, sol, 0, 666)) {

						squares[whiteSquareRow][whiteSquareColumn] = new Square(
								squares[whiteSquareRow][whiteSquareColumn].getNumber(), ColourEnum.COLOURED);
						 System.out.println("bottom to top");
					}
		
		}
		for (int i = 0; i < size; i++) {
			 System.out.println("for loop 2");
		
			if (solveMazeUtil(squares, i, 0, sol, 666, s - 1)) {
				squares[whiteSquareRow][whiteSquareColumn] = new Square(
						squares[whiteSquareRow][whiteSquareColumn].getNumber(), ColourEnum.COLOURED);

				 System.out.println("left to right");
				 
				 
				
			} 
			
		
			if (solveMazeUtil(squares, 0, i, sol, s - 1, 666)) {
				squares[whiteSquareRow][whiteSquareColumn] = new Square(
						squares[whiteSquareRow][whiteSquareColumn].getNumber(), ColourEnum.COLOURED);
				 System.out.println("right to left");

				
			
			}
			
		}

		board.setSquares(squares);
	}


	public static boolean solveMazeUtil(Square[][] squares, int r, int c, int solution[][], int goalRow, int goalColumn) {


		if (goalRow == 666) {

			if (c == goalColumn) {
				solution[r][c] = 1;
				return true;
			}

		} else if (goalColumn == 666) {
			if (r == goalRow) {
				solution[r][c] = 1;
				return true;
			}
		}

		
		if (isSafe(squares, r, c) == true) {
			solution[r][c] = 1;
			isWhite(squares, r, c);


			if (solveMazeUtil(squares, r + 1, c, solution, goalRow, goalColumn))
				return true;

			if (solveMazeUtil(squares, r, c + 1, solution, goalRow, goalColumn))
				return true;

			solution[r][c] = 0;
			return false;
		}

		return false;
	}

}
