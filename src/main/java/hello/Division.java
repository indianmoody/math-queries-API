package hello;

public class Division {
	private final float x;
	private final float y;
	
	public Division (float x, float y) {
		this.x = x;
		this.y = y;
	}
	
	public double getDivision() {
		try {
			return x/y;
		}
		catch (Exception e) {
			return 9999999;
		}
	}
	
}