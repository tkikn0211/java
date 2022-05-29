package ECFtech;

public class Q035 {
	public static void main(String[] args) {
		int[] a = { 68, 55, 72, 93, 87 };
		int manValue = a[0];
		int manIndex = 0;

		for (int i = 1; i < a.length; i++) {
			if (a[i] > manValue) {
				manValue = a[i];
				manIndex = i;
			}
		}
		System.out.println(manValue);
		System.out.println(manIndex);
	}

}