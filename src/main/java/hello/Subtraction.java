package hello;

public class Subtraction {
	private final float x;
	private final float y;
	
	public Subtraction (float x, float y) {
		this.x = x;
		this.y = y;
	}
	
	public double getDifference() {
		return x - y;
	}
	
}