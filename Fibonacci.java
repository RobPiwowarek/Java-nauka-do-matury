package alg;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int ile;
		Scanner scan = new Scanner(System.in);
		System.out.println("ktory wyraz obliczyc?");
		ile = scan.nextInt();
		
		System.out.println(ile + " wyraz to: " + fibo(1, 1, ile-2));
		
	scan.close();
	}	
	
	static int fibo(int a, int b, int ile)
	{
		
		if (ile == 0)
			return b;
		else
			return fibo(b, a+b, --ile);
	}
	

}
