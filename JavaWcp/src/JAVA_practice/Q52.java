package JAVA_practice;

public class Q52 {
	public static void main(String[] args) {
		String title = "こんにちは";
		String address = "###@gmail";
		String text = "よろしく";
		email(title, address, text);
	}

	public static void email(String title,String address,String text) {
		System.out.println(address + "に、以下のメールを送信しました。");
		System.out.println("件名：" + title);
		System.out.println("本文：" + text);
	}
}
