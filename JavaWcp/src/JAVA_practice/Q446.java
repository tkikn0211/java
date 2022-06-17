package JAVA_practice;

public class Q446 {
	public static void main(String[] args) {
		int win = 0;
		int lose = 0;
		for (int i = 0; i < 10; i++) {
			int num = new java.util.Scanner(System.in).nextInt();
			if (num == 1) {
				win++;
			} else {
				lose++;
			}
		}
		System.out.print("勝ちの総数：" + win + "、負けの総数：" + lose);
	}
}
