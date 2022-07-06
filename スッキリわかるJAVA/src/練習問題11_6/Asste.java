package 練習問題11_6;

public abstract class Asste {
	String name;
	int price;
	
	public Asste(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	public String getName() {
		return this.name;
	}
	public int getPrice() {
		return this.price;
	}
}
