package ECFtech;

public class Q035_2 {
	public static void main(String[] args) {
		int[] a = { 68, 55, 72, 93, 87 };
		int maxIndex = 0;

		for (int i = 1; i < a.length; i++) {
			if (a[maxIndex] < a[i]) {
				maxIndex = i;
			}
		}
		System.out.println(a[maxIndex]);
		System.out.println(maxIndex);
	}
}
