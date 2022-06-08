package JAVA_practice;

public class Q417 {
	public static void main(String[] args) {
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				int ans = i * j;
				System.out.print(ans);
				if (ans < 10) {
					System.out.print(" ");
				}
				System.out.print(" ");
			}
			System.out.println();
		}

	}
//	public static void main(String[] args) {
//		for (int i = 1; i <= 9; i++) {
//			for (int j = 1; j <= 9; j++) {
//				int ans = i * j;
//				System.out.printf("%2d",ans);
//			}
//			System.out.println();
//		}
//
//	}
}
