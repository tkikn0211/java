package ECFtech;

public class Q035 {
	public static void main(String[] args) {
		int []a = {68,55,72,93,87};
		
		int maxValue = a[0];
		int maxIndex = 0;
		
		for(int i = 1; i < a.length; i++) {
			if(maxValue < a[i]) {
				maxValue = a[i];
				maxIndex = i;
			}
		}
		System.out.println(maxValue);
		System.out.println(maxIndex);
	}
	
//	public static void main(String[]args) {
//		int []a = {68,55,72,87};
//		
//		int maxIndex = 0;
//		
//		for(int i = 1; i < a.length; i++) {
//			if(a[maxIndex] < a[i]) {
//				maxIndex = i;
//			}
//		}
//		System.out.println(a[maxIndex]);
//		System.out.println(maxIndex);
//	}
}
