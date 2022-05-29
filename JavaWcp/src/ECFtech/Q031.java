package ECFtech;

public class Q031 {
	public static void main(String[] args) {
		int[] a = { 68, 55, 72, 93, 87 };
		int sum = 0;

		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i];
		}
		int x = sum / a.length;
		System.out.print(x);
	}
}
