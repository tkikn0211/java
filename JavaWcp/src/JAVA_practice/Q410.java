package JAVA_practice;
//個数を示す数値を入力し、その個数分だけ‘*’を表示するプログラムを作成しなさい。
public class Q410 {
	public static void main(String[] args) {
		int sum = new java.util.Scanner(System.in).nextInt();
		for(int i = 1; i <= sum; i++) {
			System.out.print("*");
		}
	}
}
