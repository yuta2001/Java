package practice05;

public class practice05_test {
    public static void main(String[] args) throws Exception {
        introduceOneself();

        String title = "お誘いのお知らせ";
        String address = "abcde@gmail.com";
        String text = "来週の月曜日、15時頃に空いていますか?";
        email(title, address, text);

    }

    // 練習5-1
    public static void introduceOneself() throws Exception {
        String name = "yuta";
        int num = 22;
        double height = 163;
        char eto = '牛';

        System.out.println("あなたの名前は" + name);
        System.out.println("あなたの年齢は" + num);
        System.out.println("あなたの身長は" + height);
        System.out.println("あなたの干支は" + eto);
        System.out.println("----------------------------------------------------");
    }

    // 練習5-2
    public static void email(String title, String address, String text) throws Exception {
        System.out.println(title + "に、以下のメールを送信しました");
        System.out.println("件名: " + address);
        System.out.println("本文: " + text);
        System.out.println("----------------------------------------------------");
    }
}
