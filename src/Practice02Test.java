public class Practice02Test {
    public static void main(String[] args) throws Exception {

        // 第二章テスト//
        int x = 5;
        int y = 10;
        System.out.println("x + yは" + (x + y));

        // -------------------------------------------------------------------//

        // 占いの館
        System.out.println("ようこそ占いの館へ!!");
        System.out.println("あなたの名前を入力して下さい!!");
        String name = new java.util.Scanner(System.in).nextLine();
        System.out.println("あなたの年齢を入力してください");
        int ageString = new java.util.Scanner(System.in).nextInt();
        // int age = Integer.parseInt(ageString);
        int fortune = new java.util.Random().nextInt(4);
        fortune++;
        System.out.println("占いの結果が出ました!!");
        System.out.println(ageString + "歳の" + name + "さん、あなたの運気は" + fortune + "です");
        System.out.println("1:大吉 2:中吉 3:吉 4:凶");
    }
}
