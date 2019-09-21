package dnu;

import java.util.Scanner;

public class DomaciZadatak3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Unesi n ");
		int n = input.nextInt();
		for (int i = 1; i <= n; i++) {
			for (int j = 0; j <= n - i; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("*");
				
				//Nisam uspeo da skontam kako da napravim prazan prostor izmedju dva trougla!!
			}

			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
