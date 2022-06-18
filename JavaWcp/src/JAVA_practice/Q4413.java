package JAVA_practice;

public class Q4413 {
	public static void main(String[] args) {
		int strike = 0;
		int ball = 0;
		
		while(strike < 3 && ball < 4) {
			System.out.println("ストライク=1 or ボール=2 ？");
			int count = new java.util.Scanner(System.in).nextInt();
			
			if(count == 1) {
				strike++;
			} else if(count == 2) {
				ball++;
			}
		}
		System.out.println(ball + "ボール、" + strike + "ストライク");
	}
}
