package JAVA_practice;

//整数、0 か 1 を 10 回入力する。これを対戦成績と考え、0 を負け、1 を勝ちとして、
//勝ちの総数、負けの総数を表示するプログラムを作成しなさい。
public class Q46 {
	public static void main(String[] args) {
		int x = 0;
		int y = 0;
		System.out.println("０か１を１０回入力してください");
		for (int i = 0; i < 10; i++) {
			int num = new java.util.Scanner(System.in).nextInt();
			if (num == 0) {
				x = x + 1;
			} else if (num == 1) {
				y = y + 1;
			}
		}
		System.out.println("勝ちの総数" + y + "回");
		System.out.println("負けの総数" + x + "回");
	}
}
