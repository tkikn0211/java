package ECFtech;

public class Q022 {
	public static void main(String[] args) {
		int n = 9;

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				int x = i * j;

				System.out.print(x);
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}
