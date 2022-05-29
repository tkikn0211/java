package ECFtech;

public class Q009 {
	public static void main(String[] args) {
		int row = 6;
		int col = 10;

		for (int i = 0; i < row; i++) {
			int x = i % 2;

			for (int j = 0; j < col; j++) {
				if (x == j % 2) {
					System.out.print("■");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
