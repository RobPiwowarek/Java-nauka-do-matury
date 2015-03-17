package alg;

import java.util.Scanner;

public class Palindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a;
		Scanner scan = new Scanner(System.in);

		System.out.println("Podaj wyraz");
		a = scan.nextLine();

		if (palindrom(a))
			System.out.println(a + " to palindrom.");
		else
			System.out.println("To nie jest palindrom.");

		scan.close();
	}

	static boolean palindrom(String a) {
		for (int i = 0, j = a.length()-1; i < j; i++, j--) {
			if (a.charAt(i) != a.charAt(j))
				return false;
		}

		return true;
	}
}
