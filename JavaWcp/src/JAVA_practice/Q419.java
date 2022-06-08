package JAVA_practice;

public class Q419 {
	public static void main(String[] args) {
		int num = 0;
		int count = 0;

		for (;;) {
			int n = new java.util.Scanner(System.in).nextInt();

			if (n == 0) {
				break;
			}
			num = num + n;
			count++;
		}
		System.out.print("平均：" + num / count);
	}
}
