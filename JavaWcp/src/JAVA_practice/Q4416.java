package JAVA_practice;

public class Q4416 {
	public static void main(String[] args) {
		int num = new java.util.Scanner(System.in).nextInt();
		
		for(int i = 2; num > 1; i++) {
			while((num % i) == 0) {
				System.out.print(i + " ");
				num /= i;
			}
		}
	}
}
