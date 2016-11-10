package javacore3;

import java.util.Scanner;

public class SanJiaoXing4 {
	Scanner input = new Scanner(System.in);
	int x = input.nextInt();

	public SanJiaoXing4() {

		if (x < 3) {
			System.out.println("打印空白等腰三角形 需要 x>=3!");
		} else {
			for (int i = x; i > 0; i--) {
				for (int j = 1; j <= x - i; j++) {
					System.out.print(" ");
				}
				for (int k = 1; k <= 2 * i - 1; k++) {
					if (i == x || k == 1 || k == (2 * i - 1)) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				}
				System.out.println("");
			}
		}
	}
}
