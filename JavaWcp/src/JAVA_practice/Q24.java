package JAVA_practice;
//int 型の変数 x、y にそれぞれ数値を入力し、x と y の和、差（x－y）、積、商と余り(x÷y)、を表示するプログラムを作成しなさい。
public class Q24 {
	public static void main(String[] args) {
		int x = new java.util.Scanner(System.in).nextInt();
		int y = new java.util.Scanner(System.in).nextInt();
		
		System.out.println("和:" + (x + y));
		System.out.println("差" + (x-y));
		System.out.println("積" + (x*y));
		System.out.println("商"+ (x/y) + "余り"+ (x%y));
	}
}
