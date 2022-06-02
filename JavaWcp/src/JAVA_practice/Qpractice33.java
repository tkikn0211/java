package JAVA_practice;

public class Qpractice33 {
	public static void main(String[] args) {
		int isHungry = 1;
		String food = "ステーキ";

		String greeting = "こんにちは";
		System.out.println(greeting);

		if (isHungry == 0) {
			System.out.println("はらぺこです");
		} else {
			System.out.println("お腹いっぱいです");
		}

		if (isHungry == 1) {
			System.out.println(food + "をいただきます。"); 
		}
		System.out.println("ごちそうさまでした");

	}
}
