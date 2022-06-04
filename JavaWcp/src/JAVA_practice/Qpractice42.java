package JAVA_practice;

public class Qpractice42 {
	public static void main(String[] args) {
		int [] moneyList = {121902, 8302, 55100};
		
		for(int i = 0; i < moneyList.length; i++) {
			System.out.print(moneyList[i] + " ");
		}
		
		for(int sum : moneyList) {
			System.out.print(sum + " ");
		}
	}
}
