package JAVA_practice;
//数値を繰り返し入力し、合計が 100 を超えたら入力を止めて合計を表示するプログラムを作成しなさい。
public class Q4120 {
	public static void main(String[] args) {
		int sum = 0;
		while(sum <= 100) {
		 sum += new java.util.Scanner(System.in).nextInt();
		}
		System.out.println(sum);
	}
}
