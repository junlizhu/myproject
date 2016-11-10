package javacore3;

import java.util.Scanner;

public class SanJiaoXing2 {

	Scanner input = new Scanner(System.in);
	int x = input.nextInt();

	public SanJiaoXing2() {
		for (int i = x; i > 0; i--) {
			for (int j = 1; j <= x - i; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= (2 * i) - 1; k++) {
				System.out.print("*");
			}
			System.out.println("");
		}

	}
}

