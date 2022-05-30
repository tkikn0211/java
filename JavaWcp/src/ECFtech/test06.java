package ECFtech;

public class test06 {
	public static void main(String[]args) {
		int x = 0;
		int y = 0;
		
		for(int i = 1; i < 10;i++ ) {
			if(i % 2 == 0) {
				x = x +i;
			} else {
				y = y + i;
			}
		}
		System.out.println("奇数の和は" + x + "です");
		System.out.println("奇数の和は" + y + "です");
	}
}
