package JAVA_practice;

public class Q4419 {
	public static void main(String[] args) {
		int sum = 0;
		int count = 0;
		
		for(;;) {
			int num = new java.util.Scanner(System.in).nextInt();
			if(num == 0) {
				break;
			} else {
				sum += num;
				count++;
			}
		}
		System.out.print(sum /count);
	}
}
