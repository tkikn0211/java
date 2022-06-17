package JAVA_practice;

public class Q447 {
	public static void main(String[] args) {
		int giants = 0;
		int tigers = 0;

		for (int i = 1; i <= 9; i++) {
			int gia = new java.util.Scanner(System.in).nextInt();
			System.out.println(i + "回表、巨人の得点は？" + gia);
			giants += gia;

			int tig = new java.util.Scanner(System.in).nextInt();
			System.out.println(i + "回裏、阪神の得点は？" + tig);
			tigers += tig;
		}
		System.out.println("巨人：" + giants + "点、" + "阪神：" + tigers + "点");
		if (giants > tigers) {
			System.out.println("巨人の勝ち");
		} else if (giants < tigers) {
			System.out.println("阪神の勝ち");
		} else {
			System.out.println("引き分け");
		}
	}
}
