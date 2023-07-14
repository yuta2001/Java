package practice05;

//練習5-3
public class practice05_test3 {
    public static void main(String[] args) throws Exception {
        String address = "abcde@gmail.com";
        String title = "誘いのお知らせ";
        String text = "来週の月曜日、15時頃に空いていますか?";

        email(address, title, text);
    }

    public static void email(String address, String text) throws Exception {
        System.out.println(address + "に、以下のメールを送信しました");
        System.out.println("件名: 無題");
        System.out.println("本文: " + text);
    }

    public static void email(String address, String title, String text) throws Exception {
        System.out.println(address + "に、以下のメールを送信しました");
        System.out.println("件名: " + text);
        System.out.println("本文: " + title);
    }
}
