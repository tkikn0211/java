
public class Main {
	public static void main(String[] args) {
		//勇者を生成
		Hero h = new Hero();
		//フィールドに初期値をセット
		h.name = "ミナト";
		h.hp = 100;
		System.out.println("”勇者" + h.name + "を生み出しました！");
		
		Matango m1 = new Matango() ;
		m1.hp = 50;
		m1.suffix = 'A';
		System.out.println("おばけキノコ" + m1.suffix + "が現れた！");
		//勇者のメソッドを呼び出す
		h.sit(5);
		h.slip();
		h.sit(25);
		m1.run();
		h.run();
	}
}
