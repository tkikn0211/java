package JAVA_practice;

public class Q4418 {
	public static void main(String[] args) {
		int sum = 0;
		
		for(;;) {
			int num = new java.util.Scanner(System.in).nextInt();
			
			if(num == 0) {
				break;
			} else {
				sum += num;
			}
		}
		System.out.print(sum);
	}
}
