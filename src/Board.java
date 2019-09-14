

public class Board {
	
	private Square one = new Square(1,false,false);
	private Square one_B = new Square (1, true, false);
	private Square one_C = new Square (1, false, true);
	
	private Square two = new Square(2,false,false);
	private Square two_B = new Square(2,true,false);
	private Square two_C = new Square(2,false,true);
	
	private Square three = new Square(3,false,false);
	private Square three_B = new Square(3,true,false);
	private Square three_C = new Square(3,false,true);
	
	private Square four = new Square(4,false,false);
	private Square four_B = new Square(4,true,false);
	private Square four_C = new Square(4,false,true);
	
	private Square five = new Square(5,false,false);
	private Square five_B = new Square(5,true,false);
	private Square five_C = new Square(5,false,true);
	
	private Square six = new Square(6,false,false);
	private Square six_B = new Square(6,true,false);
	private Square six_C = new Square(6,false,true);
	
	private Square seven = new Square(7,false,false);
	private Square seven_B = new Square(7,true,false);
	private Square seven_C = new Square(7,false,true);
	
	private Square eight = new Square(8,false,false);
	private Square eight_B = new Square(8,true,false);
	private Square eight_C = new Square(8,false,true);
	
	private Square nine = new Square(9,false,false);
	private Square nine_B = new Square(9,true,false);
	private Square nine_C = new Square(9,false,true);
	
	private Square ten = new Square(10,false,false);
	private Square ten_B = new Square(10,true,false);
	private Square ten_C = new Square(10,false,true);
	
	private Square eleven = new Square(11,false,false);
	private Square eleven_B = new Square(11,true,false);
	private Square eleven_C = new Square(11,false,true);
	
	private Square twelve = new Square(12,false,false);
	private Square twelve_B = new Square(12,true,false);
	private Square twelve_C = new Square(12,false,true);
	

	private Square[][] FiveByFiveEasy = {{four,four,two,two,three}, {three,one,four,five,three}, {two,two,one,one,four},{two, four, one, four, five}, {four,five,two,five,one}};
	private Square[][] FiveByFiveEasy_Answer = {{four_B,four_C,two_B,two_C,three_C}, {three_C,one_C,four_C,five_C,three_B}, {two_B,two_C,one_B,one_C,four_C},{two_C, four_B, one_C, four_C, five_C}, {four_C,five_C,two_C,five_B,one_C}};
	
	
	private Square[][] FiveByFiveMedium = {{,2,1,6,2,5}, {3,1,4,6,6,6}, {4,2,3,4,8,3}, {4,5,6,3,6,2}, {4,4,3,3,4,5},{6,4,6,5,3,3}};
	private Square[][] FiveByFiveHard = {{,2,1,6,2,5}, {3,1,4,6,6,6}, {4,2,3,4,8,3}, {4,5,6,3,6,2}, {4,4,3,3,4,5},{6,4,6,5,3,3}};
	
	private Square[][] SixBySixEasy = {{,2,1,6,2,5}, {3,1,4,6,6,6}, {4,2,3,4,8,3}, {4,5,6,3,6,2}, {4,4,3,3,4,5},{6,4,6,5,3,3}};
	private Square[][] SixBySixMedium = {{,2,1,6,2,5}, {3,1,4,6,6,6}, {4,2,3,4,8,3}, {4,5,6,3,6,2}, {4,4,3,3,4,5},{6,4,6,5,3,3}};
	private Square[][] SixBySixHard = {{,2,1,6,2,5}, {3,1,4,6,6,6}, {4,2,3,4,8,3}, {4,5,6,3,6,2}, {4,4,3,3,4,5},{6,4,6,5,3,3}};
	
	private Square[][] SevenBySevenEasy = {{,2,1,6,2,5}, {3,1,4,6,6,6}, {4,2,3,4,8,3}, {4,5,6,3,6,2}, {4,4,3,3,4,5},{6,4,6,5,3,3}};
	private Square[][] SevenBySevenMedium = {{,2,1,6,2,5}, {3,1,4,6,6,6}, {4,2,3,4,8,3}, {4,5,6,3,6,2}, {4,4,3,3,4,5},{6,4,6,5,3,3}};
	private Square[][] SevenBySevenHard = {{,2,1,6,2,5}, {3,1,4,6,6,6}, {4,2,3,4,8,3}, {4,5,6,3,6,2}, {4,4,3,3,4,5},{6,4,6,5,3,3}};
	
	private Square[][] EightByEightEasy = {{,2,1,6,2,5}, {3,1,4,6,6,6}, {4,2,3,4,8,3}, {4,5,6,3,6,2}, {4,4,3,3,4,5},{6,4,6,5,3,3}};
	private Square[][] EightByEightMedium = {{,2,1,6,2,5}, {3,1,4,6,6,6}, {4,2,3,4,8,3}, {4,5,6,3,6,2}, {4,4,3,3,4,5},{6,4,6,5,3,3}};
	private Square[][] EightByEightHard = {{,2,1,6,2,5}, {3,1,4,6,6,6}, {4,2,3,4,8,3}, {4,5,6,3,6,2}, {4,4,3,3,4,5},{6,4,6,5,3,3}};
	
	private Square[][] NineByNineEasy = {{,2,1,6,2,5}, {3,1,4,6,6,6}, {4,2,3,4,8,3}, {4,5,6,3,6,2}, {4,4,3,3,4,5},{6,4,6,5,3,3}};
	private Square[][] NineByNineMedium = {{,2,1,6,2,5}, {3,1,4,6,6,6}, {4,2,3,4,8,3}, {4,5,6,3,6,2}, {4,4,3,3,4,5},{6,4,6,5,3,3}};
	private Square[][] NineByNineHard = {{,2,1,6,2,5}, {3,1,4,6,6,6}, {4,2,3,4,8,3}, {4,5,6,3,6,2}, {4,4,3,3,4,5},{6,4,6,5,3,3}};
	
	private Square[][] TwelveByTwelveEasy = {{,2,1,6,2,5}, {3,1,4,6,6,6}, {4,2,3,4,8,3}, {4,5,6,3,6,2}, {4,4,3,3,4,5},{6,4,6,5,3,3}};
	private Square[][] TwelveByTwelveMedium = {{,2,1,6,2,5}, {3,1,4,6,6,6}, {4,2,3,4,8,3}, {4,5,6,3,6,2}, {4,4,3,3,4,5},{6,4,6,5,3,3}};
	private Square[][] TwelveByTwelveHard = {{,2,1,6,2,5}, {3,1,4,6,6,6}, {4,2,3,4,8,3}, {4,5,6,3,6,2}, {4,4,3,3,4,5},{6,4,6,5,3,3}};

	
	private Square [][] squares;
	private int size;
	private int difficulty;
	
	 
	
	
	
	public Board( Square [][] squares, int size, int difficulty) {
		this.squares = squares;
		this.size = size;
		this.difficulty = difficulty;
	}
		 
	public Board() {
		this.squares = FiveByFiveEasy;
		this.size = 5;
		this.difficulty = 0;
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




	public int getDifficulty() {
		return difficulty;
	}




	public void setDifficulty(int difficulty) {
		this.difficulty = difficulty;
	}




	public void printBoard( Board board) {
		
		   for (Square[] a : board.getSquares()) {
	           for (Square i : a) {
	               System.out.print(i + "\t");
	           }
	           System.out.println("\n");
	       }
	}
	
	public void createBoard(int size, int difficulty) {
		
		if(size==5 && difficulty==0) {
			this.squares = FiveByFiveEasy;
		}else if(size==5 && difficulty==1) {
			return FiveByFiveMedium;
		}else if(size==5 && difficulty==2) {
			return FiveByFiveHard;
			
		}else if(size==6 && difficulty==0) {
			return SixBySixEasy;
		}else if(size==6 && difficulty==1) {
			return SixBySixMedium;
		}else if(size==6 && difficulty==2) {
			return SixBySixHard;
			
		}else if(size==7 && difficulty==0) {
			return SevenBySevenEasy;
		}else if(size==7 && difficulty==1) {
			return SevenBySevenMedium;
		}else if(size==7 && difficulty==2) {
			return SevenBySevenHard;
			
		}else if(size==8 && difficulty==0) {
			return EightByEightEasy;
		}else if(size==8 && difficulty==1) {
			return EightByEightMedium;
		}else if(size==8 && difficulty==2) {
			return EightByEightHard;
			
		}else if(size==9 && difficulty==0) {
			return NineByNineEasy;
		}else if(size==9 && difficulty==1) {
			return NineByNineMedium;
		}else if(size==9 && difficulty==2) {
			return NineByNineHard;
			
		}else if(size==12 && difficulty==0) {
			return TwelveByTwelveEasy;
		}else if(size==12 && difficulty==1) {
			return TwelveByTwelveMedium;
		}else if(size==12 && difficulty==2) {
			return TwelveByTwelveHard;
		}
		
	}
	
	public void createRandomBoard() {
		
		
	}

}
