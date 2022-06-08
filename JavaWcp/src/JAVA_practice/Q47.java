package JAVA_practice;
/*次のプログラムを作成しなさい。
巨人、阪神戦で毎回の得点を入力する。（１回～９回）
入力が終わったら、それぞれの得点とどちらが勝ったかを表示する。
※ 試合は巨人の先行とする。*/

public class Q47 {
	public static void main(String[] args) {
		int giants = 0;
		int tigers = 0;
		System.out.println("得点を入力してください");
		for (int i = 1; i <= 9; i++) {
			System.out.println(i + "回表、巨人の得点は？");
			giants += new java.util.Scanner(System.in).nextInt();
			System.out.println(i + "回裏、阪神の得点は？");
			tigers += new java.util.Scanner(System.in).nextInt();
		}
		System.out.println("巨人：" + giants + "点,阪神：" + tigers + "点");
		if (giants > tigers) {
			System.out.println("巨人の勝ち");
		} else if (tigers > giants) {
			System.out.println("阪神の勝ち");
		} else {
			System.out.println("引き分け");
		}
	}
}
