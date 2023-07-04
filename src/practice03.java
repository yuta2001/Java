public class practice03 {
    public static void main(String[] args) throws Exception {
        boolean whether = true;

        if (whether == true) {
            System.out.println("洗濯をします");
            System.out.println("散歩します");
        } else {
            System.out.println("DVDを見ます");
        }

        // -------------------------------------------------------------------------------------//

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

        // -------------------------------------------------------------------------------------//

        int age = 10;
        // 否定演算子
        if (!(age == 10)) {
            System.out.println("OKです!!");
        } else {
            System.out.println("NOです!!");
        }

        // -------------------------------------------------------------------------------------//

        int Drink = 150;

        if (Drink >= 170) {
            System.out.println("Lサイズです");
        } else if (Drink >= 150) {
            System.out.println("Mサイズです");
        } else {
            System.out.println("Sサイズです");
        }

        // --------------------------------------------------------------------------------------//

        System.out.println("あなたの運勢を占います");
        System.out.println("あなたの名前を入力してください");
        String you_name = new java.util.Scanner(System.in).nextLine();
        System.out.println("あなたの年齢を入力して下さい");
        int you_age = new java.util.Scanner(System.in).nextInt();
        System.out.println("結果が出ました!!OKと入力してください");
        String result = new java.util.Scanner(System.in).nextLine();

        int fortune = new java.util.Random().nextInt(4) + 1;

        // if (fortune == 1) {
        // System.out.println("大吉です");
        // } else if (fortune == 2) {
        // System.out.println("中吉です");
        // } else if (fortune == 3) {
        // System.out.println("小吉です");
        // } else {
        // System.out.println("凶です");
        // }

        // switch文ver
        switch (fortune) {
            // この場合case1,case2共に中吉になる
            case 1:
                // System.out.println("大吉です");
                // break;
            case 2:
                System.out.println("中吉です");
                break;
            case 3:
                System.out.println("小吉です");
                break;
            default:
                System.out.println("凶です");
        }
    }
}
