package naukadomatury;

import java.util.Random;
import java.util.Scanner;

public class sortowania {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		Scanner scan = new Scanner(System.in);
		int tab[] = new int[10];
		int alg;

		for (int i = 0; i < tab.length; i++)
			tab[i] = rand.nextInt(100);

		System.out.println("Tablica przed sortowaniem: ");

		display(tab);
		System.out.println("Wybierz algorytm sortujacy: ");
		System.out.println("1 - babelkowe");
		System.out.println("2 - wybor");
		System.out.println("3 - scalanie");
		System.out.println("4 - quicksort");
		System.out.println("5 - wstawianie");
		alg = scan.nextInt();

		switch (alg) {
		case 1:
			babelkowe(tab);
			break;
		case 2:
			wybor(tab);
			break;
		case 3:
			tab = scalanie(tab, 0, 9);
			break;
		case 4:
			quicksort(tab, 0, 9);
			break;
		case 5:
			tab = wstawianie(tab);
			break;
		default:
			System.out.println("MISTAKE!");
		}

		display(tab);
		scan.close();
	}

	static void display(int tab[]) {
		for (int a : tab) {
			System.out.print(a + " ");
		}
		System.out.println("");
	}

	static void babelkowe(int tab[]) {
		for (int i = 0; i < tab.length; i++)
			for (int j = 0; j < tab.length; j++) {
				if (tab[j] > tab[i]) {
					swap(tab, i, j);
				}

			}

	}

	static int min_index(int tab[], int i) {
		int min = tab[i];
		int index = i;

		for (; i < tab.length; i++) {
			if (tab[i] < min) {
				min = tab[i];
				index = i;
			}
		}
		return index;
	}

	static void wybor(int tab[]) {

		for (int i = 0; i < tab.length; i++) {
			int index = min_index(tab, i);
			swap(tab, index, i);
		}
	}

	static int[] scal(int tab[], int tab2[]) {
		int tab3[] = new int[tab.length + tab2.length];

		int indeks1 = 0;
		int indeks2 = 0;
		int indeks3 = 0;

		while (indeks1 < tab.length && indeks2 < tab2.length) {
			if (tab[indeks1] > tab2[indeks2])
				tab3[indeks3++] = tab2[indeks2++];
			else
				tab3[indeks3++] = tab[indeks1++];
		}

		while (indeks1 < tab.length)
			tab3[indeks3++] = tab[indeks1++];

		while (indeks2 < tab2.length)
			tab3[indeks3++] = tab2[indeks2++];

		return tab3;
	}

	static int[] scalanie(int tab[], int poczatek, int koniec) {
		int p = (poczatek + koniec) / 2;
		int tabC[];

		if (koniec - poczatek == 0) {
			int temp[] = new int[1];
			temp[0] = tab[poczatek];
			return temp;
		} else
			tabC = scal(scalanie(tab, p + 1, koniec),
					scalanie(tab, poczatek, p));

		return tabC;
	}

	static void swap(int tab[], int a, int b) {
		int temp = tab[a];
		tab[a] = tab[b];
		tab[b] = temp;
	}

	// l - poczatkowy indeks, r - koncowy indeks
	static int podziel(int tab[], int l, int r) {
		int indeksPodzialu = (l + r) / 2;
		int pivot = tab[indeksPodzialu];
		swap(tab, indeksPodzialu, r);

		for (int i = l; i < r; i++) {
			if (tab[i] < pivot) {
				swap(tab, i, l);
				l++;
			}
		}
		swap(tab, l, r);
		return l;
	}

	static void quicksort(int tab[], int l, int r) {
		if (l < r) {
			int i = podziel(tab, l, r);
			quicksort(tab, l, i - 1);
			quicksort(tab, i + 1, r);
		}

	}

	static void przesun(int tab[], int p) {
		int j = 0;

		while (tab[p] > tab[j] && j < p) {
			j++;
		}

		if (j == p)
			return;
		else {
			int temp = tab[p];
			for (int i = p; i > j; i--) {
				tab[i] = tab[i - 1];
			}
			tab[j] = temp;
		}
	}

	static int[] wstawianie(int tab[]) {
		int temp[] = new int[tab.length];

		for (int i = 0; i < temp.length; i++) {
			temp[i] = tab[i];
			przesun(temp, i);
		}

		return temp;
	}

}
