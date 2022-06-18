package JAVA_practice;

public class Q4415 {
	public static void main(String[] args) {
		System.out.println("素数判定プログラム");
		System.out.println("数字を入力してください");
		int num = new java.util.Scanner(System.in).nextInt();
		int n;

		for (n = 2; n <= (num / 2); n++) {
			if ((num % n) == 0)
				break;
		}

		if (n > (num / 2)) {
			System.out.println(num + "は素数です");
		} else {
			System.out.println(num + "は素数ではありません");
		}
	}
}
