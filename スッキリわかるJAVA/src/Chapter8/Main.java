package Chapter8;

public class Main {
	public static void main(String[] args) {
		Hero h = new Hero("ミナト");
		System.out.println("勇者" + h.name + "を生み出しました！");
		System.out.println(h.name + "のHPは" + h.hp + "です。");
		
		Matango m1 = new Matango();
		m1.hp = 50;
		m1.suffix = 'A';
		System.out.println("おばけキノコ" + m1.suffix + "が現れた！");

		Matango m2 = new Matango();
		m2.hp = 48;
		m2.suffix = 'B';
		System.out.println("おばけキノコ" + m2.suffix + "が現れた！");
		
		Sword s = new Sword();
		s.name = "炎の剣";
		h.sword = s;
		System.out.println("現在の武器は" + h.sword.name);
		
		Wizard w = new Wizard();
		w.name = "スガワラ";
		w.hp = 50;
		w.heal(h);
		
		h.attack();
		h.sit(5);
		h.slip();
		h.sit(25);
		h.run();
	}
}
