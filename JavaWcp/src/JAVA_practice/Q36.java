package JAVA_practice;
//整数値を入力し、以下の４つの分類から該当するものを表示するプログラムを作成しなさい。

//“正の偶数”、“正の奇数”、“負の偶数”、“負の奇数”
//※ 	負の数であっても、2 で割り切れれば偶数、そうでなければ奇数とする。
//※ 	0 は“正の偶数”であるとする。

public class Q36 {
	public static void main(String[] args) {
		int x = new java.util.Scanner(System.in).nextInt();

		if (x % 2 == 0) {
			if (x >= 0) {
				System.out.print("正の偶数");
			} else {
				System.out.print("負の遇数");
			}
		} else {
			if (x >= 0) {
				System.out.print("正の奇数");
			} else {
				System.out.print("負の奇数");
			}
		}
	}
}
