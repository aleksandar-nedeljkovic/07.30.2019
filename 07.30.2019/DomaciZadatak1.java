package dnu;

import java.util.Scanner;

public class DomaciZadatak1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, c;
		System.out.println("Unesite 1. broj: ");
		a = sc.nextInt();
		System.out.println("Unesite 2. broj: ");
		b = sc.nextInt();
		System.out.println("Unesite 3. broj: ");
		c = sc.nextInt();

		System.out.print("Najmanji broj je: " + najmanji(a, b, c));

	}

	static int najmanji(int a, int b, int c) {
		int min = a;

		if (b < min)
			min = b;

		if (c < min)
			min = c;

		return min;

	}

}
