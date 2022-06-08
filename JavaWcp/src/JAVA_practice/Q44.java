package JAVA_practice;
//7 の階乗を計算し、表示するプログラムを作成しなさい
public class Q44 {
	public static void main(String[] args) {
		int x = 1;
		for(int i = 2; i <= 7; i++) {
			x = x * i;
			System.out.println(x);
		}
	}
}
