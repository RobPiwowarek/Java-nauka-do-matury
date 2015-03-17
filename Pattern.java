package alg;

import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
		String a, b;
		Scanner scan = new Scanner(System.in);

		System.out.println("Podaj tekst");
		a = scan.nextLine();
		System.out.println("Podaj wzorzec");
		b = scan.nextLine();

		if (pattern(a, b))
			System.out.println("Znaleziono wzorzec");
		else
			System.out.println("Nie znaleziono wzorca");

		scan.close();
	}

	static boolean pattern(String a, String b) {
		char first = b.charAt(0);
		int len = b.length();

		for (int i = 0; i < a.length(); i++) {
			if (a.charAt(i) == first)
				if (b.compareTo(a.substring(i, i + len)) == 0)
					return true;

		}

		return false;
	}
}
