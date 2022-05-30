package ECFtech;

public class test04 {
	public static void main(String[] args) {
		int number[] = new int[20];
	    for (int i = 1; i <  number.length; i++) {
	      number[i] = number[i - 1] + 5;
	    }
	    for (int i = 0; i < number.length; i++) {
	    	System.out.print(number[i]);
	    }
	}
}
