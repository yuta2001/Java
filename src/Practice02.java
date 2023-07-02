import javax.swing.plaf.synth.SynthRootPaneUI;

public class Practice02 {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello!! 2023-7-3");

        int a = 20;
        int b;
        int c;
        b = a + 5;
        c = a * b;

        a++;// 1ずつ増やす
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        // ------------------------------------------------------------------------//

        // エスケープ
        System.out.println("私の好きな記号は二重引用符(\")です");
        System.out.println("(\\)1200円");

        // ------------------------------------------------------------------------//

        // 型変換
        float f = 3;// float型に変換して代入
        double d = f;// double型に変換して代入

        System.out.println(f);
        System.out.println(d);

        // キャスト演算子
        int age = (int) 3.2;// int型に強制変換
        System.out.println(age);

        // -------------------------------------------------------------------------//
        String msg = "私の年齢は" + 23;
        System.out.println(msg);

        String name = "yuta";
        System.out.println(name + "さんこんにちは!!");// println

        System.out.print(name + "さんこんにちは!!" + "\n");// print

        // --------------------------------------------------------------------------//

        int m = Math.max(5, 10);// Math.max()大きい方を比較して代入
        System.out.println("大きい数は" + m + "です!!");

        String age2 = "23";
        int n = Integer.parseInt(age2);// Integer.parseInt()文字列を数値型に変換する
        System.out.println("あなたは来年" + n + "歳ですね");

        // ------------------------------------------------------------------------------//

        int r = new java.util.Random().nextInt(90);// new java.util.Random().nextInt(上限値);ランダム乱数
        System.out.println("あなたは多分今" + r + "歳ですね??");

        // -----------------------------------------------------------------------------------------------//

        System.out.println("あなたの名前を入力してください!!");
        // キーボードから一行の入力を受け付ける
        String name_1 = new java.util.Scanner(System.in).nextLine();// newjava.util.Scanner(System.in).nextLine()
        System.out.println("あなたの年齢を入力して下さい!!");
        // キーボードから一つの整数を入力を受け付ける
        int age_1 = new java.util.Scanner(System.in).nextInt();// new java.util.Scanner(System.in).nextInt()
        System.out.println("ようこそ!!" + age_1 + "歳の" + name_1 + "さん!!");
    }
}
