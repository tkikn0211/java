package JAVA_practice;

//曜日と、午前、午後、夜間の区別を入力し、病院が開いているか、休診であるかを表示するプログラムを作成しなさい。
public class Q39 {
	public static void main(String[] args) {
		System.out.println( "曜日を選択してください" );
		System.out.print( "0=日曜、1=月曜、2=火曜、3=水曜、4=木曜、5=金曜、6=土曜" );
		int day = new java.util.Scanner(System.in).nextInt();
		
		System.out.println( "時間帯を選択してください" );
		System.out.print( "0=午前、1=午後、2=夜間" );
		int zone = new java.util.Scanner(System.in).nextInt();
		
		boolean  hospital = true;
		
		if(day == 0) {
			hospital = false;
		} else if(zone == 0 && (day==2 || day == 5)) {
			hospital = false;
		}else if(zone == 1 && day ==6) {
			hospital = false;
		}else if(zone == 2 && (day ==3 || day == 6)) {
			hospital = false;
		}
		
		if(hospital)
			System.out.println("診察しています");
		else
			System.out.println("休診です");
	}
}

