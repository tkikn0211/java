package ECFtech;

public class ArrayOption {
	public static void main(String[] args) {
		int [] a = new int [5];
		a[0] = 10;
		a[1] = 25;
		a[2] = 9;
		a[3] = 3;
		a[4] = 15;
		
		System.out.println(a[0]);
		System.out.println(a[1]+a[4]);
		
		
		int [] b = {4, 8, 12};
		
		int x = a[3] * b[2];
		System.out.println(x);
		
		
	}
}
