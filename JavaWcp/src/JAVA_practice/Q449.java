package JAVA_practice;

public class Q449 {
	public static void main(String[] args) {
		int maxValue = 0;
		int minValue = 0;

		for (int i = 0; i < 10; i++) {
			int num = new java.util.Scanner(System.in).nextInt();

			if (i == 0) {
				maxValue = num;
				minValue = num;
			} else if (maxValue < num) {
				maxValue = num;
			} else if (minValue > num) {
				minValue = num;
			}
		}
		System.out.print("最大値：" + maxValue + "、最小値：" + minValue);
	}
}
