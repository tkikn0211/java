package ECFtech;

public class Q032 {
	public static void main(String[]args) {
		int [] a = {68,55,72,93,87};
		int min = 80;
		int max = 100;
		
		int sum = 0;
		
		for(int i = 0; i < a.length; i++) {
			if(min <= a[i] && a[i] <= max) {
				sum = sum + a[i];
			}
		}
		System.out.println(sum);
	}
}
