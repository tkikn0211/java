package ECFtech;

public class SwapOption {
	public static void main(String[] args) {
		int x = 1;
		int y = 2;

		System.out.println("スワップ処理前");
		System.out.println("x:" + x);
		System.out.println("y:" + y);
		
		int work;
		work = x;
		x = y;
		y = work;
		
		System.out.println("スワップ処理後");
		System.out.println("x:" + x);
		System.out.println("y:" + y);
		
	}
}
