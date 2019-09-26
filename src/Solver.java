import java.util.ArrayList;

public class Solver {

	private boolean sandwichPair;
	private boolean adjacentTriplets;
	private boolean pairInduction;
	private boolean doubleCorner;
	private boolean impossiblePair;
	private boolean shading;
	private boolean unshading;
	private boolean shadingAndUnshading;
	private boolean cornerClose;
	private boolean edgeClose;
	private boolean quadMiddle;
	private boolean cornerTechniques;
	private boolean advancedTechniqueOne;
	private boolean advancedTechniqueTwo;
	private boolean advancedTechniqueThree;

	private boolean shadingAndUnshadingAgain;
	private boolean cornerCloseAgain;
	private boolean edgeCloseAgain;
	private boolean quadMiddleAgain;
	private boolean cornerTechniquesAgain;
	private boolean advancedTechniqueOneAgain;
	private boolean advancedTechniqueTwoAgain;
	private boolean advancedTechniqueThreeAgain;

	private String solution;

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

	public boolean isPairInduction() {
		return pairInduction;
	}

	public void setPairInduction(boolean pairInduction) {

		this.pairInduction = pairInduction;
	}

	public boolean isDoubleCorner() {
		return doubleCorner;
	}

	public void setDoubleCorner(boolean doubleCorner) {
		this.doubleCorner = doubleCorner;
	}

	public boolean isImpossiblePair() {
		return impossiblePair;
	}

	public void setImpossiblePair(boolean impossiblePair) {
		this.impossiblePair = impossiblePair;
	}

	public boolean isShading() {
		return shading;
	}

	public void setShading(boolean shading) {
		this.shading = shading;
	}

	public boolean isUnshading() {
		return unshading;
	}

	public void setUnshading(boolean unshading) {
		this.unshading = unshading;
	}

	public boolean isShadingAndUnshading() {
		return shadingAndUnshading;
	}

	public void setShadingAndUnshading(boolean shadingAndUnshading) {
		this.shadingAndUnshading = shadingAndUnshading;
	}

	public boolean isCornerClose() {
		return cornerClose;
	}

	public void setCornerClose(boolean cornerClose) {
		this.cornerClose = cornerClose;
	}

	public boolean isEdgeClose() {
		return edgeClose;
	}

	public void setEdgeClose(boolean edgeClose) {
		this.edgeClose = edgeClose;
	}

	public boolean isQuadMiddle() {
		return quadMiddle;
	}

	public void setQuadMiddle(boolean quadMiddle) {
		this.quadMiddle = quadMiddle;
	}

	public boolean isCornerTechniques() {
		return cornerTechniques;
	}

	public void setCornerTechniques(boolean cornerTechniques) {
		this.cornerTechniques = cornerTechniques;
	}

	public boolean isAdvancedTechniqueOne() {
		return advancedTechniqueOne;
	}

	public void setAdvancedTechniqueOne(boolean advancedTechniqueOne) {
		this.advancedTechniqueOne = advancedTechniqueOne;
	}

	public boolean isAdvancedTechniqueTwo() {
		return advancedTechniqueTwo;
	}

	public void setAdvancedTechniqueTwo(boolean advancedTechniqueTwo) {
		this.advancedTechniqueTwo = advancedTechniqueTwo;
	}

	public boolean isAdvancedTechniqueThree() {
		return advancedTechniqueThree;
	}

	public void setAdvancedTechniqueThree(boolean advancedTechniqueThree) {
		this.advancedTechniqueThree = advancedTechniqueThree;
	}

	public boolean isShadingAndUnshadingAgain() {
		return shadingAndUnshadingAgain;
	}

	public void setShadingAndUnshadingAgain(boolean shadingAndUnshadingAgain) {
		this.shadingAndUnshadingAgain = shadingAndUnshadingAgain;
	}

	public boolean isCornerCloseAgain() {
		return cornerCloseAgain;
	}

	public void setCornerCloseAgain(boolean cornerCloseAgain) {
		this.cornerCloseAgain = cornerCloseAgain;
	}

	public boolean isEdgeCloseAgain() {
		return edgeCloseAgain;
	}

	public void setEdgeCloseAgain(boolean edgeCloseAgain) {
		this.edgeCloseAgain = edgeCloseAgain;
	}

	public boolean isQuadMiddleAgain() {
		return quadMiddleAgain;
	}

	public void setQuadMiddleAgain(boolean quadMiddleAgain) {
		this.quadMiddleAgain = quadMiddleAgain;
	}

	public boolean isCornerTechniquesAgain() {
		return cornerTechniquesAgain;
	}

	public void setCornerTechniquesAgain(boolean cornerTechniquesAgain) {
		this.cornerTechniquesAgain = cornerTechniquesAgain;
	}

	public boolean isAdvancedTechniqueOneAgain() {
		return advancedTechniqueOneAgain;
	}

	public void setAdvancedTechniqueOneAgain(boolean advancedTechniqueOneAgain) {
		this.advancedTechniqueOneAgain = advancedTechniqueOneAgain;
	}

	public boolean isAdvancedTechniqueTwoAgain() {
		return advancedTechniqueTwoAgain;
	}

	public void setAdvancedTechniqueTwoAgain(boolean advancedTechniqueTwoAgain) {
		this.advancedTechniqueTwoAgain = advancedTechniqueTwoAgain;
	}

	public boolean isAdvancedTechniqueThreeAgain() {
		return advancedTechniqueThreeAgain;
	}

	public void setAdvancedTechniqueThreeAgain(boolean advancedTechniqueThreeAgain) {
		this.advancedTechniqueThreeAgain = advancedTechniqueThreeAgain;
	}

	public String getSolution() {
		return solution;
	}

	public void setSolution(String solution) {
		this.solution = solution;
	}

	public Solver() {
		this.sandwichPair = false;
		this.adjacentTriplets = false;
		this.pairInduction = false;
		this.doubleCorner = false;
		this.impossiblePair = false;
		this.shading = false;
		this.unshading = false;
		this.shadingAndUnshading = false;
		this.cornerClose = false;
		this.edgeClose = false;
		this.quadMiddle = false;
		this.cornerTechniques = false;
		this.advancedTechniqueOne = false;
		this.advancedTechniqueTwo = false;
		this.advancedTechniqueThree = false;
		this.shadingAndUnshadingAgain = false;
		this.solution = " ";
	}

	// start methods

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

	public static void pairInduction(Board board) {

		Square[][] squares = board.getSquares();
		for (int r = 0; r < board.getSize(); r++) {
			for (int c = 0; c < board.getSize(); c++) {

				// row
			  Square currentRow = squares[r][c];

				for (int i = 0; i < board.getSize()-1; i++) {

					Square searchOne = squares[r][i];
					Square searchTwo = squares[r][i+1];

					if (currentRow.getNumber() == searchOne.getNumber() && searchOne.getNumber() == searchTwo.getNumber() && searchOne != currentRow && searchTwo != currentRow) {
						squares[r][c] = new Square(squares[r][c].getNumber(), ColourEnum.BLACK);
					
					}

				}

				Square currentColumn = squares[c][r];

				for (int i = 0; i < board.getSize()-1; i++) {

					
					Square searchOne = squares[i][r];
					Square searchTwo = squares[i+1][r];

					if (currentColumn.getNumber() == searchOne.getNumber() && searchOne.getNumber() == searchTwo.getNumber() && searchOne != currentColumn && searchTwo != currentColumn) {
						squares[c][r] = new Square(squares[c][r].getNumber(), ColourEnum.BLACK);
					
					}

				}

			}
		}
		board.setSquares(squares);

	}

	public static void doubleCorner(Board board) {
		Square[][] squares = board.getSquares();
		int s = board.getSize();

		// top left corner
		if (squares[0][0].getNumber() == squares[0][1].getNumber()) {
			squares[1][0] = new Square(squares[1][0].getNumber(), ColourEnum.COLOURED);
		} else if (squares[0][0].getNumber() == squares[1][0].getNumber()) {
			squares[0][1] = new Square(squares[0][1].getNumber(), ColourEnum.COLOURED);
		} else if (squares[1][0].getNumber() == squares[1][1].getNumber()) {
			squares[0][1] = new Square(squares[0][1].getNumber(), ColourEnum.COLOURED);
		} else if (squares[0][1].getNumber() == squares[1][1].getNumber()) {
			squares[1][0] = new Square(squares[1][0].getNumber(), ColourEnum.COLOURED);
		}

		// top right corner
		if (squares[0][s - 2].getNumber() == squares[0][s - 1].getNumber()) {
			squares[1][s - 1] = new Square(squares[1][s - 1].getNumber(), ColourEnum.COLOURED);
		} else if (squares[0][s - 1].getNumber() == squares[1][s - 1].getNumber()) {
			squares[0][s - 2] = new Square(squares[0][s - 2].getNumber(), ColourEnum.COLOURED);
		} else if (squares[1][s - 2].getNumber() == squares[1][s - 1].getNumber()) {
			squares[0][s - 2] = new Square(squares[0][s - 2].getNumber(), ColourEnum.COLOURED);
		} else if (squares[0][s - 2].getNumber() == squares[1][s - 2].getNumber()) {
			squares[1][s - 1] = new Square(squares[1][s - 1].getNumber(), ColourEnum.COLOURED);
		}

		// bottom left corner
		if (squares[s - 1][0].getNumber() == squares[s - 1][1].getNumber()) {
			squares[s - 2][0] = new Square(squares[s - 2][0].getNumber(), ColourEnum.COLOURED);
		} else if (squares[s - 2][0].getNumber() == squares[s - 1][0].getNumber()) {
			squares[s - 1][1] = new Square(squares[s - 1][1].getNumber(), ColourEnum.COLOURED);
		} else if (squares[s - 2][0].getNumber() == squares[s - 2][1].getNumber()) {
			squares[s - 1][1] = new Square(squares[s - 1][1].getNumber(), ColourEnum.COLOURED);
		} else if (squares[s - 2][1].getNumber() == squares[s - 1][1].getNumber()) {
			squares[s - 2][0] = new Square(squares[s - 2][0].getNumber(), ColourEnum.COLOURED);
		}

		// bottom right corner
		if (squares[s - 2][s - 1].getNumber() == squares[s - 1][s - 1].getNumber()) {
			squares[s - 1][s - 2] = new Square(squares[s - 1][s - 2].getNumber(), ColourEnum.COLOURED);
		} else if (squares[s - 1][s - 2].getNumber() == squares[s - 1][s - 1].getNumber()) {
			squares[s - 2][s - 1] = new Square(squares[s - 2][s - 1].getNumber(), ColourEnum.COLOURED);
		} else if (squares[s - 2][s - 2].getNumber() == squares[s - 1][s - 2].getNumber()) {
			squares[s - 2][s - 1] = new Square(squares[s - 2][s - 1].getNumber(), ColourEnum.COLOURED);
		} else if (squares[s - 2][s - 2].getNumber() == squares[s - 2][s - 1].getNumber()) {
			squares[s - 1][s - 2] = new Square(squares[s - 1][s - 2].getNumber(), ColourEnum.COLOURED);
		}

		board.setSquares(squares);

	}

	public static void impossiblePair(Board board) {
		Square[][] squares = board.getSquares();
		for (int r = 0; r < board.getSize() - 1; r++) {
			for (int c = 0; c < board.getSize() - 1; c++) {

				// row
				Square currentSquareRow1 = squares[r][c];
				Square currentSquareRow2 = squares[r + 1][c];

				for (int i = 0; i < board.getSize() - 1; i++) {

					Square searchSquareRow1 = squares[r][i + 1];
					Square searchSquareRow2 = squares[r + 1][i];

					Square searchSquareRow1B = squares[r][i];
					Square searchSquareRow2B = squares[r + 1][i + 1];

					if (currentSquareRow1 != searchSquareRow1 && currentSquareRow2 != searchSquareRow2
							&& currentSquareRow1.getNumber() == searchSquareRow1.getNumber()
							&& currentSquareRow2.getNumber() == searchSquareRow2.getNumber()) {
						squares[r][i] = new Square(squares[r][i].getNumber(), ColourEnum.COLOURED);
						squares[r + 1][i + 1] = new Square(squares[r + 1][i + 1].getNumber(), ColourEnum.COLOURED);
					} else if (currentSquareRow1 != searchSquareRow1B && currentSquareRow2 != searchSquareRow2B
							&& currentSquareRow1.getNumber() == searchSquareRow1B.getNumber()
							&& currentSquareRow2.getNumber() == searchSquareRow2B.getNumber()) {
						squares[r][i + 1] = new Square(squares[r][i + 1].getNumber(), ColourEnum.COLOURED);
						squares[r + 1][i] = new Square(squares[r + 1][i].getNumber(), ColourEnum.COLOURED);

					}

				}

				Square currentSquareColumn1 = squares[c][r];
				Square currentSquareColumn2 = squares[c][r + 1];

				for (int i = 0; i < board.getSize() - 1; i++) {

					Square searchSquareColumn1 = squares[i + 1][r];
					Square searchSquareColumn2 = squares[i][r + 1];

					Square searchSquareColumn1B = squares[i][r];
					Square searchSquareColumn2B = squares[i + 1][r + 1];

					if (currentSquareColumn1 != searchSquareColumn1 && currentSquareColumn2 != searchSquareColumn2
							&& currentSquareColumn1.getNumber() == searchSquareColumn1.getNumber()
							&& currentSquareColumn2.getNumber() == searchSquareColumn2.getNumber()) {
						squares[i][r] = new Square(squares[i][r].getNumber(), ColourEnum.COLOURED);
						squares[i + 1][r + 1] = new Square(squares[i + 1][r + 1].getNumber(), ColourEnum.COLOURED);

					} else if (currentSquareColumn1 != searchSquareColumn1B
							&& currentSquareColumn2 != searchSquareColumn2B
							&& currentSquareColumn1.getNumber() == searchSquareColumn1B.getNumber()
							&& currentSquareColumn2.getNumber() == searchSquareColumn2B.getNumber()) {
						squares[i + 1][r] = new Square(squares[i + 1][r].getNumber(), ColourEnum.COLOURED);
						squares[i][r + 1] = new Square(squares[i][r + 1].getNumber(), ColourEnum.COLOURED);

					}

				}

			}
		}
		board.setSquares(squares);
	}

	// shading and unshading

	public static boolean shading(Board board) {

		boolean runs = false;
		Square[][] squares = board.getSquares();
		for (int r = 0; r < board.getSize(); r++) {
			for (int c = 0; c < board.getSize(); c++) {

				// row
				Square currentSquareRow = squares[r][c];

				for (int i = 0; i < board.getSize(); i++) {

					Square searchSquareRow = squares[r][i];

					if (currentSquareRow.getColour() == ColourEnum.COLOURED
							&& currentSquareRow.getNumber() == searchSquareRow.getNumber()
							&& currentSquareRow != searchSquareRow && searchSquareRow.getColour() == ColourEnum.WHITE) {
						squares[r][i] = new Square(squares[r][i].getNumber(), ColourEnum.BLACK);
						runs = true;
					}

				}

				Square currentSquareColumn = squares[c][r];

				for (int i = 0; i < board.getSize(); i++) {

					Square searchSquareColumn = squares[i][r];

					if (currentSquareColumn.getColour() == ColourEnum.COLOURED
							&& currentSquareColumn.getNumber() == searchSquareColumn.getNumber()
							&& currentSquareColumn != searchSquareColumn
							&& searchSquareColumn.getColour() == ColourEnum.WHITE) {
						squares[i][r] = new Square(squares[i][r].getNumber(), ColourEnum.BLACK);
						runs = true;
					}

				}

			}

		}
		board.setSquares(squares);
		System.out.println("shading: runs:" + runs);
		return runs;

		// setShading(true);
	}

	public static boolean unshading(Board board) {

		// fargelegg ruter rundt svarte ruter
		boolean runs = false;
		Square[][] squares = board.getSquares();
		for (int r = 0; r < board.getSize(); r++) {
			for (int c = 0; c < board.getSize(); c++) {

				ColourEnum shadedSquare = squares[r][c].getColour();

				if (shadedSquare == ColourEnum.BLACK) {

					if (r >= 1 && squares[r - 1][c].getColour() == ColourEnum.WHITE) {
						squares[r - 1][c] = new Square(squares[r - 1][c].getNumber(), ColourEnum.COLOURED);
						runs = true;
					}
					if (c >= 1 && squares[r][c - 1].getColour() == ColourEnum.WHITE) {
						squares[r][c - 1] = new Square(squares[r][c - 1].getNumber(), ColourEnum.COLOURED);
						runs = true;

					}
					if (c <= (board.getSize() - 2) && squares[r][c + 1].getColour() == ColourEnum.WHITE) {
						squares[r][c + 1] = new Square(squares[r][c + 1].getNumber(), ColourEnum.COLOURED);
						runs = true;

					}
					if (r <= (board.getSize() - 2) && squares[r + 1][c].getColour() == ColourEnum.WHITE) {
						squares[r + 1][c] = new Square(squares[r + 1][c].getNumber(), ColourEnum.COLOURED);
						runs = true;
					}
				}

			}

		}
		board.setSquares(squares);
		System.out.println("unshading: runs:" + runs);
		return runs;

	}

	public static void shadingAndUnshading(Board board) {

		while (Solver.shading(board) || Solver.unshading(board)) {
			Solver.shading(board);
			Solver.unshading(board);
			System.out.println("loop");
		}

	}

	// avoiding isolation

	public static void cornerClose(Board board) {

		Square[][] squares = board.getSquares();
		int s = board.getSize();

		// top left corner
		if (squares[0][1].getColour() == ColourEnum.BLACK) {
			squares[1][0] = new Square(squares[1][0].getNumber(), ColourEnum.COLOURED);
		}

		if (squares[1][0].getColour() == ColourEnum.BLACK) {
			squares[0][1] = new Square(squares[0][1].getNumber(), ColourEnum.COLOURED);
		}

		// top right corner

		if (squares[0][s - 2].getColour() == ColourEnum.BLACK) {
			squares[1][s - 1] = new Square(squares[1][s - 1].getNumber(), ColourEnum.COLOURED);
		}

		if (squares[1][s - 1].getColour() == ColourEnum.BLACK) {
			squares[0][s - 2] = new Square(squares[0][s - 2].getNumber(), ColourEnum.COLOURED);
		}

		// bottom left corner

		if (squares[s - 2][0].getColour() == ColourEnum.BLACK) {
			squares[s - 1][1] = new Square(squares[s - 1][1].getNumber(), ColourEnum.COLOURED);
		}

		if (squares[s - 1][1].getColour() == ColourEnum.BLACK) {
			squares[s - 2][0] = new Square(squares[s - 2][0].getNumber(), ColourEnum.COLOURED);
		}

		// bottom right corner

		if (squares[s - 2][s - 1].getColour() == ColourEnum.BLACK) {
			squares[s - 1][s - 2] = new Square(squares[s - 1][s - 2].getNumber(), ColourEnum.COLOURED);
		}

		if (squares[s - 1][s - 2].getColour() == ColourEnum.BLACK) {
			squares[s - 2][s - 1] = new Square(squares[s - 2][s - 1].getNumber(), ColourEnum.COLOURED);
		}

		board.setSquares(squares);

	}

	public static void edgeClose(Board board) {
		Square[][] squares = board.getSquares();
		int s = board.getSize();
		for (int c = 0; c < board.getSize() - 2; c++) {

			// top rown
			ColourEnum first_Top = squares[0][c].getColour();
			ColourEnum second_SecondTop = squares[1][c + 1].getColour();
			ColourEnum third_Top = squares[0][c + 2].getColour();

			if (first_Top == ColourEnum.BLACK && third_Top == ColourEnum.BLACK) {
				squares[1][c + 1] = new Square(squares[1][c + 1].getNumber(), ColourEnum.COLOURED);
			} else if (first_Top == ColourEnum.BLACK && second_SecondTop == ColourEnum.BLACK) {
				squares[0][c + 2] = new Square(squares[0][c + 2].getNumber(), ColourEnum.COLOURED);
			} else if (second_SecondTop == ColourEnum.BLACK && third_Top == ColourEnum.BLACK) {
				squares[0][c] = new Square(squares[0][c].getNumber(), ColourEnum.COLOURED);
			}

			// bottom row
			ColourEnum first_Bottom = squares[s - 1][c].getColour();
			ColourEnum second_SecondBottom = squares[s - 2][c + 1].getColour();
			ColourEnum third_Bottom = squares[s - 1][c + 2].getColour();

			if (first_Bottom == ColourEnum.BLACK && third_Bottom == ColourEnum.BLACK) {
				squares[s - 2][c + 1] = new Square(squares[s - 2][c + 1].getNumber(), ColourEnum.COLOURED);
			} else if (first_Bottom == ColourEnum.BLACK && second_SecondBottom == ColourEnum.BLACK) {
				squares[s - 1][c + 2] = new Square(squares[s - 1][c + 2].getNumber(), ColourEnum.COLOURED);
			} else if (second_SecondBottom == ColourEnum.BLACK && third_Bottom == ColourEnum.BLACK) {
				squares[s - 1][c] = new Square(squares[s - 1][c].getNumber(), ColourEnum.COLOURED);
			}

			// left column

			ColourEnum first_Left = squares[c][0].getColour();
			ColourEnum second_SecondLeft = squares[c + 1][1].getColour();
			ColourEnum third_Left = squares[c + 2][0].getColour();

			if (first_Left == ColourEnum.BLACK && third_Left == ColourEnum.BLACK) {
				squares[c + 1][1] = new Square(squares[c + 1][1].getNumber(), ColourEnum.COLOURED);
			} else if (first_Left == ColourEnum.BLACK && second_SecondLeft == ColourEnum.BLACK) {
				squares[c + 2][0] = new Square(squares[c + 2][0].getNumber(), ColourEnum.COLOURED);
			} else if (second_SecondLeft == ColourEnum.BLACK && third_Left == ColourEnum.BLACK) {
				squares[c][0] = new Square(squares[c][0].getNumber(), ColourEnum.COLOURED);
			}

			// right column
			ColourEnum first_Right = squares[c][s - 1].getColour();
			ColourEnum second_SecondRight = squares[c + 1][s - 2].getColour();
			ColourEnum third_Right = squares[c + 2][s - 1].getColour();

			if (first_Right == ColourEnum.BLACK && third_Right == ColourEnum.BLACK) {
				squares[c + 1][s - 2] = new Square(squares[c + 1][s - 2].getNumber(), ColourEnum.COLOURED);
			} else if (first_Right == ColourEnum.BLACK && second_SecondRight == ColourEnum.BLACK) {
				squares[c + 2][s - 1] = new Square(squares[c + 2][s - 1].getNumber(), ColourEnum.COLOURED);
			} else if (second_SecondRight == ColourEnum.BLACK && third_Right == ColourEnum.BLACK) {
				squares[c][s - 1] = new Square(squares[c][s - 1].getNumber(), ColourEnum.COLOURED);
			}

		}

		board.setSquares(squares);

	}

	public static void quadMiddle(Board board) {

		


		Square[][] squares = board.getSquares();
		for (int r = 0; r < board.getSize() - 2; r++) {
			for (int c = 0; c < board.getSize() - 2; c++) {

				ColourEnum oneB = squares[r][c + 1].getColour();
				ColourEnum twoA = squares[r + 1][c].getColour();
				ColourEnum twoC = squares[r + 1][c + 2].getColour();
				ColourEnum threeB = squares[r + 2][c + 1].getColour();

				if (oneB == ColourEnum.BLACK && twoA == ColourEnum.BLACK && threeB == ColourEnum.BLACK) {
					squares[r + 1][c + 2] = new Square(squares[r + 1][c + 2].getNumber(), ColourEnum.COLOURED);

				} else if (oneB == ColourEnum.BLACK && twoA == ColourEnum.BLACK && twoC == ColourEnum.BLACK) {
					squares[r + 2][c + 1] = new Square(squares[r + 2][c + 1].getNumber(), ColourEnum.COLOURED);

				} else if (oneB == ColourEnum.BLACK && twoC == ColourEnum.BLACK && threeB == ColourEnum.BLACK) {
					squares[r + 1][c] = new Square(squares[r + 1][c].getNumber(), ColourEnum.COLOURED);

				} else if (twoA == ColourEnum.BLACK && twoC == ColourEnum.BLACK && threeB == ColourEnum.BLACK) {
					squares[r][c + 1] = new Square(squares[r][c + 1].getNumber(), ColourEnum.COLOURED);

				}

			}
		}
		board.setSquares(squares);

	}

	
	
	
	
	
	
	
	
	
	
	
	
	
    
	
	public static void middleClose(Board board) {

		Square[][] squares = board.getSquares();

		int s = board.getSize();
		

		for (int r = 0; r < board.getSize(); r++) {
			for (int c = 0; c < board.getSize(); c++) {

				// top column
				ColourEnum squareFromTop = squares[r][c].getColour();

				if (squareFromTop == ColourEnum.BLACK && r < (s - 1)) {

					ArrayList<Square> shadedChain = new ArrayList<Square>();

					if (c == 0 && squares[r + 1][c + 1].getColour() == ColourEnum.BLACK) {
						shadedChain.add(squares[r + 1][c + 1]);
					}

					if (0 < c && c < (s - 1) && squares[r + 1][c + 1].getColour() == ColourEnum.BLACK) {
						shadedChain.add(squares[r + 1][c + 1]);

					} else if (0 < c && c < (s - 1) && squares[r + 1][c - 1].getColour() == ColourEnum.BLACK) {
						shadedChain.add(squares[r + 1][c - 1]);
					}

					if (c == (s - 1) && squares[r + 1][c - 1].getColour() == ColourEnum.WHITE) {
						shadedChain.add(squares[r + 1][c - 1]);
					}

				}

				/*
				 * // bottom column ColourEnum squareBottom = squares[s - 1][i].getColour();
				 * 
				 * if (squareBottom == ColourEnum.BLACK) {
				 * 
				 * }
				 * 
				 * // left row ColourEnum squareLeft = squares[i][0].getColour();
				 * 
				 * if (squareLeft == ColourEnum.BLACK) {
				 * 
				 * }
				 * 
				 * // right row ColourEnum squareRight = squares[i][s - 1].getColour();
				 * 
				 * if (squareRight == ColourEnum.BLACK) {
				 * 
				 * }
				 */

			}
		}

	}

	// advanced techniques

	public static void cornerTechniques(Board board) {

		Square[][] squares = board.getSquares();
		int s = board.getSize();

		// top left corner
		if (squares[0][0].getNumber() == squares[0][1].getNumber()
				&& squares[0][0].getNumber() == squares[1][0].getNumber()) {
			squares[0][0] = new Square(squares[0][0].getNumber(), ColourEnum.BLACK);
			squares[0][1] = new Square(squares[0][1].getNumber(), ColourEnum.COLOURED);
			squares[1][0] = new Square(squares[1][0].getNumber(), ColourEnum.COLOURED);
		} else if (squares[0][0].getNumber() == squares[1][0].getNumber()
				&& squares[0][1].getNumber() == squares[1][1].getNumber()) {
			squares[0][0] = new Square(squares[0][0].getNumber(), ColourEnum.BLACK);
			squares[1][0] = new Square(squares[1][0].getNumber(), ColourEnum.COLOURED);
			squares[0][1] = new Square(squares[0][1].getNumber(), ColourEnum.COLOURED);
			squares[1][1] = new Square(squares[1][1].getNumber(), ColourEnum.BLACK);
		} else if (squares[0][1].getNumber() == squares[1][1].getNumber()
				&& squares[1][0].getNumber() == squares[1][1].getNumber()) {
			squares[1][0] = new Square(squares[1][0].getNumber(), ColourEnum.COLOURED);
			squares[0][1] = new Square(squares[0][1].getNumber(), ColourEnum.COLOURED);
			squares[1][1] = new Square(squares[1][1].getNumber(), ColourEnum.BLACK);
		}

		// top right corner
		if (squares[0][s - 1].getNumber() == squares[0][s - 2].getNumber()
				&& squares[0][s - 1].getNumber() == squares[1][s - 1].getNumber()) {
			squares[0][s - 1] = new Square(squares[0][s - 1].getNumber(), ColourEnum.BLACK);
			squares[0][s - 2] = new Square(squares[0][s - 2].getNumber(), ColourEnum.COLOURED);
			squares[1][s - 1] = new Square(squares[1][s - 1].getNumber(), ColourEnum.COLOURED);
		} else if (squares[0][s - 1].getNumber() == squares[1][s - 1].getNumber()
				&& squares[0][s - 2].getNumber() == squares[1][s - 2].getNumber()) {
			squares[0][s - 1] = new Square(squares[0][s - 1].getNumber(), ColourEnum.BLACK);
			squares[1][s - 1] = new Square(squares[1][s - 1].getNumber(), ColourEnum.COLOURED);
			squares[0][s - 2] = new Square(squares[0][s - 2].getNumber(), ColourEnum.COLOURED);
			squares[1][s - 2] = new Square(squares[1][s - 2].getNumber(), ColourEnum.BLACK);
		} else if (squares[0][s - 2].getNumber() == squares[1][s - 2].getNumber()
				&& squares[1][s - 2].getNumber() == squares[1][s - 1].getNumber()) {
			squares[1][s - 1] = new Square(squares[1][s - 1].getNumber(), ColourEnum.COLOURED);
			squares[0][s - 2] = new Square(squares[0][s - 1].getNumber(), ColourEnum.COLOURED);
			squares[1][s - 2] = new Square(squares[1][s - 2].getNumber(), ColourEnum.BLACK);
		}

		// bottom left corner
		if (squares[s - 1][0].getNumber() == squares[s - 1][1].getNumber()
				&& squares[s - 1][0].getNumber() == squares[s - 2][0].getNumber()) {
			squares[s - 1][0] = new Square(squares[s - 1][0].getNumber(), ColourEnum.BLACK);
			squares[s - 1][1] = new Square(squares[s - 1][1].getNumber(), ColourEnum.COLOURED);
			squares[s - 2][0] = new Square(squares[s - 2][0].getNumber(), ColourEnum.COLOURED);
		} else if (squares[s - 1][0].getNumber() == squares[s - 2][0].getNumber()
				&& squares[s - 1][1].getNumber() == squares[s - 2][1].getNumber()) {
			squares[s - 1][0] = new Square(squares[s - 1][0].getNumber(), ColourEnum.BLACK);
			squares[s - 2][0] = new Square(squares[s - 2][0].getNumber(), ColourEnum.COLOURED);
			squares[s - 1][1] = new Square(squares[s - 1][1].getNumber(), ColourEnum.COLOURED);
			squares[s - 2][1] = new Square(squares[s - 2][2].getNumber(), ColourEnum.BLACK);
		} else if (squares[s - 2][0].getNumber() == squares[s - 2][1].getNumber()
				&& squares[s - 2][1].getNumber() == squares[s - 1][1].getNumber()) {
			squares[s - 2][0] = new Square(squares[s - 2][0].getNumber(), ColourEnum.COLOURED);
			squares[s - 1][1] = new Square(squares[s - 1][1].getNumber(), ColourEnum.COLOURED);
			squares[s - 2][1] = new Square(squares[s - 2][2].getNumber(), ColourEnum.BLACK);
		}

		// bottom right corner
		if (squares[s - 1][s - 1].getNumber() == squares[s - 1][s - 2].getNumber()
				&& squares[s - 1][s - 1].getNumber() == squares[s - 2][s - 1].getNumber()) {
			squares[s - 1][s - 1] = new Square(squares[s - 1][s - 1].getNumber(), ColourEnum.BLACK);
			squares[s - 1][s - 2] = new Square(squares[s - 1][s - 2].getNumber(), ColourEnum.COLOURED);
			squares[s - 2][s - 1] = new Square(squares[s - 2][s - 1].getNumber(), ColourEnum.COLOURED);
		} else if (squares[s - 1][s - 1].getNumber() == squares[s - 2][s - 1].getNumber()
				&& squares[s - 1][s - 2].getNumber() == squares[s - 2][s - 2].getNumber()) {
			squares[s - 1][s - 1] = new Square(squares[s - 1][s - 1].getNumber(), ColourEnum.BLACK);
			squares[s - 2][s - 1] = new Square(squares[s - 2][s - 1].getNumber(), ColourEnum.COLOURED);
			squares[s - 1][s - 2] = new Square(squares[s - 1][s - 2].getNumber(), ColourEnum.COLOURED);
			squares[s - 2][s - 2] = new Square(squares[s - 2][s - 2].getNumber(), ColourEnum.BLACK);
		} else if (squares[s - 2][s - 1].getNumber() == squares[s - 2][s - 2].getNumber()
				&& squares[s - 2][s - 2].getNumber() == squares[s - 1][s - 2].getNumber()) {
			squares[s - 2][s - 1] = new Square(squares[s - 2][s - 1].getNumber(), ColourEnum.COLOURED);
			squares[s - 1][s - 2] = new Square(squares[s - 1][s - 2].getNumber(), ColourEnum.COLOURED);
			squares[s - 2][s - 2] = new Square(squares[s - 2][s - 2].getNumber(), ColourEnum.BLACK);

		}

		board.setSquares(squares);
	}

	public static void advancedTechniqueOne(Board board) {

		Square[][] squares = board.getSquares();
		int s = board.getSize();

		// top left corner
		if (squares[1][1].getColour() == ColourEnum.BLACK && squares[0][0].getNumber() == squares[2][0].getNumber()
				&& squares[2][0].getNumber() == squares[0][2].getNumber()) {
			squares[0][0] = new Square(squares[0][0].getNumber(), ColourEnum.BLACK);
		}

		// top right corner
		if (squares[1][s - 2].getColour() == ColourEnum.BLACK
				&& squares[0][s - 3].getNumber() == squares[0][s - 1].getNumber()
				&& squares[0][s - 1].getNumber() == squares[2][s - 1].getNumber()) {
			squares[0][s - 1] = new Square(squares[0][s - 1].getNumber(), ColourEnum.BLACK);
		}

		// bottom left corner
		if (squares[s - 2][1].getColour() == ColourEnum.BLACK
				&& squares[s - 3][0].getNumber() == squares[s - 1][0].getNumber()
				&& squares[s - 1][0].getNumber() == squares[s - 1][2].getNumber()) {
			squares[s - 1][0] = new Square(squares[s - 1][0].getNumber(), ColourEnum.BLACK);
		}
		// bottom right corner
		if (squares[s - 2][s - 2].getColour() == ColourEnum.BLACK
				&& squares[s - 3][s - 1].getNumber() == squares[s - 1][s - 1].getNumber()
				&& squares[s - 1][s - 1].getNumber() == squares[s - 1][s - 3].getNumber()) {
			squares[s - 1][s - 1] = new Square(squares[s - 1][s - 1].getNumber(), ColourEnum.BLACK);
		}

		board.setSquares(squares);

	}

	public static void advancedTechniqueTwo(Board board) {
		Square[][] squares = board.getSquares();
		int s = board.getSize();
		for (int c = 0; c < board.getSize() - 4; c++) {

			// top rown
			int topFirstY = squares[0][c].getNumber();
			ColourEnum topX = squares[0][c + 2].getColour();
			int topSecondY = squares[0][c + 4].getNumber();
			ColourEnum topFirstShaded = squares[1][c + 1].getColour();
			ColourEnum topSecondShaded = squares[1][c + 3].getColour();

			if (topFirstShaded == ColourEnum.BLACK && topSecondShaded == ColourEnum.BLACK && topFirstY == topSecondY
					&& topX == ColourEnum.WHITE) {

				squares[0][c + 2] = new Square(squares[0][c + 2].getNumber(), ColourEnum.COLOURED);
			}

			// bottom row
			int bottomFirstY = squares[s - 1][c].getNumber();
			ColourEnum bottomX = squares[s - 1][c + 2].getColour();
			int bottomSecondY = squares[s - 1][c + 4].getNumber();
			ColourEnum bottomFirstShaded = squares[s - 2][c + 1].getColour();
			ColourEnum bottomSecondShaded = squares[s - 2][c + 3].getColour();

			if (bottomFirstShaded == ColourEnum.BLACK && bottomSecondShaded == ColourEnum.BLACK
					&& bottomFirstY == bottomSecondY && bottomX == ColourEnum.WHITE) {

				squares[s - 1][c + 2] = new Square(squares[s - 1][c + 2].getNumber(), ColourEnum.COLOURED);
			}

			// left column
			int leftFirstY = squares[c][0].getNumber();
			ColourEnum leftX = squares[c + 2][0].getColour();
			int leftSecondY = squares[c + 4][0].getNumber();
			ColourEnum leftFirstShaded = squares[c + 1][1].getColour();
			ColourEnum leftSecondShaded = squares[c + 3][1].getColour();

			if (leftFirstShaded == ColourEnum.BLACK && leftSecondShaded == ColourEnum.BLACK && leftFirstY == leftSecondY
					&& leftX == ColourEnum.WHITE) {

				squares[c + 2][0] = new Square(squares[c + 2][0].getNumber(), ColourEnum.COLOURED);
			}

			// right column
			int rightFirstY = squares[c][s - 1].getNumber();
			ColourEnum rightX = squares[c + 2][s - 1].getColour();
			int rightSecondY = squares[c + 4][s - 1].getNumber();
			ColourEnum rightFirstShaded = squares[c + 1][s - 2].getColour();
			ColourEnum rightSecondShaded = squares[c + 3][s - 2].getColour();

			if (rightFirstShaded == ColourEnum.BLACK && rightSecondShaded == ColourEnum.BLACK
					&& rightFirstY == rightSecondY && rightX == ColourEnum.WHITE) {

				squares[c + 2][s - 1] = new Square(squares[c + 2][s - 1].getNumber(), ColourEnum.COLOURED);
			}

		}

		board.setSquares(squares);
	}

	public static void advancedTechniqueThree(Board board) {
		Square[][] squares = board.getSquares();
		int s = board.getSize();

		for (int sides = 0; sides < 4; sides++) {
			for (int c = 0; c < board.getSize() - 2; c++) {

				Square first = null;
				Square second = null;
				Square third = null;
				Square first_Second = null;
				Square second_Second = null;
				Square third_Second = null;

				// top
				if (sides == 0) {
					first = squares[0][c];
					second = squares[0][c + 1];
					third = squares[0][c + 2];
					first_Second = squares[1][c];
					second_Second = squares[1][c + 1];
					third_Second = squares[1][c + 2];
					System.out.println("sides = 0");

					// bottom
				} else if (sides == 1) {
					first = squares[s - 1][c];
					second = squares[s - 1][c + 1];
					third = squares[s - 1][c + 2];
					first_Second = squares[s - 2][c];
					second_Second = squares[s - 2][c + 1];
					third_Second = squares[s - 2][c + 2];
					System.out.println("sides = 1");

					// left
				} else if (sides == 2) {

					first = squares[c][0];
					second = squares[c + 1][0];
					third = squares[c + 2][0];
					first_Second = squares[c][1];
					second_Second = squares[c + 1][1];
					third_Second = squares[c + 2][1];
					System.out.println("sides = 2");

					// right
				} else if (sides == 3) {

					first = squares[c][s - 1];
					second = squares[c + 1][s - 1];
					third = squares[c + 2][s - 1];
					first_Second = squares[c][s - 2];
					second_Second = squares[c + 1][s - 2];
					third_Second = squares[c + 2][s - 2];
					System.out.println("sides = 3");

				}

				// top rown

				// System.out.println("Second number: " + second_Second.getNumber());
				if (second_Second.getColour() == ColourEnum.WHITE && third.getNumber() == third_Second.getNumber()
						&& first.getNumber() == first_Second.getNumber()) {

					if (sides == 0) {
						squares[1][c + 1] = new Square(squares[1][c + 1].getNumber(), ColourEnum.COLOURED);
					} else if (sides == 1) {
						squares[s - 2][c + 1] = new Square(squares[s - 2][c + 1].getNumber(), ColourEnum.COLOURED);
					} else if (sides == 2) {
						squares[c + 1][1] = new Square(squares[c + 1][1].getNumber(), ColourEnum.COLOURED);
					} else if (sides == 3) {
						squares[c + 1][s - 2] = new Square(squares[c + 1][s - 2].getNumber(), ColourEnum.COLOURED);
					}

				} else if (second_Second.getColour() == ColourEnum.WHITE
						&& third.getNumber() == third_Second.getNumber() && first.getNumber() == second.getNumber()) {

					if (sides == 0) {
						squares[1][c + 1] = new Square(squares[1][c + 1].getNumber(), ColourEnum.COLOURED);
					} else if (sides == 1) {
						squares[s - 2][c + 1] = new Square(squares[s - 2][c + 1].getNumber(), ColourEnum.COLOURED);
					} else if (sides == 2) {
						squares[c + 1][1] = new Square(squares[c + 1][1].getNumber(), ColourEnum.COLOURED);
					} else if (sides == 3) {
						squares[c + 1][s - 2] = new Square(squares[c + 1][s - 2].getNumber(), ColourEnum.COLOURED);
					}
				} else if (second_Second.getColour() == ColourEnum.WHITE && third.getNumber() == second.getNumber()
						&& first.getNumber() == first_Second.getNumber()) {

					if (sides == 0) {
						squares[1][c + 1] = new Square(squares[1][c + 1].getNumber(), ColourEnum.COLOURED);
					} else if (sides == 1) {
						squares[s - 2][c + 1] = new Square(squares[s - 2][c + 1].getNumber(), ColourEnum.COLOURED);
					} else if (sides == 2) {
						squares[c + 1][1] = new Square(squares[c + 1][1].getNumber(), ColourEnum.COLOURED);
					} else if (sides == 3) {
						squares[c + 1][s - 2] = new Square(squares[c + 1][s - 2].getNumber(), ColourEnum.COLOURED);
					}

				}

			}

		}
		board.setSquares(squares);

	}

	public static void advancedTechniqueOneFour(Board board) {

	}

	public static void advancedTechniqueOneFive(Board board) {

	}



	// div

	
	public static String solutionAsList(Board board) {
		Square[][] squares = board.getSquares();

		StringBuilder solution = new StringBuilder();

		for (int r = 0; r < board.getSize(); r++) {
			for (int c = 0; c < board.getSize(); c++) {

				if (squares[r][c].getColour() == ColourEnum.COLOURED) {
					solution.append(Integer.toString(squares[r][c].getNumber()));
				} else if (squares[r][c].getColour() == ColourEnum.BLACK) {
					solution.append("X");
				}
			}
		}

		return solution.toString();
	}

	public static boolean isSolved(Board board) {

		boolean solved = true;
		Square[][] squares = board.getSquares();
		for (int r = 0; r < board.getSize(); r++) {
			for (int c = 0; c < board.getSize(); c++) {
				if (squares[r][c].getColour() == ColourEnum.WHITE) {
					solved = false;
				}
			}
		}

		return solved;
	}

	public static void reset(Board board) {
		Square[][] squares = board.getSquares();
		for (int r = 0; r < board.getSize(); r++) {
			for (int c = 0; c < board.getSize(); c++) {
				squares[r][c] = new Square(squares[r][c].getNumber(), ColourEnum.WHITE);
			}
		}

		board.setSquares(squares);

	}

}
