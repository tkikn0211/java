package JAVA_practice;

public class Q4420 {
	public static void main(String[] args) {
		int num = new java.util.Scanner(System.in).nextInt();
		
		for(int i = 0; i < num; i++) {
			for(int j = 0; j < i + 1; j++) {
				System.out.print("$");
			}
			System.out.println();
		}
	}
}
