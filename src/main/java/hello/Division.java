package hello;

public class Division {
	private final int x;
	private final int y;
	
	public Division (int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public long getDivision() {
		try {
			return x/y;
		}
		catch (Exception e) {
			return 9999999;
		}
	}
	
}