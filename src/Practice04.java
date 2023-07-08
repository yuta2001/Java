//import java.util.Scanner;

public class Practice04 {
    public static void main(String[] args) {
        System.out.println("Hello 2023-7-8");
        // Scanner scanner = new Scanner(System.in);
        // System.out.println("文字を入力してください!!");
        // String input_str = scanner.nextLine();
        // System.out.println(input_str + "が入力されました!!");

        // 配列の基本
        // int[]・・・初期化
        // ary・・・配列変数
        // new int[5]・・・int型の要素を5つ作成する
        int[] ary = new int[5];
        int num = ary.length;// .lengthは長さを調べる
        System.out.println(num);

        // 配列[1]に10を代入
        ary[1] = 10;
        System.out.println(ary[1]);

        // 省略の書き方
        int[] ary_2 = new int[] { 10, 20, 30, 40, 50 };
        int num_2 = ary_2.length;
        System.out.println(num_2);

        // 配列の応用
        int[] ary_test = { 10, 20, 30 };

        for (int i = 0; i < ary_test.length; i++) {
            System.out.println(ary_test[i]);
        }

        // scanner.close();
    }
}
