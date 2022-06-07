package JAVA_practice;
//正の整数値を入力し、それが偶数か奇数かを判定するプログラムを作成しなさい。
//※ 	奇数、偶数の判定には除算の余りを利用する。

public class Q35 {
	public static void main(String[] args) {
		int x = new java.util.Scanner(System.in).nextInt();
		
		if(x % 2 == 0) {
			System.out.print("偶数");
		} else {
			System.out.print("奇数");
		}
	}
}
