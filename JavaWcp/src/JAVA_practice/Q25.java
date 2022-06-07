package JAVA_practice;
//２つの整数値を入力し、平均値を求めるプログラムを作成しなさい。
//※ 	計算は整数で行い、小数点以下は切り捨ててよい。

public class Q25 {
	public static void main(String[] args) {
		int x = new java.util.Scanner(System.in).nextInt();
		int y = new java.util.Scanner(System.in).nextInt();

		int z = (x + y) / 2;
		System.out.println("平均値=" + z);
	}
}
