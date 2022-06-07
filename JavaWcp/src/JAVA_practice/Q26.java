package JAVA_practice;
//年齢を訊ね、生まれてから現在までの、おおよその日数を表示するプログラムを作成しなさい。
//※ 	日数の計算は閏年等を考慮せず、年齢×365とする。

public class Q26 {
	public static void main(String[] args) {
		System.out.println("あなたの年齢を入力してください。");
		int x = new java.util.Scanner(System.in).nextInt();
		System.out.println("生まれてから現在まで" + (x * 365) + "日です。");
	}
}
