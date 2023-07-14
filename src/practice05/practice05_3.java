package practice05;

public class practice05_3 {
    public static void main(String[] args) throws Exception {
        System.out.println("メソッドを呼び出します");
        name("yuta");
        name("うゆゆ");
        school("STです");
        System.out.println("メソッドの呼び出しを終了します");

        add(100, 2, "の合計は");
        add(300, 200, "の合計は");
    }

    public static void name(String name) {
        System.out.println(name + "さんこんにちは!!");
    }

    public static void school(String school) {
        System.out.println("次の授業は" + school);
    }

    public static void add(int x, int y, String z) {
        int ans = x + y;
        System.out.println(x + " + " + y + z + ans);
    }
}
