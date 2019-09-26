
public class Board {

	private Square one = new Square(1, ColourEnum.WHITE);
	private Square two = new Square(2, ColourEnum.WHITE);
	private Square three = new Square(3, ColourEnum.WHITE);
	private Square four = new Square(4, ColourEnum.WHITE);
	private Square five = new Square(5, ColourEnum.WHITE);
	private Square six = new Square(6, ColourEnum.WHITE);
	private Square seven = new Square(7, ColourEnum.WHITE);
	private Square eight = new Square(8, ColourEnum.WHITE);

	private Square[][] FiveByFive = { { four, four, two, two, three }, { three, one, four, five, three },
			{ two, two, one, one, four }, { two, four, one, four, five }, { four, five, two, five, one } };

	private Square[][] SixBySix = { { three, two, one, one, three, two }, { five, one, two, three, four, three },
			{ one, four, four, three, five, three }, { one, three, one, two, two, four },
			{ three, four, three, two, six, two }, { five, five, three, one, one, six } };

	private Square[][] SevenBySeven = { { four, five, four, three, three, six, seven },
			{ one, three, seven, five, three, two, one }, { five, three, four, six, six, seven, two },
			{ four, seven, seven, six, four, five, five }, { three, one, five, three, two, four, six },
			{ seven, five, six, two, five, one, two }, { three, two, three, four, four, five, one } };

	private Square[][] EightByEight = { { four, six, one, five, two, six, four, one },
			{ two, eight, one, one, five, four, three, two }, { eight, two, seven, one, four, two, six, seven },
			{ one, one, three, four, eight, five, four, two }, { four, two, seven, six, six, four, two, eight },
			{ one, three, four, six, seven, two, eight, three }, { seven, four, six, eight, five, six, five, three },
			{ two, seven, six, two, three, three, one, one } };

	private Square[][] squares;
	private int size;

	public Board(Square[][] squares, int size) {
		this.squares = squares;
		this.size = size;

	}

	public Board() {
		this.squares = FiveByFive;
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
			break;
		case 6:
			this.squares = SixBySix;
			break;
		case 7:
			this.squares = SevenBySeven;
			break;
		case 8:
			this.squares = EightByEight;
			break;
		default:
			this.squares = FiveByFive;
		}

	}

	public static Board createBoard(String in) {

		String[] integerStrings = in.split(" ");
		int size = (int) Math.sqrt(integerStrings.length);

		Square[][] squares = new Square[size][size];
		Board board = new Board();

		for (int r = 0; r < squares.length; r++) {
			for (int c = 0; c < squares[r].length; c++) {

				squares[r][c] = new Square(Integer.parseInt(integerStrings[(r * squares[r].length) + c]),
						ColourEnum.WHITE);
			}
		}

		board.setSquares(squares);
		board.setSize(size);

		return board;

	}

}
