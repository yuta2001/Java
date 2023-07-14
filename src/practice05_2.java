public class practice05_2 {

    public static void methodA() {// ②
        System.out.println("methodA");
        methodB();
    }

    public static void methodB() {
        System.out.println("methodB");
    }

    // 必ずmainメソッドから読み込まれる。
    public static void main(String[] args) throws Exception {// ①
        methodA();
    }
}
