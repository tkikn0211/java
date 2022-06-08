package JAVA_practice;
//個数を示す数値を入力し、その個数分だけ 0 ～ 9 の数字を表示するプログラムを作成しなさい。
//数字は 0, 1, 2, 3, , の順に表示し、9 の次は 0 に戻るものとします。
public class Q411 {
	public static void main(String[] args) {
		int num = new java.util.Scanner(System.in).nextInt();
		for(int i = 0; i <= num; i++) {
			  System.out.print( i % 10 );
		}
	}
}

