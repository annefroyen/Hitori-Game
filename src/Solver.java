
public class Solver {

	private boolean sandwichPair;
	private boolean adjacentTriplets;
	private boolean shading;

	public boolean isSandwichPair() {
		return sandwichPair;
	}

	public void setSandwichPair(boolean sandwichPair) {
		this.sandwichPair = sandwichPair;
	}
	
	public boolean isAdjacentTriplets() {
		return adjacentTriplets;
	}

	public void setAdjacentTriplets(boolean adjacentTriplets) {
		this.adjacentTriplets = adjacentTriplets;
	}
	
	public boolean isShading() {
		return shading;
	}

	public void setShading(boolean shading) {
		this.shading = shading;
	}

	public Solver() {
		this.sandwichPair = false;
		this.adjacentTriplets =false;
		this.shading = false;
	}

//start methods
	
    //funker
	public static void adjacentTriplets(Board board) {

		Square[][] squares = board.getSquares();
		for (int r = 0; r < board.getSize(); r++) {
			for (int c = 0; c < board.getSize() - 2; c++) {

				int oneRow = squares[r][c].getNumber();
				int twoRow = squares[r][c + 1].getNumber();
				int threeRow = squares[r][c + 2].getNumber();

				if (oneRow == twoRow && twoRow == threeRow) {
					squares[r][c] = new Square(oneRow, ColourEnum.BLACK);
					squares[r][c + 2] = new Square(threeRow, ColourEnum.BLACK);
				}

				int oneColumn = squares[c][r].getNumber();
				int twoColumn = squares[c + 1][r].getNumber();
				int threeColumn = squares[c + 2][r].getNumber();

				if (oneColumn == twoColumn && twoColumn == threeColumn) {
					squares[c][r] = new Square(oneColumn, ColourEnum.BLACK);
					squares[c + 2][r] = new Square(threeColumn, ColourEnum.BLACK);
				}
			}
		}
		board.setSquares(squares);
	}

	//funker
	public static void sandwichPair(Board board) {

		Square[][] squares = board.getSquares();
		for (int r = 0; r < board.getSize(); r++) {
			for (int c = 0; c < board.getSize() - 2; c++) {

				int oneRow = squares[r][c].getNumber();
				int twoRow = squares[r][c + 1].getNumber();
				int threeRow = squares[r][c + 2].getNumber();

				if (oneRow == threeRow) {
					squares[r][c + 1] = new Square(twoRow, ColourEnum.COLOURED);
				}

				int oneColumn = squares[c][r].getNumber();
				int twoColumn = squares[c + 1][r].getNumber();
				int threeColumn = squares[c + 2][r].getNumber();

				if (oneColumn == threeColumn) {
					squares[c + 1][r] = new Square(twoColumn, ColourEnum.COLOURED);
				}
			}
		}
		board.setSquares(squares);

	}
	
	//todo
//to do
	public static void pairInduction(Board board) {
	}
	
	
//main methods
	
	//funker

	public static void sggg(Board board) {

		int blackedNumber;
		Square[][] squares = board.getSquares();
		for (int c = 0; c < squares.length; c++) {

			for (int r = 0; r < squares.length - 2; r++) {

				// finn ein svart
				if (squares[c][r].getColour() == ColourEnum.BLACK) {
					blackedNumber = squares[c][r].getNumber();
					// sjekk om resten av rekka har samme nummer som svart
					if (blackedNumber == squares[c][r].getNumber()) {

					}
				}

				int oneColumn = squares[c][r].getNumber();
				int twoColumn = squares[c][r + 1].getNumber();
				int threeColumn = squares[c][r + 2].getNumber();

				int oneRow = squares[r][c].getNumber();
				int twoRow = squares[r + 1][c].getNumber();
				int threeRow = squares[r + 2][c].getNumber();

				// System.out.println("Column: " + oneColumn );
				// System.out.println("Row: " + oneRow);

				if (oneRow == twoRow && twoRow == threeRow) {
					// System.out.println("Tre like på rader!!");
					squares[r][c].setColour(ColourEnum.BLACK);
					squares[r + 2][c].setColour(ColourEnum.BLACK);

				}
				if (oneColumn == twoColumn && twoColumn == threeColumn) {
					// System.out.println("Tre like på kolonner!!");
					squares[c][r].setColour(ColourEnum.BLACK);
					squares[c][r + 2].setColour(ColourEnum.BLACK);

				}
			}
		}

	}

	public static void shading(Board board) {
		Square[][] squares = board.getSquares();
		for (int r = 0; r < board.getSize(); r++) {
			for (int c = 0; c < board.getSize(); c++) {

				
				
				
				// row
				Square currentSquareRow = squares[r][c];

				for (int i = 0; i < board.getSize(); i++) {

					Square searchSquareRow = squares[r][i];

					if (currentSquareRow.getColour() == ColourEnum.COLOURED && 
							currentSquareRow.getNumber() == searchSquareRow.getNumber() &&
							currentSquareRow != searchSquareRow) {
						squares[r][i] = new Square(squares[r][i].getNumber(), ColourEnum.BLACK);
					}

				}
			
				
			
				Square currentSquareColumn = squares[c][r];

				for (int i = 0; i < board.getSize(); i++) {

					Square searchSquareColumn = squares[i][r];

					if (currentSquareColumn.getColour() == ColourEnum.COLOURED && 
							currentSquareColumn.getNumber() == searchSquareColumn.getNumber() && 
							currentSquareColumn != searchSquareColumn) {
						squares[i][r] = new Square(squares[i][r].getNumber(), ColourEnum.BLACK);
					}

				}
				
				
			}

		}
		board.setSquares(squares);
	}

	//todo
	public static void unshading() {

	}





}
