package ECFtech;

public class test05 {
	public static void main(String[] args) {
		int number[] = new int[20];
		
		for(int i = 1; i < number.length; i++) {
			number[i] = number[i - 1] + 5;
			System.out.print(number[i]);
		}
		
		
	}
}
