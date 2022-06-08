package JAVA_practice;
//数値を繰り返して入力し、0 が入力されたら入力を止め、
//それまでの合計を表示するプログラムを作成しなさい。
public class Q418 {
	public static void main(String[] args) {
		int num = 0;
		for(;;) {
			int n = new java.util.Scanner(System.in).nextInt();
			if( n == 0) {
				break;
			}
			num = num + n;
		}
		System.out.print(num);
	}
}
