
public class Maiji1 {

	public static void main(String[] args) {
		int i, j;
		for (int m = 0; m < 100; m = m + 3) {
			i = (8*m-600) / 6;
			j = (600-7*m) / 3;
if ((i >= 0) && (j >= 0)  && (i + j + m == 100) && (5 * i + 3 * j + m / 3 == 100) && (m % 3 == 0)) {
	     System.out.println("公鸡: " + i + "  母鸡： " + j + "  小鸡： " + m);


			}

		}

	}

}
