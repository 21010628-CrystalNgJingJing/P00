
public class Calculator {

	public int add (int a, int b) {
		return a + b;
	}
	
	public int subtract (int a, int b) {
		return a - b;
	}
	
	public int multiple (int e, int f) {
		return e * f;
	}
	
	public int divide (int g, int h) {
		if (h == 0) {
			throw new IllegalArgumentException("Denominator cannot be zero");
		}
			return g / h;
	}
}
