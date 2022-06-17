package JAVA_practice;

public class Q448 {
	public static void main(String[] args) {
		int maxValue = 0;
		
		for(int i = 0; i < 10; i++) {
			int num = new java.util.Scanner(System.in).nextInt();
			if( maxValue < num) {
				maxValue = num;
			}
		}
		System.out.print(maxValue);
	}
}
