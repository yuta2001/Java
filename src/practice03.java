public class practice03 {
    public static void main(String[] args) throws Exception {
        boolean whether = true;

        if (whether == true) {
            System.out.println("洗濯をします");
            System.out.println("散歩します");
        } else {
            System.out.println("DVDを見ます");
        }

        String name = "yuta";

        // while (name == "yuta") {
        // System.out.println("正解です!!");
        // }

        // Stringの文字列の比較をする場合＞変数名.equals(比較対象)
        // 一応==でもできるけど意味不明なエラーが起こる時がある
        if (name.equals("yuta")) {
            System.out.println("正解です!!");
        } else {
            System.out.println("不正解です");
        }

        // -------------------------------------------------------------------------------------//

        int hp = 100;
        boolean poison = false;

        if ((hp < 100 && poison == false) || (hp >= 100 && poison == true)) {
            System.out.println("テストです");
        } else {
            System.out.println("テスト2です");
        }
    }
}
