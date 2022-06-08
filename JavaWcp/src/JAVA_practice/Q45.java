package JAVA_practice;
//整数を 10 回入力し、平均値を求めるプログラムを作成しなさい。
public class Q45 {
	public static void main(String[] args) {
		int x = 0;
		for(int i = 0; i < 10; i++) {
			int num = new java.util.Scanner(System.in).nextInt();
			x = x + num;
		}
		System.out.println("平均値：" + (x / 10));
	}
}
