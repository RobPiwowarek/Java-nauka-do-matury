package alg;

public class Pierwiastki {

	// dla demonstracji
	// y = -4x^2 + 4x + 2
	// przedzial <-10, 10>
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a = -10.0;
		double b = 10.0;
		double delta = 0.01; // precision
		
		System.out.println(find_root(a, b, delta));
	}

	static double find_root(double a, double b, double delta)
	{
		double c = f((a+b)/2.0);
		double x = (a+b)/2.0;
		
		if (c == 0.0 || (c < delta && c > -delta))
			return x;
		else if (f(a)*c < 0)
			return find_root(a, x, delta);
		else
			return find_root(x, b, delta);
	}
	
	static double f(double x) {
		double value = -4.0 * x * x + 4.0 * x +2.0; 
		return value; 
	}

}
