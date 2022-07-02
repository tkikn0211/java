package 練習問題10_6;

import cord9_3.Hero;

public class PoisinMatango extends Matango{
	int poisonCount = 5;
	
	public PoisinMatango (char saffix) {
		super(suffix);
	}
	
	public void attack(Hero h) {
		super.attack(h);
		if(this.poisonCount > 0) {
			System.out.println("さらに毒の胞子をばら撒いた。");
			int dmg = h.hp / 5;
			h.hp -= dmg;
			System.out.println(dmg + "ポイントのダメージ！");
			this.poisonCount--;
		}
	}

}
