package practice05;

//練習5-2
public class practice05_test2 {
    public static void mail(String[] args) throws Exception {
        String title = "お誘いのお知らせ";
        String address = "abcde@gmail.com";
        String text = "来週の月曜日、15時頃に空いていますか?";

        email(title, address, text);
    }

    public static void email(String title, String address, String text) throws Exception {
        System.out.println(title + "に、以下のメールを送信しました");
        System.out.println("件名: " + address);
        System.out.println("本文: " + text);
        System.out.println("----------------------------------------------------");
    }
}
