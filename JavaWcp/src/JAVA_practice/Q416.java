package JAVA_practice;

//2 以上の数値を入力し、素因数分解した結果を表示しなさい。
public class Q416 {
	public static void main(String[] args) {
		int n = new java.util.Scanner(System.in).nextInt();
		for (int x = 2; n > 1; x++) {
			while ((n % x) == 0) {
				System.out.print(x + " ");
				n /= x;
			}
		}
	}
}
