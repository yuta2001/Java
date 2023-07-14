package practice04;

public class practice04_2 {
    public static void main(String[] args) {

        // 配列の定義
        int[] ary = { 10, 20, 30, 40, 50 };
        // 初期化
        int sum = 0;

        for (int i = 0; i < ary.length; i++) {
            // aryの配列の要素を全て足してsumに代入
            sum += ary[i];
        }

        int avg = sum / ary.length;
        System.out.println("合計点は" + sum + "点です");
        System.out.println("平均点は" + avg + "点です");
    }
}
