
public class Square {
	
	private int number;
	private boolean blacked;
	private boolean circled;
	
	public Square(int number, boolean blacked, boolean circled) {
		this.number = number;
		this.blacked = blacked;
		this.circled = circled;
	}
	
	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public boolean isBlacked() {
		return blacked;
	}

	public void setBlacked(boolean blacked) {
		this.blacked = blacked;
	}

	public boolean isCircled() {
		return circled;
	}

	public void setCircled(boolean circled) {
		this.circled = circled;
	}
	

}
