package Chapter8;

public class Matango {
	int hp;
	//定数フィールド（値を変えられない）
	final int LEVEL = 10;
	char suffix;
	
	public void run() {
		System.out.println("おばけキノコ" + this.suffix + "は、逃げ出した！");
		
	}
}
