package javacore3;

import java.util.Scanner;

public class SanJiaoXing {
	Scanner input = new Scanner(System.in);
	int x = input.nextInt();

	public SanJiaoXing() {

		for (int i = 1; i < x; i++) {
			for (int j = 1; j < x - i; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= (2 * i) - 1; k++) {
				System.out.print("*");

			}
			System.out.println("");
		}
	}
}
