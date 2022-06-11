package ECFtech;

import java.util.Arrays;

public class Q111 {
	public static void main(String[] args) {
		int[] num = {1,23,31,2,75,91};
		Arrays.sort(num);

		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + ",");
		}
	}
}
