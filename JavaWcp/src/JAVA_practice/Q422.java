package JAVA_practice;

//フィボナッチ数列を表示するプログラムを作成しなさい。
//最初の２つの項を 0、1 とし、1000 まで（ 1000 以下の項）を表示するものとします。
public class Q422 {
	public static void main(String[] args) {
		int n1 = 0;
		int n2 = 1;
		int n3 = n1 + n2;

		while (n1 <= 1000) {
			System.out.print(n1 + ",");

			n1 = n2;
			n2 = n3;
			n3 = n1 + n2;
		}
	}
}
