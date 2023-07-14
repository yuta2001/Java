package practice05;

public class practice05_4 {
    public static int add(int x, int y) {
        int ans = x + y;
        return ans;
    }

    public static void main(String[] args) throws Exception {
        // 書き方1
        // int ans = add(100, 200);
        // System.out.println(ans);

        // 書き方2
        System.out.println(add(100, 200));
        // 一つ目のadd()がx,二つ目のadd()がy
        System.out.println(add(add(100, 200), add(300, 400)));
        // --→1000
    }
}
