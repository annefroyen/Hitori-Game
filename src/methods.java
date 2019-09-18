
public class methods {

	
	 
	public static void threeInARowOld(int [][] board){
		
			
			for(int c = 0; c < board.length; c++) {
				
				for(int r = 0; r < board.length-2; r++) {
		
					int oneColumn = board[c] [r];
					int twoColumn = board[c] [r+1];
					int threeColumn = board[c][r+2];
					
					int oneRow = board[r][c];
					int twoRow = board[r+1][c];
					int threeRow = board[r+2][c];
				
					System.out.println("Column: " + oneColumn);
					System.out.println("Row: " + oneRow);
				
				if(oneRow==twoRow && twoRow==threeRow) {
					//System.out.println("Tre like på rader!!");
					board[r][c] = 0;
					board[r+2][c] = 0;
					
				}
				if(oneColumn==twoColumn && twoColumn==threeColumn) {
					//System.out.println("Tre like på kolonner!!");
					board[c][r] = 0;
					board[c][r+2] = 0;
					
				}
			}
		}
			
		}
	
	
	public static void sandwichOLD(int [][] board) {
	
		for(int c = 0; c < board.length; c++) {
			
			for(int r = 0; r < board.length-2; r++) {
	
				
				
				
				int oneColumn = board[c] [r];
				int twoColumn = board[c] [r+1];
				int threeColumn = board[c][r+2];
				
				int oneRow = board[r][c];
				int twoRow = board[r+1][c];
				int threeRow = board[r+2][c];
			
				//System.out.println("Column: " + oneColumn + twoColumn);
				//System.out.println("Row: " + oneRow);
			
			if(oneRow==threeRow) {
				//System.out.println("Tre like på rader!!");
				board[r+1][c] = 00;
				
			}
			if(oneColumn==threeColumn) {
				//System.out.println("Tre like på kolonner!!");
			;
				board[c][r+1] = 00;;
				
			}
		}
	}
	}
	
	
	 //FUNGERER
		public static void threeInARow(Board board){
			
				Square[][] squares = board.getSquares(); 
				for(int c = 0; c < squares.length; c++) {
					
					for(int r = 0; r < squares.length-2; r++) {
			
						int oneColumn = squares[c] [r].getNumber();
						int twoColumn = squares[c] [r+1].getNumber();
						int threeColumn = squares[c][r+2].getNumber();
						
						int oneRow = squares[r][c].getNumber();
						int twoRow = squares[r+1][c].getNumber();
						int threeRow = squares[r+2][c].getNumber();
					
						//System.out.println("Column: " + oneColumn + twoColumn);
						//System.out.println("Row: " + oneRow);
					
					if(oneRow==twoRow && twoRow==threeRow) {
						//System.out.println("Tre like på rader!!");
						squares[r][c].setColour(ColourEnum.BLACK);
						squares[r+2][c].setColour(ColourEnum.BLACK);
					
					}
					if(oneColumn==twoColumn && twoColumn==threeColumn) {
						//System.out.println("Tre like på kolonner!!");
						squares[c][r].setColour(ColourEnum.BLACK);
						squares[c][r+2].setColour(ColourEnum.BLACK);
						
					}
				}
			}
		}
		
		
		//fungerer
		public static void sandwich(Board board) {
			
			
			Square[][] squares = board.getSquares(); 
			for(int c = 0; c < squares.length; c++) {
				
				for(int r = 0; r < squares.length-2; r++) {
		
					
					
					
					int oneColumn = squares[c] [r].getNumber();
					int twoColumn = squares[c] [r+1].getNumber();
					int threeColumn = squares[c][r+2].getNumber();
					
					int oneRow = squares[r][c].getNumber();
					int twoRow = squares[r+1][c].getNumber();
					int threeRow = squares[r+2][c].getNumber();
				
					//System.out.println("Column: " + oneColumn + twoColumn);
					//System.out.println("Row: " + oneRow);
				
				if(oneRow==threeRow) {
					//System.out.println("Tre like på rader!!");
					squares[r+1][c].setColour(ColourEnum.COLOURED);
					
				}
				if(oneColumn==threeColumn) {
					//System.out.println("Tre like på kolonner!!");
				;
					squares[c][r+1].setColour(ColourEnum.COLOURED);
					
				}
			}
				
		}
			board.setSquares(squares);
			
		}
		
       private void pairInduction() {
			
		}
       
       private void checkForDuplicateNumbers(Board board) {

    	   int blackedNumber;
			Square[][] squares = board.getSquares(); 
			for(int c = 0; c < squares.length; c++) {
				
				for(int r = 0; r < squares.length-2; r++) {
		
					//finn ein svart
					if(squares[c][r].getColour() == ColourEnum.BLACK) {
						blackedNumber = squares[c][r].getNumber();
					//sjekk om resten av rekka har samme nummer som svart
					if(blackedNumber == squares[c][r].getNumber()) {
						 
					}
					}
					
					
					int oneColumn = squares[c] [r].getNumber();
					int twoColumn = squares[c] [r+1].getNumber();
					int threeColumn = squares[c][r+2].getNumber();
					
					int oneRow = squares[r][c].getNumber();
					int twoRow = squares[r+1][c].getNumber();
					int threeRow = squares[r+2][c].getNumber();
				
					//System.out.println("Column: " + oneColumn );
					//System.out.println("Row: " + oneRow);
				
				if(oneRow==twoRow && twoRow==threeRow) {
					//System.out.println("Tre like på rader!!");
					squares[r][c].setColour(ColourEnum.BLACK);
					squares[r+2][c].setColour(ColourEnum.BLACK);
					
				}
				if(oneColumn==twoColumn && twoColumn==threeColumn) {
					//System.out.println("Tre like på kolonner!!");
					squares[c][r].setColour(ColourEnum.BLACK);
					squares[c][r+2].setColour(ColourEnum.BLACK);
					
				}
			}
		}
    	   
       }
       
       private void circleAroundBlackedSquares() {
    	   
       }
       
       
       
   	/*
   	 * 1. Finne 3 på rad 2. Finne en sandwich 3. Pair induction (1 + 2 like på ei
   	 * linje)
   	 * 
   	 * Basic teknikkar:
   	 * 
   	 * 1. Svart ut i kuber i rekker der det same talet er ring rundt. 2. Ring rundt
   	 * svarte kuber
   	 * 
   	 * 
   	 * Pass på at tall ikkje blir utestengt
   	 */
       
}
