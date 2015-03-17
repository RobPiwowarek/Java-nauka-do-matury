package alg;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a, b;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Podaj pierwszy wyraz");
		a = scan.nextLine();
		System.out.println("Podaj drugi wyraz");
		b = scan.nextLine();
		
		if (anagram(a,b))
			System.out.println(a + " to anagrma " + b);
		else
			System.out.println("To nie sa anagramy");
		
		scan.close();
	}
	
	static boolean anagram(String a, String b)
	{
		char [] a_temp = a.toCharArray();
		char [] b_temp = b.toCharArray();
		
		Arrays.sort(a_temp);
		Arrays.sort(b_temp);
		
		if (Arrays.equals(a_temp, b_temp))
			return true;
		else
			return false;
	}

}
