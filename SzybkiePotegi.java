package alg;

import java.util.Scanner;

public class SzybkiePotegi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int a, b;
		System.out.println("Podaj podstawe");
		a = scan.nextInt();
		System.out.println("Podaj wykladnik");
		b = scan.nextInt();
		
		System.out.println(potegi(a,b));
		
		scan.close();
	}

	static int potegi(int a, int b)	{
		if (b == 0)
			return 1;
		else if (b % 2 != 0)
			return a*potegi(a, b-1);
		else
			return potegi(a, b/2)*potegi(a, b/2);
	}
}
