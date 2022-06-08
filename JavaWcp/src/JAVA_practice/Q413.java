package JAVA_practice;

/*ストライク・カウントを数えるプログラムを作成しなさい。
１球ごとにストライクかボールかを入力する。
３ストライクまたは４ボールになったら入力を止め、ストライクとボールのカウントを表示する。*/
public class Q413 {
	public static void main(String[] args) {
		int strike = 0;
		int ball = 0;

		while (strike < 3 && ball < 4) {
			System.out.println("ストライク=1 or ボール=2 ？");
			int num = new java.util.Scanner(System.in).nextInt();
			if (num == 1) {
				strike++;
			} else if (num == 2) {
				ball++;
			}
		}
		System.out.println(ball + "ボール," + strike + "ストライク");
	}
}
