package naukadomatury;

import java.util.ArrayList;
import java.util.Scanner;

public class SitoEratostenesa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<>();
		
		int zakres;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Podaj zakres: ");
		zakres = scan.nextInt();
		
		for (int i = 2; i <= zakres; i++)
			list.add(i);
		
		System.out.println(Math.sqrt(zakres));
		
		for (int i = 2; i <= Math.sqrt(zakres); i++)
		{
				for (int j = 2; i*j <= zakres; j++)
					list.remove(new Integer(i*j));
		}
		
		
		for (Integer a: list)
		{
			System.out.println(a);
		}
			
		
		scan.close();
	}
}
