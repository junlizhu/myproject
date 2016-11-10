
public class MaiJi {

	public static void main(String[] args) {

		int k = 0; // 小鸡数
		for (int i = 0; i <= 20; i++) { // 公鸡数
			for (int j = 0; j <= 33; j++) { // 母鸡数
				k = 100 - i - j; // 一共100只鸡
				if (k % 3 == 0 && (5 * i + 3 * j + k / 3) == 100 && i + j + k == 100) {
					System.out.println("公鸡: " + i + "  母鸡： " + j + "  小鸡： " + k);

				}
			}
		}
	}
}
