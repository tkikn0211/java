package JAVA_practice;

public class Q44155 {
	public static void main(String[] args) {
		System.out.println("素数判定プログラム");
		System.out.println("数字を入力してください(2以上)");
		int num = new java.util.Scanner(System.in).nextInt();
		int n = 0;
		
		if(num < 2) {
			System.out.println("1以下の数が入力されました。");
		} else if(num == 2) {
			System.out.println(num + "は素数です");
		} else {
			for(n = 2; n <= (num / 2); n++) {
				if((num % n) == 0)
					break;
			}
		}
		
		if(n > (num / 2)) {
			System.out.println(num + "は素数です");
		} else {
			System.out.println(num + "は素数ではありません");
		}
		
		
	}
}
