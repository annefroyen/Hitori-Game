
import java.util.*;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.text.WordUtils;

public class Main {
	
	
	public int [][]board;
	public int size;
	
	 public static void main(String[] args) 
	    { 

		 
		 //Create board
		 
		 //solve board step by step
		 
		 
		 //
		 
		 
		 
	// nytt 5x5 brett
	int [][] board = new int [5][5];

	// Fill each row with 1.0
	for(int[] row:board)
	{
		Arrays.fill(row,1);
	}

	
	//Stacc board]
	
	int[][] stacc = {
		{5,2,1,6,2,5},
		{3,1,4,6,6,6},
		{4,2,3,4,8,3},
		{4,5,6,3,6,2},
		{4,4,3,3,4,5},
		{6,4,6,5,3,3}
		
	};

	System.out.println("Board:");
	
	   for (int[] a : stacc) {
           for (int i : a) {
               System.out.print(i + "\t");
           }
           System.out.println("\n");
       }
	System.out.println(Arrays.deepToString(stacc));

	
	threeInARow(stacc);
	// Start teknikkar:
	
	
	System.out.println("Board:");
	
	   for (int[] a : stacc) {
        for (int i : a) {
            System.out.print(i + "\t");
        }
        System.out.println("\n");
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
	 
	 static //FUNGERER. den finner 3 like og fjerner dei to ytterste
	 void threeInARow(int [][] board){
		
			
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
		
		private void sandwich() {
			
		}
		
        private void pairInduction() {
			
		}
	 
}