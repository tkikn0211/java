package ECFtech;

public class Q034_2 {
	public static void main(String[] args) {
		int[] a = { 68, 55, 72, 93, 87 };

		int minIndex = 0;

		for (int i = 1; i < a.length; i++) {
			if (a[minIndex] > a[i]) {
				minIndex = i;
			}
		}
		System.out.println(a[minIndex]);
		System.out.println(minIndex);
	}
}
