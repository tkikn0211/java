package JAVA_practice;
//int 型の変数 x、y にそれぞれ数値を入力し、x が ｙ より大きい場合には“xはyより大きい”、
//x が y より小さい場合には“xはyより小さい”と表示するプログラムを作成しなさい。
public class Q33 {
	public static void main(String[] args) {
		int x = new java.util.Scanner(System.in).nextInt();
		int y = new java.util.Scanner(System.in).nextInt();
		
		if(x > y) {
			System.out.println("xはyより大きい");
		} else {
			System.out.println("xはyより小さい");
		}
	}
}
