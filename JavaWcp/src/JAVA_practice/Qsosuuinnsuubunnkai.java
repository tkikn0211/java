package JAVA_practice;

public class Qsosuuinnsuubunnkai {
	public static void main(String[] args) {
		int num = 2489;
		
		for(int i = 2; i <= num; i++) {
			if(num % i == 0) {
				num /= i;
			}
			if(num == 1) {
				System.out.print(i);
			} else {
				System.out.print(i + "×");
				i = 1;
			}
		}
	}
}