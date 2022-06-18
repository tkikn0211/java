package JAVA_practice;

public class Q4414 {
	public static void main(String[] args) {
		int strike = 0;
		int ball = 0;
		
		while(strike < 3 && ball < 4) {
			System.out.println("ストライク=1 or ボール=2 or ファウル= 3？");
			int count = new java.util.Scanner(System.in).nextInt();
			
			if(count == 1) {
				strike++;
			} else if(count == 2) {
				ball++;
			} else if(count == 3) {
				if(strike < 2) {
					strike++;
				}
			}
		}
		System.out.println(ball + "ボール、" + strike + "ストライク");
	}
}
