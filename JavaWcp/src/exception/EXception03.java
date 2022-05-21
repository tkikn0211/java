package exception;

public class EXception03 {
	public static void main(String[] args) {
		try {
			EXception03.division(100, 0);
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException例外が発生");
		} catch (IllegalArgumentException e) {
			System.out.println("IllegalArgumentWxception例外が発生");
			throw e;
		}
	}
	
	public static void division(int a, int b) {
		System.out.println(a + "÷" + b + "は？");
		if (b == 0) {
			throw new IllegalArgumentException("引数は不正です");
		}
		int result = a / b;
		System.out.println("計算結果" + result);
	}
	
}