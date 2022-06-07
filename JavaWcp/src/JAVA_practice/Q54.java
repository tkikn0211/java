package JAVA_practice;

public class Q54 {
	public static void main(String[] args) {
		double triangleArea = calcTriangleArea(10.0, 5.0);
		System.out.println("三角形の面積：" + triangleArea + "平方ｃｍ");
		double circleArea = calcCircleArea(5.0);
		System.out.println("円の面積" + circleArea + "平方ｃｍ");
	}

	public static double calcTriangleArea(double height, double bottom) {
		double are = (bottom * height) / 2;
		return are;
	}

	public static double calcCircleArea(double radius) {
		double area = radius * radius * 3.14;
		return area;
	}
}
