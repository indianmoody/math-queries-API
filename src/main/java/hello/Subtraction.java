package hello;

public class Subtraction {
	private final int x;
	private final int y;
	
	public Subtraction (int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public long getDifference() {
		return x - y;
	}
	
}