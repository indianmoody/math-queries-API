package hello;

public class Factorial {
	private final int x;
	
	public Factorial (int x) {
		this.x = x;
	}
	
	private int calculateFactorial(int n) {
		if (n<=1) {
			return 1;
		}
		else {
			return n * calculateFactorial(n-1);
		}
	}
	
	public int getFactorial() {
		return calculateFactorial(x);
	}
	
}