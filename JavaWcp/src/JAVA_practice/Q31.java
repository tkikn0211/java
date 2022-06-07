package JAVA_practice;
//int 型の変数 x、y にそれぞれ数値を入力し、x が y より大きい場合に、“xはyより大きい。”という文を表示するプログラムを作成しなさい。
public class Q31 {
 public static void main(String[] args) {
	 int x = new java.util.Scanner(System.in).nextInt();
	 int y = new java.util.Scanner(System.in).nextInt();
	 
	 if(y < x) {
		 System.out.println("ｘはｙより大きい");
	 }
 }
}
