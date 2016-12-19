package hello;

public class Addition {
	private final float x;
	private final float y;
	
	public Addition (float x, float y) {
		this.x = x;
		this.y = y;
	}
	
	public double getSum() {
		return x + y;
	}
	
}