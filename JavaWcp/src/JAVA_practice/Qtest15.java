package JAVA_practice;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Qtest15 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// 入力パラメータを読み込む
		String input = br.readLine();
		String[] param = input.split(" ");// 入力値を空白で分解する
		int num1 = Integer.parseInt(param[0]);// ①
		int num2 = Integer.parseInt(param[1]);
		System.out.println(num1 + num2);
	}
}
