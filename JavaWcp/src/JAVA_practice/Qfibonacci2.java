package JAVA_practice;

public class Qfibonacci2 {
	public static void main(String[] args) {
		System.out.println("フィボナッチ数列");
		int n1 = 0;
		int n2 = 1;
		int n3 = n1 + n2;
		int x = new java.util.Scanner(System.in).nextInt();
		int i = 1;
		
		while(i <= x -1) {
			n1 = n2;
			n2 = n3;
			n3 = n1 + n2;
			i++;
		}
		System.out.print(n1);
		
		
	}
}
