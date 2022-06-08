package JAVA_practice;
//整数を 10 回入力し、最大値と最小値を求めるプログラムを作成しなさい。
public class Q49 {
	public static void main(String[] args) {
		int maxValue = 0;
		int minValue = 0;
		for(int i = 0; i < 10; i++) {
			int value = new java.util.Scanner(System.in).nextInt();
			if(i == 0) {
				maxValue = value;
				minValue = value;
			}else {
			  if(maxValue < value) {
				  maxValue = value;
		    	} else if(minValue > value){
				  minValue = value;
			  }
			}
		}
		System.out.println("最大値：" + maxValue + ",最小値：" + minValue);
	}
}
