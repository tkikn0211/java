package JAVA_practice;

//２つの整数値を入力し、大きい方（小さくない方）の数を表示するプログラムを作成しなさい。
public class Q32 {
	public static void main(String[] args) {
		int x = new java.util.Scanner(System.in).nextInt();
		int y = new java.util.Scanner(System.in).nextInt();

		if (x > y) {
			System.out.println(x);
		} else {
			System.out.println(y);
		}
	}
}
