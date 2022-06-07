package JAVA_practice;
/*試験の点数を入力し、対応する成績を表示するプログラムを３種類作成しなさい。
試験は 100 点満点（ 0 点～ 100 点）とし、点数と成績の対応を以下のようにします。
ケース1
    60 点以上：“合格”
    60 点未満：“不合格”
ケース2
    80 点以上：“たいへんよくできました。”
    60 点以上、80 点未満：“よくできました。”
    60 点未満：“ざんねんでした。”
ケース3
    80 点以上：“優”
    70 点以上、80 点未満：“良”
    60 点以上、70 点未満：“可”
    60 点未満：“不可” */

public class Q37 {
	public static void main(String[] args) {
		// ケース１
		int x = new java.util.Scanner(System.in).nextInt();
		if (x >= 60) {
			System.out.println("合格");
		} else {
			System.out.println("不合格");
		}

		// ケース２

		if (x >= 80) {
			System.out.println("大変良くできました");
		} else if (x >= 60) {
			System.out.println("よくできました");
		} else {
			System.out.println("残念でした");
		}

		// ケース３
		if (x >= 80) {
			System.out.println("優");
		} else if (x >= 70) {
			System.out.println("良");
		} else if (x >= 60) {
			System.out.println("可");
		} else {
			System.out.println("不可");
		}
	}

}
