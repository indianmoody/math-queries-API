package hello;

public class Multiplication {
	private final int x;
	private final int y;
	
	public Multiplication (int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public long getProduct() {
		return x * y;
	}
	
}