package naukadomatury;

import java.util.Scanner;

// schemat hornera

public class Horner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int stopien;
		int x;
		System.out.println("Podaj stopien wielomianu");
		stopien = scan.nextInt();
		stopien++;
		
		int wsp[] = new int[stopien];
	
		for (int i = 0; i < stopien; i++)
		{
			System.out.println("Podaj wspolczynnik przy " + (stopien-i-1) + " potedze");
			wsp[i] = scan.nextInt();
		}
		
		System.out.println("Podaj x");
		x = scan.nextInt();
		
		System.out.println(horner(wsp, stopien, x) + " " + rekur(wsp, stopien-1, x));
		
		scan.close();
	}

	static int horner(int wsp[], int stp, int x)
	{
		int wynik = wsp[0];
		
		for (int i = 1; i < stp; i++)
			wynik = wynik*x + wsp[i];
		
		return wynik;
	}
	
	static int rekur(int wsp[], int stp, int x)
	{	
		if (stp == 0)
			return wsp[stp];
		else
			return x*rekur(wsp, stp-1, x)+wsp[stp];
	}
}
