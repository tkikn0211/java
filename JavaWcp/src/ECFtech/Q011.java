package ECFtech;

public class Q011 {
	public static void main(String [] args) {
		int n = 13;
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n - i; j++) {
				System.out.print("■");
			}
			System.out.println();
		}
	}
}
