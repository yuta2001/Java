package practice05;

public class practice05_5 {
    // オーバーロード
    // 仮引数が全て異なるので同じ名前のメソッドを定義することが出来る

    public static int add(int a, int b) {
        System.out.println("引数が二つの場合");
        return a + b;
    }

    public static int add(int a, int b, int c) {
        System.out.println("引数が三つの場合");
        return a + b + c;
    }

    public static String add(String a, String b) {
        System.out.println("引数がString型の場合");
        return a + b;
    }

    public static double add(double a, double b) {
        System.out.println("引数がdouble型の場合");
        return a + b;
    }

    public static void main(String[] args) throws Exception {

        // int型
        System.out.println(add(1, 2));
        // 引数の数が異なる場合
        System.out.println(add(1, 2, 3));
        // String型
        System.out.println(add("1", "2"));
        // double型
        System.out.println(add(1.0, 2.0));
    }
}
