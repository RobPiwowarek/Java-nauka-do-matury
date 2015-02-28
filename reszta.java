package naukadomatury;

import java.util.Random;

public class reszta {

	// problem wydawania reszty
	// majac nominaly 1, 2, 5 rozmien X zlotych. 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		int x = rand.nextInt(100);
		int tab[] = {1, 2, 5};
		
		System.out.println(x);
		
		while (x != 0)
		{
			int a = max(tab, x);
			x = x - a;
			System.out.println(a);
		}
		
	}
	
	static int max(int tab[], int a)
	{
		int i = tab.length-1;
		for (; i > 0; i--)
			if (a - tab[i] > 0)
				break;
		
	return tab[i];	
	}
}
