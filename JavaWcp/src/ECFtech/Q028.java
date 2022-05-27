package ECFtech;

public class Q028 {
	public static void main(String[] args) {
		int [] a = {40,10,30,50,20};
		int min = 20;
		int max = 39;
		
		for(int i = 0; i < a.length; i++) {
			if(min <= a[i] && a[i] <= max) {
				System.out.println(a[i]);
			}
		}
	}
}