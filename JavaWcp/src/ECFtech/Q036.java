package ECFtech;

public class Q036 {
	public static void main(String[] args) {
		int[] a = { 68, 55, 72, 93, 87 };

		System.out.println("並び替える前");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}

		for (int i = 0; i < a.length; i++) {
			int minIndex = i;

			for (int j = i + 1; j < a.length; j++) {
				if(a[minIndex] > a[j]) {
					minIndex = j;
				}
			}
			
			int work = a[i];
			a[i] = a[minIndex];
			a[minIndex] = work;
		}
		
		System.out.println("並び替え後");
		for(int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
}
