package JAVA_practice;

//サイズを示す数値を入力し、そのサイズの×印を何等かの文字で表示するプログラムを作成しなさい。
public class Q421 {
	public static void main(String[] args) {
		int size = 5;

		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				if (i == j || (size - i - 1) == j) {
					System.out.print("X");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
	}
}
