package JAVA_practice;

public class Q17 {
	public static void main(String[] args) {
		int x = 3;
		int y = 7;
		int num;

		num = x;
		x = y;
		y = num;

		System.out.println("x=" + x + ",y=" + y);
	}
}
