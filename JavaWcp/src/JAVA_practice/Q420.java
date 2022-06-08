package JAVA_practice;

//サイズを示す数値を入力し、何等かの文字で例のような三角形を表示するプログラムを作成しなさい。
public class Q420 {
	public static void main(String[] args) {
		int n = 4;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < i + 1; j++) {
				System.out.print("$");
			}
			System.out.println();
		}
	}
}
