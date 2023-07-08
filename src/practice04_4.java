public class practice04_4 {
    public static void main(String[] args) {
        int[] ary = new int[10];

        // 塩基配列をランダムに生成

        for (int i = 0; i < ary.length; i++) {
            // ランダムに入れられた数字
            ary[i] = new java.util.Random().nextInt(4);
        }

        for (int i = 0; i < ary.length; i++) {
            char[] base = { 'A', 'T', 'G', 'C' };
            System.out.print(base[ary[i]] + " ");
        }

        // ----------------------------------------------------------------------------------------//

        // 拡張for文

        int[] ary2 = { 0, 1, 2, 3, 4, 5, 6, 7 };
        for (int value : ary2) {
            System.out.print(value + " ");
        }
    }
}
