package Chapter8;

public class Main {
	public static void main(String[] args) {
		Hero h = new Hero();
		h.name = "ミナト";
		h.hp = 100;
		System.out.println("勇者" + h.name + "を生み出しました！");
		
		Matango m1 = new Matango();
		m1.hp = 50;
		m1.suffix = 'A';
		System.out.println("おばけキノコ" + m1.suffix + "が現れた！");

		Matango m2 = new Matango();
		m2.hp = 48;
		m2.suffix = 'B';
		System.out.println("おばけキノコ" + m2.suffix + "が現れた！");
		
		
		h.sit(5);
		h.slip();
		h.sit(25);
		h.run();
	}
}
