package ECFtech;

public class Q033 {
	public static void main(String[] args) {
		String[] a = { "abc", "abcd", "abcde", "xx", "yyy" };
		String key = "abcde";

		int i;
		for (i = 0; i < a.length; i++) {
			if (a[i].equals(key)) {
				break;
			}
		}
		if (i < a.length) {
			System.out.println(i);
		} else {
			System.out.println("Notfount");
		}
	}
}
