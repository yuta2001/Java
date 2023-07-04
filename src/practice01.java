public class Practice01 {
    public static void main(String[] args) throws Exception {
        int a = 3;
        int b = 5;
        int c = a * b;
        System.out.println("縦幅3横幅5の長方形の面積は、" + c);

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
    }
}