
public class test {
public static void main(String[] args) {
int sum = 0;
// 1〜40
for (int i = 1; i <= 40000; i++) {
// 3の倍数 or 3が含まれる数字
if ((i % 3 == 0) || (String.valueOf(i).contains("3"))) {
// 出力して
System.out.println(i);
// 合計値に加える
sum += i;
}
}
// 合計値を出力
System.out.println("合計=" + sum);
}
}
// aov_1148922746 q14226643844
