
public class Square {
	
	private int number;
	private ColourEnum colour;
	
	public Square(int number, ColourEnum colour) {
		this.number = number;
		this.colour = colour;
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
	

}
