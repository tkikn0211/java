package ECFtech;

public class Q026 {
	public static void main(String[] args) {
		int[] a = { 10, 20, 30, 40, 50 };

		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
			if (i != a.length - 1) {
				System.out.print(",");
			}
		}
	}
}
