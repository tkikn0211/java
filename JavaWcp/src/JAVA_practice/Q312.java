package JAVA_practice;

//好きな鮨（すし）を選択させ、それに対応したメッセージを表示する、鮨占いプログラムを作成しなさい。
public class Q312 {
	public static void main(String[] args) {
		System.out.println("お好きな寿司を選んでください");
		System.out.println("1:まぐろ 2:サーモン 3:えび 4:こはだ 5:さわら");
		int sushi = new java.util.Scanner(System.in).nextInt();

		switch (sushi) {
		case 1:
			System.out.println("大吉");
			break;
		case 2:
			System.out.println("中吉");
			break;
		case 3:
			System.out.println("吉");
			break;
		case 4:
			System.out.println("小吉");
			break;
		case 5:
			System.out.println("凶");
			break;
		}
	}
}
