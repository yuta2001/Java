package practice04;

public class practice04_5 {
    public static void main(String[] args) {

        // NullPointerException:null格納されている配列を使うと発生する。

        // int[] ary = { 1, 2, 3, 4, 5, 6, 7 };
        // ary = null;
        // ary[0] = 10;

        // ----------------------------------------------------------------

        // .length()・・・文字の長さを取得
        String str_test = "Javaの勉強中";
        System.out.println(str_test.length());

        // 多次元配列

        int[][] ary = { { 10, 20, 30, 40, 50 }, { 60, 70, 80, 90, 100 } };
        System.out.println(ary.length);
        // 一つ目の配列{10, 20, 30, 40, 50}の要素の長さが5つだから5と表示される
        System.out.println(ary[0].length);
    }
}
