package ECFtech;

public class Q036 {
	public static void main(String[] args) {
		int [] a = {68,55,72,93,87};
		System.out.println("並び替え前");
		for(int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		
		for(int i = 0; i < a.length;i++) {
			int minValue = i;
			
			for(int j = i +1;j < a.length;j++) {
				if(a[minValue] > a[j]) {
					minValue = j;
				}
			}
			int num = a[i];
			a[i] = a[minValue];
			a[minValue] = num;
		}
		System.out.println("並び替え後");
		for(int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		
		  
	}

		
}
