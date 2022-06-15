package ECFtech;

public class Qkannma {
	public static void main(String[] args) {
		boolean flg = true;
		String str = "";
		
		for(int i = 1; i < 10; i++) {
			if(flg) {
				str += i;
				flg = false;
			} else {
				str += "," + i;
			}
			System.out.print(str);
		}
	}
}
