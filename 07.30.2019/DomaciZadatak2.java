package dnu;

import java.util.Scanner;

public class DomaciZadatak2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Unesite N: ");
		n = sc.nextInt();
		int k;
		System.out.println("Unesite K: ");
		k = sc.nextInt();

		System.out.println(funkcija(n, k));

	}

	static double funkcija(int n, int k) {
		double sum = 0;
		for (int i = 0; i <= n; ++i) {
			sum += (i + 1) / (double) (k + i);
		}
		return sum;
	}
}
