package JAVA_practice;

public class Q44111 {
	public static void main(String[] args) {
		int num = new java.util.Scanner(System.in).nextInt();
		for (int i = 0, out = 0; i < num; i++) {
			System.out.print(out++);

			if (out > 9)
				out = 0;
		}

	}
}
