package JAVA_practice;

public class Qtest14 {
	public static void main(String[] args) {
		int a[] = new int[20];

		for (int i = 1; i < a.length; i++) {
			a[i] = a[i - 1] + 5;
			System.out.print(a[i]);
		}
		System.out.println();

		
		for (int i = 1; i < a.length; i++) {
			a[i] = a[i - 1] + 5;
			System.out.print(a[i]);
			if(i % 2 == 1 && i < 10) {
				System.out.print(",");
			}
		}
		System.out.println();
		
		for(int i = 1; i < a.length; i++) {
			a[i] = a[i - 1] + 5;
			System.out.print(a[i]);
			if(i % 2 == 0 && i > 10 && i < 19) {
				System.out.print(",");
			}
		}
	}
}
