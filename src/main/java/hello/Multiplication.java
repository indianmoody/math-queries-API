package hello;

public class Multiplication {
	private final float x;
	private final float y;
	
	public Multiplication (float x, float y) {
		this.x = x;
		this.y = y;
	}
	
	public double getProduct() {
		return x * y;
	}
	
}