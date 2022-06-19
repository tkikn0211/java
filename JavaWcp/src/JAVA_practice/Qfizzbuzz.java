package JAVA_practice;

public class Qfizzbuzz {
	public static void main (String[] args) {
		System.out.println("FizzBuzz問題");
		System.out.println("数字を入力してください");
		
		int num = new java.util.Scanner(System.in).nextInt();
		
		if(num % 3 == 0 && num % 5 == 0) {
			System.out.print("FizzBuzz");
		} else if(num % 3 == 0) {
			System.out.print("Fizz");
		} else if(num % 5 == 0) {
			System.out.print("Buzz");
		} else {
			System.out.print("num");
		}
	}
}
