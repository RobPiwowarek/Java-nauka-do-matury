package naukadomatury;

import java.util.Random;

public class Euklides {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();

		System.out.println("Najwiekszy wspolny dzielnik to: "
				+ odejmowanie(rand.nextInt(1000), rand.nextInt(1000)));
		System.out.println("Najwiekszy wspolny dzielnik to: "
				+ modulo(rand.nextInt(1000), rand.nextInt(1000)));

		int a = rand.nextInt(1000);
		int b = rand.nextInt(1000);
		System.out.println("Liczby: " + a + " i " + b);
		System.out.println("Najwiekszy wspolny dzielnik to: "
				+ rekur(a, b));
	}

	static int odejmowanie(int a, int b) {
		System.out.println("Liczby: " + a + " i " + b);

		while (a != b && a > 0 && b > 0) {
			if (a > b)
				a = a - b;
			else
				b = b - a;
		}
		return a;
	}

	static int modulo(int a, int b) {
		System.out.println("Liczby: " + a + " i " + b);

		while (b != 0) {
			int c = a % b;
			a = b;
			b = c;
		}
		return a;
	}

	static int rekur(int a, int b) {
		if (b == 0)
			return a;
		else
			return rekur(b, a%b);
	}
	
}
