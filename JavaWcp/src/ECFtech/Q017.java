package ECFtech;

public class Q017 {
	public static void main(String [] args) {
		int n = 20;
		int bai = 4;
		
		for(int i = 1; i <= n; i++) {
			if(i % bai == 0) {
				System.out.println(i);
			}
		}
	}
}
