package ECFtech;

public class Q012 {
	public static void main(String[] args) {
		int n = 8;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == j) {
					System.out.print("■");
					break;
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
