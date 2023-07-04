public class practice03_2 {
    public static void main(String[] args) throws Exception {
        int temp = 30;
        // 最低一回ここで処理が入る
        do {
            temp--;
            System.out.println("温度を一度下げました");
        } while (temp >= 25);
        // 25以下になったら実行
        {
            System.out.println("温度調整完了");
        }

        // --------------------------------------------------------------------------------//

        // for文の基本構文
        for (int i = 0; i < 5; i++) {
            System.out.println(i + "回目です");
        }

    }
}
