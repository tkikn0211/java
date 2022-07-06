package 練習問題11_6;

public abstract class TangibleAsset extends Asste  implements Thing{
	String color;
	double weight;
	
	public TangibleAsset(String name, int price, String color){
		super(name, price);
		this.color = color;
	}
	
	public String getColor() {
		return this.color;
	}
	public double getWeight() {
		return this.weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
}
