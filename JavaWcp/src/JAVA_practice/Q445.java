package JAVA_practice;

public class Q445 {
	public static void main(String[] args) {
		int x = 0;
		for(int i = 0; i < 10; i++) {
			int num = new java.util.Scanner(System.in).nextInt();
		    x += num;
		}
		System.out.print(x / 10);
	}
}
