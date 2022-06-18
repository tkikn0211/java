package JAVA_practice;

public class Q4421 {
	public static void main(String[] args) {
		int num = new java.util.Scanner(System.in).nextInt();
		
		for(int i = 0; i < num; i++) {
			for(int j = 0; j < num; j++) {
				if(i == j || (num - i -1) == j) {
					System.out.print("X");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
	}
}
