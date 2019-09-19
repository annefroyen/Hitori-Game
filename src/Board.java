import java.util.ArrayList;

public class Board {

	private Square one = new Square(1, ColourEnum.WHITE);
	private Square one_B = new Square(1, ColourEnum.BLACK);
	private Square one_C = new Square(1, ColourEnum.COLOURED);

	private Square two = new Square(2, ColourEnum.WHITE);
	private Square two_B = new Square(2, ColourEnum.BLACK);
	private Square two_C = new Square(2, ColourEnum.COLOURED);

	private Square three = new Square(3, ColourEnum.WHITE);
	private Square three_B = new Square(3, ColourEnum.BLACK);
	private Square three_C = new Square(3, ColourEnum.COLOURED);

	private Square four = new Square(4, ColourEnum.WHITE);
	private Square four_B = new Square(4, ColourEnum.BLACK);
	private Square four_C = new Square(4, ColourEnum.COLOURED);

	private Square five = new Square(5, ColourEnum.WHITE);
	private Square five_B = new Square(5, ColourEnum.BLACK);
	private Square five_C = new Square(5, ColourEnum.COLOURED);

	private Square six = new Square(6, ColourEnum.WHITE);
	private Square six_B = new Square(6, ColourEnum.BLACK);
	private Square six_C = new Square(6, ColourEnum.COLOURED);

	private Square seven = new Square(7, ColourEnum.WHITE);
	private Square seven_B = new Square(7, ColourEnum.BLACK);
	private Square seven_C = new Square(7, ColourEnum.COLOURED);

	private Square eight = new Square(8, ColourEnum.WHITE);
	private Square eight_B = new Square(8, ColourEnum.BLACK);
	private Square eight_C = new Square(8, ColourEnum.COLOURED);

	private Square nine = new Square(9, ColourEnum.WHITE);
	private Square nine_B = new Square(9, ColourEnum.BLACK);
	private Square nine_C = new Square(9, ColourEnum.COLOURED);

	private Square ten = new Square(10, ColourEnum.WHITE);
	private Square ten_B = new Square(10, ColourEnum.BLACK);
	private Square ten_C = new Square(10, ColourEnum.COLOURED);

	private Square eleven = new Square(11, ColourEnum.WHITE);
	private Square eleven_B = new Square(11, ColourEnum.BLACK);
	private Square eleven_C = new Square(11, ColourEnum.COLOURED);

	private Square twelve = new Square(12, ColourEnum.WHITE);
	private Square twelve_B = new Square(12, ColourEnum.BLACK);
	private Square twelve_C = new Square(12, ColourEnum.COLOURED);

	private Square[][] FiveByFive = { { four, four, two, two, three }, { three, one, four, five, three },
			{ two, two, one, one, four }, { two, four, one, four, five }, { four, five, two, five, one } };
	private Square[][] FiveByFive_Solution = { { four_B, four_C, two_B, two_C, three_C },
			{ three_C, one_C, four_C, five_C, three_B }, { two_B, two_C, one_B, one_C, four_C },
			{ two_C, four_B, one_C, four_C, five_C }, { four_C, five_C, two_C, five_B, one_C } };
	/*private Square[][] FiveByFive2 = { { three, two, two, four, four }, { five, two, four, one, three },
			{ one, one, five, five, two }, { one, three, five, three, four }, { three, four, four, three, five } };
	private Square[][] FiveByFive2_Solution = { { three_C, two_B, two_C, four_C, four_B },
			{ five_C, two_C, four_C, one_C, three_C }, { one_B, one_C, five_B, five_C, two_C },
			{ one_C, three_C, five_C, three_B, four_C }, { three_B, four_C, four_B, three_C, five_C } };
*/
	private Square[][] SixBySix = { { three, two, one, one, three, two }, { five, one, two, three, four, three },
			{ one, four, four, three, five, three }, { one, three, one, two, two, four },
			{ three, four, three, two, six, two }, { five, five, three, one, one, six } };
	private Square[][] SixBySix_Solution = { { three_B, two_C, one_B, one_C, three_C, two_B },
			{ five_C, one_C, two_C, three_B, four_C, three_C }, { one_C, four_B, four_C, three_C, five_C, three_B },
			{ one_B, three_C, one_C, two_B, two_C, four_C }, { three_C, four_C, three_B, two_C, six_C, two_B },
			{ five_B, five_C, three_C, one_B, one_C, six_C } };
	/*private Square[][] SixBySix2 = { { five, five, six, six, four, five }, { six, two, one, five, five, four },
			{ four, five, five, two, six, three }, { six, three, five, four, one, one },
			{ five, four, two, one, two, six }, { three, four, four, five, two, one } };
	private Square[][] SixBySix2_Solution = { { five_B, five_C, six_B, six_C, four_C, five_B },
			{ six_C, two_C, one_C, five_B, five_C, four_C }, { four_C, five_B, five_C, two_C, six_C, three_C },
			{ six_B, three_C, five_B, four_C, one_C, one_B }, { five_C, four_C, two_C, one_C, two_B, six_C },
			{ three_C, four_B, four_C, five_C, two_C, one_C } };
*/
	private Square[][] SevenBySeven = { { four, five, four, three, three, six, seven },
			{ one, three, seven, five, three, two, one }, { five, three, four, six, six, seven, two },
			{ four, seven, seven, six, four, five, five }, { three, one, five, three, two, four, six },
			{ seven, five, six, two, five, one, two }, { three, two, three, four, four, five, one } };
	private Square[][] SevenBySeven_Solution = { { four_C, five_C, four_B, three_C, three_B, six_C, seven_C },
			{ one_C, three_B, seven_C, five_C, three_C, two_C, one_B },
			{ five_C, three_C, four_C, six_B, six_C, seven_C, two_C },
			{ four_B, seven_C, seven_B, six_C, four_C, five_B, five_C },
			{ three_C, one_C, five_C, three_B, two_C, four_C, six_C },
			{ seven_C, five_B, six_C, two_C, five_C, one_C, two_B },
			{ three_B, two_C, three_C, four_C, four_B, five_C, one_C } };
	/*private Square[][] SevenBySeven2 = { { six, four, seven, two, six, one, four },
			{ one, four, three, two, two, five, four }, { three, two, six, six, one, four, two },
			{ two, three, six, four, four, seven, one }, { one, seven, two, one, five, five, six },
			{ five, one, four, six, seven, six, two }, { three, five, four, four, six, six, three } };
	private Square[][] SevenBySeven2_Solution = { { six_C, four_C, seven_C, two_C, six_B, one_C, four_B },
			{ one_C, four_B, three_C, two_B, two_C, five_C, four_C },
			{ three_C, two_C, six_B, six_C, one_C, four_C, two_B },
			{ two_C, three_C, six_C, four_B, four_C, seven_C, one_C },
			{ one_B, seven_C, two_C, one_C, five_C, five_B, six_C },
			{ five_C, one_C, four_C, six_B, seven_C, six_C, two_C },
			{ three_B, five_C, four_B, four_C, six_C, six_B, three_C } };
*/
	private Square[][] EightByEight = { {four, six, one, five, two, six, four, one },
			{ two, eight, one, one, five, four, three, two }, { eight, two, seven, one, four, two, six, seven },
			{ one, one, three, four, eight, five, four, two}, {four, two, seven, six, six, four, two, eight},{one, three, four, six, seven, two, eight, three},{ seven, four, six, eight, five, six, five, three},{two, seven, six, two, three, one, one, one}};
	
	private Square[][] EightByEight_Solution = { { four_C, five_C, four_B, three_C, three_B, six_C, seven_C },
			{ one_C, three_B, seven_C, five_C, three_C, two_C, one_B },
			{ five_C, three_C, four_C, six_B, six_C, seven_C, two_C },
			{ four_B, seven_C, seven_B, six_C, four_C, five_B, five_C },
			{ three_C, one_C, five_C, three_B, two_C, four_C, six_C },
			{ seven_C, five_B, six_C, two_C, five_C, one_C, two_B },
			{ three_B, two_C, three_C, four_C, four_B, five_C, one_C } };
	/*private Square[][] EightByEight2 = { { six, four, seven, two, six, one, four },
			{ one, four, three, two, two, five, four }, { three, two, six, six, one, four, two },
			{ two, three, six, four, four, seven, one }, { one, seven, two, one, five, five, six },
			{ five, one, four, six, seven, six, two }, { three, five, four, four, six, six, three } };
	private Square[][] EightByEight2_Solution = { { six_C, four_C, seven_C, two_C, six_B, one_C, four_B },
			{ one_C, four_B, three_C, two_B, two_C, five_C, four_C },
			{ three_C, two_C, six_B, six_C, one_C, four_C, two_B },
			{ two_C, three_C, six_C, four_B, four_C, seven_C, one_C },
			{ one_B, seven_C, two_C, one_C, five_C, five_B, six_C },
			{ five_C, one_C, four_C, six_B, seven_C, six_C, two_C },
			{ three_B, five_C, four_B, four_C, six_C, six_B, three_C } };
*/
	private Square[][] squares;
	private Square[][] squares_Solution;
	private int size;

	public Board(Square[][] squares, Square[][] squares_Solution, int size) {
		this.squares = squares;
		this.squares_Solution = squares_Solution;
		this.size = size;

	}

	public Board() {
		this.squares = FiveByFive;
		this.squares_Solution = FiveByFive_Solution;
		this.size = 5;

	}

	public Square[][] getSquares() {
		return squares;
	}

	public void setSquares(Square[][] squares) {
		this.squares = squares;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public void printBoard(Board board) {

		for (Square[] a : board.getSquares()) {
			for (Square i : a) {
				System.out.print(i.getNumber() + "\t");
			}
			System.out.println("\n");
		}
	}



	public void getBoard(int size) {

		this.size = size;

		switch (size) {
		case 5:
			this.squares = FiveByFive;
			this.squares_Solution = FiveByFive_Solution;
			break;
		case 6:
			this.squares = SixBySix;
			this.squares_Solution = SixBySix_Solution;
			break;
		case 7:
			this.squares = SevenBySeven;
			this.squares_Solution = SevenBySeven_Solution;
			break;
		case 8:
			this.squares = EightByEight;
			this.squares_Solution = EightByEight_Solution;
			break;
		default:
			this.squares = FiveByFive;
			this.squares_Solution = FiveByFive_Solution;
		}
		
		
		//kan evnt gjere dei om til ein metode og ha create/choose som parameter elns?

	}
	
	
	//bruke toCharArray på string?
	
	/* ARNE snitt
	String[] rekke1 = toList(request.getParameter("row1"));
	String [] rekke2 = toList(request.getParameter("row2"));

	public String[] toList(String string){

	String[] charList = String[string.length];
	for(Char ch  : string.toCharArray()){
	charList[index] = ch;
	}
	return charlist;
	}

	}

*/
	
	public Board(String input) {
		
		Square[][] squares = new Square[1000][1000];
		ArrayList<Square> container = new ArrayList<Square>();

		int amount= 0;

		    	 
		    	 for(int i = 0; i< input.length()-2; i++) {
		 			
		    		 if(input.charAt(i) == ' ' && input.charAt(i+2) == ' ') {
		    			 
		    				// i er eit tal med 1 siffer
		    			int nr = Integer.parseInt(String.valueOf(input.charAt(i+1)));
		    	
		    			 Square square = new Square(nr, ColourEnum.WHITE);
		    			container.add(square);
		    			 amount++;
		    			 
		    			 //legge talla i en arraylist og så i squares?

		    		/*}else if(input.charAt(i) == ' ' && input.charAt(i+3) == ' ') {
		    				
		    				//i er eit tal med 2 siffer
		    				 int nr = Integer.parseInt(String.valueOf(input.charAt(i+1)) + String.valueOf(input.charAt(i+2)));
		    				 Square square = new Square(55, ColourEnum.WHITE);
		    				squares[0][1]=square;
		    				 // addToSquares(this.squares, square);
		    				 amount++;
		    				 
		    			*/
		    		
		    		 }
		
		 
		}
		    	 
		    	 for (int r=0; r<=squares.length; r++) {
		    	     for (int c=0; c<=squares[r].length; c++) {
		    	    	 
		    	    	 for (int i = 0; i < container.size(); i++) {
		 		 			
		    	         squares[r][c]=container.get(i);
		    	     }
		    	 }
		    	 }
		    	
		this.squares = squares;
		
		int length = (int) (Math.log10(amount) + 1);

		this.size = (int) Math.sqrt(length);
//skal bretta kunne bere over 9? isåfall kan man ikkje bere skrive inn ei talrekke?????
		
	}

	private int parseInt(char charAt) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public void addToSquares(Square[][] squares, Square s) {

		
	 // print array in rectangular form
	 for (int r=0; r<=this.squares.length; r++) {
	     for (int c=0; c<=this.squares[r].length; c++) {
	         squares[r][c]=s;
	     }
	 }
	}

}
