package JAVA_practice;

//自然数（正の整数）を 10 回入力し、最大値を求めるプログラムを作成しなさい。
public class Q48 {
	public static void main(String[] args) {
		int maxValue = 0;
		for (int i = 0; i < 10; i++) {
			int value = new java.util.Scanner(System.in).nextInt();
			if (maxValue < value) {
				maxValue = value;
			}
		}
		System.out.println("最大値：" + maxValue);
	}
}
