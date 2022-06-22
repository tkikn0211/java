package JAVA_practice;

public class Qsannkakkei {
	public static void main(String[] args) {

		for (int i = 0; i < 5; i++) {
			
			for(int j = 0; j < 5 - (i + 1); j++) {
				System.out.print(" ");
			}
			
			for(int k = 0; k <= (i*2); k++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
}

/*・一つ目のfor文(i)で三角形の高さを定義する（今回は事前に変数max = 5としています。）
・2つ目のfor文(j)で空白("")を定義。
三角形のため、最初は空欄が最大、＊の数と反比例して徐々に空欄を少なくするので
条件式はj < max-i;となります。
・3つ目のfor文(k)で＊を出力。
・最後に１ループが終わる毎にprintlnで改行してあげる。（改行しないとずっと横に出力される）
*/
