public class practice03Test {
    public static void main(String[] args) throws Exception {
        int isHungry = 1;
        String food = "barger";
        System.out.println("こんにちは");
        if (isHungry == 0) {
            System.out.println("お腹いっぱいです");
        } else {
            System.out.println("腹ペコです");
            System.out.println(food + "をいただきます");
        }
        System.out.println("ごちそうさまでした");

        // ------------------------------------------------------------------------------//

        System.out.println("[メニュー]1:検索,2:登録,3:削除,4;変更>");

        int selected = new java.util.Scanner(System.in).nextInt();

        switch (selected) {
            case 1:
                System.out.println("1:検索します");
                break;
            case 2:
                System.out.println("2:登録します");
                break;
            case 3:
                System.out.println("3:削除します");
                break;
            case 4:
                System.out.println("4:変更します");
                break;
        }

        // ------------------------------------------------------------------------------//

        System.out.println("[数あてゲーム!!]");

        int ans = new java.util.Random().nextInt(10);

        for (int i = 0; i < 5; i++) {
            System.out.println("0~9の数字を入力して下さい");
            int num = new java.util.Scanner(System.in).nextInt();
            if (num == ans) {
                System.out.println("当たり!!");
                break;
            } else {
                System.out.println("違います");
            }
        }
        System.out.println("ゲームを終了します");
    }
}
