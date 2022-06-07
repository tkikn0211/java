package ECFtech;

public class Q11111 {
	public static void main(String[] args) {
		int a[] = new int[20];

		for(int i = 1; i < a.length; i++) {
			a[i] = a[i - 1] + 5;
			System.out.print(a[i]);
		}
		System.out.println();
		
		
		for (int i = 1; i < a.length; i++) {
			a[i] = a[i - 1] + 5;
			System.out.print(a[i]);
			if (a[i] % 2 != 0 && i < 10) {
				System.out.print(",");
			}
		}
		System.out.println();

		
		for (int i = 1; i < a.length; i++) {
			a[i] = a[i - 1] + 5;
			System.out.print(a[i]);
			if (a[i] % 2 == 0 && i > 11 && i < 19) {
				System.out.print(",");
			}
		}
	}
}
