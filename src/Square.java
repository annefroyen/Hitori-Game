
public class Square {
	
	private int number;
	private ColourEnum colour;
	private boolean correct;
	
	public Square(int number, ColourEnum colour) {
		this.number = number;
		this.colour = colour;
	}
	
	public Square(int number, ColourEnum colour, boolean correct) {
		this.number = number;
		this.colour = colour;
		this.correct = correct;
	}
	
	public void setNumber(int number) {
		this.number = number;
	}

	public int getNumber() {
		return number;
	}

	public ColourEnum getColour() {
		return colour;
	}

	public void setColour(ColourEnum colour) {
		this.colour = colour;
	}

	public boolean isCorrect() {
		return correct;
	}

	public void setCorrect(boolean correct) {
		this.correct = correct;
	}
	

}
