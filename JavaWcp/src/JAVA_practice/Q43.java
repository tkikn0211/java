package JAVA_practice;
//2 の 1 乗から 8 乗までを計算し表示するプログラムを作成しなさい。
public class Q43 {
	public static void main(String[] args) {
		int num = 1;
		for(int i = 1; i <= 8; i++) {
			num = num * 2;
			System.out.println(num);
		}
	}
}
