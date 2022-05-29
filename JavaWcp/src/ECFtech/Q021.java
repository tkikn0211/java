package ECFtech;

public class Q021 {
	public static void main(String[] args) {
		int n = 20;
		int bai = 3;
		
		for(int i = 1; i <= n; i++) {
			if(i % bai == 0) {
				System.out.print("?");
			} else {
			 System.out.print(i);
			}
			
			if(i != n) {
				System.out.print(",");
			}
			
		}
	}
}
