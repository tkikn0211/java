package JAVA_practice;

public class Qhisigata {
	public static void main(String[]args) {
		int max = 5;
		int space = 0;
		int end = max / 2;
		
		for(int i = 0; i < max; i++) {
			
			if(i <= max /2) {
				space = (max /2) -i;
				end++;
			} else {
				space = i - (max / 2);
				end--;
			}
			
			for(int j = 0; j < end; j++) {
				System.out.print(j < space ? " ":"*");
			}
			System.out.println();
		}
	}
}
