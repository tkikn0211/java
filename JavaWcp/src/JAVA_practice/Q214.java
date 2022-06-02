package JAVA_practice;

//ランダムな数を生成する命令
public class Q214 {
	public static void main(String[] args) {
		int r = new java.util.Random().nextInt(90);
		System.out.println("あなたの年齢は" + r + "歳ですね？");

	}
}
