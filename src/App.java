public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        System.out.println("Hello yuta!!");
        System.out.println(1 + 1);

        int age = 20;// 変数の初期化
        age = 30;// 再度代入

        System.out.println(age);

        int num = 1;
        int num2 = 10;

        if (num < num2) {
            System.out.println("OK!!");
        } else {
            System.out.println("NO!!");
        }

        final double pi = 3.14;// 定数宣言
        // pi = 10;finalで定数宣言されている為上書きできない
        System.out.println(pi);

        // 2023-7-1
        // ----------------------------------------------------------------------------------------------//
    }

}
