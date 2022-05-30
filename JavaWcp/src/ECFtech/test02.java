package ECFtech;

public class test02 {
	public static void main(String[] args) {
		int sum = 0;
		int count = 0;

		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				sum = sum + i;
				count++;
			}
		}
		System.out.println(sum);
		System.out.println(count);
	}
}
