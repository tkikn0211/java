package ECFtech;

public class Q022 {
	public static void main(String[] args) {
		for(int i = 1; i <= 9; i++) {
			for(int j = 1; j <= 9; j++) {
				int ans = i * j;
				System.out.print(ans);
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}
