package JAVA_practice;

public class Qpractice44 {
	public static void main(String[] args) {
		int[] number = { 3, 4, 9 };
		
		System.out.println("１桁の数字を入力してください");
		int input = new java.util.Scanner(System.in).nextInt();
		
		for(int i = 0; i < number.length;i++) {
			if(number[i] == input) {
				System.out.print("アタリ！");
			}
		}
	}
}
