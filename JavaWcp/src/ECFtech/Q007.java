package ECFtech;

public class Q007 {
	public static void main(String[] args) {
		int row = 11;
		int col = 15;
		for(int i = 0; i < row; i++) {
			if(i % 2 == 0) {
				for(int j = 0; j < col; j++) {
					System.out.print("■");
				}
			}
			System.out.println();
		}
	}
}