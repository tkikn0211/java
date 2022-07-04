package 練習問題8._6;

import java.util.Random;

public class Cleric {
	String name ;
	int hp = 50;
	final int MAXHP = 50;
	int mp = 10;
	final int MAXMP = 10;
	
	public void selfAid() {
		System.out.println(this.name + "は、セルフエイドを唱えた！");
		this.mp -= 5;
		this.hp = this.MAXHP;
		System.out.println("HPが最大まで回復した！");
	}
	
	public int pray(int sec) {
		System.out.println(this.name + "は" + sec + "秒間祈りました！");
		
		int recover = new Random().nextInt(3) + sec;
		int recoverActual = Math.min(this.MAXHP - this.hp, recover);
		
		this.hp += recoverActual;
		System.out.println("MPが" + recoverActual + "回復した！");
		return recoverActual;
	}
}
