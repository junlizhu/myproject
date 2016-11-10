package javacore3;

import java.util.Scanner;
public class SanJiaoXing3 {

	Scanner input = new Scanner(System.in);
	int x = input.nextInt();
	public SanJiaoXing3() {
		if (x < 3) {
			System.out.println("打印空白等要三角形需要 x>=3!");
		} else {
			for (int i = 1; i <= x; i++) {
				for (int j = x - 1; j >= i; j--) {
					System.out.print(" ");
				}
				for (int k = 1; k <= (2 * i) - 1; k++) {
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
